/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.form;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.gym.controller.NutricionistaController;

import pe.gym.model.Nutricionista;

import pe.gym.util.Render;

/**
 *
 * @author Alumno
 */
public class BuscarInfNutricional extends javax.swing.JDialog {

    /**
     * Creates new form AsignarCarne
     */
    private List<Nutricionista> lista = new ArrayList<>();

    public BuscarInfNutricional(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        cargarDatos();
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
        jtxtDNI = new javax.swing.JTextField();
        rSButtonMetro1 = new rojerusan.RSButtonMetro();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtableinfnutmodal = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelHeader1.setText("BUSCAR FICHA DE INFORMACION NUTRICIONAL");
        labelHeader1.setColorDeSombra(new java.awt.Color(0, 112, 192));
        labelHeader1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel10.setText("DNI:");

        jtxtDNI.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jtxtDNI.setForeground(new java.awt.Color(153, 153, 153));
        jtxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtDNIKeyPressed(evt);
            }
        });

        rSButtonMetro1.setText("Seleccionar");
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        jScrollPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtableinfnutmodal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdInfNutricional", "IdSocio", "Nombre", "DNI", "Fecha", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableinfnutmodal.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtableinfnutmodal.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtableinfnutmodal.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtableinfnutmodal.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtableinfnutmodal.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtableinfnutmodal.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtableinfnutmodal.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtableinfnutmodal.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtableinfnutmodal.setFuenteHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jtableinfnutmodal.setRowHeight(20);
        jtableinfnutmodal.getTableHeader().setReorderingAllowed(false);
        jtableinfnutmodal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableinfnutmodalMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jtableinfnutmodal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 484, Short.MAX_VALUE)
                        .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDNIKeyPressed
        try {

            cargarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_jtxtDNIKeyPressed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        int row = jtableinfnutmodal.getSelectedRow();

        if (row == -1) {
            return;

        }

        String codigo = this.jtableinfnutmodal.getValueAt(row, 0).toString();
        
       RegistrarPlanEntrenamiento.txtidinfnutricional.setText(codigo);
 
        this.dispose();


    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void jtableinfnutmodalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableinfnutmodalMouseClicked
        int column = jtableinfnutmodal.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jtableinfnutmodal.getRowHeight();
        if (row < jtableinfnutmodal.getRowCount() && row >= 0 && column < jtableinfnutmodal.getColumnCount() && column >= 0) {
            Object value = jtableinfnutmodal.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                int rows = jtableinfnutmodal.getSelectedRow();
                if (rows == -1) {
                    return;
                }

                DetalleNutricional view;
                view = new DetalleNutricional(new JFrame(), true);
                view.setRowData(lista.get(row));
                view.setLocationRelativeTo(null);
                view.setVisible(true);
            }
        }
    }//GEN-LAST:event_jtableinfnutmodalMouseClicked

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
            java.util.logging.Logger.getLogger(BuscarInfNutricional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarInfNutricional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarInfNutricional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarInfNutricional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarInfNutricional dialog = new BuscarInfNutricional(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane7;
    private rojerusan.RSTableMetro jtableinfnutmodal;
    private javax.swing.JTextField jtxtDNI;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private rojerusan.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        jtableinfnutmodal.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Detalle");
        // Datos
        String dni ="";
        dni=jtxtDNI.getText();

        try {
            // Proceso
            NutricionistaController control = new NutricionistaController();
            lista = control.consultarxDNI(dni);
            if (lista.isEmpty()) {
                throw new Exception("Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Acceso al objeto Table
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) jtableinfnutmodal.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (Nutricionista men : lista) {
            Object[] rowData = {
                men.getIdInfNutricional(),
                men.getIdSocio(),
                men.getNombre(),
                men.getDNI(),
                men.getFecha(),
                btn1
            };
            tabla.addRow(rowData);
        }

    }
}
