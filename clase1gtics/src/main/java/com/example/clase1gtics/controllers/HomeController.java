package com.example.clase1gtics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//DEBO DECIRLE A SPRING QE ESTO ES UN CONTROLLER
//ESE SIMBOLITO ES UN FRIJOL, Y POR LO TANTO SIGNIFICA bean

@Controller
public class HomeController {

    //CUANDO ALGUIEN PONGA LA RUTA DEL INDEX EN EL NAVEGADOR, ESTO VA A LLEGAR AQUÍ:
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        //SPRING ESPERARÁ QUE TÚ LE PONGAS EL NOMBRE DE LA VISTA QUE QUIERAS PONER
        return "Hola Mundo GAAAAA";
    }

    //AHORA ENVÉS DE LOS SWITCH Y CASES, AHORA CREAMOS OTRO METODO
    @RequestMapping(value = {"/empleado", "/employee", "/emp"})
    public String empleado(){
        //SPRING ESPERARÁ QUE TÚ LE PONGAS EL NOMBRE DE LA VISTA QUE QUIERAS PONER

        //PARA RESPONDER CON UN VISTA, DEBO BORRAR ResponseBody
        return "pag1";
    }

    //thymeleaf


}
