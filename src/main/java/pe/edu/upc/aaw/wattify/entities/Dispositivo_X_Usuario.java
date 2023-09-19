package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;

@Entity
@Table(name = "Dispositivo_X_Usuario")
public class Dispositivo_X_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_DxUsuario;
    @Column(name = "cantidadDispositivos", nullable = false)
    private int cantidadDispositivos;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Dispositivo", referencedColumnName = "id_Dispositivo")
    private Dispositivo dispositivo;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    // validar si no se debe eliminar el constructor  -_-
    public Dispositivo_X_Usuario() {
    }

    public Dispositivo_X_Usuario(int id_DxUsuario, int cantidadDispositivos, Dispositivo dispositivo, Usuario usuario) {
        this.id_DxUsuario = id_DxUsuario;
        this.cantidadDispositivos = cantidadDispositivos;
        this.dispositivo = dispositivo;
        this.usuario = usuario;
    }

    public int getId() {
        return id_DxUsuario;
    }

    public void setId(int id) {
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
