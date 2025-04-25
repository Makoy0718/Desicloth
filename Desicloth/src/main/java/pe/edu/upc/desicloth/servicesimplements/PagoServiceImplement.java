package pe.edu.upc.desicloth.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Pago;
import pe.edu.upc.desicloth.repositories.IPagoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IPagoService;


import java.util.List;
@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository paR;

    @Override
    public List<Pago> listPago() {return paR.findAll();}

    @Override
    public void insertPago (Pago pa) { paR.save(pa); }


}
