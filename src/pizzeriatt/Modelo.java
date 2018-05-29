/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class Modelo implements TableModel {

    private List<Pedido> listaPedidos = new ArrayList<Pedido>();
    private List<TableModelListener> listeners = new ArrayList<TableModelListener>();

    @Override
    public int getRowCount() {
        return this.listaPedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreColumna = "";
        if (columnIndex == 0) {
            nombreColumna = "Numero Pedido";
        } else if (columnIndex == 1) {
            nombreColumna = "Cliente";
        } else if (columnIndex == 2) {
            nombreColumna = "Pedido";
        } else if (columnIndex == 3) {
            nombreColumna = "Hora Pedido";
        } else if (columnIndex == 4) {
            nombreColumna = "Demora";
        }
        return nombreColumna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido unPedido = this.listaPedidos.get(rowIndex);
        String[] partes = unPedido.getHoraPedido().split(":");
        String hora = partes[0];
        String minutos = partes[1];
        String demora = String.valueOf(unPedido.getTiempoDemora());
        String numeroPedido = String.valueOf(unPedido.getNumeroPedido());
        String valor = "";
        if (columnIndex == 0) {
            valor = numeroPedido;
        } else if (columnIndex == 1) {
            valor = unPedido.getCliente();
        } else if (columnIndex == 2) {
            valor = unPedido.getUnaPizza().getVariedadPizza().getNombre() + ", "
                    + unPedido.getUnaPizza().getTamanio() + ", " + unPedido.getUnaPizza().getTipo()
                    + ", cantidad " + unPedido.getCantidad();
        } else if (columnIndex == 3) {
            valor = hora + ":" + minutos;
        } else if (columnIndex == 4) {
            valor = demora;
        }
        np++;
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        this.listeners.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        this.listeners.remove(l);
    }

    public void agregarPedido(Pedido unPedido) {
        this.listaPedidos.add(unPedido);

        TableModelEvent evento = new TableModelEvent(this, this.listaPedidos.size() - 1, this.listaPedidos.size() - 1,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);

        for (TableModelListener listener : this.listeners) {
            listener.tableChanged(evento);
        }

    }

    public List<Pedido> getPedidos() {
        return this.listaPedidos;
    }

}
