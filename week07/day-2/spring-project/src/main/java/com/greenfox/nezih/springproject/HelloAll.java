package com.greenfox.nezih.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.Random;
@Controller
public class HelloAll {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
            "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour","Guten Tag", "Gia'sou",
            "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn",
            "Halo", "Aksunai", "Qanuipit", "Dia dhuit","Salve", "Ciao", "Kon-nichiwa",
            "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua",
            "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej","Sa-wat-dee", "Merhaba", "Selam",
            "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};



    @RequestMapping("/web")
    public String greeting(Model model) {
        model.addAttribute("greeting", randomPicker(hellos));
        model.addAttribute("color", randomcolor());
        return "GreetAll";
    }
    public String randomcolor (){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);
        String color = "color:rgb(" + R + "," + G + "," + B + ");";
        return color;
    }
    public String randomPicker(String[] hellos){
        Random random = new Random();
        return hellos[random.nextInt(hellos.length-1)];
    }


}