package com.adopta.service.controller;
import com.adopta.service.entity.Mascota;
import com.adopta.service.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mascota")
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @GetMapping("/lista")
    public List<Mascota> vermascota(){
        return mascotaService.vermascota();
    }

    @PostMapping("/lista")
    public void crearmascota(@RequestBody Mascota mascota){
        mascotaService.crearmascota(mascota);
    }


}
