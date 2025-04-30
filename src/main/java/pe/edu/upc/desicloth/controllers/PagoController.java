package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.GeneroDTO;
import pe.edu.upc.desicloth.dtos.PagoDTO;
import pe.edu.upc.desicloth.entities.Genero;
import pe.edu.upc.desicloth.entities.Pago;
import pe.edu.upc.desicloth.servicesinterfaces.IPagoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService paS;

    //Listar
    @GetMapping("/listaPago")
    public List<PagoDTO> listaPago() {
        return paS.listPago().stream().map( w -> {
            ModelMapper m = new ModelMapper();
            return m.map( w, PagoDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarPago")
    public void insertPago(@RequestBody PagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago p = m.map(dto, Pago.class);
        paS.insertPago(p);
    }

    //Actualzar
    @PutMapping("/actualizarPago")
    public void modificarPago(@RequestBody GeneroDTO dto) {
        ModelMapper m = new ModelMapper();
        Pago pa = m.map(dto, Pago.class);
        paS.updatePago(pa);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable("id") int id) { paS.deletePago(id); }

    // Buscar por método de pago
    @GetMapping("/buscarPorMetodo")
    public List<PagoDTO> buscarPorMetodo(@RequestParam String metodo) {
        return paS.buscarPorMetodoPago(metodo).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, PagoDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por fecha exacta
    @GetMapping("/buscarPorFecha")
    public List<PagoDTO> buscarPorFecha(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return paS.buscarPorFechaPago(fecha).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, PagoDTO.class);
        }).collect(Collectors.toList());
    }
}
