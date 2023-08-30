package pe.edu.upc.aaw.wattify.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.wattify.entities.Membresia;
import pe.edu.upc.aaw.wattify.repositories.IMembresiaRepository;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements IMembresiaService {
    @Autowired
    private IMembresiaRepository mR;

    @Override
    public void insert(Membresia membresia) {
        mR.save(membresia);
    }

    @Override
    public List<Membresia> list() {
        return mR.findAll();
    }
}
