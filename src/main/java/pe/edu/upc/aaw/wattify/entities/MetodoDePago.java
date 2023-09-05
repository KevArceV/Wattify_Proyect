package pe.edu.upc.aaw.wattify.entities;

import javax.persistence.*;

@Entity
@Table(name = "MetodoDePago")
public class MetodoDePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Tipo_Metodo", length = 50, nullable = false)
    private String tipoMetodo;

    @Column(name = "Descripcion", length = 200)
    private String descripcion;

    public MetodoDePago() {
    }

    public MetodoDePago(int id, String tipoMetodo, String descripcion) {
        this.id = id;
        this.tipoMetodo = tipoMetodo;
        this.descripcion = descripcion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
