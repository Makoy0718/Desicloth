package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Genero;

import java.util.List;

public interface IGeneroService {
    public List<Genero> list();
    public void insert(Genero g);
    public void update(Genero g);
    public void delete(int id);
}
