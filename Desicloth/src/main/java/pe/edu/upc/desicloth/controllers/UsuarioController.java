package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.UsuarioDTO;
import pe.edu.upc.desicloth.entities.Usuario;
import pe.edu.upc.desicloth.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;


    @GetMapping("/lista")
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }


    @PostMapping("/prueba")
    public void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }


    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.update(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        uS.delete(id);
    }

}
