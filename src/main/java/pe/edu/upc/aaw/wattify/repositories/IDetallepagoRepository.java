package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.Detalle_pago;
import java.util.List;

@Repository
public interface IDetallepagoRepository extends JpaRepository<Detalle_pago, Integer> {
    List<Detalle_pago>findBySub_total_pago(int Sub_total_pago);
}
