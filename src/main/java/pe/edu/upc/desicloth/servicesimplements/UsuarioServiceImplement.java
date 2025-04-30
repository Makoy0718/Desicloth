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

    //Listar
    @Override
    public List<Usuario> listUsuario() {
        return uR.findAll();
    }

    //Insertar
    @Override
    public void insertUsuario(Usuario u) {
        uR.save(u);
    }

    //Actualizar
    @Override
    public void updateUsuario(Usuario u) {
        uR.save(u);
    }

    //Eliminar
    @Override
    public void deleteUsuario(int id) {
        uR.deleteById(id);
    }

    //Buscar por el nombre del usuario
    @Override
    public List<Usuario> buscarPorNombreUsuario(String nombre) { return uR.buscarPorNombreUsuario(nombre); }

    //Buscar por rol que tenga
    @Override
    public List<Usuario> buscarPorRol(int idRol) { return uR.buscarPorRol(idRol); }

}
