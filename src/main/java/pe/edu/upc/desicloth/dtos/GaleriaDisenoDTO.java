package pe.edu.upc.desicloth.dtos;


import jakarta.persistence.*;
import pe.edu.upc.desicloth.entities.Diseno;
import pe.edu.upc.desicloth.entities.Galeria;

public class GaleriaDisenoDTO {
    private int idGaleriaDiseno;
    private Galeria galeria;
    private Diseno diseno;
    private String comentarios;

    public int getIdGaleriaDiseno() { return idGaleriaDiseno; }
    public void setIdGaleriaDiseno(int idGaleriaDiseno) { this.idGaleriaDiseno = idGaleriaDiseno; }

    public Galeria getGaleria() { return galeria; }
    public void setGaleria(Galeria galeria) { this.galeria = galeria; }

    public Diseno getDiseno() { return diseno; }
    public void setDiseno(Diseno diseno) { this.diseno = diseno; }

    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }
}
