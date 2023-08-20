package com.example.clase1gtics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//EL HomeController es un Controller general por así decirlo para gestionar a todos los demás controladores
//LOS CONTROLADORES GESTIONAN SOLICITUDES HTTP

//DEBO DECIRLE A SPRING QUE ESTO ES UN CONTROLLER, POR ESO PONGO @Controller
@Controller
//ESE SIMBOLITO ES UN FRIJOL, Y POR LO TANTO SIGNIFICA bean
//ESTA ES UNA CLASE POJO
public class HomeController {

    //USAMOS @RequestMapping PARA INDICAR CUAL ES LA RUTA (url web) que identificará a este controlador
    //PARA MAPEAR LA RUTA RAÍZ ESTAMOS UTILIZANDO "/"
    //ES TAMBIEN IMPORTANTE PONER EL MÉTODO, EN ESTE CASO, ES METODO GET, PERO PODRÍA SER: GET, POST, PUT Y DELETE
    @RequestMapping(value = "/",method = RequestMethod.GET)
    //AHORA, USAREMOS @ResponseBody para que se responda lo que dice en return, si no quieres que se uestra exactamente eso, lo quitas
    @ResponseBody
    public String paginaPrincipal(){
        return "hola ciclo 2023-2 :D";
    }

    //ESTO ES UNA VISTA QUE YO ESTOY AÑADIENDO A MODO DE EJEMPLO
    @RequestMapping(value = {"/holaMundo"})
    public String holiwis(){
        //NOTAR QUE NO ES NECESARIO DECIR QUE ESTOY USANDO LA EXTENSIÓN HTML, ES QUE YA SE ASUME POR DEFECTO
        //NO PONGO NINGÚN SLASH PORQUE DIRECTAMENTE SE AGREGA DE LA CARPETA TEMPLATES
        return "hola";
    }

    //NOTAR QUE AQUÍ HEMOS MAPEADO MULTIPLES RUTAS PARA EL MISMO METODO
    @RequestMapping(value = {"/empleado1","/employee1","/em1"})
    public String empleado(){
        //Seguimos retornando un html
        return "pag1";
    }
}
