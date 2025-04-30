package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.DisenoDTO;
import pe.edu.upc.desicloth.dtos.UsuarioDTO;
import pe.edu.upc.desicloth.entities.Diseno;
import pe.edu.upc.desicloth.entities.Usuario;
import pe.edu.upc.desicloth.servicesinterfaces.IDisenoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Disenos")
public class DisenoController {
    @Autowired
    private IDisenoService dS;

    //Listar
    @GetMapping("/listaDiseno")
    public List<DisenoDTO> listaDiseno() {
        return dS.listDiseno().stream().map(w ->{
            ModelMapper m = new ModelMapper();
            return m.map(w, DisenoDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarDiseno")
    public void insertarDiseno(@RequestBody DisenoDTO dto) {
        ModelMapper m = new ModelMapper();
        Diseno d = m.map(dto, Diseno.class);
        dS.insertDiseno(d);
    }

    //Actualizar
    @PutMapping("/editarDiseno")
    public void modificarDiseno(@RequestBody DisenoDTO dto) {
        ModelMapper m = new ModelMapper();
        Diseno d = m.map(dto, Diseno.class);
        dS.updateDiseno(d);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarDiseno(@PathVariable("id") int id) {
        dS.deleteDiseno(id);
    }

    //Buscar por fecha de origen
    @GetMapping("/buscarPorFechaOrigen")
    public List<DisenoDTO> buscarPorFecha(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return dS.searchByFechaOrigen(fecha).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, DisenoDTO.class);
        }).collect(Collectors.toList());
    }

    //Buscar por tipo de origen
    @GetMapping("/buscarPorTipo")
    public List<DisenoDTO> buscarPorTipo(@RequestParam String tipo) {
        return dS.searchByTipoOrigen(tipo).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, DisenoDTO.class);
        }).collect(Collectors.toList());
    }
}
