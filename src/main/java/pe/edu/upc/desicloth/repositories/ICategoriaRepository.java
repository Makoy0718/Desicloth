package pe.edu.upc.desicloth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.desicloth.entities.Categoria;

import java.util.List;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {
    //Busca por nombre
    @Query("select a from Categoria a where a.nombreCategoria like %:nombreC%")
    public List<Categoria> buscarCategoria(@Param("nombreC") String nombreC);

    //Conteo de cuantos disenos tiene una categoria
    @Query(value = "select c.nombre_categoria, count(d.id_diseno) as Cantidad\n" +
            "from categoria c inner join diseno d\n" +
            "on c.id_categoria = d.id_categoria\n" +
            "group by c.nombre_categoria",
            nativeQuery = true)
    List<String[]> contarDisenosPorCategoria();
}
