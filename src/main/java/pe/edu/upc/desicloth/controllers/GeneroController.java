package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.ConteoCategoriaPorDisenoDTO;
import pe.edu.upc.desicloth.dtos.ConteoGeneroPorDisenoDTO;
import pe.edu.upc.desicloth.dtos.GeneroDTO;
import pe.edu.upc.desicloth.entities.Genero;
import pe.edu.upc.desicloth.servicesinterfaces.IGeneroService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private IGeneroService gS;

    //Listar
    @GetMapping("/listaGenero")
    public List<GeneroDTO> listarGenero() {
        return gS.listGenero().stream().map(w -> {
            ModelMapper m = new ModelMapper();
            return m.map(w, GeneroDTO.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarGenero")
    public void insertarGenero(@RequestBody GeneroDTO dto) {
        ModelMapper m = new ModelMapper();
        Genero g = m.map(dto, Genero.class);
        gS.insertGenero(g);
    }

    //Actualzar
    @PutMapping("/actualizarGenero")
    public void modificarGenero(@RequestBody GeneroDTO dto) {
        ModelMapper m = new ModelMapper();
        Genero g = m.map(dto, Genero.class);
        gS.updateGenero(g);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarGenero(@PathVariable("id") int id) { gS.deleteGenero(id); }

    //Query buscar por nombre
    @GetMapping("/nombresG")
    public List<GeneroDTO> buscarGeneroNombre(@RequestParam String nombreG) {
        return gS.searchGenero(nombreG).stream().map(y ->{
            ModelMapper m = new ModelMapper();
            return m.map(y,GeneroDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/conteoGeneros")
    public List<ConteoGeneroPorDisenoDTO> obtenerConteoGeneros() {
        List<ConteoGeneroPorDisenoDTO> dtoLista = new ArrayList<>();
        List<String[]> resultados = gS.contarDisenosPorGenero();

        for(String[] fila : resultados) {
            ConteoGeneroPorDisenoDTO dto = new ConteoGeneroPorDisenoDTO();
            dto.setNombreGenero(fila[0]);
            dto.setCantidadDisenos(Integer.parseInt(fila[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
