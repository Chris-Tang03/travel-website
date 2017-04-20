package com.christang.controller;

import com.christang.bean.TravelRepository;
import com.christang.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {

    @Autowired
    TravelService service;

    @GetMapping("/")
    public String home(Model model, String country){
        model.addAttribute("country", country);
        model.addAttribute("countries", service.listCountries());
        return "home";
    }

    @GetMapping("/travelTip")
    public String travelTip(){
        return "travelTip";
    }
}
