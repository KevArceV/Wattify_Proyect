package pe.edu.upc.aaw.wattify.serviceinterfaces;

import pe.edu.upc.aaw.wattify.entities.Membresia;

import java.util.List;

public interface IMembresiaService {
    public void insert(Membresia membresia);
    public List<Membresia> list();
    public void delete(int idMembresia);
}
