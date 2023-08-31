package com.example.clase1gtics.controllers;

import com.example.clase1gtics.entity.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//GET TRAE DATOS
//POST GUARDA DATOS, POR LO QUE YO DESDE LA VISTA MANDO DATOS PARA QUE SE GUARDEN

@Controller
@RequestMapping("/job")
public class JobController {

    //  /job
    //NOTAR QUE HEMOS USADO GetMapping PORQUE ESTAMOS ASUMIENDO QUE EL MÉTODO ES GET
    //ESTO ES LO MISMO QUE @RequestMapping(value = "",method = RequestMethod.GET)
    @GetMapping(value = "")
    public String listar() {
        return "job/lista";
    }

    //  /job/buscar?id=[id]&nombre=[nom]&apellido=[ap]
    @GetMapping("/buscar")
    public String buscar(@RequestParam(name = "apellido", required = false) String ape,
                         @RequestParam(name = "id", required = false) Integer id,
                         @RequestParam("nombre") String nombre) {
        System.out.println("nombre recibido: " + nombre);
        System.out.println("apellido recibido: " + ape);
        System.out.println("id recibido: " + id);
        return "job/lista";
    }

    //  /job/buscarF2/[id]/[nombre]/[apellido]
    @GetMapping("/buscarF2/{id}/{nombre}/{apellido}")
    public String buscarF2(@PathVariable("id") String id,
                           @PathVariable("nombre") String nombre,
                           @RequestParam("dni") String dni) {
        System.out.println("nombre recibido: " + nombre);
        System.out.println("id recibido: " + id);
        System.out.println("dni recibido: " + dni);
        return "job/lista";
    }

    //AHORA VAMOS A HACER COMO UN COMBINADA, VAMOS A HACER REQUEST DE INFORMACIÓN, LA VAMOS A ALMACENAR ACÁ Y DE AHÍ LA VAMOS
    //A VOLVER A ENVIAR A LAS VISTAS
    //   /job/guardar
    //NOTAR QUE HEMOS USADO PostMapping PORQUE ESTAMOS ASUMIENDO QUE EL MÉTODO ES POST
    //ESTO ES LO MISMO QUE @RequestMapping(value = "/guardar",method = RequestMethod.POST)
    @PostMapping("/guardar")
    public String guardar(Model model,
                          @RequestParam("id") Integer idbamba,
                          @RequestParam("nombre") String nombre) {
        System.out.println("nombre recibido: " + nombre);
        System.out.println("id recibido: " + idbamba);

        //EL MODEL ES EL QUE SE VA A ENCARGAR DE GUARDAR LOS DATOS EN LA BASE DE DATOS
        model.addAttribute("id",idbamba);
        model.addAttribute("nombre",nombre);
        //INSTANCIAMOS UNA PERSONA, PARA ASÍ PONERLE su nombre y apellido.
        //NOTEMOS QUE NO ESTAMOS HACIENDO REQUEST DE NINGÚN APELLIDO EN EL FORO, SOLO LO ESTAMOS PONIENDO Y YA
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setApellido("Perez");

        //ACÁ SE ESTARÁ ENVIANDO EL DATO almacenado en la varibale p, y se está guardando en la variable "persona"
        //De hecho, la variable "persona" (la que está entre comillas y es de color verde) es el dato que se va a mandar a la vista html
        model.addAttribute("persona",p);
        return "job/datos";
    }

    //job/crearform
    @GetMapping("/crearform")
    public String crear() {
        return "job/newJob";
    }

}
