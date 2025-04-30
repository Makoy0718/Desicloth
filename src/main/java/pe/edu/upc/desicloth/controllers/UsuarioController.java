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

    //Listar
    @GetMapping("/lista")
    public List<UsuarioDTO> listarUsuario() {
        return uS.listUsuario().stream().map(w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarUsuario")
    public void insertarUsuario(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insertUsuario(u);
    }

    //Actualizar
    @PutMapping("/modificarUsuario")
    public void modificarUsuario(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.updateUsuario(u);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable("id") int id) { uS.deleteUsuario(id); }

    // Buscar por nombre de usuario
    @GetMapping("/buscarPorNombre")
    public List<UsuarioDTO> buscarPorNombre(@RequestParam String nombre) {
        return uS.buscarPorNombreUsuario(nombre).stream().map(u -> {
            ModelMapper m = new ModelMapper();
            return m.map(u, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por ID de rol
    @GetMapping("/buscarPorRol")
    public List<UsuarioDTO> buscarPorRol(@RequestParam int idRol) {
        return uS.buscarPorRol(idRol).stream().map(u -> {
            ModelMapper m = new ModelMapper();
            return m.map(u, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
