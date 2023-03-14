package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDocumento extends JpaRepository<TipoDocumento,Integer> {
}
