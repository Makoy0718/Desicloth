package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol r);
    public void update(Rol r);

    public void delete(int id);
}
