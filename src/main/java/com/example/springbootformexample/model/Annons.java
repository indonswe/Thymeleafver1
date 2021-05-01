package com.example.springbootformexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String provins;
    private String kommun;
    private int size_of_area;
    private int size_of_buildings;
    private int price;
    private Category category;

    public Annons(String name, String provins, String kommun, int size_of_area, int size_of_buildings, int price, Category category) {
        this.name = name;
        this.provins = provins;
        this.kommun = kommun;
        this.size_of_area = size_of_area;
        this.size_of_buildings = size_of_buildings;
        this.price = price;
        this.category = category;
    }
    public Annons(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize_of_area() {
        return size_of_area;
    }

    public void setSize_of_area(int size_of_area) {
        this.size_of_area = size_of_area;
    }

    public int getSize_of_buildings() {
        return size_of_buildings;
    }

    public void setSize_of_buildings(int size_of_buildings) {
        this.size_of_buildings = size_of_buildings;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
