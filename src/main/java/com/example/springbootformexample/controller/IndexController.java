package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.data.BlasterRepository;
import com.example.springbootformexample.model.BankAccount;
import com.example.springbootformexample.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    //private final BlasterRepository repository;
    private final AnnonsRepository repository;
    int sort = 0;
    BankAccount account = new BankAccount(500, "Kalle", "Anka", 12345);
    int account1;

    @Autowired
    public IndexController(AnnonsRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/query")

    public String query
        (@RequestParam("category") Category category){

            return "index";

    }

    @PostMapping("/sortby")

    public String sort(@RequestParam("category") Category category){
        if (category.equals("HOUSE")){
            account1 = account.deposit(100);

            sort = 1;
        }
        else if (category.equals("FOREST")){
            account1 = account.withdraw(100);
            sort = 2;
        }

        account1 = account.deposit(100);

        System.out.println(sort);

        System.out.println(account.getBalanceAccount());



        return "index";
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {

        System.out.println(account.getBalanceAccount());

        account1 = account.getBalanceAccount();

        //account1 = 15;

        model.addAttribute("balanceAccount", account1);

        //model.addAttribute("balanceAccount", new java.util.Date());

        /*if (sort==1) {
           model.addAttribute("annonsDTOs", repository.findAllAsDTO());
       }
       else if (sort==2) {
           model.addAttribute("annonsDTOs", repository.sortByPriceDescDTO());
       }
        System.out.println(repository.findByPerson(1));*/



        return "index";
    }
}
