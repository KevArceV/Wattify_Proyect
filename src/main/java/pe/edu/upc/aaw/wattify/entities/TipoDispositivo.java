package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoDispositivo")
public class TipoDispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombreTipoDispositivo", nullable = false, length = 35)
    private String nombreTipoDispositivo;
    @Column(name = "descripcion", nullable = false, length = 350)
    private String descripcion;

    public TipoDispositivo() {
    }

    public TipoDispositivo(int id, String nombreDispositivo, String descripcion) {
        this.id = id;
        this.nombreTipoDispositivo = nombreDispositivo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDispositivo() {
        return nombreTipoDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreTipoDispositivo = nombreDispositivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
