package com.adopta.service.service;

import com.adopta.service.entity.Mascota;
import com.adopta.service.repository.MascotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService {
    @Autowired
    MascotaRepositorio mascotaRepositorio;

    public void crearmascota(Mascota mascota){
        mascotaRepositorio.save(mascota);
    }
    public List<Mascota> vermascota(){
        List<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.addAll(mascotaRepositorio.findAll());
        return mascotas;
    }

}
