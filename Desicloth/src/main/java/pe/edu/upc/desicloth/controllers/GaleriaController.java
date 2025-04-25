package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.GaleriaDTO;
import pe.edu.upc.desicloth.entities.Galeria;
import pe.edu.upc.desicloth.servicesinterfaces.IGaleriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Galeria")
public class GaleriaController {
    @Autowired
    private IGaleriaService gS;

    @GetMapping("/listarGaleria")
    public List<GaleriaDTO> ListarGalerias() {
        return gS.listGaleria().stream().map(g->{
            ModelMapper m = new ModelMapper();
            return m.map(g, GaleriaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertarGaleria")
    public void insertarGaleria(@RequestBody GaleriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Galeria g = m.map(dto, Galeria.class);
        gS.insertGaleria(g);
    }
}
