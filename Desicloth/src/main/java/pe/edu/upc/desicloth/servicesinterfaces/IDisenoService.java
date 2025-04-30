package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Diseno;

import java.util.List;

public interface IDisenoService {
    public List<Diseno> listDiseno();
    public void insertDiseno(Diseno d);
}
