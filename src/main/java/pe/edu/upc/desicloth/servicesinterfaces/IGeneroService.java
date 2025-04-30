package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.entities.Genero;

import java.util.List;

public interface IGeneroService {
    public List<Genero> listGenero();
    public void insertGenero(Genero g);
    public void updateGenero(Genero g);
    public void deleteGenero(int id);
    public List<Genero> searchGenero(String nombreG);
    public List<String[]> contarDisenosPorGenero();
}
