package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.DisenoDTO;
import pe.edu.upc.desicloth.entities.Diseno;
import pe.edu.upc.desicloth.servicesinterfaces.IDisenoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Disenos")
public class DisenoController {
    @Autowired
    private IDisenoService dS;

    @GetMapping("/listaDiseno")
    public List<DisenoDTO> listaDiseno() {
        return dS.listDiseno().stream().map(w ->{
            ModelMapper m = new ModelMapper();
            return m.map(w, DisenoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertarDiseno")
    public void insertarDiseno(@RequestBody DisenoDTO dto) {
        ModelMapper m = new ModelMapper();
        Diseno d = m.map(dto, Diseno.class);
        dS.insertDiseno(d);
    }
}
