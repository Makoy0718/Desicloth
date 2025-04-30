package pe.edu.upc.desicloth.dtos;

import pe.edu.upc.desicloth.entities.Diseno;

public class GeneroDTO {
    private int idGenero;
    private String nombreGenero;
    private String descripcionGenero;
    private Diseno diseno;

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
