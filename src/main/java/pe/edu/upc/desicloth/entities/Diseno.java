package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Diseno")
public class Diseno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiseno;

    @Column(name = "respuestaTextoDiseno",length = 100,nullable = true)
    private String respuestaTextoDiseno;

    @Column(name = "imagenDiseno",length = 100,nullable = false)
    private String imagenDiseno;

    @Column(name = "promtDiseno",length = 100,nullable = true)
    private String promtDiseno;

    @Column(name = "precioDiseno",nullable = false)
    private int precioDiseno;

    @Column(name = "fechaOrigenDiseno",nullable = false)
    private LocalDate fechaOrigenDiseno;

    @Column(name = "tipoOrigenDiseno", length = 20,nullable = false)
    private String tipoOrigenDiseno;

    @ManyToOne
    @JoinColumn(name = "idGenero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    @OneToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Diseno() {

    }

    public Diseno(int idDiseno, String respuestaTextoDiseno, String imagenDiseno, String promtDiseno, int precioDiseno, LocalDate fechaOrigenDiseno, String tipoOrigenDiseno, Genero genero, Categoria categoria, Producto producto, Usuario usuario) {
        this.idDiseno = idDiseno;
        this.respuestaTextoDiseno = respuestaTextoDiseno;
        this.imagenDiseno = imagenDiseno;
        this.promtDiseno = promtDiseno;
        this.precioDiseno = precioDiseno;
        this.fechaOrigenDiseno = fechaOrigenDiseno;
        this.tipoOrigenDiseno = tipoOrigenDiseno;
        this.genero = genero;
        this.categoria = categoria;
        this.producto = producto;
        this.usuario = usuario;
    }

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

    public String getTipoOrigenDiseno() {
        return tipoOrigenDiseno;
    }
    public void setTipoOrigenDiseno(String tipoOrigenDiseno) {
        this.tipoOrigenDiseno = tipoOrigenDiseno;
    }

    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) { this.genero = genero; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
