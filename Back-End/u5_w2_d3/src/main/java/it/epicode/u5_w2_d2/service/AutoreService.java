package it.epicode.u5_w2_d2.service;

import it.epicode.u5_w2_d2.exception.AutoreNotFoundException;
import it.epicode.u5_w2_d2.model.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {

    private List<Autore> autori = new ArrayList<>();

    public String saveAutore(Autore autore){
        autori.add(autore);
        return "Autore creato con id=" + autore.getId();
    }

    public List<Autore> getAutore(){
        return autori;
    }

    public Optional<Autore> getAutoreById(int id){
        return autori.stream().filter(autore -> autore.getId()==id).findFirst();
    }

    public Autore updateAutore(int id, Autore autoreUpd){
        Optional<Autore> autoreOptional = getAutoreById(id);

        if(autoreOptional.isPresent()){
            Autore autore = autoreOptional.get();

            autore.setNome(autoreUpd.getNome());
            autore.setCognome(autoreUpd.getCognome());
            autore.setEmail(autoreUpd.getEmail());
            autore.setDataDiNascita(autoreUpd.getDataDiNascita());
            return autore;
        }
        else{
            throw new AutoreNotFoundException("Autore non trovato");
        }
    }

    public String deleteAutore(int id){
        Optional<Autore> autoreOptional = getAutoreById(id);

        if(autoreOptional.isPresent()){
            autori.remove(autoreOptional.get());
            return "Autore con id="+ id + " rimosso";
        }
        else{
            throw new AutoreNotFoundException("Autore non trovato");
        }
    }
}
