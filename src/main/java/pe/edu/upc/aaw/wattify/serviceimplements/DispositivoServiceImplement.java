package pe.edu.upc.aaw.wattify.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.wattify.entities.Dispositivo;
import pe.edu.upc.aaw.wattify.repositories.IDispositivoRepository;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IDispositivoService;

import java.util.List;

@Service
public class DispositivoServiceImplement implements IDispositivoService {

    private IDispositivoRepository dR;

    @Override
    public void insert(Dispositivo dispositivo) {
        dR.save(dispositivo);
    }

    @Override
    public List<Dispositivo> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDispositivo) {
    dR.deleteById(idDispositivo);
    }

    @Override
    public Dispositivo findFirstByNombre(String nombre) {
        return dR.findFirstByNombre(nombre);
    }
}
