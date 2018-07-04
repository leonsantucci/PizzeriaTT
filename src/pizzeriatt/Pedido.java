package pizzeriatt;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Pedido {

    @Column
    private String cliente;
    @Column
    private String horaPedido;
    @Column
    private int tiempoDemora;
    @Column
    private int numeroPedido;
    @Column
    private double precio;
    @Column
    private int cantidad;
    @Transient
    private Pizza unaPizza;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public Pedido (){
    }
    
    public Pedido(String cliente, String horaPedido, int tiempoDemoraMinutos, Pizza unaPizza, int cantidad) {
        if (cliente.isEmpty()) {
            throw new Error("ingrese el cliente");
        }
        if (cantidad < 1) {
            throw new Error("cantidad no valida");
        }

        if (unaPizza == null) {
            throw new Error("ingrese la una pizza");
        }
        this.cliente = cliente;
        this.horaPedido = horaPedido;
        this.tiempoDemora = tiempoDemoraMinutos;
        this.unaPizza = unaPizza;
        this.cantidad = cantidad;
        this.numeroPedido++;
        
        this.precio = unaPizza.getPrecioPedido() * cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean estaAtrasado(Date fechaActual) {

        String[] partes = this.horaPedido.split(":");
        int horas = Integer.valueOf(partes[0]);
        int minutos = Integer.valueOf(partes[1]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, horas);
        calendar.set(Calendar.MINUTE, minutos);

        calendar.add(Calendar.MINUTE, tiempoDemora);

        Date fechaEstimadaEntrega = calendar.getTime();

        return fechaEstimadaEntrega.before(fechaActual);

    }

    public void setTiempoDemora(int tiempoDemora) {
        this.tiempoDemora = tiempoDemora;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public int getTiempoDemora() {
        return tiempoDemora;
    }

    public Pizza getUnaPizza() {
        return unaPizza;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Long getId() {
        return id;
    }
    
    
    
    
    
    

}
