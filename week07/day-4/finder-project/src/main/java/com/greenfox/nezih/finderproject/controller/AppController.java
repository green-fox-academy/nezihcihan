package com.greenfox.nezih.finderproject.controller;

import com.greenfox.nezih.finderproject.UserService.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class AppController {
    @Autowired
    UserService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "index";
    }
    @PostMapping("/app")
    public String create() {
        service.save(new User());
        return "redirect:/";
    }
}
