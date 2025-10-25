package com.adopta.service.entity;
import jakarta.persistence.*;
import lombok.*;

import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@AllArgsConstructor

@Getter
@Setter
@ToString
public class DocumentoAlmacenado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    private String nombre;
    private String fileName;
    private String extension;
    private String estado;
    private boolean eliminado;

    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private MultipartFile file;

    @Transient
    private String urlfile;

    public DocumentoAlmacenado() {
        id = 0L;
        nombre = "";
        fileName = "";
        extension = "";
        estado = "A";
        eliminado = false;
    }

    public String getCompleteFileName() {
        return fileName + extension;
    }



}
