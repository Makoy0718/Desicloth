package pe.edu.upc.desicloth.dtos;

import pe.edu.upc.desicloth.entities.GaleriaDiseno;
import pe.edu.upc.desicloth.entities.Usuario;

import java.util.List;

public class GaleriaDTO {

    private int idGaleria;
    private String nombreGaleria;
    private boolean visibilidadGaleria;
    private float ratingGaleria;
    private Usuario usuario;
    private List<GaleriaDiseno> galeriaDisenos;

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

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getRatingGaleria() {
        return ratingGaleria;
    }
    public void setRatingGaleria(float ratingGaleria) {
        this.ratingGaleria = ratingGaleria;
    }

    public List<GaleriaDiseno> getGaleriaDisenos() {
        return galeriaDisenos;
    }
    public void setGaleriaDisenos(List<GaleriaDiseno> galeriaDisenos) {
        this.galeriaDisenos = galeriaDisenos;
    }
}
