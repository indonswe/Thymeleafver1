package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.data.BlasterRepository;
import com.example.springbootformexample.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    //private final BlasterRepository repository;
    private final AnnonsRepository repository;

    @Autowired
    public IndexController(AnnonsRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/query")

    public String query(@RequestParam("category") Category category){

        return "index";
    }

    @PostMapping("/sortby")

    public String sort(@RequestParam("category") Category category){

        return "index";
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("annonsDTOs", repository.findAllAsDTO());
        System.out.println(repository.findByPerson(1));



        return "index";
    }
}
