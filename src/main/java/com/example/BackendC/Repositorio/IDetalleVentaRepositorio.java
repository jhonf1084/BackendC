package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleVentaRepositorio extends JpaRepository <DetalleVenta, Integer> {
}
