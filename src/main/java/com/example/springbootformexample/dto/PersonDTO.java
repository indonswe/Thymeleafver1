package com.example.springbootformexample.dto;

public class PersonDTO {

    private String email;
    private String name;
    private String username;
    private String password;
    private int phonenumber;

    public PersonDTO(String email, String name, String username, String password, int phonenumber) {
        this.email = email;
        this.name = name;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
