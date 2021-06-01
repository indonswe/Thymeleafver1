package com.example.springbootformexample.dto;

import com.example.springbootformexample.model.Category;
import com.example.springbootformexample.model.Person;

public class AnnonsDTO {
    private String name;
    private Person person;
    private String provins;
    private String kommun;
    private int size_of_area;
    private int size_of_buildings;
    private int price;
    private Category category;
    private byte[] image;

    public AnnonsDTO(String name, Person person, String provins, String kommun, int size_of_area, int size_of_buildings, int price, Category category, byte[] image) {
        this.name = name;
        this.person = person;
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

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getProvins() {
        return provins;
    }

    public void setProvins(String provins) {
        this.provins = provins;
    }

    public String getKommun() {
        return kommun;
    }

    public void setKommun(String kommun) {
        this.kommun = kommun;
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

    public byte[] getImage() {

        // image = "data:image/png;base64,R0lGODlhlgCWAMQAAPz8/N3d3eX.../big image

        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
