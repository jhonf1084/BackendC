package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {


}
