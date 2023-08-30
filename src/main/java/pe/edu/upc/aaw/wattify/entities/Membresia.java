package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Tipo_Membresia", length = 50, nullable = false)
    private String Tipo_Membresia;
    @Column(name = "Fecha_inicio", nullable = false)
    private LocalDate Fecha_inicio;
    @Column(name = "Fecha_fin", nullable = false)
    private LocalDate Fecha_fin;
    @Column(name = "Precio", length = 10, nullable = false)
    private BigDecimal Precio;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Membresia() {
    }

    public Membresia(int id, String tipo_Membresia, LocalDate fecha_inicio, LocalDate fecha_fin, BigDecimal precio, Usuario usuario) {
        this.id = id;
        Tipo_Membresia = tipo_Membresia;
        Fecha_inicio = fecha_inicio;
        Fecha_fin = fecha_fin;
        Precio = precio;
        this.usuario = usuario;
    }

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
