package pe.edu.upc.desicloth.dtos;

public class ConteoCategoriaPorDisenoDTO {
    private String nombreCategoria;
    private int cantidadDisenos;

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getCantidadDisenos() {
        return cantidadDisenos;
    }

    public void setCantidadDisenos(int cantidad) {
        this.cantidadDisenos = cantidadDisenos;
    }
}
