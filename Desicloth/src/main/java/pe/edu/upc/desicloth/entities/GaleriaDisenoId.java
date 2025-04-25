package pe.edu.upc.desicloth.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class GaleriaDisenoId implements Serializable {

    private int galeriaId;
    private int disenoId;

    public GaleriaDisenoId() {}

    public GaleriaDisenoId(int galeriaId, int disenoId) {
        this.galeriaId = galeriaId;
        this.disenoId = disenoId;
    }

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

    // Que tenemos que implementar equals() y hashCode() para trabajar correctamente
    // con claves compuestas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GaleriaDisenoId that = (GaleriaDisenoId) o;
        return galeriaId == that.galeriaId && disenoId == that.disenoId;
    }

    @Override
    public int hashCode() {
        return 31 * galeriaId + disenoId;
    }
}
