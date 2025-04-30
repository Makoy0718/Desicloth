package pe.edu.upc.desicloth.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.desicloth.entities.Producto;
import pe.edu.upc.desicloth.repositories.IProductoRepository;
import pe.edu.upc.desicloth.servicesinterfaces.IProductoService;

import java.util.List;

@Service
public class ProductoServiceImplement implements IProductoService {
    @Autowired
    private IProductoRepository pR;

    //Listar
    @Override
    public List<Producto> listProducto() { return pR.findAll(); }

    //Insertar
    @Override
    public void insertProducto(Producto p) { pR.save(p); }

    //Actualizar
    @Override
    public void updateProducto(Producto p) { pR.save(p); }

    //Eliminar
    @Override
    public void deleteProducto(int id) { pR.deleteById(id); }

    @Override
    public List<Producto> buscarPorTalla(char talla) {
        return pR.buscarPorTalla(talla);
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return pR.buscarPorNombre(nombre);
    }
}
