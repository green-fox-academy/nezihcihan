package com.greenfox.nezih.tododatabase.controller;

import com.greenfox.nezih.tododatabase.module.Todo;
import com.greenfox.nezih.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = {"/{id}/delete"}, method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        return  new ModelAndView("redirect:/post");
    }
//
//    public void addTodo(Todo todo) {
//        repository.save(todo);
//    }
//
//    public void deleteTodo(String id) {
//        repository.delete(id);
//    }

}

