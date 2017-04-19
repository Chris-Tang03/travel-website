package com.christang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {

    @Autowired
    TravelRepository repo;

    @GetMapping("/")
    public String home(Model model, String search){
        model.addAttribute("search", search);
        model.addAttribute("countries", repo.listCountry(search));
        return "home";
    }

    @GetMapping("/travelTip")
    public String travelTip(){
        return "travelTip";
    }
}
