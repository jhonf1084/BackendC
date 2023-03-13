package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "marcas")
public class Marca {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_marca")
    private Integer idMarca;
    @Column(name = "descripcion_marca")
    private String descripcionMarca;

    public Marca() {
    }

    public Marca(Integer idMarca, String descripcionMarca) {
        this.idMarca = idMarca;
        this.descripcionMarca = descripcionMarca;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }
}
