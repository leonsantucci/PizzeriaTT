package pizzeriatt;

public class Pedido{

    private String cliente;
    private Hora horaPedido;
    private Hora tiempoDemora;
    private int numeroPedido;
    private double precio;
    private int cantidad;
    private Pizza unaPizza;

    public Pedido(String cliente, Hora horaPedido, Hora tiempoDemoraMinutos, Pizza unaPizza, int cantidad) {

        if (cliente.isEmpty() || cliente == null) {
            throw new Error("ingrese el cliente");
        }
        if (cantidad < 1) {
            throw new Error("cantidad");
        }
        
        if (unaPizza == null){
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
        return unaPizza.getPrecio();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

}
