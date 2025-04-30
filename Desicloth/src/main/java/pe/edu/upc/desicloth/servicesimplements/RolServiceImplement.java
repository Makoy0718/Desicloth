package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Rol;
import pe.edu.upc.desicloth.repositories.IRolRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rS;

    @Override
    public List<Rol> list() {
        return rS.findAll();
    }

    @Override
    public void insert(Rol t) {
        rS.save(t);
    }

    @Override
    public void update(Rol t) {
        rS.save(t);
    }

    @Override
    public void delete(int id) {
        rS.deleteById(id);
    }

}
