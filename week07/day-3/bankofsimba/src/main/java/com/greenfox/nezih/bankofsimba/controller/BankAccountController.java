package com.greenfox.nezih.bankofsimba.controller;

import com.greenfox.nezih.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BankAccountController {

    @GetMapping("/account")
    public String account(Model model) {
        BankAccount account = new BankAccount("Simba",2000,"Lion",false,"Good Guy");
        model.addAttribute("balance", account.balance);
        model.addAttribute("name", account.name);
        model.addAttribute("animalType", account.animalType);
        return "bankaccount";
    }

    @PostMapping("/account")
    public String account(@ModelAttribute BankAccount account) {
        return "result";
    }

    @RequestMapping("/enjoy")
    public String message(Model model) {
        model.addAttribute("message", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }

    @GetMapping("/multiple")
    public String listAccounts(Model model) {
        ArrayList<BankAccount> accountList = new ArrayList<>();
        BankAccount accountSimba = new BankAccount("Simba",2000,"Lion",false,"Good Guy");
        BankAccount accountScar = new BankAccount("Scar",1500,"Lion",false,"Bad Guy");
        BankAccount accountPumba = new BankAccount("Pumba",1000,"Pig",false,"Bad Guy");
        BankAccount accountKing = new BankAccount("King",5000,"Lion",true,"Good Guy");
        accountList.add(accountSimba);
        accountList.add(accountScar);
        accountList.add(accountPumba);
        accountList.add(accountKing);
        model.addAttribute("accountList", accountList);
        return "multiple";
    }
    @PostMapping("/greeting")
    public String listAccounts(@ModelAttribute BankAccount bankAccount) {
        return "result";
    }
}
