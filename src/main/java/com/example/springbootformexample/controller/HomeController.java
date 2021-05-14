package com.example.springbootformexample.controller;

import com.example.springbootformexample.data.AnnonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String getIndexPage(Model model) {
        //model.addAttribute("annonsDTOs", repository.findAllAsDTO());

        return "index";
    }
}
