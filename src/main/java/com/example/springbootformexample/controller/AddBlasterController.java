package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.data.BlasterRepository;
import com.example.springbootformexample.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddBlasterController {
    //private final BlasterRepository repository;
    private final AnnonsRepository repository;

    @Autowired
    public AddBlasterController(AnnonsRepository repository) {
        this.repository = repository;
    }
    /*public AddBlasterController(BlasterRepository repository) {
        this.repository = repository;
    }*/

    @GetMapping("/add-blaster")
    public String getAddBlasterPage() {
        return "add-blaster";
    }

    private String name;
    private Person person;
    private String provins;
    private String kommun;
    private int size_of_area;
    private int size_of_buildings;
    private int price;
    private Category category;
    Person loged = new Person("mejladdress", "kalle", "anka", "d", 5);


    @PostMapping("/blasters")



    public String addAd(@RequestParam("name") String name,
    //@RequestParam("person") Person person,
    @RequestParam("provins") String provins,
    @RequestParam("kommun") String kommun,
    @RequestParam("size_of_area") int size_of_area,
    @RequestParam("size_of_buildings") int size_of_buildings,
    @RequestParam("price") int price,
    @RequestParam("category") Category category){
        repository.save(new Annons(name, loged, provins,kommun,size_of_area,size_of_buildings,price,category));
    /*public String addBlaster(@RequestParam("name") String name,
                             @RequestParam("capacity") int capacity,
                             @RequestParam("quality") BlasterAmmunitionQuality quality) {
        repository.save(new Annons(name, capacity, quality));*/

        return "redirect:/";
    }
}
