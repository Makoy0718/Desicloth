package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Diseno;
@Repository
public interface IDisenoRepository extends JpaRepository<Diseno, Integer> {
}
