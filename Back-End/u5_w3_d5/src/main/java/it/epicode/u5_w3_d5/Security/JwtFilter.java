package it.epicode.u5_w3_d5.Security;


import it.epicode.u5_w3_d5.Exception.NotFoundException;
import it.epicode.u5_w3_d5.Exception.UnauthorizedException;
import it.epicode.u5_w3_d5.Service.UserService;
import it.epicode.u5_w3_d5.entity.User;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;


@Component
public class JwtFilter extends OncePerRequestFilter {



    @Autowired
    private JwtTool jwtTool;


    @Autowired
    UserService userService;



    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            throw new UnauthorizedException("Error in authorization, token is null or Bearer is null");
        }else{
            String token = authHeader.substring(7);

            jwtTool.verifyToken(token);

            int userIdInsideToken = jwtTool.getIdFromToken(token);

            Optional<User> userOptional = userService.getUserById(userIdInsideToken);

            if (userOptional.isPresent()) {
                User user = userOptional.get();

                Authentication authentication = new UsernamePasswordAuthenticationToken(user,null);
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }else{
                throw new NotFoundException("User with id: "+userIdInsideToken+" ,not found");
            }

            filterChain.doFilter(request,response);
        }

    }


    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException{
        return new AntPathMatcher().match("/auth/**",request.getServletPath());
    }

}
