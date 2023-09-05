package pe.edu.upc.aaw.wattify.dtos;

import pe.edu.upc.aaw.wattify.entities.Usuario;
import java.time.LocalDate;
public class MetodoPagoDTO {
    private int id;
    private int Tipo;
    private int Credencial_de_tarjeta;
    private LocalDate Fecha_de_vencimiento;
    private String Copia_de_Seguridad;
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        Tipo = tipo;
    }

    public int getCredencial_de_tarjeta() {
        return Credencial_de_tarjeta;
    }

    public void setCredencial_de_tarjeta(int credencial_de_tarjeta) {
        Credencial_de_tarjeta = credencial_de_tarjeta;
    }

    public LocalDate getFecha_de_vencimiento() {
        return Fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(LocalDate fecha_de_vencimiento) {
        Fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public String getCopia_de_Seguridad() {
        return Copia_de_Seguridad;
    }

    public void setCopia_de_Seguridad(String copia_de_Seguridad) {
        Copia_de_Seguridad = copia_de_Seguridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
