package pe.edu.upc.aaw.wattify.serviceinterfaces;



import pe.edu.upc.aaw.wattify.entities.MetodoPago;
import java.util.List;

import java.util.List;
public interface IMetodoPagoService {


        public void insert(MetodoPago metodoPago);
        public List<MetodoPago> list();
        public void delete(int idMetodoPago);


}
