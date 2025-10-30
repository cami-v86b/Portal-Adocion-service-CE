package com.adopta.service.controller;
import com.adopta.service.entity.Adopcion;
import com.adopta.service.service.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/adopcion")
public class AdopcionController {
    @Autowired
    AdopcionService adopcionService;

    @GetMapping("/lista")
    public List<Adopcion>  veradopciones(){
        return adopcionService.verescrito();
    }
    @PostMapping("/lista")
    public void regisadopcion(@RequestBody Adopcion adopcion){
        adopcionService.escribiradopta(adopcion);
        }


}
