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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    PersonTodo person1 = new PersonTodo("Fredrik","Ljungberg"); // fixed in todoItems

    @PostMapping("/query")  //Input to TodoItems
    public String query
        (@RequestParam("category") Category category){
        if (category.toString() == "H"){ //Using enum from another project
            Todo todo2 = new Todo("Run", false);
        }
        else if (category.toString()=="FOREST"){ //Using enum from another project
            Todo todo2 = new Todo("Defend", false);
            System.out.println(category);
        }
        return "redirect:/index";
    }

    @PostMapping("/sortby") //Input to people
    public String sort(@RequestParam("category") Category category){
        if (category.toString() == "H"){ //Using enum from another project
            PersonTodo person2 = new PersonTodo("Robert","Pires");
            Todo one = TodoItems.findById(TodoItems.size());
            one.setAssignee(person2);
        }
        else if (category.toString()=="FOREST"){ //Using enum from another project
            PersonTodo person2 = new PersonTodo("Martin","Keown");
            Todo one = TodoItems.findById(TodoItems.size());
            one.setAssignee(person2);
        }
        return "redirect:/index";
    }

    @RequestMapping(value="/clearTodoItem")
    public String clearTodoItem() {
        TodoItems.clear();
        return "redirect:/index";
    }

    @RequestMapping(value="/eraseTodoItem")
    public String eraseTodoItem() {
        Boolean erase = TodoItems.remove(TodoItems.size());
        return "redirect:/index";
    }

    //@GetMapping({"/", "/index", ""}) save line for future development
    @GetMapping("/index") //Printing the userinterface
    public String getIndexPage(Model model) {
        PersonTodo person3 = People.findById(People.size());
        String person3LastName = person3.getLastName();
        Todo one = TodoItems.findById(TodoItems.size());
        if (one != null) {
            String desc = one.getDescription();
            model.addAttribute("person1", person3LastName);
            model.addAttribute("todoone", desc);
            Todo[] thymeleaf = TodoItems.findAll();
            model.addAttribute("categories", thymeleaf);
        }
        return "index";
    }


}
