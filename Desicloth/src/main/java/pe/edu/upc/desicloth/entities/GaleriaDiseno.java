package pe.edu.upc.desicloth.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "GaleriaDiseno")
public class GaleriaDiseno {

    @EmbeddedId
    private GaleriaDisenoId id;
    //Como que GaleriaDiseno tiene una clave primaria compuesta,
    //necesitamos una clase GaleriaDisenoId que representará esa clave primaria

    // Relación ManyToOne con Galeria, necesitamos que alguien la cree
    @ManyToOne
    @MapsId("galeriaId") // Indica que 'galeriaId' es parte de la clave compuesta
    @JoinColumn(name = "galeriaId", insertable = false, updatable = false, referencedColumnName = "idGaleria")
    private Galeria galeria;

    // Relación ManyToOne con Diseno
    @ManyToOne
    @MapsId("disenoId") // Indica que 'disenoId' es parte de la clave compuesta
    @JoinColumn(name = "disenoId", insertable = false, updatable = false, referencedColumnName = "idDiseno")
    private Diseno diseno;

    @Column(name = "comentariosGaleriaDiseno", length = 100, nullable = false)
    private String comentariosGaleriaDiseno;

    public GaleriaDiseno() {}

    public GaleriaDiseno(GaleriaDisenoId id, Galeria galeria, Diseno diseno, String comentariosGaleriaDiseno) {
        this.id = id;
        this.galeria = galeria;
        this.diseno = diseno;
        this.comentariosGaleriaDiseno = comentariosGaleriaDiseno;
    }

    public GaleriaDisenoId getId() {
        return id;
    }

    public void setId(GaleriaDisenoId id) {
        this.id = id;
    }

    public Galeria getGaleria() {
        return galeria;
    }

    public void setGaleria(Galeria galeria) {
        this.galeria = galeria;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public void setDiseno(Diseno diseno) {
        this.diseno = diseno;
    }

    public String getComentariosGaleriaDiseno() {
        return comentariosGaleriaDiseno;
    }

    public void setComentariosGaleriaDiseno(String comentariosGaleriaDiseno) {
        this.comentariosGaleriaDiseno = comentariosGaleriaDiseno;
    }
}
