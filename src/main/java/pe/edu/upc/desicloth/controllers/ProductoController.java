package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.PedidoDTO;
import pe.edu.upc.desicloth.dtos.ProductoDTO;
import pe.edu.upc.desicloth.entities.Pedido;
import pe.edu.upc.desicloth.entities.Producto;
import pe.edu.upc.desicloth.servicesinterfaces.IProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService pS;

    //Listar
    @GetMapping("/listarProducto")
    public List<ProductoDTO> listarProducto() {
        return  pS.listProducto().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, ProductoDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarProducto")
    public void insertarProducto(@RequestBody ProductoDTO dto) {
        ModelMapper m = new ModelMapper();
        Producto p = m.map(dto, Producto.class);
        pS.insertProducto(p);
    }

    //Actualzar
    @PutMapping("/actualizarProducto")
    public void modificarProducto(@RequestBody ProductoDTO dto) {
        ModelMapper m = new ModelMapper();
        Producto p = m.map(dto, Producto.class);
        pS.updateProducto(p);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable("id") int id) { pS.deleteProducto(id); }

    // Buscar por talla
    @GetMapping("/buscarPorTalla")
    public List<ProductoDTO> buscarPorTalla(@RequestParam char talla) {
        return pS.buscarPorTalla(talla).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, ProductoDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por nombre
    @GetMapping("/buscarPorNombre")
    public List<ProductoDTO> buscarPorNombre(@RequestParam String nombre) {
        return pS.buscarPorNombre(nombre).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, ProductoDTO.class);
        }).collect(Collectors.toList());
    }
}
