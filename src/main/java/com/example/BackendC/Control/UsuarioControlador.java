package com.example.BackendC.Control;

import com.example.BackendC.Dominio.Usuario;
import com.example.BackendC.Servicio.Implementacion.UsuarioImplementacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/Api/usuario")
public class UsuarioControlador {

    private UsuarioImplementacion usuarioImplementacion;

    public UsuarioControlador(UsuarioImplementacion usuarioImplementacion) {
        this.usuarioImplementacion = usuarioImplementacion;
    }

//    @PostMapping("/Registro")
//    public ResponseEntity<?> registro(@RequestBody Usuario usuario) {
//        try {
//            this.usuarioImplementacion.save(usuario);
//            return ResponseEntity.status(HttpStatus.OK).body("{\"status\":\"success\"}");
//        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//        }
//    }

    @GetMapping("/consultaUsuarios")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioImplementacion.findAll());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
