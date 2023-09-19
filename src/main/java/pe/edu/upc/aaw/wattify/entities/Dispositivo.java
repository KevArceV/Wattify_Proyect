package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Dispositivo")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Dispositivo;
    @Column(name = "nombre", nullable = false, length = 35)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 350)
    private String descripcion;
    @Column(name = "consumoHora", nullable = false)
    private int consumoHora;
    @Column(name = "horasEncendidas", nullable = false)
    private int horasEncendidas;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idTipoDispositivo")
    private TipoDispositivo tipoDispositivo;

    //@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
   // private List<Dispositivo_X_Usuario> dispositivo_X_Usuario;

    public Dispositivo() {
    }

    public Dispositivo(int id_Dispositivo, String nombre, String descripcion, int consumoHora, int horasEncendidas, LocalDate fecha, TipoDispositivo tipoDispositivo) {
        this.id_Dispositivo = id_Dispositivo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.consumoHora = consumoHora;
        this.horasEncendidas = horasEncendidas;
        this.fecha = fecha;
        this.tipoDispositivo = tipoDispositivo;
    }

    public int getId() {
        return id_Dispositivo;
    }

    public void setId(int id_Dispositivo) {
        this.id_Dispositivo = id_Dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getConsumoHora() {
        return consumoHora;
    }

    public void setConsumoHora(int consumoHora) {
        this.consumoHora = consumoHora;
    }

    public int getHorasEncendidas() {
        return horasEncendidas;
    }

    public void setHorasEncendidas(int horasEncendidas) {
        this.horasEncendidas = horasEncendidas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoDispositivo getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(TipoDispositivo tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    /*
    public List<Dispositivo_X_Usuario> getDispositivo_X_Usuario() {
        return dispositivo_X_Usuario;
    }

    public void setDispositivo_X_Usuario(List<Dispositivo_X_Usuario> dispositivo_X_Usuario) {
        this.dispositivo_X_Usuario = dispositivo_X_Usuario;
    }*/
}
