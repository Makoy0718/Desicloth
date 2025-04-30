package pe.edu.upc.desicloth.servicesinterfaces;


import pe.edu.upc.desicloth.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> listUsuario();
    public void insertUsuario(Usuario u);
    public void updateUsuario(Usuario u);
    public void deleteUsuario(int id);
    List<Usuario> buscarPorNombreUsuario(String nombre);
    List<Usuario> buscarPorRol(int idRol);
}
