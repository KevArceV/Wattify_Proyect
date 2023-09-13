package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;

@Entity
@Table(name = "DispositivoPorUsuario")
public class DispositivoPorUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cantidadDispositivos", nullable = false)
    private int cantidadDispositivos;
    @ManyToOne
    @JoinColumn(name = "id")
    private Dispositivo dispositivo;
    @ManyToOne
    @JoinColumn(name = "Id")
    private Usuario usuario;

    public DispositivoPorUsuario() {
    }

    public DispositivoPorUsuario(int id, int cantidadDispositivos, Dispositivo dispositivo, Usuario usuario) {
        this.id = id;
        this.cantidadDispositivos = cantidadDispositivos;
        this.dispositivo = dispositivo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
