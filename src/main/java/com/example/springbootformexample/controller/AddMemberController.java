package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.data.PersonRepository;
import com.example.springbootformexample.model.Annons;
import com.example.springbootformexample.model.BankAccount;
import com.example.springbootformexample.model.Category;
import com.example.springbootformexample.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddMemberController {
    private final PersonRepository repository;

    BankAccount account = new BankAccount(500, "Kalle", "Anka", 12345);

    int account1;

    @Autowired
    public AddMemberController(PersonRepository repository) {
        this.repository = repository;
    }
    /*public AddBlasterController(BlasterRepository repository) {
        this.repository = repository;
    }*/

    @GetMapping("/add-member")
    public String getAddBlasterPage() {
        return "add-member";
    }

    private String email;
    private String name;
    //private String lastName;
    private String username;
    private String password;
    private int phonenumber;
    //Person loged = new Person("mejladdress", "kalle", "anka", "d", 5);


    @PostMapping("/members")

    public String addAd(@RequestParam("email") String email,
                        //@RequestParam("person") Person person,
                        @RequestParam("name") String name,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("phonenumber") int phonenumber)
                        {

        repository.save(new Person(email, name, username,password,phonenumber));
    /*public String addBlaster(@RequestParam("name") String name,
                             @RequestParam("capacity") int capacity,
                             @RequestParam("quality") BlasterAmmunitionQuality quality) {
        repository.save(new Annons(name, capacity, quality));*/

                            account1 = account.deposit(100);

        return "redirect:/";
    }
}
