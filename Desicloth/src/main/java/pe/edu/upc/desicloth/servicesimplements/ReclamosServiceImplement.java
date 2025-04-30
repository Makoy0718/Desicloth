package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Reclamos;
import pe.edu.upc.desicloth.repositories.IReclamosRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IReclamosService;

import java.util.List;

@Service
public class ReclamosServiceImplement implements IReclamosService {

    @Autowired
    private IReclamosRepository rR;

    @Override
    public List<Reclamos> listReclamos() {
        return rR.findAll();
    }

    @Override
    public void insertReclamo(Reclamos r) {

        rR.save(r);
    }
}