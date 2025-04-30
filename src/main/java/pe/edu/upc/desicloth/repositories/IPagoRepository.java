package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Pago;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    // Buscar pagos por método de pago (búsqueda exacta)
    @Query("select p from Pago p where p.metodoPago = :metodo")
    List<Pago> buscarPorMetodoPago(@Param("metodo") String metodo);

    // Buscar pagos por fecha exacta
    @Query("select p from Pago p where p.fechaPago = :fecha")
    List<Pago> buscarPorFechaPago(@Param("fecha") LocalDate fecha);
}
