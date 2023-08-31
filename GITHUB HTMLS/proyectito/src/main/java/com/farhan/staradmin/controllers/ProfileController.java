package com.farhan.staradmin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "pages")

public class ProfileController {
    @GetMapping(value = "miperfil")
    public String miperfil() {
        return "pages/pages-profile";
    }
}
