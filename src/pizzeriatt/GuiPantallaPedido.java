package pizzeriatt;

import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.List;
import pizzeriatt.GuiPantallaTiket;
import pizzeriatt.Pizza;
import pizzeriatt.Tipo;
import pizzeriatt.Variedad;

/**
 *
 * @author ITUOM
 */
public class GuiPantallaPedido extends javax.swing.JFrame {

    private GuiTablaInicial pantallaInicial;
    private static int numeroPedido = 1;
    private List<Variedad> listaDeVariedades;

    /**
     * Creates new form Pizzeriaa
     */
    public GuiPantallaPedido() {
        initComponents();
        configurarHora();
        leerVariedades();
    }

    private void configurarHora() {
        Calendar cal = Calendar.getInstance();
        int horaActual = cal.get(Calendar.HOUR_OF_DAY);
        int minutosActual = cal.get(Calendar.MINUTE);

        variableHora.setText(String.valueOf(horaActual));
        VariableMinuto.setText(String.valueOf(minutosActual));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        VariableCliente = new javax.swing.JTextField();
        variableHora = new javax.swing.JTextField();
        variableDemora = new javax.swing.JTextField();
        VariableEjecutar = new javax.swing.JButton();
        TextCliente = new javax.swing.JLabel();
        textDemora = new javax.swing.JLabel();
        TextHora = new javax.swing.JLabel();
        ImagenYtextVariedad = new javax.swing.JLabel();
        ImagenYTextorciones = new javax.swing.JLabel();
        ImagenYTextTipoDePizza = new javax.swing.JLabel();
        VariableCantidadPizzaIngresadas = new javax.swing.JTextField();
        VariableMinuto = new javax.swing.JTextField();
        Puntos = new javax.swing.JLabel();
        VariedadPizza = new javax.swing.JComboBox<>();
        VariedadPorciones = new javax.swing.JComboBox<>();
        VariedadTipoDePizza = new javax.swing.JComboBox<>();
        variableErrorDeIngresCantidadDePizza = new javax.swing.JLabel();
        TextCantidadDePizza = new javax.swing.JLabel();
        TextObservacion = new javax.swing.JLabel();
        variableObservacion = new javax.swing.JTextField();
        variableErrorCliente = new javax.swing.JLabel();
        variableErrorDemora = new javax.swing.JLabel();
        jLabelTexMinutos = new javax.swing.JLabel();

        jLabel14.setText("              ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VariableCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VariableCliente.setText(" ");

        variableHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        variableHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        variableHora.setText("00");

        variableDemora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        variableDemora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        variableDemora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableDemoraActionPerformed(evt);
            }
        });

        VariableEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/6798618-pizza-en-el-oro-de-internet-de-botón-ilustración-original.jpg"))); // NOI18N
        VariableEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularCosto(evt);
            }
        });

        TextCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/antipolo-city-filipinas-octubre-19-2017-los-clientes-se-alinean-en-el-cajero-de-un-restaurante-de-pizza-kf4gp1.jpg"))); // NOI18N
        TextCliente.setText("Cliente");

        textDemora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDemora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/arenan0019.jpg"))); // NOI18N
        textDemora.setText("Demora");

        TextHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/reloj.png"))); // NOI18N
        TextHora.setText("hora");

        ImagenYtextVariedad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImagenYtextVariedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/tipo.jpg"))); // NOI18N
        ImagenYtextVariedad.setText("Variedad");

        ImagenYTextorciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImagenYTextorciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/Porciones.jpg"))); // NOI18N
        ImagenYTextorciones.setText("Porciones");

        ImagenYTextTipoDePizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImagenYTextTipoDePizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzeriatt/imagenes/piedra.jpg"))); // NOI18N
        ImagenYTextTipoDePizza.setText("Tipo de pizza ");

        VariableCantidadPizzaIngresadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        VariableMinuto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VariableMinuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VariableMinuto.setText("00");

        Puntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Puntos.setText(":");

        VariedadPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        VariedadPorciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VariedadPorciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12" }));

        VariedadTipoDePizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VariedadTipoDePizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "piedra", "molde", "parrillla" }));

        variableErrorDeIngresCantidadDePizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        variableErrorDeIngresCantidadDePizza.setForeground(new java.awt.Color(204, 0, 0));
        variableErrorDeIngresCantidadDePizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TextCantidadDePizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextCantidadDePizza.setText("Cantidad de Pizza");

        TextObservacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextObservacion.setText("Observacion");

        variableObservacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        variableObservacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        variableObservacion.setText("                                       ");

        variableErrorCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        variableErrorCliente.setForeground(new java.awt.Color(153, 0, 0));

        variableErrorDemora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        variableErrorDemora.setForeground(new java.awt.Color(153, 0, 0));

        jLabelTexMinutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTexMinutos.setText("(Minutos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenYtextVariedad)
                            .addComponent(VariedadPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VariedadPorciones, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImagenYTextorciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImagenYTextTipoDePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VariableCantidadPizzaIngresadas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(variableObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextCantidadDePizza)
                                        .addGap(63, 63, 63)
                                        .addComponent(TextObservacion))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VariedadTipoDePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(variableErrorDeIngresCantidadDePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(TextCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDemora))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(VariableCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variableErrorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(variableDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTexMinutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variableErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(variableHora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Puntos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VariableMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(VariableEjecutar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextCliente)
                        .addComponent(VariableCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(variableErrorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextHora)
                    .addComponent(variableHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VariableMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Puntos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDemora)
                            .addComponent(variableDemora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTexMinutos))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ImagenYTextTipoDePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ImagenYTextorciones)
                                    .addComponent(ImagenYtextVariedad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(variableObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextCantidadDePizza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(VariableCantidadPizzaIngresadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(VariedadPorciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VariedadPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VariedadTipoDePizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(variableErrorDeIngresCantidadDePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(VariableEjecutar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(variableErrorDemora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void CalcularCosto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularCosto
        GuiPantallaTiket ticket = new GuiPantallaTiket();
        
        
        int variedadSeleccionada = VariedadPizza.getSelectedIndex();
        Variedad variedad = this.listaDeVariedades.get(variedadSeleccionada);
        
        int tamanio = 0;
        int tamanioSeleccionado = VariedadPorciones.getSelectedIndex();
        if (tamanioSeleccionado == 0) {
            tamanio = 8;
        } else if (tamanioSeleccionado == 1) {
            tamanio = 10;
        } else if (tamanioSeleccionado == 2) {
            tamanio = 12;
        }

        Tipo tipo = null;
        int tipoSeleccionado = VariedadTipoDePizza.getSelectedIndex();
        if (tipoSeleccionado == 0) {
            tipo = tipo.PIEDRA;
        } else if (tipoSeleccionado == 1) {
            tipo = tipo.MOLDE;
        } else if (tipoSeleccionado == 2) {
            tipo = tipo.PARRILLA;
        }
        Pizza pizzaSeleccionada = new Pizza(tamanio, tipo, variedad);
        try {
            int cantidad = Integer.valueOf(VariableCantidadPizzaIngresadas.getText());
            try {
                Integer demora = Integer.valueOf(variableDemora.getText());
                Pedido pedidoRealizado = new Pedido(VariableCliente.getText(), variableHora.getText() + ":" + VariableMinuto.getText(), demora, pizzaSeleccionada, cantidad);
                String precioTotal = String.valueOf(pedidoRealizado.getPrecio());
                String nombreIngresado = VariableCliente.getText();
                nombreIngresado = nombreIngresado.trim();
                if (nombreIngresado.isEmpty()) {
                    variableErrorCliente.setText("Ingrese un nombre");
                } else {
                    ticket.jLabelNombreCliente.setText("Cliente: " + VariableCliente.getText());
                    ticket.jLabelHoraPedido.setText("Hora pedido: " + variableHora.getText() + ":" + VariableMinuto.getText());
                    ticket.jLabelHoraDemora.setText("Demora: " + variableDemora.getText());
                    ticket.jLabelTotalFinal.setText("Costo total: " + precioTotal);
                    ticket.jLabelObservacion.setText("Observacion: " + variableObservacion.getText());
                    ticket.jLabelTotal1.setText(pedidoRealizado.getCantidad() + " x " + pedidoRealizado.getUnaPizza().getVariedadPizza().getNombre() + " = " + pedidoRealizado.getPrecio());
                   pedidoRealizado.setNumeroPedido(numeroPedido);
                   numeroPedido++;
                    pedidoRealizado.setCliente(nombreIngresado);
                    pantallaInicial.agregarPedido(pedidoRealizado);

                    ticket.setVisible(true);
                    dispose();
                }
            } catch (Exception e) {
                variableErrorDemora.setText("La demora debe ser un numero");
            }

        } catch (Exception e) {
            variableErrorDeIngresCantidadDePizza.setText("La cantidad debe ser un numero");
        }


    }//GEN-LAST:event_CalcularCosto

    private void PresiototalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresiototalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PresiototalActionPerformed

    private void variableDemoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableDemoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_variableDemoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPantallaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenYTextTipoDePizza;
    private javax.swing.JLabel ImagenYTextorciones;
    private javax.swing.JLabel ImagenYtextVariedad;
    private javax.swing.JLabel Puntos;
    private javax.swing.JLabel TextCantidadDePizza;
    private javax.swing.JLabel TextCliente;
    private javax.swing.JLabel TextHora;
    private javax.swing.JLabel TextObservacion;
    private javax.swing.JTextField VariableCantidadPizzaIngresadas;
    private javax.swing.JTextField VariableCliente;
    private javax.swing.JButton VariableEjecutar;
    private javax.swing.JTextField VariableMinuto;
    private javax.swing.JComboBox<String> VariedadPizza;
    private javax.swing.JComboBox<String> VariedadPorciones;
    private javax.swing.JComboBox<String> VariedadTipoDePizza;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabelTexMinutos;
    private javax.swing.JLabel textDemora;
    private javax.swing.JTextField variableDemora;
    private javax.swing.JLabel variableErrorCliente;
    private javax.swing.JLabel variableErrorDeIngresCantidadDePizza;
    private javax.swing.JLabel variableErrorDemora;
    private javax.swing.JTextField variableHora;
    private javax.swing.JTextField variableObservacion;
    // End of variables declaration//GEN-END:variables

    public void setPantallaListado(GuiTablaInicial pantallaInicial) {
        this.pantallaInicial = pantallaInicial;
    }

    private void leerVariedades() {
        AdministradorDeVariedades unAdmin = new AdministradorDeVariedades();
        this.listaDeVariedades = unAdmin.obtener();
        
        for(Variedad v : this.listaDeVariedades) {
            VariedadPizza.addItem(v.getNombre());
        }
        
    }
}
