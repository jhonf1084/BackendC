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

    public Venta() {
    }

    public Venta(Integer idVenta, Date fecha, Usuario usuario, String ciudadDeEnvio, String direccionCorrespondencia, String correoFacturacion) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.usuario = usuario;
        this.ciudadDeEnvio = ciudadDeEnvio;
        this.direccionCorrespondencia = direccionCorrespondencia;
        this.correoFacturacion = correoFacturacion;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCiudadDeEnvio() {
        return ciudadDeEnvio;
    }

    public void setCiudadDeEnvio(String ciudadDeEnvio) {
        this.ciudadDeEnvio = ciudadDeEnvio;
    }

    public String getDireccionCorrespondencia() {
        return direccionCorrespondencia;
    }

    public void setDireccionCorrespondencia(String direccionCorrespondencia) {
        this.direccionCorrespondencia = direccionCorrespondencia;
    }

    public String getCorreoFacturacion() {
        return correoFacturacion;
    }

    public void setCorreoFacturacion(String correoFacturacion) {
        this.correoFacturacion = correoFacturacion;
    }
}
