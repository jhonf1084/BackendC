package com.example.BackendC.Control;

import com.example.BackendC.Dominio.DetalleVenta;
import com.example.BackendC.Dominio.Producto;
import com.example.BackendC.Servicio.Implementacion.DetalleVentaImplementacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/carroCompras")
public class DetalleVentaControlador {

    private DetalleVentaImplementacion detalleVentaImplementacion;

    public DetalleVentaControlador (DetalleVentaImplementacion detalleVentaImplementacion){
        this.detalleVentaImplementacion = detalleVentaImplementacion;
    }

    @PostMapping("/registrar")
    public ResponseEntity<DetalleVenta> registrarProducto(@RequestBody DetalleVenta detalleVenta) {
        try {
            detalleVentaImplementacion.registrarProducto(detalleVenta);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<DetalleVenta>> obtenerDetalleVentaById(@PathVariable Integer id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(detalleVentaImplementacion.obtenerDetalleByVenta(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetalleVenta> eliminarDetalleVentaPorId(@PathVariable Integer id){
        try {
            detalleVentaImplementacion.delete(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<DetalleVenta> actualizarInventario(@PathVariable Integer id){
        try {
            detalleVentaImplementacion.actualizarInventario(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
