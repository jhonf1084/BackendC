package com.example.BackendC.Seguridad;

public class AuthCredentials {
    private String correoUsuario;
    private String contrasena;

    public String getcorreoUsuario() {
        return correoUsuario;
    }

    public void setcorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
