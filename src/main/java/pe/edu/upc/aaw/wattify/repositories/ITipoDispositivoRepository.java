package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.TipoDispositivo;

import java.util.List;

@Repository
public interface ITipoDispositivoRepository extends JpaRepository<TipoDispositivo, Integer> {

    @Query(value = "select td.nombre_tipo_dispositivo, count(d.id_dispositivo) as cantidad_de_dispositivos\n" +
            " from tipo_dispositivo td\n" +
            " left join dispositivo d \n" +
            " on td.id_tipo_dispositivo = d.id_tipo_dispositivo\n" +
            " group by td.nombre_tipo_dispositivo",nativeQuery = true)
    public List<String[]> cantidadDispositivosXtipo();
}
