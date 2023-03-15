package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IVentaRepositorio extends JpaRepository<Venta, Integer> {

    @Query("SELECT idVenta FROM Venta  WHERE usuario.idUsuario =:idUsuario ORDER BY idVenta DESC LIMIT 1")
    List<Venta> ultimoIdVenta(Integer idUsuario);

}
