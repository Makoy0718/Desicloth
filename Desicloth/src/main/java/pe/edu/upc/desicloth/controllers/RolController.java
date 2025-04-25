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


    @GetMapping("/lista")
    public List<RolDTO> listar() {
        return rS.list().stream().map(w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, RolDTO.class);
        }).collect(Collectors.toList());
    }


    @PostMapping("/prueba")
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }


    @PutMapping
    public void modificar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        rS.delete(id);
    }
}
