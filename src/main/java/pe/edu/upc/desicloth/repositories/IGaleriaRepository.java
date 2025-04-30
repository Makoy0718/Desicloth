package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Galeria;

import java.util.List;

@Repository
public interface IGaleriaRepository extends JpaRepository<Galeria, Integer> {
    // Buscar galerías por nombre (like %pattern%)
    @Query("select g from Galeria g where g.nombreGaleria like %:nombre%")
    List<Galeria> buscarPorNombre(@Param("nombre") String nombre);

    // Buscar galerías por ID de usuario (igualdad exacta)
    @Query("select g from Galeria g where g.usuario.idUsuario = :idUsuario")
    List<Galeria> buscarPorUsuarioId(@Param("idUsuario") int idUsuario);


}
