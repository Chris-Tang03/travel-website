package com.christang.controller;

import com.christang.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {

    @Autowired
    CountryService service;

    @GetMapping("/")
    public String home(Model model, @RequestParam (defaultValue = "") String alpha3Code){
        model.addAttribute("alpha3Code", alpha3Code);
        model.addAttribute("countries", service.listCountries());
        if(alpha3Code.length() == 3){
            model.addAttribute("country", service.getCountryByCode(alpha3Code));
        }
        return "home";
    }

    @GetMapping("/travelTip")
    public String travelTip(){
        return "travelTip";
    }
}
