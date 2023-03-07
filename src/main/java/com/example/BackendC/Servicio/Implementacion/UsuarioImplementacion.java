package com.example.BackendC.Servicio.Implementacion;

import com.example.BackendC.Dominio.Usuario;
import com.example.BackendC.Repositorio.IUsuarioRepositorio;
import com.example.BackendC.Servicio.InterfazServicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioImplementacion implements IUsuarioServicio {

    private IUsuarioRepositorio iUsuarioRepositorio;

    @Autowired
    public UsuarioImplementacion(IUsuarioRepositorio iUsuarioRepositorio) {
        this.iUsuarioRepositorio = iUsuarioRepositorio;
    }



    @Override
    public Boolean login(String correoUsuario, String contrasena) throws Exception {
        return null;
    }

    @Override
    public List<Usuario> findAll() throws Exception {
        try {
            return iUsuarioRepositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }


    }
}

