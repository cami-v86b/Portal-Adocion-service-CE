package com.adopta.service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id" , nullable = false)
    private Integer id;
    private String email;
    private String clave;
    private boolean vigencia;


}
