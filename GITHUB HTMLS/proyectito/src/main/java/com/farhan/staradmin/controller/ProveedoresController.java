package com.farhan.staradmin.controller;

import com.farhan.staradmin.domain.Proveedor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "pages")
public class ProveedoresController {

    @GetMapping(value = "proveedores")
    public ModelMap mmProveedores() {
        ArrayList<Proveedor> provedoresTmp = new ArrayList<>();
        provedoresTmp.add(new Proveedor(1, "https://selectra.com.pe/sites/selectra.com.pe/files/images/logos/movistar-logo.png", "Movistar", "Compartida la vida es más Compartida la vida es más Compartida la vida es más Compartida la vida es más"));
        provedoresTmp.add(new Proveedor(2, "https://1000marcas.net/wp-content/uploads/2021/02/Claro-Logo.png", "Claro", "Para ti primero"));
        provedoresTmp.add(new Proveedor(3, "https://yt3.googleusercontent.com/bAzd9h3KSp1pw-ekPVr_NTmxsAeR3_Ug5TZSFUTUZI-9ctR7cFWQ3P1lgj0ChGkl6R4zTiCJiAE=s900-c-k-c0x00ffffff-no-rj", "Entel", "Vive mejor conectado"));
        ModelMap model = new ModelMap();
        model.addAttribute("proveedores", provedoresTmp);
        return model;
    }

}
