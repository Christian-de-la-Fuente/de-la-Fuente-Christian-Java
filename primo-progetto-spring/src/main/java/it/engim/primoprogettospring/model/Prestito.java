package it.engim.primoprogettospring.model;

import jakarta.persistence.*;

@Entity
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne @JoinColumn(name = "id_libro")
    private Libro libro;
    @ManyToOne @JoinColumn(name = "id_utente")
    private Utente utente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
