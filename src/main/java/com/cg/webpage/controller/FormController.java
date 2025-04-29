package com.cg.webpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes({"firstName", "lastName", "email", "phoneNumber"})
public class FormController {

    @GetMapping("/")
    public String showPage1() {
        return "page1";
    }

    @PostMapping("/page2")
    public String goToPage2(@RequestParam String firstName,
                            @RequestParam String lastName,
                            Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return "page2";
    }

    @PostMapping("/page3")
    public String goToPage3(@RequestParam String email,
                            @RequestParam String phoneNumber,
                            Model model) {
        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phoneNumber);
        return "page3";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String city,
                             @RequestParam String country,
                             Model model) {
        model.addAttribute("city", city);
        model.addAttribute("country", country);
        return "page4";
    }
}

