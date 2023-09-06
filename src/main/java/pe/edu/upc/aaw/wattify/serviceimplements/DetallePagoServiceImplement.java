package pe.edu.upc.aaw.wattify.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.wattify.entities.Detalle_pago;
import pe.edu.upc.aaw.wattify.repositories.IDetallepagoRepository;
import pe.edu.upc.aaw.wattify.serviceinterfaces.IDetallepagoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class DetallePagoServiceImplement implements IDetallepagoService {
    @Autowired
    private IDetallepagoRepository mR;

    @Override
    public void insert(Detalle_pago detalle_pago) {
        mR.save(detalle_pago);
    }

    @Override
    public List<Detalle_pago> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idDetallePago) {
        mR.deleteById(idDetallePago);
    }

    @Override
    public List<Detalle_pago> findBySub_total_pago(int Sub_total_pago) {
        return mR.findBySub_total_pago(Sub_total_pago);
    }

}
