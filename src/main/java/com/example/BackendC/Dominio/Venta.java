package com.example.BackendC.Dominio;

import jakarta.persistence.*;
import org.hibernate.annotations.JoinColumnOrFormula;

import java.util.Date;

@Entity
@Table(name = "Ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Integer idVenta;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @Column (name = "ciudad_de_envio")
    private String ciudadDeEnvio;
    @Column(name = "direccion_correspondencia")
    private String direccionCorrespondencia;
    @Column(name = "correo_facturacion")
    private String correoFacturacion;
}
