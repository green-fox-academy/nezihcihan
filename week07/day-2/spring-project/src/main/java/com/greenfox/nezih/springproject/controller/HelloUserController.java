package com.greenfox.nezih.springproject.controller;

import com.greenfox.nezih.springproject.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloUserController {

    @RequestMapping("/greeting2")
    public List<Greeting> greetWithName(@RequestParam(name = "name") String name) {
        return Arrays.asList(new Greeting("Hello " + name));
    }
}
