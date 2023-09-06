package pe.edu.upc.aaw.wattify.dtos;

public class TipoDispositivoDTO {
    private int id;
    private String nombreTipoDispositivo;
    private String descripcion;

    public TipoDispositivoDTO() {
    }

    public TipoDispositivoDTO(int id, String nombreTipoDispositivo, String descripcion) {
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

