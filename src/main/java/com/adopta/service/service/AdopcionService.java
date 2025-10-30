package com.adopta.service.service;

import com.adopta.service.entity.Adopcion;
import com.adopta.service.repository.AdopcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdopcionService {
    @Autowired
    AdopcionRepositorio adopcionRepositorio;

    public void escribiradopta(Adopcion adopcion){
        adopcionRepositorio.save(adopcion);

    }

    public List<Adopcion> verescrito(){
        List<Adopcion> adopciones = new ArrayList<Adopcion>();
        adopciones.addAll(adopcionRepositorio.findAll());
        return adopciones;

    }




}
