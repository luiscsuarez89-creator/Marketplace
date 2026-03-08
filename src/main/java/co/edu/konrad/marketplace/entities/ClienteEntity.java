package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Definicion tabla producto
 * @author Luis 
 */
@Entity
public class ClienteEntity implements Serializable {

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCliente;

    /**
     * 
     */
    @Column(name = "nombre_cliente")
    private String nombreCliente;

    /**
     * 
     */
    @Column(name = "apellido_cliente")
    private String apellidoCliente;

    /**
     * 
     */
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    
    @Column(name = "numero_codumento")
    private int numeroDocumento;
    
    @JoinColumn(name = "tipo_documento")
    @ManyToOne
    private TipoDocumentoEntity tipoDocumento;

    public ClienteEntity() {
    }

    public ClienteEntity(long idCliente, String nombreCliente, String apellidoCliente, Date fechaNacimiento, int numeroDocumento, TipoDocumentoEntity tipoDocumento) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public TipoDocumentoEntity getTipoDocumento() {
        return tipoDocumento;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    
}
