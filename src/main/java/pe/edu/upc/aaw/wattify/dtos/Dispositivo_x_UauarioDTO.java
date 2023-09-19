package pe.edu.upc.aaw.wattify.dtos;

import pe.edu.upc.aaw.wattify.entities.Dispositivo;
import pe.edu.upc.aaw.wattify.entities.Usuario;

public class Dispositivo_x_UauarioDTO {
    private int id_DxUsuario;
    private int cantidadDispositivos;
    private Dispositivo dispositivo;
    private Usuario usuario;

    public int getId_DxUsuario() {
        return id_DxUsuario;
    }

    public void setId_DxUsuario(int id) {
        this.id_DxUsuario = id;
    }

    public int getCantidadDispositivos() {
        return cantidadDispositivos;
    }

    public void setCantidadDispositivos(int cantidadDispositivos) {
        this.cantidadDispositivos = cantidadDispositivos;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
