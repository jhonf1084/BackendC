package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private Integer idUsuario;
    private String nombres;
    private String apellidos;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @ManyToOne
    @JoinColumn (name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;

    @Column (name = "correo_usuario")
    private String correoUsuario;
    @Column(name = "contraseña")
    private String contrasena;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombres, String apellidos, String numeroDocumento, TipoDocumento tipoDocumento, String correoUsuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.correoUsuario = correoUsuario;
        this.contrasena = contrasena;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
