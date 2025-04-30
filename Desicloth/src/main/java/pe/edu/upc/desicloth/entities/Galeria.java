package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Galeria")
public class Galeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGaleria")
    private int idGaleria;

    @Column(name = "nombreGaleria", length = 50, nullable = false)
    private String nombreGaleria;

    @Column(name = "visibilidadGaleria", nullable = false)
    private boolean visibilidadGaleria;

    @Column(name = "ratingGaleria")
    private float ratingGaleria;

    // Relación ManyToOne con Usuario (un usuario puede tener muchas galerías)
    @ManyToOne
    @JoinColumn(name = "Usuario_id", insertable = false, updatable = false, referencedColumnName = "id")
    private Usuario usuario;

    // Relación OneToMany con GaleriaDiseno (una galería puede tener muchos diseños)
    @OneToMany(mappedBy = "galeria")
    private List<GaleriaDiseno> galeriaDisenos;

    public Galeria() {

    }

    public Galeria(int idGaleria, String nombreGaleria, boolean visibilidadGaleria, float ratingGaleria, Usuario usuario, List<GaleriaDiseno> galeriaDisenos) {
        this.idGaleria = idGaleria;
        this.nombreGaleria = nombreGaleria;
        this.visibilidadGaleria = visibilidadGaleria;
        this.ratingGaleria = ratingGaleria;
        this.usuario = usuario;
        this.galeriaDisenos = galeriaDisenos;
    }

    public int getIdGaleria() {
        return idGaleria;
    }

    public void setIdGaleria(int idGaleria) {
        this.idGaleria = idGaleria;
    }

    public String getNombreGaleria() {
        return nombreGaleria;
    }

    public void setNombreGaleria(String nombreGaleria) {
        this.nombreGaleria = nombreGaleria;
    }

    public boolean isVisibilidadGaleria() {
        return visibilidadGaleria;
    }

    public void setVisibilidadGaleria(boolean visibilidadGaleria) {
        this.visibilidadGaleria = visibilidadGaleria;
    }

    public float getRatingGaleria() {
        return ratingGaleria;
    }

    public void setRatingGaleria(float ratingGaleria) {
        this.ratingGaleria = ratingGaleria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<GaleriaDiseno> getGaleriaDisenos() {
        return galeriaDisenos;
    }

    public void setGaleriaDisenos(List<GaleriaDiseno> galeriaDisenos) {
        this.galeriaDisenos = galeriaDisenos;
    }
}

