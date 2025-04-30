package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Reclamos;

import java.util.List;

@Repository
public interface IReclamosRepository extends JpaRepository<Reclamos, Integer> {
    // Buscar reclamos por título
    @Query("select r from Reclamos r where lower(r.titulo) like lower(concat('%', :titulo, '%'))")
    List<Reclamos> buscarPorTitulo(@Param("titulo") String titulo);

    // Buscar reclamos por estado (true/false)
    @Query("select r from Reclamos r where r.estado = :estado")
    List<Reclamos> buscarPorEstado(@Param("estado") boolean estado);
}
