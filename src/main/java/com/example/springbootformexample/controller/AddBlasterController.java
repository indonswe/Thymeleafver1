package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.BlasterRepository;
import com.example.springbootformexample.model.Blaster;
import com.example.springbootformexample.model.BlasterAmmunitionQuality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddBlasterController {
    private final BlasterRepository repository;

    @Autowired
    public AddBlasterController(BlasterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/add-blaster")
    public String getAddBlasterPage() {
        return "add-blaster";
    }

    @PostMapping("/blasters")
    public String addBlaster(@RequestParam("name") String name,
                             @RequestParam("capacity") int capacity,
                             @RequestParam("quality") BlasterAmmunitionQuality quality) {
        repository.save(new Blaster(name, capacity, quality));

        return "redirect:/";
    }
}
