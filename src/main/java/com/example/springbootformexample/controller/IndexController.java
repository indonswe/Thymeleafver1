package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.data.BlasterRepository;
import com.example.springbootformexample.data.People;
import com.example.springbootformexample.dto.PeopleDTO;
import com.example.springbootformexample.model.BankAccount;
import com.example.springbootformexample.model.Category;
import com.example.springbootformexample.model.PersonTodo;
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
    PersonTodo person1 = new PersonTodo("a","b");
    String person3LastName = "Empty";
    PeopleDTO id3 = new PeopleDTO(People.size());
    int lastPeople;

    @Autowired
    public IndexController(AnnonsRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/query")

    public String query
        (@RequestParam("category") Category category){

        System.out.println("Query");
        /*People.clear();
        String firstName = "Kalle";
        String lastName = "Anka";
        String firstName2 = "Dorian";
        String lastName2 = "Yates";
        String firstName3 = "Robert";
        String lastName3 = "Pires";
        People.add(firstName, lastName);
        People.add(firstName2, lastName2);
        People.add(firstName3, lastName3);*/
        id3.setSize(People.size());
        System.out.println(People.size());

        return "redirect:/index";

    }

    @PostMapping("/sortby")

    public String sort(@RequestParam("category") Category category){
        System.out.println(category);
        if (category.equals("HOUSE")){
            account1 = account.deposit(100);

            sort = 1;
        }
        else if (category.equals("FOREST")){
            account1 = account.withdraw(100);
            sort = 2;
        }

        account1 = account.deposit(100);
        PersonTodo person2 = new PersonTodo("c","d");
        id3.setSize(People.size());
        System.out.println(People.size());
        //id3.setFoundId(3);
        //PersonTodo person3 = People.findById(3);
        //System.out.println(person3LastName);
        //model.addAttribute("balanceAccount", person3LastName);
        ///
        //System.out.println(sort);
        //System.out.println(account.getBalanceAccount());


        //model.addAttribute("balanceAccount", account1);
        return "redirect:/index";
        //return "redirect:/index";
    }

    //@GetMapping({"/", "/index", ""})
    @GetMapping("/index")
    public String getIndexPage(Model model) {

        account1 = account.getBalanceAccount();

        //account1 = 15;

        System.out.println(person3LastName);
        PersonTodo person3 = People.findById(People.size());
        System.out.println(id3.getFoundId());
        System.out.println(person3);
        String person3LastName = person3.getLastName();
        System.out.println(person3LastName);
        model.addAttribute("person1", person3LastName);
        model.addAttribute("balanceAccount", person3LastName);

        //model.addAttribute("balanceAccount", account1);

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
