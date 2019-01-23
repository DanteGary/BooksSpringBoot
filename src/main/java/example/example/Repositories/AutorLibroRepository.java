package example.example.Repositories;

import example.example.model.Autor_Libro;
import org.springframework.data.repository.CrudRepository;

public interface AutorLibroRepository extends CrudRepository<Autor_Libro, Long> {
}
