package pe.edu.upc.desicloth.dtos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.entities.Genero;
import pe.edu.upc.desicloth.entities.Producto;
import pe.edu.upc.desicloth.entities.Usuario;

import java.time.LocalDate;

public class DisenoDTO {
    private int idDiseno;
    private String respuestaTextoDiseno;
    private String imagenDiseno;
    private String promtDiseno;
    private int precioDiseno;
    private LocalDate fechaOrigenDiseno;
    private int tipoOrigenDiseno;
    private Genero genero;
    private Categoria categoria;
    private Producto producto;
    private Usuario usuario;


    public int getIdDiseno() {
        return idDiseno;
    }
    public void setIdDiseno(int idDiseno) {
        this.idDiseno = idDiseno;
    }

    public String getRespuestaTextoDiseno() {
        return respuestaTextoDiseno;
    }
    public void setRespuestaTextoDiseno(String respuestaTextoDiseno) { this.respuestaTextoDiseno = respuestaTextoDiseno; }

    public String getImagenDiseno() {
        return imagenDiseno;
    }
    public void setImagenDiseno(String imagenDiseno) {
        this.imagenDiseno = imagenDiseno;
    }

    public String getPromtDiseno() {
        return promtDiseno;
    }
    public void setPromtDiseno(String promtDiseno) {
        this.promtDiseno = promtDiseno;
    }

    public int getPrecioDiseno() {
        return precioDiseno;
    }
    public void setPrecioDiseno(int precioDiseno) {
        this.precioDiseno = precioDiseno;
    }

    public LocalDate getFechaOrigenDiseno() {
        return fechaOrigenDiseno;
    }
    public void setFechaOrigenDiseno(LocalDate fechaOrigenDiseno) {
        this.fechaOrigenDiseno = fechaOrigenDiseno;
    }

    public int getTipoOrigenDiseno() {
        return tipoOrigenDiseno;
    }
    public void setTipoOrigenDiseno(int tipoOrigenDiseno) {
        this.tipoOrigenDiseno = tipoOrigenDiseno;
    }

    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) { this.genero = genero; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
