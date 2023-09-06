package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.Metodo_de_Pago;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IMetododePagoRepository extends JpaRepository<Metodo_de_Pago, Integer> {
}
