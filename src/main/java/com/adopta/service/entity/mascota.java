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
public class mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id" , nullable = false)
    private Long id;
    private String tipoanimal;
    private String edad;
    private String raza;
    private String color;
    private String nombre;
    private String nombrecorte;
    private LocalDate fechaingreso;
}
