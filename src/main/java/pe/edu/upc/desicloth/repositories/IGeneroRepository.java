package pe.edu.upc.desicloth.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Categoria;
import pe.edu.upc.desicloth.entities.Genero;

import java.util.List;

@Repository
public interface IGeneroRepository extends JpaRepository<Genero, Integer> {
    //Busca por nombre
    @Query("select a from Genero a where a.nombreGenero like %:nombreG%")
    public List<Genero> buscarGenero(@Param("nombreG") String nombreG);

    //Conteo de cuantos disenos tiene una genero
    @Query(value = "select g.nombre_genero, count(d.id_diseno) as Cantidad\n" +
            "from genero g inner join diseno d\n" +
            "on g.id_genero = d.id_genero\n" +
            "group by c.nombre_genero",
            nativeQuery = true)
    List<String[]> contarDisenosPorGenero();
}
