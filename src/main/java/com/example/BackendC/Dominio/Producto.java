package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "Productos")
public class Producto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_color")
    Color color;

    @ManyToOne
    @JoinColumn(name = "id_talla")
    Talla talla;
    private Double valor;
    private Integer stock;
    private Integer busquedas;
    private String imagen;

}

