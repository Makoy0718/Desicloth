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

    //Listar
    @Override
    public List<Reclamos> listReclamos() {
        return rR.findAll();
    }

    //Insertar
    @Override
    public void insertReclamos(Reclamos r) { rR.save(r); }

    //Actualizar
    @Override
    public void updateReclamos(Reclamos r) { rR.save(r); }

    //Eliminar
    @Override
    public void deleteReclamos(int id) { rR.deleteById(id); }

    //Buscar por titulo
    @Override
    public List<Reclamos> buscarPorTitulo(String titulo) { return rR.buscarPorTitulo(titulo); }

    //Buscar por su estado
    @Override
    public List<Reclamos> buscarPorEstado(boolean estado) { return rR.buscarPorEstado(estado); }
}