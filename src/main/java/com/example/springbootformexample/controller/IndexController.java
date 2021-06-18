package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import com.example.springbootformexample.data.BlasterRepository;
import com.example.springbootformexample.data.People;
import com.example.springbootformexample.data.TodoItems;
import com.example.springbootformexample.dto.PeopleDTO;
import com.example.springbootformexample.model.BankAccount;
import com.example.springbootformexample.model.Category;
import com.example.springbootformexample.model.PersonTodo;
import com.example.springbootformexample.model.Todo;
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
    Todo todo1 = new Todo("First", true);

    @Autowired
    public IndexController(AnnonsRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/query")

    public String query
        (@RequestParam("category") Category category){

        System.out.println("Query");

        if (category.toString() == "H"){
            Todo todo2 = new Todo("Run", false);
        }
        else if (category.toString()=="FOREST"){
            Todo todo2 = new Todo("Defend", false);
            System.out.println(category);
        }



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


        return "redirect:/index";

    }

    @PostMapping("/sortby")

    public String sort(@RequestParam("category") Category category){
        System.out.println(category);
        if (category.toString() == "H"){
            PersonTodo person2 = new PersonTodo("Robert","Pires");
            account1 = account.deposit(100);
            sort = 1;
            System.out.println(category);
        }
        else if (category.toString()=="FOREST"){
            PersonTodo person2 = new PersonTodo("Martin","Keown");
            account1 = account.withdraw(100);
            sort = 2;
            System.out.println(category);
        }

        account1 = account.deposit(100);
        System.out.println(account1);

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
        //System.out.println(id3.getFoundId());
        System.out.println(person3);
        String person3LastName = person3.getLastName();
        System.out.println(person3LastName);
        Todo one = TodoItems.findById(TodoItems.size());
        one.setAssignee(person3);
        String desc = one.getDescription();
        model.addAttribute("person1", person3LastName);
        model.addAttribute("todoone", desc);
        Todo[] thymeleaf = TodoItems.findAll();
        model.addAttribute("categories",thymeleaf);

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
