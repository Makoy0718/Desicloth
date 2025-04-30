package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Diseno;
import pe.edu.upc.desicloth.repositories.IDisenoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IDisenoService;

import java.time.LocalDate;
import java.util.List;
@Service
public class DisenoServiceImplement implements IDisenoService {

    @Autowired
    private IDisenoRepository dR;

    //Listar
    @Override
    public List<Diseno> listDiseno() {
        return dR.findAll();
    }

    //Insertar
    @Override
    public void insertDiseno(Diseno d) {
        dR.save(d);
    }

    //Actualizar
    @Override
    public void updateDiseno(Diseno d) { dR.save(d); }

    //Eliminar
    @Override
    public void deleteDiseno(int id) { dR.deleteById(id); }

    //Busca por fecha de origen
    @Override
    public List<Diseno> searchByFechaOrigen(LocalDate fecha) {
        return dR.buscarPorFechaOrigen(fecha);
    }

    //Buscar por tipo de origen
    @Override
    public List<Diseno> searchByTipoOrigen(String tipo) {
        return dR.buscarByTipoOrigen(tipo);
    }
}
