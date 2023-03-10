package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {

}
