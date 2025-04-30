package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> listCategoria();
    public void insertCategoria(Categoria c);
    public void updateCategoria(Categoria c);
    public void deleteCategoria(int id);
    public List<Categoria> searchCategoria(String nombreC);
    public List<String[]> contarDisenosPorCategoria();
}
