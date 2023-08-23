package com.example.clase1gtics.controllers;

import com.example.clase1gtics.entity.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.SecureRandom;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    //HACEMOS EL PRIMERO DE TODOS, ES DECIR, el listado
    @GetMapping(value = "")
    public String listar() {
        return "persona/lista";
    }

    //SI ALGUIEN HACE LA URL DE GUARDAR, VA A GUARDAR Y VA A IMPRIMIR ESTO EN CONSOLA, ES MÁS
    //LO VA A REDIRIGIR A UN HTML DONDE ESO SE ESTÉ MOSTRANDO
    @PostMapping("/guardar")
    public String guardar(Model model,
                          @RequestParam("nombre") String nombresito,
                          @RequestParam("apellido") String apellidito,
                          @RequestParam("edad") String edadStr
                          ) {
        System.out.println("nombre recibido: " + nombresito);
        System.out.println("apellido recibido: " + apellidito);
        System.out.println("edad recibida: " + edadStr);

        //VOY A GUARDAR EL NOMBRESITO QUE HE RECIBIDO EN EL APELLIDO
        /* model.addAttribute("nombresote",nombresito);
        model.addAttribute("apellidote",apellidito);
        model.addAttribute("edadMostrar", edadStr); */
        //INSTANCIAMOS UNA PERSONA, PARA ASÍ PONERLE su nombre y apellido.
        //NOTEMOS QUE NO ESTAMOS HACIENDO REQUEST DE NINGÚN APELLIDO EN EL FORO, SOLO LO ESTAMOS PONIENDO Y YA
        Persona p = new Persona();
        p.setNombre(nombresito);
        p.setApellido(apellidito);
        try {
            int edadEntera = Integer.parseInt(edadStr);
            p.setEdad(edadEntera);
        } catch (NumberFormatException numExcep) {
            p.setEdad(0);
        }
        // GUARDAMOS p EN BASE DE DATOS
        // int idPersona = bd.getTable("persona").save(p)
        // FIN GUARDADO BASE DE DATOS
        //ACÁ SE ESTARÁ ENVIANDO EL DATO almacenado en la varibale p, y se está guardando en la variable "persona"
        model.addAttribute("personajebarbaro", p);
        return "persona/datos";
    }

    //SÍ, JUSTAMENTE ESTO ES, SI ALGUIEN NOS MANDA COMO RESPUESTA ESTA URL, entonces lo vamos a redireccionar al html persona/newPersona
    //persona/crearform
    @GetMapping("/crearform")
    public String crear() {
        return "persona/newPersona";
    }



}
