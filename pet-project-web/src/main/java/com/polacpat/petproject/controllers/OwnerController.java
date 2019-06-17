package com.polacpat.petproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    @GetMapping({"/vets/index", "/vets/index.html"})
    public String listofOwners() {
        return "owners/index.html";
    }


}
