package com.example.BackendC.Dominio;

import jakarta.persistence.*;

@Entity
@Table (name = "Tipos_Documento")
public class TipoDocumento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_tipo_documento")
    private Integer idTipDoc;
    @Column (name = "tipo_documento")
    private String tipoDocumento;
}
