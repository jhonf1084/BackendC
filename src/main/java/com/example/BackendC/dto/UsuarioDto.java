package com.example.BackendC.dto;

import com.example.BackendC.Dominio.TipoDocumento;
import com.example.BackendC.Dominio.Usuario;


public class UsuarioDto {
    private Integer idUsuario;
    private String nombres;
    private String apellidos;
    private String numeroDocumento;
    private TipoDocumento tipoDocumento;
    private String correoUsuario;
    private String contrasena;

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

    public Usuario getUserFromDto() {
        Usuario usuario = new Usuario();
        usuario.setNombres(nombres);
        usuario.setApellidos(apellidos);
        usuario.setNumeroDocumento(numeroDocumento);
        usuario.setTipoDocumento(tipoDocumento);
        usuario.setCorreoUsuario(correoUsuario);
        usuario.setContrasena(contrasena);

        return usuario;

    }
}
