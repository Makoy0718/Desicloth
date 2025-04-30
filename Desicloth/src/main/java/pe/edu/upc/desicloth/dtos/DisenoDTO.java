package pe.edu.upc.desicloth.dtos;

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
    private Producto productoId;
    private Usuario usuarioId;

    public int getIdDiseno() {
        return idDiseno;
    }

    public void setIdDiseno(int idDiseno) {
        this.idDiseno = idDiseno;
    }

    public String getRespuestaTextoDiseno() {
        return respuestaTextoDiseno;
    }

    public void setRespuestaTextoDiseno(String respuestaTextoDiseno) {
        this.respuestaTextoDiseno = respuestaTextoDiseno;
    }

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

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }
}
