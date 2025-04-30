package pe.edu.upc.desicloth.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.PedidoDTO;
import pe.edu.upc.desicloth.entities.Pedido;
import pe.edu.upc.desicloth.servicesinterfaces.IPedidoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private IPedidoService pS;

    @GetMapping("/listarPedido")
    public List<PedidoDTO> listarPedido() {
        return pS.listPedido().stream().map( w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, PedidoDTO.class);
        }).collect(Collectors.toList());

    }

    @PostMapping("/insertarPedido")
    public void insertarPedido(@RequestBody PedidoDTO dto) {
        ModelMapper m = new ModelMapper();
        Pedido p = m.map(dto, Pedido.class);
        pS.insertPedido(p);
    }
}
