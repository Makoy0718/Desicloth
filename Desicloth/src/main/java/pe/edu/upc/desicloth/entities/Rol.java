package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idRol;

    @Column(name = "nombreRol",length = 50, nullable = false)
    private String nombreRol;

    @Column(name = "descripcionRol",length = 500, nullable = false)
    private String descripcionRol;

    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String descripcionRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcionRol = descripcionRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}

