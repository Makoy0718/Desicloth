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

    //Listar
    @Override
    public List<Categoria> listCategoria() {
        return cR.findAll();
    }

    //Insertar
    @Override
    public void insertCategoria(Categoria c) {
        cR.save(c);
    }

    //Actualizar
    @Override
    public void updateCategoria(Categoria c) { cR.save(c); }

    //Eliminar
    @Override
    public void deleteCategoria(int id) { cR.deleteById(id); }

    //Buscar por nombre
    @Override
    public List<Categoria> searchCategoria(String nombreC) {
        return cR.buscarCategoria(nombreC);
    }

    //Conteo de categorias en disenos
    @Override
    public List<String[]> contarDisenosPorCategoria() { return cR.contarDisenosPorCategoria(); }
}
