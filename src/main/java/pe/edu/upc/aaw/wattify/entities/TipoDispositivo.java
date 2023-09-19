package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class TipoDispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombreTipoDispositivo", nullable = false)
    private String nombreTipoDispositivo;

    @Column(name = "descripcion")
    private String descripcion;


    public TipoDispositivo() {
    }


    public TipoDispositivo(int id, String nombreTipoDispositivo, String descripcion) {
        this.id = id;
        this.nombreTipoDispositivo = nombreTipoDispositivo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTipoDispositivo() {
        return nombreTipoDispositivo;
    }

    public void setNombreTipoDispositivo(String nombreTipoDispositivo) {
        this.nombreTipoDispositivo = nombreTipoDispositivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
