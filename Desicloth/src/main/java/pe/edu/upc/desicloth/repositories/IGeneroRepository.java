package pe.edu.upc.desicloth.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Genero;

@Repository
public interface IGeneroRepository extends JpaRepository<Genero, Long> {


}
