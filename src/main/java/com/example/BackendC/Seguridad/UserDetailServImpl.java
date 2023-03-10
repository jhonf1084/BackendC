package com.example.BackendC.Seguridad;

import com.example.BackendC.Dominio.Usuario;
import com.example.BackendC.Repositorio.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServImpl implements UserDetailsService {

    @Autowired
    private IUsuarioRepositorio iUsuarioRepositorio;


    @Override
    public UserDetails loadUserByUsername(String correoUsuario) throws UsernameNotFoundException {
        Usuario usuario = iUsuarioRepositorio
                .findOneBycorreoUsuario(correoUsuario)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con correo " + correoUsuario + " no existe"));

        return new UserDetailsImpl(usuario);
    }
}
