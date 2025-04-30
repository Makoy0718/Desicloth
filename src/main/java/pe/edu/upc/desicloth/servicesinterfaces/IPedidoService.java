package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Pedido;

import java.time.LocalDate;
import java.util.List;

public interface IPedidoService {
    public List<Pedido> listPedido();
    public void insertPedido(Pedido p);
    public void updatePedido(Pedido p);
    public void deletePedido(int id);
    List<Pedido> buscarPorUsuarioId(int idUsuario);
    List<Pedido> buscarPorFechaPedido(LocalDate fecha);
}
