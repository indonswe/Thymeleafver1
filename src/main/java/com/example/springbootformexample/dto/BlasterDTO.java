package com.example.springbootformexample.dto;

import com.example.springbootformexample.model.BlasterAmmunitionQuality;

public class BlasterDTO {
    private final String name;
    private final String ammunitionQuality;
    private final int ammunitionCapacity;

    public BlasterDTO(String name, BlasterAmmunitionQuality ammunitionQuality, int ammunitionCapacity) {
        this.name = name;
        this.ammunitionCapacity = ammunitionCapacity;

        switch (ammunitionQuality) {
            case LOW: {
                this.ammunitionQuality = "Low (Red)";
                break;
            }
            case MEDIUM: {
                this.ammunitionQuality = "Medium (Yellow)";
                break;
            }
            case HIGH: {
                this.ammunitionQuality = "High (Green)";
                break;
            }
            default: {
                this.ammunitionQuality = "Unknown";
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public String getAmmunitionQuality() {
        return this.ammunitionQuality;
    }

    public int getAmmunitionCapacity() {
        return this.ammunitionCapacity;
    }
}
