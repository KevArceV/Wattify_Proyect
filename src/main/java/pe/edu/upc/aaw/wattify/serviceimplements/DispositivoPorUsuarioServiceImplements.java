package pe.edu.upc.aaw.wattify.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.wattify.entities.DispositivoPorUsuario;
import pe.edu.upc.aaw.wattify.repositories.IDispositivoPorUsuario;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IDispositivoPorUsuarioService;

@Service
public class DispositivoPorUsuarioServiceImplements implements IDispositivoPorUsuarioService {
    @Autowired
    private IDispositivoPorUsuario dR;

    @Override
    public void insert(DispositivoPorUsuario dispositivoPorUsuario) {
        dR.save(dispositivoPorUsuario);
    }
}
