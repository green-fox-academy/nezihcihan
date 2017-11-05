package com.greenfox.nezih.reddit.controller;

import com.greenfox.nezih.reddit.module.PostService;
import com.greenfox.nezih.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class postController {
    @Autowired
    PostRepository postRepository;
    @Autowired
    PostService postService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return  "posts";
    }
    @GetMapping("/{id}/up")
    public String up(@PathVariable long id) {
        postService.scoreUp(id);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/down")
    public String down(@PathVariable long id) {
        postService.scoreDown(id);
        return "redirect:/posts";
    }

}
