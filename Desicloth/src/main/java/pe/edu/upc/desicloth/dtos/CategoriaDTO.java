package pe.edu.upc.desicloth.dtos;

import pe.edu.upc.desicloth.entities.Diseno;

public class CategoriaDTO {
    private int idCategoria;
    private int nombreCategoria;
    private int descripcionCategoria;
    private Diseno diseno;

    public CategoriaDTO() {
    }

    public CategoriaDTO(int idCategoria, int nombreCategoria, int descripcionCategoria, Diseno diseno) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.diseno = diseno;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(int nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(int descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public void setDiseno(Diseno diseno) {
        this.diseno = diseno;
    }
}
