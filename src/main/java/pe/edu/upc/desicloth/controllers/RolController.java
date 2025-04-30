package pe.edu.upc.desicloth.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.RolDTO;
import pe.edu.upc.desicloth.entities.Rol;
import pe.edu.upc.desicloth.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IRolService rS;

    //Listar
    @GetMapping("/listaRol")
    public List<RolDTO> listarRol() {
        return rS.listRol().stream().map(w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, RolDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarRol")
    public void insertarRol(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insertRol(r);
    }

    //Actualizar
    @PutMapping("/actualizarRol")
    public void modificarRol(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.updateRol(r);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarRol(@PathVariable("id") int id) { rS.deleteRol(id); }

    // Buscar por nombre
    @GetMapping("/buscarPorNombre")
    public List<RolDTO> buscarPorNombre(@RequestParam String nombre) {
        return rS.buscarPorNombreRol(nombre).stream().map(r -> {
            ModelMapper m = new ModelMapper();
            return m.map(r, RolDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por descripción
    @GetMapping("/buscarPorDescripcion")
    public List<RolDTO> buscarPorDescripcion(@RequestParam String descripcion) {
        return rS.buscarPorDescripcionRol(descripcion).stream().map(r -> {
            ModelMapper m = new ModelMapper();
            return m.map(r, RolDTO.class);
        }).collect(Collectors.toList());
    }
}
