package com.adopta.service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Mascota {
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
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "checkadoptado_id")
    private Adopcion checkadoptado;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imagen_id")
    private DocumentoAlmacenado imagen;


}
