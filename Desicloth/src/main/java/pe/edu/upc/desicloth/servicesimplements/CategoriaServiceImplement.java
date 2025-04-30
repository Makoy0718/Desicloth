package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.repositories.ICategoriaRepository;
import pe.edu.upc.desicloth.servicesinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;

    @Override
    public List<Categoria> listCategoria() {
        return cR.findAll();
    }

    @Override
    public void insertCategoria(Categoria c) {
        cR.save(c);
    }
}
