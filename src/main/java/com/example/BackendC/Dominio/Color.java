package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "colores")
public class Color {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_color")
    private Integer idColor;
    @Column(name = "descripcion_color")
    private String descripcionColor;

    public Color() {
    }

    public Color(Integer idColor, String descripcionColor) {
        this.idColor = idColor;
        this.descripcionColor = descripcionColor;
    }

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

    public String getDescripcionColor() {
        return descripcionColor;
    }

    public void setDescripcionColor(String descripcionColor) {
        this.descripcionColor = descripcionColor;
    }
}
