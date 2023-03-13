package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name ="generos")
public class Genero {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_genero")
    private Integer idGenero;
    @Column(name = "descripcion_genero")
    private String descripcionGenero;

    public Genero() {
    }

    public Genero(Integer idGenero, String descripcionGenero) {
        this.idGenero = idGenero;
        this.descripcionGenero = descripcionGenero;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getDescripcionGenero() {
        return descripcionGenero;
    }

    public void setDescripcionGenero(String descripcionGenero) {
        this.descripcionGenero = descripcionGenero;
    }
}
