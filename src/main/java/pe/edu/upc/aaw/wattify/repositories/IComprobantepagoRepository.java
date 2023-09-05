package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.Comprobante_pago;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface IComprobantepagoRepository extends JpaRepository<Comprobante_pago, Integer> {
    List<Comprobante_pago>findByFechaEmision(LocalDate FechaEmision);
}
