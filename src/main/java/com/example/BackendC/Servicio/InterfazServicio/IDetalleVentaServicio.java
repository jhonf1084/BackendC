package com.example.BackendC.Servicio.InterfazServicio;

import com.example.BackendC.Dominio.DetalleVenta;
import com.example.BackendC.Dominio.Producto;

import java.util.List;


public interface IDetalleVentaServicio {

    DetalleVenta registrarProducto(DetalleVenta detalleVenta) throws Exception;

    List<DetalleVenta> obtenerDetalleByVenta(Integer id) throws Exception;

    void delete(Integer id) throws Exception;

    void actualizarInventario(Integer id) throws Exception;

}
