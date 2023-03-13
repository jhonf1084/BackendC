package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "tallas")
public class Talla {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_talla")
    private Integer idTalla;
    @Column (name = "descripcion_talla")
    private String decripcionTalla;

    public Talla() {
    }

    public Talla(Integer idTalla, String decripcionTalla) {
        this.idTalla = idTalla;
        this.decripcionTalla = decripcionTalla;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public String getDecripcionTalla() {
        return decripcionTalla;
    }

    public void setDecripcionTalla(String decripcionTalla) {
        this.decripcionTalla = decripcionTalla;
    }
}
