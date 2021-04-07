package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.BlasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final BlasterRepository repository;

    @Autowired
    public IndexController(BlasterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("blasterDTOs", repository.findAllAsDTO());

        return "index";
    }
}
