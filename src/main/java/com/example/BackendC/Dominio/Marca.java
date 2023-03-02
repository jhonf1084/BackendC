package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "Marcas")
public class Marca {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_marca")
    private Integer idMarca;
    private String marca;
}
