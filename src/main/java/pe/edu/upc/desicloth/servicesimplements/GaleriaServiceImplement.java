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

    //Listar
    @Override
    public List<Galeria> listGaleria() {
        return gR.findAll();
    }

    //Insertar
    @Override
    public void insertGaleria(Galeria g) {
        gR.save(g);
    }

    //Actualizar
    @Override
    public void updateGaleria(Galeria g) { gR.save(g); }

    //Eliminar
    @Override
    public void deleteGaleria(int id) { gR.deleteById(id); }

    //Busca por id de usuario
    @Override
    public List<Galeria> searchByIdUsuario(int idUsuario) { return gR.buscarPorUsuarioId(idUsuario); }

    //Buscar por nombre de galeria
    @Override
    public List<Galeria> searchByNombre(String nombre) { return gR.buscarPorNombre(nombre); }
}
