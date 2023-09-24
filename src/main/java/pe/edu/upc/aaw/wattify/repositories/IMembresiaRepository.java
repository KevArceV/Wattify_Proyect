package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.Membresia;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IMembresiaRepository extends JpaRepository<Membresia, Integer> {
    List<Membresia>findByFechaInicio(LocalDate fechaInicio);
@Query(value = "select m.tipo_membresia, count(m.tipo_membresia) as cantidad_de_usuarios\n" +
        " from membresia m\n" +
        " group by m.tipo_membresia;\n",nativeQuery = true)
    public List<String[]>CantidadDeUsuariosXTipoMembresia();
}

