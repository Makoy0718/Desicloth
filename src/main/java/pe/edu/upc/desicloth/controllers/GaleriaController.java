package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.GaleriaDTO;
import pe.edu.upc.desicloth.dtos.GaleriaDisenoDTO;
import pe.edu.upc.desicloth.entities.Galeria;
import pe.edu.upc.desicloth.entities.GaleriaDiseno;
import pe.edu.upc.desicloth.servicesinterfaces.IGaleriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Galeria")
public class GaleriaController {
    @Autowired
    private IGaleriaService gS;

    //Listar
    @GetMapping("/listarGaleria")
    public List<GaleriaDTO> ListarGalerias() {
        return gS.listGaleria().stream().map(g->{
            ModelMapper m = new ModelMapper();
            return m.map(g, GaleriaDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarGaleria")
    public void insertarGaleria(@RequestBody GaleriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Galeria g = m.map(dto, Galeria.class);
        gS.insertGaleria(g);
    }

    //Actualizar
    @PutMapping("/editarGaleria")
    public void modificarGaleria(@RequestBody GaleriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Galeria g = m.map(dto, Galeria.class);
        gS.updateGaleria(g);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarGaleria(@PathVariable("id") int id) {
        gS.deleteGaleria(id);
    }

    // Buscar por nombre (like %nombre%)
    @GetMapping("/buscarPorNombre")
    public List<GaleriaDTO> buscarPorNombre(@RequestParam String nombre) {
        return gS.searchByNombre(nombre).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, GaleriaDTO.class);
        }).collect(Collectors.toList());
    }

    // Buscar por ID de usuario (exact match)
    @GetMapping("/buscarPorUsuario")
    public List<GaleriaDTO> buscarPorUsuario(@RequestParam int idUsuario) {
        return gS.searchByIdUsuario(idUsuario).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, GaleriaDTO.class);
        }).collect(Collectors.toList());
    }
}
