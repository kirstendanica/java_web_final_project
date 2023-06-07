package com.example.java_web_final_project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.java_web_final_project.model.Cat;
import com.example.java_web_final_project.model.CatRepository;
@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    public Cat getCatById(Long id) {
        return catRepository.findById(id).orElse(null);
    }

    public Cat addCat(Cat cat) {
        return catRepository.save(cat);
    }

    public void deleteCat(Long id) {
        catRepository.deleteById(id);
    }

}