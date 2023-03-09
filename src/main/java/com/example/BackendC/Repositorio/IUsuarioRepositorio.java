package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    Boolean existsByCorreoUsuario(String correoUsuario);

//    @Query("SELECT u FROM Usuario u WHERE u.numero_documento=:documento")
//    Usuario findByDocumento(String numeroDocumento);
}
