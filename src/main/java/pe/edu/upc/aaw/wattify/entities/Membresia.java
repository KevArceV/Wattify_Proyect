package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Membresia;
    @Column(name = "Tipo_Membresia", length = 50, nullable = false)
    private String Tipo_Membresia;
    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "Fecha_fin", nullable = false)
    private LocalDate Fecha_fin;
    @Column(name = "Precio", length = 10, nullable = false)
    private BigDecimal Precio;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Membresia() {
    }

    public Membresia(int id_Membresia, String tipo_Membresia, LocalDate fechaInicio, LocalDate fecha_fin, BigDecimal precio, Usuario usuario) {
        this.id_Membresia = id_Membresia;
        Tipo_Membresia = tipo_Membresia;
        this.fechaInicio = fechaInicio;
        Fecha_fin = fecha_fin;
        Precio = precio;
        this.usuario = usuario;
    }

    public int getId_Membresia() {
        return id_Membresia;
    }

    public void setId_Membresia(int id_Membresia) {
        this.id_Membresia = id_Membresia;
    }

    public String getTipo_Membresia() {
        return Tipo_Membresia;
    }

    public void setTipo_Membresia(String tipo_Membresia) {
        Tipo_Membresia = tipo_Membresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
