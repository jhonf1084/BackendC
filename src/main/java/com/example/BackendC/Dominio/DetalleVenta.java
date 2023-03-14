package com.example.BackendC.Dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.util.List;

@Entity
@Table(name = "Detalle_venta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detalle_venta")
    private Long idDetalle;

    @ManyToOne
    @JoinColumn(name = "consecutivo_venta")
    private Venta venta;
    @ManyToOne
    @JoinColumn(name = "producto")
    private Producto producto;
    @Column(nullable = false)
    @Pattern(regexp = "^[0-9]*$", message = "Solo numeros")
    private Integer cantidad;
    private Double subTotal;

    public DetalleVenta() {
    }

    public DetalleVenta(Long idDetalle, Venta venta, Producto producto, Integer cantidad, Double subTotal) {
        this.idDetalle = idDetalle;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
}
