package pe.edu.upc.aaw.wattify.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MembresiaDTO {
    private int id;
    private String Tipo_Membresia;
    private LocalDate Fecha_inicio;
    private LocalDate Fecha_fin;
    private BigDecimal Precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_Membresia() {
        return Tipo_Membresia;
    }

    public void setTipo_Membresia(String tipo_Membresia) {
        Tipo_Membresia = tipo_Membresia;
    }

    public LocalDate getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        Fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        Fecha_fin = fecha_fin;
    }

    public BigDecimal getPrecio() {
        return Precio;
    }

    public void setPrecio(BigDecimal precio) {
        Precio = precio;
    }
}
