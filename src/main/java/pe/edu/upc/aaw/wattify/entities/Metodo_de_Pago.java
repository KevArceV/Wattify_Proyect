package pe.edu.upc.aaw.wattify.entities;
import javax.persistence.*;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Metodo_de_Pago")
public class Metodo_de_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Tipo", length = 50, nullable = false)
    private int Tipo;

    @Column(name = "Credencial_de_tarjeta", length = 50, nullable = false)
    private int Credencial_de_tarjeta;

    @Column(name = "Fecha_de_vencimiento", length = 50, nullable = false)
    private LocalDate Fecha_de_vencimiento;

    @Column(name = "Copia_de_seguridad", length = 50, nullable = false)
    private String Copia_de_seguridad;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Metodo_de_Pago() {
    }

    public Metodo_de_Pago(int id, int tipo, int credencial_de_tarjeta, LocalDate fecha_de_vencimiento, String copia_de_seguridad, Usuario usuario) {
        this.id = id;
        Tipo = tipo;
        Credencial_de_tarjeta = credencial_de_tarjeta;
        Fecha_de_vencimiento = fecha_de_vencimiento;
        Copia_de_seguridad = copia_de_seguridad;
        this.usuario = usuario;
    }

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

    public String getCopia_de_seguridad() {
        return Copia_de_seguridad;
    }

    public void setCopia_de_seguridad(String copia_de_seguridad) {
        Copia_de_seguridad = copia_de_seguridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
