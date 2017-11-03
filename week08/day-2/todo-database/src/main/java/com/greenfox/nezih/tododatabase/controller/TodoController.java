package com.greenfox.nezih.tododatabase.controller;

import com.greenfox.nezih.tododatabase.module.Todo;
import com.greenfox.nezih.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.persistence.Table;
import java.util.List;

@Controller
@RequestMapping("/todo")

public class TodoController {
    @Autowired
    TodoRepository repository;

    @RequestMapping(value = {"/list","/"}, method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("todos", repository.findAll());
        return  "todo2";
    }
    @RequestMapping(value = "/new", method = RequestMethod.GET)
        public String newTodo() {
        return "new";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("message") String title) {
        repository.save(new Todo(title));
        return new ModelAndView("redirect:/todo/");
    }

    @RequestMapping(value = {"/{id}/delete"}, method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        return  new ModelAndView("redirect:/todo/");
    }

    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateEntry(@ModelAttribute Todo todo){
        repository.save(todo);
        return "redirect:/todo/";
    }

    @RequestMapping(value="/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id, Model model) {
        Todo todo = repository.findOne(id);
        model.addAttribute("todo", todo);
        repository.equals(todo);
        return "edit";
    }



    @GetMapping("/bytitle")
    public String findByTitle(Model model, String title) {
        List byTitle = repository.findAllByTitle(title);
        model.addAttribute("byTitle", byTitle);
        return "bytitle";
    }
}

