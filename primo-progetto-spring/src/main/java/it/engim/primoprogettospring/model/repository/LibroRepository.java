package it.engim.primoprogettospring.model.repository;

import it.engim.primoprogettospring.model.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, Integer> {
    List<Libro> findAll();
    // List<Libro> findByTitolo(String titolo);
}
