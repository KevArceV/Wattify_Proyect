package pe.edu.upc.aaw.wattify.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;




public class MetodoPagoDTO {


    public class MembresiaDTO {
        private int id;
        private String tipoMembresia;
        private LocalDate fechaInicio;
        private LocalDate fechaFin;
        private BigDecimal precio;
        private String metodoDePago;

        // Getters y Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTipoMembresia() {
            return tipoMembresia;
        }

        public void setTipoMembresia(String tipoMembresia) {
            this.tipoMembresia = tipoMembresia;
        }

        public LocalDate getFechaInicio() {
            return fechaInicio;
        }

        public void setFechaInicio(LocalDate fechaInicio) {
            this.fechaInicio = fechaInicio;
        }

        public LocalDate getFechaFin() {
            return fechaFin;
        }

        public void setFechaFin(LocalDate fechaFin) {
            this.fechaFin = fechaFin;
        }

        public BigDecimal getPrecio() {
            return precio;
        }

        public void setPrecio(BigDecimal precio) {
            this.precio = precio;
        }

        public String getMetodoDePago() { //
            return metodoDePago;
        }

        public void setMetodoDePago(String metodoDePago) {
            this.metodoDePago = metodoDePago;
        }
    }

}
