package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Diseno;
import pe.edu.upc.desicloth.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

public interface IDisenoService {
    public List<Diseno> listDiseno();
    public void insertDiseno(Diseno d);
    public void updateDiseno(Diseno d);
    public void deleteDiseno(int id);
    public List<Diseno> searchByFechaOrigen(LocalDate fecha);
    public List<Diseno> searchByTipoOrigen(String tipo);
}
