package pe.edu.upc.desicloth.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Buscar usuarios por nombre (búsqueda parcial insensible a mayúsculas)
    @Query("select u from Usuario u where lower(u.nombreUsuario) like lower(concat('%', :nombre, '%'))")
    List<Usuario> buscarPorNombreUsuario(@Param("nombre") String nombre);

    // Buscar usuarios por rol (ID del rol)
    @Query("select u from Usuario u where u.rol.idRol = :idRol")
    List<Usuario> buscarPorRol(@Param("idRol") int idRol);
}
