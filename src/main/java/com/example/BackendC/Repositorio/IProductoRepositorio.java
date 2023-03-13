package com.example.BackendC.Repositorio;

import com.example.BackendC.Dominio.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {


    @Query("SELECT p FROM Producto p WHERE (LOWER(p.descripcion) LIKE LOWER(CONCAT('%',?1,'%'))  " +
            "OR LOWER(p.color.descripcionColor) LIKE LOWER(CONCAT('%',?1,'%') ) OR LOWER(p.marca.descripcionMarca) LIKE LOWER(CONCAT('%',?1,'%') )) AND p.genero.descripcionGenero = ?2  ")
    List<Producto> findProductoByDescripcionOrColorOrMarcaAndGenero( String genero,String termino);

    // Este Query tambien funciona
//    @Query("SELECT p FROM Producto p WHERE (p.descripcion LIKE %?1% OR p.color.descripcionColor LIKE %?1% OR p.marca.descripcionMarca LIKE %?1%) AND p.genero.descripcionGenero =?2")
//    List<Producto> findProductoByDescripcionOrColorOrMarcaAndGenero( String genero,String termino);

    List<Producto> findTop4ByOrderByBusquedasDesc();

    @Query("SELECT p FROM Producto p WHERE p.genero.descripcionGenero = ?1")
    List<Producto> findProductoByGenero(String genero);


}
