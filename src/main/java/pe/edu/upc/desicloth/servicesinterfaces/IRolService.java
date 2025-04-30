package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> listRol();
    public void insertRol(Rol r);
    public void updateRol(Rol r);
    public void deleteRol(int id);
    List<Rol> buscarPorNombreRol(String nombre);
    List<Rol> buscarPorDescripcionRol(String descripcion);
}
