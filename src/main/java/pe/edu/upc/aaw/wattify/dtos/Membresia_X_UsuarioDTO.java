package pe.edu.upc.aaw.wattify.dtos;

public class Membresia_X_UsuarioDTO {
    private String tipoMembresia;
    private int cantidadUsuarios;

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }
}
