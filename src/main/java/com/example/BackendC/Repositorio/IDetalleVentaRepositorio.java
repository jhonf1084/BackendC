package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDetalleVentaRepositorio extends JpaRepository<DetalleVenta, Integer> {

    @Query("FROM DetalleVenta WHERE venta.idVenta = :id")
    List<DetalleVenta> getByIdVenta(Integer id);

    List<DetalleVenta> findDetalleVentaByVenta(Integer id);
}
