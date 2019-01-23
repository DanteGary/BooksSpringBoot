package example.example.Dev;

import example.example.Repositories.AutorLibroRepository;
import example.example.Repositories.AutorRepository;
import example.example.Repositories.LibroRepository;
import example.example.model.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;



@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
    private AutorRepository autorRepository;
    private LibroRepository libroRepository;
    private AutorLibroRepository autorLibroRepository;

    public DevBootstrap(AutorRepository autorRepository, LibroRepository libroRepository, AutorLibroRepository autorLibroRepository) {
        this.autorRepository = autorRepository;
        this.libroRepository = libroRepository;
        this.autorLibroRepository = autorLibroRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Autor appAutor = new Autor();
        appAutor.setNombre("Jorge Luis");

        autorRepository.save(appAutor);
    }
}
