package pizzeriatt;

import java.util.Calendar;
import java.util.Date;

public class Pedido {

    private String cliente;
    private String horaPedido;
    private int tiempoDemora;
    private int numeroPedido;
    private double precio;
    private int cantidad;
    private Pizza unaPizza;

    public Pedido(String cliente, String horaPedido, int tiempoDemoraMinutos, Pizza unaPizza, int cantidad) {

        if (cliente.isEmpty()) {
            throw new Error("ingrese el cliente");
        }
        if (cantidad < 1) {
            throw new Error("cantidad");
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
    }

    public double getPrecio() {
        return unaPizza.getPrecioPedido() * cantidad;
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

}
