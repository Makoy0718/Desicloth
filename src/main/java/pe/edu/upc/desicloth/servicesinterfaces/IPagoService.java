package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Pago;

import java.time.LocalDate;
import java.util.List;

public interface IPagoService {
    public List<Pago> listPago();
    public void insertPago(Pago pa);
    public void updatePago(Pago pa);
    public void deletePago(int id);
    List<Pago> buscarPorMetodoPago(String metodo);
    List<Pago> buscarPorFechaPago(LocalDate fecha);
}
