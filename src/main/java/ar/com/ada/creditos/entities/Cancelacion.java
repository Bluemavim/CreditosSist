package ar.com.ada.creditos.entities;
import javax.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name="cancelacion")
public class Cancelacion {
    
    @Id
    
    
    @Column(name="cancelacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cancelacionId;

    @Column(name="prestamo_id")
    private Date fecha;
    @Column(name="fecha_cancelacion")
    private BigDecimal importe;
    @Column(name="cuota")
    private int cuotas;


    @ManyToOne // los JoinColumn van donde está la FK
    @JoinColumn(name = "prestamo_id", referencedColumnName = "prestamo_id")
    private Cliente cliente;
    
}
