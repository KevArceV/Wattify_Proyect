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

    @Column(name = "tipo_de_pago", length = 50, nullable = false)
    private String Tipo_de_pago;

    @Column(name = "titular", length = 50, nullable = false)
    private String Titular;

    public Metodo_de_Pago() {
    }

    public Metodo_de_Pago(int id, String tipo_de_pago, String titular) {
        this.id = id;
        Tipo_de_pago = tipo_de_pago;
        Titular = titular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_de_pago() {
        return Tipo_de_pago;
    }

    public void setTipo_de_pago(String tipo_de_pago) {
        Tipo_de_pago = tipo_de_pago;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }
}
