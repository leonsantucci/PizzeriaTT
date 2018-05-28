/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class ResaltadorDePedidosVencidos implements TableCellRenderer {

    private Modelo modelo;

    public ResaltadorDePedidosVencidos(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = new DefaultTableCellRenderer().getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Pedido pedido = modelo.getPedidos().get(row);
        if (pedido.estaAtrasado(new Date())) {
            c.setBackground(Color.red);
        } else {
            c.setBackground(Color.white);
        }
        return c;
    }

}
