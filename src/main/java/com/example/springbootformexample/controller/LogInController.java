package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.PersonRepository;
import com.example.springbootformexample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

public class LogInController {
    private final PersonRepository repository;

    @Autowired
    public LogInController(PersonRepository repository) {
        this.repository = repository;
    }
    /*public AddBlasterController(BlasterRepository repository) {
        this.repository = repository;
    }*/

    @GetMapping("/login")
    public String getAddBlasterPage() {
        return "login";
    }


    private String username;
    private String password;
    //private int phonenumber;
    //Person loged = new Person("mejladdress", "kalle", "anka", "d", 5);


    @PostMapping("/login")

    public String addAd(@RequestParam("username") String username,
                        //@RequestParam("person") Person person,
                        //@RequestParam("name") String name,
                        @RequestParam("password") String password)
                        //@RequestParam("phonenumber") int phonenumber)
    {

        Set checkUsername = repository.findByUsername(username);
        boolean check = true;
        if (checkUsername.isEmpty()){
            System.out.println("Incorrect username");
        }else if (checkUsername.equals(password)){
            check = false;
        }
        if (check){
            System.out.println("Incorrect password");
        }else{
            System.out.println("You logged in");
        }


        //repository.save(new Person(email, name, username,password,phonenumber));
    /*public String addBlaster(@RequestParam("name") String name,
                             @RequestParam("capacity") int capacity,
                             @RequestParam("quality") BlasterAmmunitionQuality quality) {
        repository.save(new Annons(name, capacity, quality));*/

        return "redirect:/";
    }
}
