package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Diseno;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDisenoRepository extends JpaRepository<Diseno, Integer> {
    // Buscar diseños por fecha exacta
    @Query("SELECT d FROM Diseno d WHERE d.fechaOrigenDiseno = :fecha")
    List<Diseno> buscarPorFechaOrigen(@Param("fecha") LocalDate fecha);

    // Buscar diseños por tipoOrigenDiseno
    @Query("SELECT d FROM Diseno d WHERE d.tipoOrigenDiseno = :tipo")
    List<Diseno> buscarByTipoOrigen(@Param("tipo") String tipo);
}
