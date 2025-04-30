package pe.edu.upc.desicloth.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.desicloth.dtos.CategoriaDTO;
import pe.edu.upc.desicloth.dtos.ConteoCategoriaPorDisenoDTO;
import pe.edu.upc.desicloth.dtos.UsuarioDTO;
import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.entities.Usuario;
import pe.edu.upc.desicloth.servicesinterfaces.ICategoriaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService cS;

    //Listar
    @GetMapping("/listaCategoria")
    public List<Categoria> listaCategoria() {
        return cS.listCategoria().stream().map(w->{
            ModelMapper m = new ModelMapper();
            return m.map(w, Categoria.class);
        }).collect(Collectors.toList());
    }

    //Insertar
    @PostMapping("/insertarCategoria")
    public void insertarCategoria(@RequestBody CategoriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(dto, Categoria.class);
        cS.insertCategoria(c);
    }

    //Actualizar
    @PutMapping("/modificarCategoria")
    public void modificarCategoria(@RequestBody CategoriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(dto, Categoria.class);
        cS.updateCategoria(c);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable("id") int id) { cS.deleteCategoria(id); }

    //Query buscar por nombre
    @GetMapping("/nombresC")
    public List<CategoriaDTO> buscarCategoriaNombre(@RequestParam String nombreC) {
        return cS.searchCategoria(nombreC).stream().map(y ->{
            ModelMapper m = new ModelMapper();
            return m.map(y,CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/conteoDisenos")
    public List<ConteoCategoriaPorDisenoDTO> obtenerConteoDisenos() {
        List<ConteoCategoriaPorDisenoDTO> dtoLista = new ArrayList<>();
        List<String[]> resultados = cS.contarDisenosPorCategoria();

        for(String[] fila : resultados) {
            ConteoCategoriaPorDisenoDTO dto = new ConteoCategoriaPorDisenoDTO();
            dto.setNombreCategoria(fila[0]);
            dto.setCantidadDisenos(Integer.parseInt(fila[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
