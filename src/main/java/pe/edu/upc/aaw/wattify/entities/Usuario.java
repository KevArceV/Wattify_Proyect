package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "Nombres",length = 45,nullable = false)
    private String Nombres;
    @Column(name = "Apellidos",length = 45,nullable = false)
    private String Apellidos;
    @Column(name = "Genero",length = 30,nullable = false)
    private String Genero;
    @Column(name = "Direccion",length = 60,nullable = false)
    private String Direccion;
    @Column(name = "DNI",length = 9,nullable = false)
    private String DNI;
    @Column(name = "Celular",length = 10,nullable = false)
    private String Celular;

    public Usuario() {
    }

    public Usuario(int id, String nombres, String apellidos, String genero, String direccion, String DNI, String celular) {
        Id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Genero = genero;
        Direccion = direccion;
        this.DNI = DNI;
        Celular = celular;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }
}
