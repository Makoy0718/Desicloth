package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.GaleriaDiseno;

import java.util.List;

public interface IGaleriaDisenoService {
    public List<GaleriaDiseno> listGaleriaDiseno();
    public void insertGaleriaDiseno(GaleriaDiseno gd);
}
