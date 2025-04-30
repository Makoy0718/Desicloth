package pe.edu.upc.desicloth.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.GeneroDTO;
import pe.edu.upc.desicloth.dtos.PedidoDTO;
import pe.edu.upc.desicloth.entities.Pago;
import pe.edu.upc.desicloth.entities.Pedido;
import pe.edu.upc.desicloth.servicesinterfaces.IPedidoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private IPedidoService pS;

    //Listar
    @GetMapping("/listarPedido")
    public List<PedidoDTO> listarPedido() {
        return pS.listPedido().stream().map( w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, PedidoDTO.class);
        }).collect(Collectors.toList());

    }

    //Insertar
    @PostMapping("/insertarPedido")
    public void insertarPedido(@RequestBody PedidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pedido p = m.map(dto, Pedido.class);
        pS.insertPedido(p);
    }

    //Actualzar
    @PutMapping("/actualizarPedido")
    public void modificarPedido(@RequestBody PedidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pedido p = m.map(dto, Pedido.class);
        pS.updatePedido(p);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable("id") int id) { pS.deletePedido(id); }

    // Buscar por ID de usuario
    @GetMapping("/buscarPorUsuario")
    public List<PedidoDTO> buscarPorUsuario(@RequestParam int idUsuario) {
        return pS.buscarPorUsuarioId(idUsuario).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, PedidoDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por fecha exacta
    @GetMapping("/buscarPorFecha")
    public List<PedidoDTO> buscarPorFecha(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return pS.buscarPorFechaPedido(fecha).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, PedidoDTO.class);
        }).collect(Collectors.toList());
    }
}
