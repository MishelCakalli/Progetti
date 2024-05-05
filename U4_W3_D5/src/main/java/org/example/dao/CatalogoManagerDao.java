package org.example.dao;
import org.example.entity.ElementoCatalogo;
import org.example.entity.Prestito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CatalogoManagerDao implements CatalogoManager {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public CatalogoManagerDao() {
        entityManagerFactory = Persistence.createEntityManagerFactory("U4_W3_D5");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void aggiungiElemento(ElementoCatalogo elemento) {
        entityManager.getTransaction().begin();
        entityManager.persist(elemento);
        entityManager.getTransaction().commit();
    }

    @Override
    public void rimuoviElementoPerISBN(String codiceISBN) {
        ElementoCatalogo elemento = cercaPerISBN(codiceISBN);
        if (elemento != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(elemento);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public ElementoCatalogo cercaPerISBN(String codiceISBN) {
        return entityManager.find(ElementoCatalogo.class, codiceISBN);
    }

    @Override
    public List<ElementoCatalogo> cercaPerAnnoPubblicazione(int anno) {
        TypedQuery<ElementoCatalogo> query = entityManager.createQuery(
                "SELECT e FROM ElementoCatalogo e WHERE e.annoPubblicazione = :anno", ElementoCatalogo.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    @Override
    public List<ElementoCatalogo> cercaPerAutore(String autore) {
        return List.of();
    }

    @Override
    public List<ElementoCatalogo> cercaPerTitolo(String titolo) {
        return List.of();
    }

    @Override
    public List<ElementoCatalogo> cercaElementiInPrestitoPerUtente(String numeroTessera) {
        return List.of();
    }

    @Override
    public List<Prestito> ricercaPrestitiScadutiERestituiti() {
        return List.of();
    }

}

