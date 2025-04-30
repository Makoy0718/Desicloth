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
    private IRolRepository rR;

    //Listar
    @Override
    public List<Rol> listRol() {
        return rR.findAll();
    }

    //Insertar
    @Override
    public void insertRol(Rol t) { rR.save(t); }

    //Actualizar
    @Override
    public void updateRol(Rol t) {
        rR.save(t);
    }

    //Eliminar
    @Override
    public void deleteRol(int id) {
        rR.deleteById(id);
    }

    //Buscar por nombre
    @Override
    public List<Rol> buscarPorNombreRol(String nombre) { return rR.buscarPorNombreRol(nombre); }

    //Buscar por su descripcion
    @Override
    public List<Rol> buscarPorDescripcionRol(String descripcion) { return rR.buscarPorDescripcionRol(descripcion); }
}
