package pe.edu.upc.desicloth.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Genero;
import pe.edu.upc.desicloth.repositories.IGeneroRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IGeneroService;

import java.util.List;

@Service
public class GeneroServiceImplement implements IGeneroService {

    @Autowired
    public IGeneroRepository gR;

    //Listar
    @Override
    public List<Genero> listGenero() {
        return gR.findAll();
    }

    //Insertar
    @Override
    public void insertGenero(Genero g) {
        gR.save(g);
    }

    //Actualizar
    @Override
    public void updateGenero(Genero g) {
        gR.save(g);
    }

    //Eliminar
    @Override
    public void deleteGenero(int id) {
        gR.deleteById((int) id);
    }

    @Override
    public List<Genero> searchGenero(String nombreG) {
        return gR.buscarGenero(nombreG);
    }

    @Override
    public List<String[]> contarDisenosPorGenero() {
        return gR.contarDisenosPorGenero();
    }
}
