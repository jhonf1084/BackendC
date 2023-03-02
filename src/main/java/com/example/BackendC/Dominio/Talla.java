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
}
