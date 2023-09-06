package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.TipoDispositivo;

import java.util.List;

@Repository
public interface ITipoDispositivoRepository extends JpaRepository<TipoDispositivo, Integer> {


    List<TipoDispositivo> findByNombreTipoDispositivo(String nombreTipoDispositivo);


    List<TipoDispositivo> findByDescripcion(String descripcion);
}
