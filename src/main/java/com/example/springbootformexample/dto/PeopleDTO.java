package com.example.springbootformexample.dto;

public class PeopleDTO {
    int foundId;
    int size;

    public PeopleDTO(int foundId) {
        this.foundId = foundId;
        this.size=1;
    }

    public int getFoundId() {
        return foundId;
    }

    public void setFoundId(int foundId) {
        this.foundId = foundId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
