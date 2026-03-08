package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Definicion tabla producto
 *
 * @author Luis
 */
@Entity
public class TipoDocumentoEntity implements Serializable {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoDocumento;

    /**
     *
     */
    @Column(name = "nombre_tipo_documento", nullable = false, unique = true)
    private String nombreTipoDoc;

    public TipoDocumentoEntity() {
    }

    /**
     *
     * @param idTipoDocumento
     * @param nombreTipoDoc
     */
    public TipoDocumentoEntity(long idTipoDocumento, String nombreTipoDoc) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombreTipoDoc = nombreTipoDoc;
    }

    public long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public String getNombreTipoDoc() {
        return nombreTipoDoc;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public void setNombreTipoDoc(String nombreTipoDoc) {
        this.nombreTipoDoc = nombreTipoDoc;
    }

}
