package com.example.BackendC.Servicio.InterfazServicio;

import com.example.BackendC.Dominio.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoServicio {
    List<Producto> buscarPorDescripcionMarcaColor(String genero, String termino);

    Optional<Producto> obtenerProductoPorId(Integer id) throws Exception;

    List<Producto> findProductoByGenero(String genero) throws Exception;

    void actualizarBusquedas(Producto producto) throws Exception;

    List<Producto> obtenerProductosMasBuscados() throws Exception;

}
