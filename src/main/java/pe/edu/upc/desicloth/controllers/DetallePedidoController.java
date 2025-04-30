package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.CategoriaDTO;
import pe.edu.upc.desicloth.dtos.DetallePedidoDTO;
import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.entities.DetallePedido;
import pe.edu.upc.desicloth.servicesinterfaces.IDetallePedidoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/DetallePedidos")
public class DetallePedidoController {
    @Autowired
    private IDetallePedidoService dpS;

    //Listar
    @GetMapping("listarDetallePedidos")
    public List<DetallePedido> listaDetallePedidos() {
        return dpS.listDetallePedido().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, DetallePedido.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("insertarDetallePedidos")
    public void insertarDetallePedido(@RequestBody DetallePedidoDTO dto) {
        ModelMapper m = new ModelMapper();
        DetallePedido dp = m.map(dto, DetallePedido.class);
        dpS.insertDetallePedido(dp);
    }

    //Actualizar
    @PutMapping("/modificarDetallePedido")
    public void modificarDetallePedido(@RequestBody DetallePedidoDTO dto) {
        ModelMapper m = new ModelMapper();
        DetallePedido dp = m.map(dto, DetallePedido.class);
        dpS.updateDetallePedido(dp);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarDetallePedido(@PathVariable("id") int id) { dpS.deleteDetallePedido(id); }
}
