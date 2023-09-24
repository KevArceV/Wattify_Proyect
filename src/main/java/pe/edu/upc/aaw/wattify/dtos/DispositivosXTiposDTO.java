package pe.edu.upc.aaw.wattify.dtos;

public class DispositivosXTiposDTO {
    private String nombre_tipo_dispositivo ;
    private int cantidad_de_dispositivos ;

    public String getNombre_tipo_dispositivo() {
        return nombre_tipo_dispositivo;
    }

    public void setNombre_tipo_dispositivo(String nombre_tipo_dispositivo) {
        this.nombre_tipo_dispositivo = nombre_tipo_dispositivo;
    }

    public int getCantidad_de_dispositivos() {
        return cantidad_de_dispositivos;
    }

    public void setCantidad_de_dispositivos(int cantidad_de_dispositivos) {
        this.cantidad_de_dispositivos = cantidad_de_dispositivos;
    }
}
