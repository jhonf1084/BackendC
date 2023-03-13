package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "Productos")
public class Producto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;
    @Column(name = "descripcion")
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
    @Column(name = "valor")
    private Double valor;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "busquedas")
    private Integer busquedas;
    @Column(name = "imagen")
    private String imagen;

    public Producto() {
    }

    public Producto(Integer idProducto, String descripcion, Marca marca, Genero genero, Color color, Talla talla, Double valor, Integer stock, Integer busquedas, String imagen) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.marca = marca;
        this.genero = genero;
        this.color = color;
        this.talla = talla;
        this.valor = valor;
        this.stock = stock;
        this.busquedas = busquedas;
        this.imagen = imagen;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getBusquedas() {
        return busquedas;
    }

    public void setBusquedas(Integer busquedas) {
        this.busquedas = busquedas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

