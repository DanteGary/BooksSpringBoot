package example.example.Controller;

import example.example.Repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutorController {
    @Autowired
    private AutorRepository autorRepository;

    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @RequestMapping("/autores")
    public String getAutores(Model model) {
        model.addAttribute("autores", autorRepository.findAll());
        return "autores";
    }
}
