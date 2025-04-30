package pe.edu.upc.desicloth.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Pedido;
import pe.edu.upc.desicloth.repositories.IPedidoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IPedidoService;

import java.util.List;
@Service
public class PedidoServiceImplement implements IPedidoService {

    @Autowired
    private IPedidoRepository pR;

    @Override
    public List<Pedido> listPedido() { return pR.findAll();}

    @Override
    public void insertPedido(Pedido p) { pR.save(p);}




}
