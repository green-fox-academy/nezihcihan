package com.greenfox.nezih.todos.controller;

import com.greenfox.nezih.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoRepository repository;

    @RequestMapping(value = {"/list","/"}, method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("todos", repository.findAll());
        return  "todo";
    }
}
