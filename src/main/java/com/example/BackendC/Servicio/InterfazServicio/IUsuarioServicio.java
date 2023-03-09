package com.example.BackendC.Servicio.InterfazServicio;


import com.example.BackendC.Dominio.Usuario;

import java.util.List;

public interface IUsuarioServicio {

    Usuario registro(Usuario usuario) throws Exception;

    Boolean login(String correoUsuario, String contrasena) throws Exception;

    List<Usuario> findAll() throws Exception;

    //Usuario findByDocumento (String documento) throws Exception;


}
