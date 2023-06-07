package com.example.java_web_final_project;

        import org.springframework.boot.CommandLineRunner;
        import org.springframework.stereotype.Component;

        import com.example.java_web_final_project.model.Cat;
        import com.example.java_web_final_project.model.CatRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final CatRepository catRepository;

    public DataLoader(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        catRepository.save(new Cat("Chonkerella", "Tabby", 2));
        catRepository.save(new Cat("Boo", "American Shorthair", 7));
        catRepository.save(new Cat("Tyga", "Siamese", 4));
    }
}