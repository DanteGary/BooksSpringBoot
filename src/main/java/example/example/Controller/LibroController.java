package example.example.Controller;


import example.example.Repositories.AutorRepository;
import example.example.Repositories.LibroRepository;
import example.example.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;

    public LibroController(LibroRepository libroRepository, AutorRepository autorRepository) {
        this.libroRepository = libroRepository;
        this.autorRepository = autorRepository;
    }

    @RequestMapping("/libros")
    public String getLibros(Model model){
        model.addAttribute("libros",libroRepository.findAll());
        model.addAttribute("autores",autorRepository.findAll());
        return "libros";
    }


    @PostMapping("/saveLibro")
    public String registrarLibro(Libro l){
      libroRepository.save(l);
      return "redirect:/libros";
    }

    @DeleteMapping("/lib/{id}")
    public String deleteBook(@PathVariable Long id){
        libroRepository.deleteById(id);
        return "redirect:/libros";
    }
//    public String eliminarLibro(@PathVariable Long id){
//        libroRepository.deleteById(id);
//        return "redirect:/libros";
//    }


}
