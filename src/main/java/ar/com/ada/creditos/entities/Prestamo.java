package ar.com.ada.creditos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

// Comento posibles soluciones para ver cómo poner el setTimestamp
//preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));


@Entity
@Table(name="prestamos")
public class Prestamo{

    @Id
    @Column(name="prestamo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prestamoId;

    @Column(name="fecha")
    private Date fecha;
    @Column(name="importe")
    private BigDecimal importe;
    @Column(name="cuotas")
    private int cuotas;
    @Column(name="fecha_alta")
    private Date fechaAlta;

    @ManyToOne // los JoinColumn van donde está la FK
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    private Cliente cliente;


    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.cliente.getPrestamos().add(this);//relación bidireccional
    }


}
