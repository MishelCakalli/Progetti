package it.epicode.u5_w2_d2.service;

import it.epicode.u5_w2_d2.exception.PostNotFoundException;
import it.epicode.u5_w2_d2.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public String savePost(Post post){
        posts.add(post);
        return "Post creato con id="+post.getId();
    }
    public List<Post> getPosts(){
        return posts;
    }
    public Optional<Post> getPostById(int id){
        return posts.stream().filter(post -> post.getId()==id).findFirst();
    }

    public Post updatePost(int id, Post postUpd){
        Optional<Post> blogOptional = getPostById(id);

        if(blogOptional.isPresent()){
            Post posts = blogOptional.get();

            posts.setCategoria(postUpd.getCategoria());
            posts.setContenuto(postUpd.getContenuto());
            posts.setTitolo(postUpd.getTitolo());
            posts.setTempoDiLettura(postUpd.getTempoDiLettura());
            return posts;
        }
        else{
            throw new PostNotFoundException("Blog non trovato");
        }
    }

    public String deletePost(int id){
        Optional<Post> postOptional = getPostById(id);

        if(postOptional.isPresent()){
            posts.remove(postOptional.get());
            return "Blog con id="+ id + " rimosso";
        }
        else{
            throw new PostNotFoundException("Blog non trovato");
        }
    }


}
