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
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Talla talla;
    private Double valor;
    private Integer stock;
    private Integer busquedas;
    private String imagen;

}

