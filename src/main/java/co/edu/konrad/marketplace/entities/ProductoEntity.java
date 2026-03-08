package co.edu.konrad.marketplace.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Definicion tabla producto
 * @author Luis 
 */
@Entity
public class ProductoEntity implements Serializable {

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProducto;

    /**
     * 
     */
    @Column(name = "nombre_producto")
    private String nombreProducto;

    /**
     * 
     */
    @Column
    private String marca;

    /**
     * 
     */
    @Column(nullable = true, unique = false)
    private double valorUnitario;

    /**
     * 
     */
    public ProductoEntity() {
    }

    /**
     * 
     * @param idProducto
     * @param nombreProducto
     * @param marca
     * @param valorUnitario 
     */
    public ProductoEntity(long idProducto, String nombreProducto, String marca, double valorUnitario) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.valorUnitario = valorUnitario;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    

}
