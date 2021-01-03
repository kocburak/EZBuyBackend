package com.ezbuy.backend;

import com.ezbuy.backend.Entity.Category;
import com.ezbuy.backend.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DataLoader implements ApplicationRunner {

    private CategoryRepository categoryRepository;

    @Autowired
    public DataLoader(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void run(ApplicationArguments args) {
        categoryRepository.save(new Category(UUID.fromString("b9061f1e-4dd4-11eb-9458-0242ac110002"),"Teknoloji"));
        categoryRepository.save(new Category(UUID.fromString("c035ea04-4dd4-11eb-9458-0242ac110002"),"Giyim"));
    }
}
