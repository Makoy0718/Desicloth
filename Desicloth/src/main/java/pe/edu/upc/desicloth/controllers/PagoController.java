package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.PagoDTO;
import pe.edu.upc.desicloth.entities.Pago;
import pe.edu.upc.desicloth.servicesinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService paS;

    @GetMapping("/listaPago")
    public List<PagoDTO> listaPago() {
        return paS.listPago().stream().map( w -> {
            ModelMapper m = new ModelMapper();
            return m.map( w, PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertarPago")
    public void insertPago(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto, Pago.class);
        paS.insertPago(p);
    }
}
