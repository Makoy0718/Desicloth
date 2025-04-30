package pe.edu.upc.desicloth.dtos;

public class ConteoGeneroPorDisenoDTO {
    private String nombreGenero;
    private int cantidadDisenos;

    public String getNombreGenero() { return nombreGenero; }
    public void setNombreGenero(String nombreGenero) { this.nombreGenero = nombreGenero; }

    public int getCantidadDisenos() { return cantidadDisenos; }
    public void setCantidadDisenos(int cantidadDisenos) { this.cantidadDisenos = cantidadDisenos; }
}
