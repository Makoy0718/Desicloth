package pe.edu.upc.desicloth.servicesinterfaces;


import pe.edu.upc.desicloth.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario u);
    public void update(Usuario u);
    public void delete(int id);
}
