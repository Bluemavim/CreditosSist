package ar.com.ada.creditos.entities;
import javax.persistence.*;
import java.util.Date;

import java.math.BigDecimal;


@Entity
@Table(name="cancelacion")
public class Cancelacion {
    
    @Id  
    @Column(name="cancelacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cancelacionId;

    @ManyToOne
    @JoinColumn(name="prestamo_id", referencedColumnName = "prestamo_id")
    private Prestamo prestamo;

    @Column(name="fecha_cancelacion")
    private Date fechaCancelacion;

    @Column(name="importe")
    private BigDecimal importe;

    @Column(name="cuota")
    private int cuotas;

    public int getCancelacionId() {
        return cancelacionId;
    }

    public void setCancelacionId(int cancelacionId) {
        this.cancelacionId = cancelacionId;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
}
