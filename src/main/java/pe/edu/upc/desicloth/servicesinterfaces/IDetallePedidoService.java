package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.DetallePedido;

import java.util.List;

public interface IDetallePedidoService {
    public List<DetallePedido> listDetallePedido();
    public void insertDetallePedido(DetallePedido dp);
    public void updateDetallePedido(DetallePedido dp);
    public void deleteDetallePedido(int id);
}
