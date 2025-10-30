package com.adopta.service.repository;

import com.adopta.service.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface MascotaRepositorio extends JpaRepository<Mascota, Long> {
}
