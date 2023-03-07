package com.example.BackendC.Servicio.InterfazServicio;

import com.example.BackendC.Dominio.TipoDocumento;
import com.example.BackendC.Dominio.Usuario;

import java.util.List;

public interface IUsuarioServicio {



    Boolean login(String correoUsuario, String contrasena) throws Exception;

    List<Usuario> findAll() throws Exception;


}
