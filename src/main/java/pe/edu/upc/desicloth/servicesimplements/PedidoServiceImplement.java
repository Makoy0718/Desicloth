package pe.edu.upc.desicloth.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Pedido;
import pe.edu.upc.desicloth.repositories.IPedidoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IPedidoService;

import java.time.LocalDate;
import java.util.List;
@Service
public class PedidoServiceImplement implements IPedidoService {
    @Autowired
    private IPedidoRepository pR;

    //Listar
    @Override
    public List<Pedido> listPedido() { return pR.findAll();}

    //Insertar
    @Override
    public void insertPedido(Pedido p) { pR.save(p);}

    //Actualizar
    @Override
    public void updatePedido(Pedido p) { pR.save(p); }

    //Eliminar
    @Override
    public void deletePedido(int id) { pR.deleteById(id); }

    @Override
    public List<Pedido> buscarPorUsuarioId(int idUsuario) {
        return pR.buscarPorUsuarioId(idUsuario);
    }

    @Override
    public List<Pedido> buscarPorFechaPedido(LocalDate fecha) {
        return pR.buscarPorFechaPedido(fecha);
    }


}
