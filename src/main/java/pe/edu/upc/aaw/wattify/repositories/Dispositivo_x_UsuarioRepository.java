package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.Dispositivo_X_Usuario;

@Repository
public interface Dispositivo_x_UsuarioRepository extends JpaRepository<Dispositivo_X_Usuario, Integer> {
}
