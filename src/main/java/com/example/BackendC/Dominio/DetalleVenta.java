package com.example.BackendC.Dominio;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    private Integer cantidad;
    private Double subTotal;

}
