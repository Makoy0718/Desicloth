package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    // Buscar productos por talla
    @Query("select p from Producto p where p.tallaProducto = :talla")
    List<Producto> buscarPorTalla(@Param("talla") char talla);

    // Buscar productos por nombre
    @Query("select p from Producto p where lower(p.nombreProducto) like lower(concat('%', :nombre, '%'))")
    List<Producto> buscarPorNombre(@Param("nombre") String nombre);
}
