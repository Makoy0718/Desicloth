package pe.edu.upc.desicloth.servicesinterfaces;

import pe.edu.upc.desicloth.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> listProducto();
    public void insertProducto(Producto p);
    public void updateProducto(Producto p);
    public void deleteProducto(int id);
    List<Producto> buscarPorTalla(char talla);
    List<Producto> buscarPorNombre(String nombre);
}
