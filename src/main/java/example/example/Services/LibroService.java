package example.example.Services;

import example.example.model.Libro;

import java.util.List;

public interface LibroService {
    List<Libro> getLibros();
    Libro findById(Long id);
    List<Libro> find(String code);
}
