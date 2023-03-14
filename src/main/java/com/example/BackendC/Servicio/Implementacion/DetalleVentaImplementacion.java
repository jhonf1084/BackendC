package com.example.BackendC.Servicio.Implementacion;

import com.example.BackendC.Dominio.DetalleVenta;

import com.example.BackendC.Dominio.Producto;
import com.example.BackendC.Repositorio.IDetalleVentaRepositorio;

import com.example.BackendC.Repositorio.IProductoRepositorio;
import com.example.BackendC.Repositorio.IVentaRepositorio;
import com.example.BackendC.Servicio.InterfazServicio.IDetalleVentaServicio;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DetalleVentaImplementacion implements IDetalleVentaServicio {

    private IDetalleVentaRepositorio iDetalleVentaRepositorio;
    private IProductoRepositorio iProductoRepositorio;
    private IVentaRepositorio iVentaRepositorio;


    public DetalleVentaImplementacion(IDetalleVentaRepositorio iDetalleVentaRepositorio, IProductoRepositorio iProductoRepositorio, IVentaRepositorio iVentaRepositorio) {
        this.iDetalleVentaRepositorio = iDetalleVentaRepositorio;
        this.iProductoRepositorio = iProductoRepositorio;
        this.iVentaRepositorio = iVentaRepositorio;

    }


    @Override
    public DetalleVenta registrarProducto(DetalleVenta detalleVenta) throws Exception {
        try {
            detalleVenta.setSubTotal(detalleVenta.getProducto().getValor()* detalleVenta.getCantidad());
            return iDetalleVentaRepositorio.save(detalleVenta);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<DetalleVenta> obtenerDetalleByVenta(Integer id) throws Exception {
        try {
            return iDetalleVentaRepositorio.getByIdVenta(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void delete(Integer id) throws Exception {
        try {
            iDetalleVentaRepositorio.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public void actualizarInventario(Integer id) throws Exception {
        try {
            List<DetalleVenta> listDetalleVenta = iDetalleVentaRepositorio.findDetalleVentaByVenta(id);
            for (DetalleVenta detalleVenta : listDetalleVenta) {
                Integer idProducto = detalleVenta.getProducto().getIdProducto();
                Integer cantidad = detalleVenta.getCantidad();
                Producto producto = iProductoRepositorio.findById(idProducto).orElseThrow();

                Integer nuevoInventario = producto.getStock() - cantidad;
                producto.setStock(nuevoInventario);
                iProductoRepositorio.save(producto);
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}


