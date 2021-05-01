package com.example.springbootformexample.dto;

import com.example.springbootformexample.model.Category;

public class AnnonsDTO {
    private String name;
    private String provins;
    private String kommun;
    private int size_of_area;
    private int size_of_buildings;
    private int price;
    private Category category;

    public AnnonsDTO(String name, String provins, String kommun, int size_of_area, int size_of_buildings, int price, Category category) {
        this.name = name;
        this.provins = provins;
        this.kommun = kommun;
        this.size_of_area = size_of_area;
        this.size_of_buildings = size_of_buildings;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getProvins() {
        return provins;
    }

    public String getKommun() {
        return kommun;
    }

    public int getSize_of_area() {
        return size_of_area;
    }

    public int getSize_of_buildings() {
        return size_of_buildings;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
