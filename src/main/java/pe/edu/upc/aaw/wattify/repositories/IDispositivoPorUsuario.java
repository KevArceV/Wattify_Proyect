package pe.edu.upc.aaw.wattify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.wattify.entities.DispositivoPorUsuario;

@Repository
public interface IDispositivoPorUsuario extends JpaRepository<DispositivoPorUsuario, Integer>{
    
}
