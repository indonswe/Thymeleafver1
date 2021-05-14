package com.example.springbootformexample;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.Category;
import com.example.springbootformexample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Databasinstoppare implements ApplicationRunner {

    private final AnnonsRepository repository;

    @Autowired
    public Databasinstoppare(AnnonsRepository repo){
        System.out.println("Databasins autowired");
        this.repository = repo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("p");

        Person person = new Person("a", "b", "c", "d", 5);
        Annons annons = new Annons("t", person, "a","b", 13,13,300, Category.Rubber_trees);

        repository.save(annons);

    }
}
