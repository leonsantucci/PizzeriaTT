/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

/**
 *
 * @author ITUOM
 */
public class GuiPantallaTiket extends javax.swing.JFrame {

    /**
     * Creates new form GuiPantallaPedidoEnMarcha
     */
    public GuiPantallaTiket() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLabelTitulo = new javax.swing.JLabel();
        jLabelTextoNombreCliente = new javax.swing.JLabel();
        jLabelTextoHoraPedido = new javax.swing.JLabel();
        jLabelTextoPedido = new javax.swing.JLabel();
        jLabelHoraPedido = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelTextoCostoTotal = new javax.swing.JLabel();
        jLabelCostoTotal = new javax.swing.JLabel();
        jLabelTextoHoraPedido1 = new javax.swing.JLabel();
        jLabelHoraDemora = new javax.swing.JLabel();
        jLabelTextoObservacion = new javax.swing.JLabel();
        jLabelObservacion = new javax.swing.JLabel();
        jLabelMinutosPedido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabelLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLabelTitulo.setText("Tiket");

        jLabelTextoNombreCliente.setText("Nombre Cliente:");

        jLabelTextoHoraPedido.setText("Demora (Minutos) ");

        jLabelTextoPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTextoPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoPedido.setText("Cuenta");

        jLabelHoraPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHoraPedido.setText("00");

        jLabelNombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombreCliente.setText("nombre cliente");

        jLabelTextoCostoTotal.setText("Costa Total:");

        jLabelCostoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCostoTotal.setText("Costo total del pedido");

        jLabelTextoHoraPedido1.setText("Hora Pedido:");

        jLabelHoraDemora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelHoraDemora.setText("demora");

        jLabelTextoObservacion.setText("Observacion:");

        jLabelObservacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelObservacion.setText("observacion");

        jLabelMinutosPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinutosPedido.setText("00");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTextoObservacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelObservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelTextoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTextoNombreCliente)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabelNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabelLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTextoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCostoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextoHoraPedido)
                            .addComponent(jLabelTextoHoraPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelHoraPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMinutosPedido))
                            .addComponent(jLabelHoraDemora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoNombreCliente)
                    .addComponent(jLabelNombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoHoraPedido1)
                    .addComponent(jLabelHoraPedido)
                    .addComponent(jLabelMinutosPedido)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTextoHoraPedido)
                    .addComponent(jLabelHoraDemora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoObservacion)
                    .addComponent(jLabelObservacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabelTextoPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoCostoTotal)
                    .addComponent(jLabelCostoTotal))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GuiPantallaTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPantallaTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPantallaTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelCostoTotal;
    public javax.swing.JLabel jLabelHoraDemora;
    public javax.swing.JLabel jLabelHoraPedido;
    private javax.swing.JLabel jLabelLabelTitulo;
    public javax.swing.JLabel jLabelMinutosPedido;
    public javax.swing.JLabel jLabelNombreCliente;
    public javax.swing.JLabel jLabelObservacion;
    private javax.swing.JLabel jLabelTextoCostoTotal;
    private javax.swing.JLabel jLabelTextoHoraPedido;
    private javax.swing.JLabel jLabelTextoHoraPedido1;
    private javax.swing.JLabel jLabelTextoNombreCliente;
    private javax.swing.JLabel jLabelTextoObservacion;
    private javax.swing.JLabel jLabelTextoPedido;
    // End of variables declaration//GEN-END:variables
}