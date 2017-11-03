package com.greenfox.nezih.tododatabase.controller;

import com.greenfox.nezih.tododatabase.module.Assignee;
import com.greenfox.nezih.tododatabase.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/assignees")
public class AssigneeController {

    @Autowired
    private AssigneeRepository assigneeRepository;

    @RequestMapping({"", "/"})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }
    @GetMapping("/addnewassignee")
    public String newAssignee(Model model) {
        model.addAttribute("newAssignee", new Assignee());
        return "addassignee";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }

    @DeleteMapping("/{id}/delete")
    public String deleteAssignee(@PathVariable long id) {
        assigneeRepository.delete(id);
        return"redirect:/assignees";
    }

    @GetMapping("/{id}/edit")
    public String editAssignee(@PathVariable long id, Model model) {
        Assignee assignee = assigneeRepository.findOne(id);
        model.addAttribute("assignee", assignee);
        return"editassignee";
    }

    @PostMapping("/{id}/edit")
    public String editAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }
}
