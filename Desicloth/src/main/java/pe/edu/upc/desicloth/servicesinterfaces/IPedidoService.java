package pe.edu.upc.desicloth.servicesinterfaces;
import pe.edu.upc.desicloth.entities.Pedido;
import java.util.List;

public interface IPedidoService {

    public List<Pedido> listPedido();
    public void insertPedido(Pedido p);
}
