package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Galeria;

import java.util.List;

public interface IGaleriaService {
    public List<Galeria> listGaleria();
    public void insertGaleria(Galeria g);
    public void updateGaleria(Galeria g);
    public void deleteGaleria(int id);
    public List<Galeria> searchByIdUsuario(int idUsuario);
    public List<Galeria> searchByNombre(String nombre);
}
