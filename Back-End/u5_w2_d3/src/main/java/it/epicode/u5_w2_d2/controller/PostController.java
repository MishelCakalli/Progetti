package it.epicode.u5_w2_d2.controller;

import it.epicode.u5_w2_d2.exception.PostNotFoundException;
import it.epicode.u5_w2_d2.model.Post;
import it.epicode.u5_w2_d2.service.PostService;
import it.epicode.u5_w2_d2.service.PostService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    private PostService2 postService2;

//    @GetMapping("/api")
//    public String benvenuto(){
//        return "Benvenuto";
//    }



    @GetMapping("/Post")
    public List<Post> ritornaLaListaDiBlogPost(){
        return postService.getPosts();
    }
    @GetMapping("/Post/{id}")
    public Post  ritornaUnSingoloBlogPost(@PathVariable int id){
        Optional<Post> postOptional = postService.getPostById(id);

        if(postOptional.isPresent()){
            return postOptional.get();
        }
        else{
            throw new PostNotFoundException("Blog non trovato");
        }

    }
    @PostMapping("/posts")
    public String  creaUnNuovoBlogPost(@RequestBody Post post){
        return postService.savePost(post);
    }
    @PutMapping("/Posts/{id}")
    public Post  modificaLoSpecificoBlogPost(@RequestBody int id,@RequestBody Post post){
        return postService.updatePost(id,post);
    }

    @DeleteMapping("/Posts/{id}")
    public String  cancellaLoSpecificoBlogPost(@PathVariable int id){
        return postService.deletePost(id);
    }

    @GetMapping
    public Page<Post> getAllBlogPosts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return postService2.findAll(pageable);
    }
}
