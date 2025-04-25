package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Usuario;
import pe.edu.upc.desicloth.repositories.IUsuarioRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    public IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuario u) {
        uR.save(u);
    }

    @Override
    public void update(Usuario u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

}
