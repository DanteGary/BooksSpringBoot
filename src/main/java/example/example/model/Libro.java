package example.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Libro extends Model{
    private String titulo;
    private String fecha_edicion;

    public String getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(String fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "libro", cascade = CascadeType.ALL)
    private Set<Autor_Libro> autor_libros = new HashSet<>();

    public Set<Autor_Libro> getAutor_libros() {
        return autor_libros;
    }

    public void setAutor_libros(Set<Autor_Libro> autor_libros) {
        this.autor_libros = autor_libros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
