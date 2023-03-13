package com.example.BackendC.Servicio.Implementacion;

import com.example.BackendC.Dominio.Producto;
import com.example.BackendC.Repositorio.IProductoRepositorio;
import com.example.BackendC.Servicio.InterfazServicio.IProductoServicio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoImplementacion implements IProductoServicio {

    private IProductoRepositorio iProductoRepositorio;

    public ProductoImplementacion(IProductoRepositorio iProductoRepositorio) {
        this.iProductoRepositorio = iProductoRepositorio;
    }

    @Override
    public List<Producto> buscarPorDescripcionMarcaColor(String genero,String termino) {
        return iProductoRepositorio.findProductoByDescripcionOrColorOrMarcaAndGenero(termino, genero);
    }

    @Override
    public Optional<Producto> obtenerProductoPorId(Integer id) throws Exception {
        try {
            return iProductoRepositorio.findById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public List<Producto> findProductoByGenero(String genero) throws Exception {
       try {
           return iProductoRepositorio.findProductoByGenero(genero);
       }catch (Exception e){
           throw new Exception(e.getMessage());
       }
    }

    @Override
    public void actualizarBusquedas(Producto producto) throws Exception {
        try {
            producto.setBusquedas(producto.getBusquedas() + 1);
            iProductoRepositorio.save(producto);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
