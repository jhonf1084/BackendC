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
}
