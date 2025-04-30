package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Pedido;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
    // Buscar pedidos por ID de usuario
    @Query("select p from Pedido p where p.usuario.idUsuario = :idUsuario")
    List<Pedido> buscarPorUsuarioId(@Param("idUsuario") int idUsuario);

    // Buscar pedidos por fecha exacta
    @Query("select p from Pedido p where p.fechaPedido = :fecha")
    List<Pedido> buscarPorFechaPedido(@Param("fecha") LocalDate fecha);
}
