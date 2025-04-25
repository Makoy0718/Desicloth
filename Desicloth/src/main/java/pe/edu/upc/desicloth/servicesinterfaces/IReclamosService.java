package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Reclamos;

import java.util.List;

public interface IReclamosService {
    public List<Reclamos> listReclamos();
    public void insertReclamo(Reclamos r);
}
