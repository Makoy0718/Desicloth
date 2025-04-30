package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Reclamos;

import java.util.List;

public interface IReclamosService {
    public List<Reclamos> listReclamos();
    public void insertReclamos(Reclamos r);
    public void updateReclamos(Reclamos r);
    public void deleteReclamos(int id);
    List<Reclamos> buscarPorTitulo(String titulo);
    List<Reclamos> buscarPorEstado(boolean estado);
}
