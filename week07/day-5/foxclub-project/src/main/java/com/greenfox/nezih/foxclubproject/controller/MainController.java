package com.greenfox.nezih.foxclubproject.controller;

import com.greenfox.nezih.foxclubproject.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    Fox fox;
    List<String> trickList;


    @GetMapping("/information")
    public String index(Model model) {
        model.addAttribute("fox",fox);
        return "index";
    }
    @GetMapping("/nutrition")
    public String nutrition(Model model) {
        model.addAttribute("fox",fox);
        return "nutrition";
    }

    @PostMapping("/addnutrition")
    public String addnutrition(String food, String drink) {
        this.fox.setFood(food);
        this.fox.setDrink(drink);
        return "redirect:/information";
    }

    @GetMapping("/tricks")
    public String trick(Model model) {
        model.addAttribute("fox",fox);
        return "tricks";
    }
    @PostMapping("/addtrick")
    public String addtrick(String trick) {
        fox.trickList.add(trick);
        fox.newTricks.remove(trick);
        return "redirect:/information";
    }
}
