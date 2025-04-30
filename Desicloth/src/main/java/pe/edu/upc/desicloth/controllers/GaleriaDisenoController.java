package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.GaleriaDisenoDTO;
import pe.edu.upc.desicloth.entities.GaleriaDiseno;
import pe.edu.upc.desicloth.servicesinterfaces.IGaleriaDisenoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/GaleriasDisenos")
public class GaleriaDisenoController {
    @Autowired
    private IGaleriaDisenoService gdS;

    @GetMapping("/listarGaleriaDiseno")
    public List<GaleriaDisenoDTO> listarGaleriaDiseno() {
        return gdS.listGaleriaDiseno().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, GaleriaDisenoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertarGaleriaDiseno")
    public void insertarGaleriaDiseno(@RequestBody GaleriaDisenoDTO dto) {
        ModelMapper m = new ModelMapper();
        GaleriaDiseno gd = m.map(dto, GaleriaDiseno.class);
        gdS.insertGaleriaDiseno(gd);
    }

}
