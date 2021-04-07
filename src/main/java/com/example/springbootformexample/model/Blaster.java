package com.example.springbootformexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int ammunitionCapacity;
    private BlasterAmmunitionQuality ammunitionQuality;

    public Blaster(String name, int ammunitionCapacity, BlasterAmmunitionQuality ammunitionQuality) {
        this.name = name;
        this.ammunitionCapacity = ammunitionCapacity;
        this.ammunitionQuality = ammunitionQuality;
    }

    public Blaster(Integer id, String name, int ammunitionCapacity, BlasterAmmunitionQuality ammunitionQuality) {
        this.id = id;
        this.name = name;
        this.ammunitionCapacity = ammunitionCapacity;
        this.ammunitionQuality = ammunitionQuality;
    }

    public Blaster() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmunitionCapacity() {
        return ammunitionCapacity;
    }

    public void setAmmunitionCapacity(int capacity) {
        this.ammunitionCapacity = capacity;
    }

    public BlasterAmmunitionQuality getAmmunitionQuality() {
        return ammunitionQuality;
    }

    public void setAmmunitionQuality(BlasterAmmunitionQuality ammunitionQuality) {
        this.ammunitionQuality = ammunitionQuality;
    }
}
