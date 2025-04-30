package pe.edu.upc.desicloth.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductoDTO {
    private int idProducto;
    private String tipoProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private char tallaProducto;
    private int precioProducto;

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getTipoProducto() { return tipoProducto; }
    public void setTipoProducto(String tipoProducto) { this.tipoProducto = tipoProducto; }

    public String getNombreProducto() {return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public String getDescripcionProducto() { return descripcionProducto; }
    public void setDescripcionProducto(String descripcionProducto) { this.descripcionProducto = descripcionProducto; }

    public char getTallaProducto() { return tallaProducto; }
    public void setTallaProducto(char tallaProducto) { this.tallaProducto = tallaProducto; }

    public int getPrecioProducto() { return precioProducto; }
    public void setPrecioProducto(int precioProducto) { this.precioProducto = precioProducto; }
}
