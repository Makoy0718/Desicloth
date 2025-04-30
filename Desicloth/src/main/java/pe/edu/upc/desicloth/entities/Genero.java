package pe.edu.upc.desicloth.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenero;

    @Column(name = "nombreGenero", length = 50, nullable = false)
    private String nombreGenero;

    @Column(name = "descripcionGenero", length = 50, nullable = false)
    private String descripcionGenero;

    @ManyToOne
    @JoinColumn(name = "idDiseno")
    private Diseno diseno;

    public Genero() {
    }

    public Genero(int idGenero, String nombreGenero, String descripcionGenero, Diseno diseno) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.descripcionGenero = descripcionGenero;
        this.diseno = diseno;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getDescripcionGenero() {
        return descripcionGenero;
    }

    public void setDescripcionGenero(String descripcionGenero) {
        this.descripcionGenero = descripcionGenero;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public void setDiseno(Diseno diseno) {
        this.diseno = diseno;
    }
}
