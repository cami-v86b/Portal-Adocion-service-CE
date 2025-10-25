package com.adopta.service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class duenorefugio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Integer id;
    private String representante;
    private String direccion;
    private String localidad;
    private String correo;
    private String refugio;
    private boolean vigencia;





}
