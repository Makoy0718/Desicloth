package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Diseno")
public class Diseno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiseno;

    @Column(name = "respuestaTextoDiseno",length = 100,nullable = false)
    private String respuestaTextoDiseno;

    @Column(name = "imagenDiseno",length = 100,nullable = false)
    private String imagenDiseno;

    @Column(name = "promtDiseno",length = 100,nullable = false)
    private String promtDiseno;

    @Column(name = "precioDiseno",nullable = false)
    private int precioDiseno;

    @Column(name = "fechaOrigenDiseno",nullable = false)
    private LocalDate fechaOrigenDiseno;

    @Column(name = "tipoOrigenDiseno", length = 20,nullable = false)
    private int tipoOrigenDiseno;

    @OneToOne
    @JoinColumn(name = "productoId")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuario;

    public Diseno() {

    }

    public Diseno(int idDiseno, String respuestaTextoDiseno, String imagenDiseno, String promtDiseno, int precioDiseno, LocalDate fechaOrigenDiseno, int tipoOrigenDiseno, Producto producto, Usuario usuario) {
        this.idDiseno = idDiseno;
        this.respuestaTextoDiseno = respuestaTextoDiseno;
        this.imagenDiseno = imagenDiseno;
        this.promtDiseno = promtDiseno;
        this.precioDiseno = precioDiseno;
        this.fechaOrigenDiseno = fechaOrigenDiseno;
        this.tipoOrigenDiseno = tipoOrigenDiseno;
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

    public int getTipoOrigenDiseno() {
        return tipoOrigenDiseno;
    }

    public void setTipoOrigenDiseno(int tipoOrigenDiseno) {
        this.tipoOrigenDiseno = tipoOrigenDiseno;
    }

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
