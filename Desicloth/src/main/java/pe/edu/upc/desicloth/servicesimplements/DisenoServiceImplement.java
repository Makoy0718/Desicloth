package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Diseno;
import pe.edu.upc.desicloth.repositories.IDisenoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IDisenoService;

import java.util.List;
@Service
public class DisenoServiceImplement implements IDisenoService {

    @Autowired
    private IDisenoRepository dR;

    @Override
    public List<Diseno> listDiseno() {
        return dR.findAll();
    }

    @Override
    public void insertDiseno(Diseno d) {
        dR.save(d);
    }
}
