package com.example.clase1gtics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/job")
    @ResponseBody
    public String paginaPrincipal(){
        //SPRING ESPERARÁ QUE TÚ LE PONGAS EL NOMBRE DE LA VISTA QUE QUIERAS PONER
        return "Hola Mundo GAAAAA";
    }
}
