package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name ="Generos")
public class Genero {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_genero")
    private Integer idGenero;
    private String genero;
}
