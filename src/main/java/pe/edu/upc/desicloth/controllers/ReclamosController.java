package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.ProductoDTO;
import pe.edu.upc.desicloth.dtos.ReclamosDTO;
import pe.edu.upc.desicloth.entities.Producto;
import pe.edu.upc.desicloth.entities.Reclamos;
import pe.edu.upc.desicloth.servicesinterfaces.IProductoService;
import pe.edu.upc.desicloth.servicesinterfaces.IReclamosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reclamos")
public class ReclamosController {
    @Autowired
    private IReclamosService rS;

    //Listar
    @GetMapping("/listarReclamos")
    public List<ReclamosDTO> listarReclamos() {
        return  rS.listReclamos().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, ReclamosDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarReclamos")
    public void insertarReclamos(@RequestBody ReclamosDTO dto) {
        ModelMapper m = new ModelMapper();
        Reclamos r = m.map(dto, Reclamos.class);
        rS.insertReclamos(r);
    }

    //Actualzar
    @PutMapping("/actualizarReclamos")
    public void modificarReclamos(@RequestBody ReclamosDTO dto) {
        ModelMapper m = new ModelMapper();
        Reclamos r = m.map(dto, Reclamos.class);
        rS.updateReclamos(r);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarReclamos(@PathVariable("id") int id) { rS.deleteReclamos(id); }

    // Buscar por título
    @GetMapping("/buscarPorTitulo")
    public List<ReclamosDTO> buscarPorTitulo(@RequestParam String titulo) {
        return rS.buscarPorTitulo(titulo).stream().map(r -> {
            ModelMapper m = new ModelMapper();
            return m.map(r, ReclamosDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por estado
    @GetMapping("/buscarPorEstado")
    public List<ReclamosDTO> buscarPorEstado(@RequestParam boolean estado) {
        return rS.buscarPorEstado(estado).stream().map(r -> {
            ModelMapper m = new ModelMapper();
            return m.map(r, ReclamosDTO.class);
        }).collect(Collectors.toList());
    }
}
