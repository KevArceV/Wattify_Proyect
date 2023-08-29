package pe.edu.upc.aaw.wattify.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.wattify.repositories.IMembresiaRepository;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IMembresiaService;

@Service
public class MembresiaServiceImplement implements IMembresiaService {
    @Autowired
    private IMembresiaRepository mR;

}
