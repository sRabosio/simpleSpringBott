package com.example.Buttare;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class MyController {
    @RequestMapping(value = "/home")
    public String getHome(@RequestParam(value = "name", required = false) String nome, Model model){
        System.out.println("\n\n\n vado in home");
        return "homepage";
    }

    @GetMapping("/somma")
    public String getCalc(@RequestParam("val1") int val1, @RequestParam("val2") int val2, Model model){
        int ris = val1 + val2;
        model.addAttribute("val1", val1);
        model.addAttribute("val2", val2);
        model.addAttribute("ris", ris);
        return "calcolatrice";
    }
}
