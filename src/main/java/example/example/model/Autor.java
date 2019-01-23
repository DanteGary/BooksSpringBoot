package example.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Autor extends Model {
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autor", cascade = CascadeType.ALL)
    private Set<Autor_Libro> autor_libros;

    public Set<Autor_Libro> getAutor_libros() {
        return autor_libros;
    }

    public void setAutor_libros(Set<Autor_Libro> autor_libros) {
        this.autor_libros = autor_libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
