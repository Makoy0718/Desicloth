package pe.edu.upc.desicloth.servicesinterfaces;
import pe.edu.upc.desicloth.entities.Pago;
import java.util.List;

public interface IPagoService {
    public List<Pago> listPago();
    public void insertPago(Pago pa);
}
