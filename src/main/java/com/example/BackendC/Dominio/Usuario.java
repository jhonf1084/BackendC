package com.example.BackendC.Dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;


@Entity
@Table (name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private Integer idUsuario;
    @Column(nullable = false)
    @Pattern(regexp = "[a-zA-Z\s]+",message = "Solo letras y espacios")
    private String nombres;
    @Column(nullable = false)
    @Pattern(regexp = "[a-zA-Z\s]+",message = "Solo letras y espacios")
    private String apellidos;
    @Column(name = "numero_documento",nullable = false)
    @Pattern(regexp = "^[0-9]*$", message = "Solo numeros")
    private String numeroDocumento;
    @ManyToOne
    @JoinColumn (name = "id_tipo_documento",nullable = false)
    private TipoDocumento tipoDocumento;

    @Column (name = "correo_usuario",nullable = false)
    @Email(message = "El correo que intenta registrar no es valido")
    private String correoUsuario;
    @Column(name = "contraseña",nullable = false)
    @Pattern(regexp = "(?=^.{5,}$)((?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))^.*", message = "contraseña debe ser de longitud mínima 5, y debe contener letras mayúsculas,\n" +
            "letras minúsculas y números.\n")
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
