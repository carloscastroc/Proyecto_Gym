/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.form;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.gym.controller.DetPagosController;
import pe.gym.model.DetPagos;
import pe.gym.model.DetalleEvaluador;
import pe.gym.model.Pagos;

/**
 *
 * @author Alumno
 */
public class DetallePagos extends javax.swing.JDialog {

    /**
     * Creates new form AsignarCarne
     */
    private List<DetPagos> lista = new ArrayList<>();
    DetPagos detpagos= new DetPagos();

    public DetallePagos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtabledetpagos = new rojerusan.RSTableMetro();
        rSButtonMetro1 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelHeader1.setText("DETALLE DE PAGOS");
        labelHeader1.setColorDeSombra(new java.awt.Color(0, 112, 192));
        labelHeader1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtabledetpagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPago", "NroCuota", "Importe", "F. Ultima de pago", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabledetpagos.setAltoHead(40);
        jtabledetpagos.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtabledetpagos.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtabledetpagos.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtabledetpagos.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtabledetpagos.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtabledetpagos.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtabledetpagos.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtabledetpagos.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtabledetpagos.setFuenteHead(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtabledetpagos.setRowHeight(20);
        jtabledetpagos.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtabledetpagos);

        rSButtonMetro1.setText("Completar Pago");
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        DetPagosController control = new DetPagosController();
        try {
            int row = jtabledetpagos.getSelectedRow();

            if (row == -1) {
                return;
            }

            String idpago = jtabledetpagos.getValueAt(row, 0).toString();
            int nrocuota = Integer.parseInt(jtabledetpagos.getValueAt(row, 1).toString());
            
            detpagos=control.consultadetpago(idpago, nrocuota);
            if ("Cancelado".equals(detpagos.getEstado())) {
                JOptionPane.showMessageDialog(null, "Cuota ya cancelada");
                return;
            }

            int resp = JOptionPane.showConfirmDialog(null, "¿Confirma que se realizo el pago para "
                    + "el cambio de estado?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                control.cambiaestadodetpago(idpago, nrocuota);
                JOptionPane.showMessageDialog(null, "Estado cambiado correctamente");
                cargarDatos();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

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
            java.util.logging.Logger.getLogger(DetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetallePagos dialog = new DetallePagos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSTableMetro jtabledetpagos;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private rojerusan.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables

    public void setRowData(Pagos bean) {
        jLabel10.setVisible(true);

        jLabel10.setText(bean.getIdPago());

        cargarDatos();
    }

    private void cargarDatos() {

        try {

            String idpa = jLabel10.getText();

            // Proceso
            DetPagosController control = new DetPagosController();
            lista = control.consultaDetPagosxid(idpa);

            // Acceso al objeto Table
            DefaultTableModel tabla;
            tabla = (DefaultTableModel) jtabledetpagos.getModel();

            // Eliminar  todas las filas
            tabla.setRowCount(0);

            // Cargar Datos
            for (DetPagos det : lista) {
                Object[] rowData = {
                    det.getIdPago(),
                    det.getNroCuota(),
                    det.getImporte(),
                    det.getF_UPago(),
                    det.getEstado()
                };
                tabla.addRow(rowData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}