package com.tienda.controller;

import com.tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {

        var lista = categoriaService.getCategorias(false);
        
        
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());  
     /*model.addAttribute(attributeName: "saludo", attributeValue:"Hola mundo");
       model.addAttribute(attributeName: "totalCategorias", attributeValue:4);
        
        */
      return "/categoria/listado";

    }

}
