package pe.edu.upc.desicloth.dtos;


public class GaleriaDisenoDTO {
    private int galeriaId;       // Objeto Galeria completo
    private int disenoId;         // Objeto Diseno completo
    private String comentariosGaleriaDiseno;

    public int getGaleriaId() {
        return galeriaId;
    }

    public void setGaleriaId(int galeriaId) {
        this.galeriaId = galeriaId;
    }

    public int getDisenoId() {
        return disenoId;
    }

    public void setDisenoId(int disenoId) {
        this.disenoId = disenoId;
    }

    public String getComentariosGaleriaDiseno() {
        return comentariosGaleriaDiseno;
    }

    public void setComentariosGaleriaDiseno(String comentariosGaleriaDiseno) {
        this.comentariosGaleriaDiseno = comentariosGaleriaDiseno;
    }
}
