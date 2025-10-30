package com.adopta.service.repository;

import com.adopta.service.entity.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopcionRepositorio extends JpaRepository<Adopcion, Long> {

}
