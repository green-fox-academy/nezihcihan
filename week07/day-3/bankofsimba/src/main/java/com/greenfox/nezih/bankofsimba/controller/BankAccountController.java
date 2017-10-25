package com.greenfox.nezih.bankofsimba.controller;

import com.greenfox.nezih.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BankAccountController {

    @GetMapping("/account")
    public String greetingForm(Model model) {
        BankAccount account = new BankAccount("Simba",2000,"lion");
        model.addAttribute("balance", account.balance);
        model.addAttribute("name", account.name);
        model.addAttribute("animalType", account.animalType);
        return "bankaccount";
    }

    @PostMapping("/account")
    public String greetingSubmit(@ModelAttribute BankAccount account) {
        return "result";
    }

    @RequestMapping("/enjoy")
    public String greeting(Model model) {
        model.addAttribute("message", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }


}
