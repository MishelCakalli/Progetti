package it.epicode.u5_w2_d2.controller;

import it.epicode.u5_w2_d2.exception.PostNotFoundException;
import it.epicode.u5_w2_d2.model.Autore;
import it.epicode.u5_w2_d2.model.Post;
import it.epicode.u5_w2_d2.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

//    @GetMapping("/api")
//    public String benvenuto(){
//        return "Benvenuto";
//    }



    @GetMapping("/Autore")
    public List<Autore> ritornaLaListaDiAutori(){
        return autoreService.getAutore();
    }
    @GetMapping("/Autore/{id}")
    public Autore ritornaUnSingoloAutori(@PathVariable int id){
        Optional<Autore> postOptional = autoreService.getAutoreById(id);

        if(postOptional.isPresent()){
            return postOptional.get();
        }
        else{
            throw new PostNotFoundException("Blog non trovato");
        }

    }
    @PostMapping("/Autore")
    public String  creaUnNuovoAutori(@RequestBody Autore autore){
        return autoreService.saveAutore(autore);
    }
    @PutMapping("/Autore/{id}")
    public Autore  modificaLoSpecificoAutori(@RequestBody int id,@RequestBody Autore autore){
        return autoreService.updateAutore(id,autore);
    }

    @DeleteMapping("/Autore/{id}")
    public String  cancellaLoSpecificoAutori(@PathVariable int id){
        return autoreService.deleteAutore(id);
    }



}
