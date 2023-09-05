package pe.edu.upc.aaw.wattify.entities;

public class TipoDispositivo {
    private int id;
    private String nombreDispositivo;
    private String descripcion;

    public TipoDispositivo() {
    }

    public TipoDispositivo(int id, String nombreDispositivo, String descripcion) {
        this.id = id;
        this.nombreDispositivo = nombreDispositivo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
