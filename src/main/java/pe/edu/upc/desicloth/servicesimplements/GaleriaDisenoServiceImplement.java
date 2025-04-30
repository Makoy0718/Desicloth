package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.GaleriaDiseno;
import pe.edu.upc.desicloth.repositories.IGaleriaDisenoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IGaleriaDisenoService;

import java.util.List;

@Service
public class GaleriaDisenoServiceImplement implements IGaleriaDisenoService {
    @Autowired
    private IGaleriaDisenoRepository gdR;

    //Listar
    @Override
    public List<GaleriaDiseno> listGaleriaDiseno() {
        return gdR.findAll();
    }

    //Insertar
    @Override
    public void insertGaleriaDiseno(GaleriaDiseno gd) {
        gdR.save(gd);
    }

    //Actualizar
    @Override
    public void updateGaleriaDiseno(GaleriaDiseno gd) { gdR.save(gd); }

    //Eliminar
    @Override
    public void deleteGaleriaDiseno(int id) { gdR.deleteById(id); }
}
