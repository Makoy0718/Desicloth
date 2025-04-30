package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Rol;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    // Buscar roles por nombre
    @Query("select r from Rol r where lower(r.nombreRol) like lower(concat('%', :nombre, '%'))")
    List<Rol> buscarPorNombreRol(@Param("nombre") String nombre);

    // Buscar roles por descripción (búsqueda parcial insensible a mayúsculas)
    @Query("select r from Rol r where lower(r.descripcionRol) like lower(concat('%', :descripcion, '%'))")
    List<Rol> buscarPorDescripcionRol(@Param("descripcion") String descripcion);
}
