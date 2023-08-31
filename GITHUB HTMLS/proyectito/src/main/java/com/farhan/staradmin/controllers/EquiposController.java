package com.farhan.staradmin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "pages")

public class EquiposController {
    @GetMapping(value = "equipos")
    public ModelMap mmEquipos() {
        return new ModelMap();
    }
}



