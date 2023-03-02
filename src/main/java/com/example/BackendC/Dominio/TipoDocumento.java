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

    public TipoDocumento() {
    }

    public TipoDocumento(Integer idTipDoc, String tipoDocumento) {
        this.idTipDoc = idTipDoc;
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getIdTipDoc() {
        return idTipDoc;
    }

    public void setIdTipDoc(Integer idTipDoc) {
        this.idTipDoc = idTipDoc;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
