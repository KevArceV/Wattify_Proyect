package pe.edu.upc.aaw.wattify.serviceimplements;

import pe.edu.upc.aaw.wattify.serviceinterfaces.IMetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.wattify.entities.MetodoDePago;
import pe.edu.upc.aaw.wattify.repositories.IMetodoPagoRepositories;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IMetodoPagoService;

import java.util.List
public class MetodoPagoImplements implements IMetodoPagoService {

@Autowired
private IMetodoPagoRepositories mR;

    @Override
    public void insert(MetodoDePago metodoDePago) {
        mR.save(metodoDePago);
    }

    @Override
    public List<MetodoDePago> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMetodoPago) {
        mR.deleteById(idMetodoPago);
    }
}
