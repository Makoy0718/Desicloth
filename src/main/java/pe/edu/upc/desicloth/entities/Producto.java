package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "tipoProducto", length = 50,nullable = false)
    private String tipoProducto;

    @Column(name = "nombreProducto", length = 50,nullable = false)
    private String nombreProducto;

    @Column(name = "descripcionProducto", length = 50,nullable = false)
    private String descripcionProducto;

    @Column(name = "tallaProducto", length = 3,nullable = false)
    private char tallaProducto;

    @Column(name = "precioProducto",nullable = false)
    private int precioProducto;

    public Producto() {

    }

    public Producto(int idProducto, String tipoProducto, String nombreProducto, String descripcionProducto, char tallaProducto, int precioProducto) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.tallaProducto = tallaProducto;
        this.precioProducto = precioProducto;
    }

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getTipoProducto() { return tipoProducto; }
    public void setTipoProducto(String tipoProducto) { this.tipoProducto = tipoProducto; }

    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public String getDescripcionProducto() { return descripcionProducto; }
    public void setDescripcionProducto(String descripcionProducto) { this.descripcionProducto = descripcionProducto; }

    public char getTallaProducto() { return tallaProducto; }
    public void setTallaProducto(char tallaProducto) { this.tallaProducto = tallaProducto; }

    public int getPrecioProducto() { return precioProducto; }
    public void setPrecioProducto(int precioProducto) { this.precioProducto = precioProducto;}
}
