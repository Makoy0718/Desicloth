package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Galeria;
import pe.edu.upc.desicloth.repositories.IGaleriaRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IGaleriaService;

import java.util.List;

@Service
public class GaleriaServiceImplement implements IGaleriaService {

    @Autowired
    private IGaleriaRepository gR;

    @Override
    public List<Galeria> listGaleria() {
        return gR.findAll();
    }

    @Override
    public void insertGaleria(Galeria g) {
        gR.save(g);
    }
}
