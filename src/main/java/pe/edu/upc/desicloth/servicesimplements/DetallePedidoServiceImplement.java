package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.DetallePedido;
import pe.edu.upc.desicloth.repositories.IDetallePedidoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IDetallePedidoService;

import java.util.List;

@Service
public class DetallePedidoServiceImplement implements IDetallePedidoService {
    @Autowired
    private IDetallePedidoRepository dpR;

    //Listar
    @Override
    public List<DetallePedido> listDetallePedido() { return dpR.findAll(); }

    //Insertar
    @Override
    public void insertDetallePedido(DetallePedido dp) { dpR.save(dp); }

    //Actualizar
    @Override
    public void updateDetallePedido(DetallePedido dp) { dpR.save(dp); }

    //Eliminar
    @Override
    public void deleteDetallePedido(int id) { dpR.deleteById(id); }
}
