package com.example.BackendC.Control;

import com.example.BackendC.Dominio.Producto;
import com.example.BackendC.Servicio.Implementacion.ProductoImplementacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/producto")
public class ProductoControlador {

    private ProductoImplementacion productoImplementacion;

    public ProductoControlador(ProductoImplementacion productoImplementacion) {
        this.productoImplementacion = productoImplementacion;
    }

    @GetMapping("/{genero}/{termino}")
    public ResponseEntity<?> busquedaProducto(@PathVariable String genero, @PathVariable String termino) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoImplementacion.buscarPorDescripcionMarcaColor(genero, termino));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");

        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerProductoPorId(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoImplementacion.obtenerProductoPorId(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentra producto\"}");
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> actualizarBusquedasPorId(@PathVariable Integer id) {
        try {
            Optional<Producto> productoExistente = productoImplementacion.obtenerProductoPorId(id);
            return productoExistente.map(producto -> {
                try {
                    productoImplementacion.actualizarBusquedas(producto);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return ResponseEntity.status(HttpStatus.OK).body(producto);
            }).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentra producto\"}");
        }
    }

    @GetMapping({"/masBuscados"})
    public ResponseEntity<?> obtenerProductosMasBuscados() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoImplementacion.obtenerProductosMasBuscados());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error. no se encuentran productos\"}");
        }
    }

    @GetMapping("/genero/{genero}")
    public ResponseEntity<List<Producto>> obtenerProductoPorGenero(@PathVariable String genero){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoImplementacion.findProductoByGenero(genero));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
