package it.epicode.u5_w3_d5.Service;



import it.epicode.u5_w3_d5.DTO.UserLoginDTO;
import it.epicode.u5_w3_d5.Exception.UnauthorizedException;
import it.epicode.u5_w3_d5.Security.JwtTool;
import it.epicode.u5_w3_d5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtTool jwtTool;


    @Autowired
    private PasswordEncoder passwordEncoder;


    public String authenticateUserAndCreateToken(UserLoginDTO userLoginDTO){
     User user = userService.getUserByEmail(userLoginDTO.toString());

        if (passwordEncoder.matches(userLoginDTO.getPassword() ,user.getPassword())) {
        return jwtTool.createToken(user); // metodo createToken vuole l'utente per creare il token
        }else{
            throw  new UnauthorizedException("Dati errati, controllare i dati inseriti e prova nuovamente, se riscontri ancora problemi contatta l'assistenza di TicketGenius");
        }
    }


}
