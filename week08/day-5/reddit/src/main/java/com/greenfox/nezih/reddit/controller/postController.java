package com.greenfox.nezih.reddit.controller;

import com.greenfox.nezih.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class postController {
    @Autowired
    PostRepository postRepository;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return  "posts";
    }

}
