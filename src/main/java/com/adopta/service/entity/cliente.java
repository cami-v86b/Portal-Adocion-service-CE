package com.tren.transporte3.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id" , nullable = false)
    private Long id;
    private String nombrecompleto;
    private Integer edad;
    private String genero;
    private String ocupacion;
    private String estadocivil;
    private String correo;
    private String celular;
    private String direccion;
    private LocalDate fechaingreso;
}
