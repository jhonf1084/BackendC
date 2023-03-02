package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "Tallas")
public class Talla {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_talla")
    private Integer idTalla;
    private String talla;

    public Talla() {
    }

    public Talla(Integer idTalla, String talla) {
        this.idTalla = idTalla;
        this.talla = talla;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
