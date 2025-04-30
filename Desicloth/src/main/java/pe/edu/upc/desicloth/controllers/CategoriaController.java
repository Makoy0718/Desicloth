package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.CategoriaDTO;
import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.servicesinterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService cS;

    @GetMapping("/listaCategoria")
    public List<Categoria> listaCategoria() {
        return cS.listCategoria().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, Categoria.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertarCategoria")
    public void insertarCategoria(@RequestBody CategoriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(dto, Categoria.class);
        cS.insertCategoria(c);
    }
}
