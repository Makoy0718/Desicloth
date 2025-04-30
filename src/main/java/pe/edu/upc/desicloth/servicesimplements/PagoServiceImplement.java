package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Pago;
import pe.edu.upc.desicloth.repositories.IPagoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IPagoService;

import java.time.LocalDate;
import java.util.List;
@Service
public class PagoServiceImplement implements IPagoService {
    @Autowired
    private IPagoRepository paR;

    //Listar
    @Override
    public List<Pago> listPago() {return paR.findAll();}

    //Insertar
    @Override
    public void insertPago (Pago pa) { paR.save(pa); }

    //Actualizar
    @Override
    public void updatePago(Pago pa) { paR.save(pa); }

    //Eliminar
    @Override
    public void deletePago(int id) { paR.deleteById(id); }

    //Buscar por metodo de pago
    @Override
    public List<Pago> buscarPorMetodoPago(String metodo) {
        return paR.buscarPorMetodoPago(metodo);
    }

    //Buscar por fecha
    @Override
    public List<Pago> buscarPorFechaPago(LocalDate fecha) {
        return paR.buscarPorFechaPago(fecha);
    }


}
