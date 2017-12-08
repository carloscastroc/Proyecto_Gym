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
import pe.gym.controller.SocioController;
import pe.gym.model.Empleado;

import pe.gym.model.Socio;
import pe.gym.util.Session;

/**
 *
 * @author Alumno
 */
public class BuscarSocioModal extends javax.swing.JDialog {

    /**
     * Creates new form AsignarCarne
     */
    
    private List<Socio> lista = new ArrayList<>();
    
    public BuscarSocioModal(java.awt.Frame parent, boolean modal) {
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
        jScrollPane5 = new javax.swing.JScrollPane();
        jtablesociomodal = new rojerusan.RSTableMetro();
        rSButtonMetro1 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelHeader1.setText("BUSCAR SOCIO");
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

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtablesociomodal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdSocio", "Apellido", "Nombre", "DNI", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablesociomodal.setAltoHead(40);
        jtablesociomodal.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtablesociomodal.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtablesociomodal.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtablesociomodal.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtablesociomodal.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtablesociomodal.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtablesociomodal.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtablesociomodal.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtablesociomodal.setFuenteHead(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtablesociomodal.setRowHeight(20);
        jtablesociomodal.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtablesociomodal);

        rSButtonMetro1.setText("Seleccionar");
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
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        int row = jtablesociomodal.getSelectedRow();

        if (row == -1) {
            return;
             
        }
        
        String codigo=this.jtablesociomodal.getValueAt(row, 0).toString();
        
        Empleado bean = (Empleado) Session.get("empleado");
        
        if ("C0002".equals(bean.getIdCargo())) {
             RegistrarMembresias.txtidsociomodal.setText(codigo);
        }
        else if ("C0004".equals(bean.getIdCargo())) {
            DetalleNutricional.txtidinf.setText(codigo);
        }
        

        
        this.dispose();
        
        
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
            java.util.logging.Logger.getLogger(BuscarSocioModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarSocioModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarSocioModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarSocioModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarSocioModal dialog = new BuscarSocioModal(new javax.swing.JFrame(), true);
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
    private rojerusan.RSTableMetro jtablesociomodal;
    private javax.swing.JTextField jtxtDNI;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private rojerusan.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables

        private void cargarDatos() {
        
               // Datos
            String dni = jtxtDNI.getText();
            
            // Proceso
            SocioController control = new SocioController();
            lista = control.consultarxDNI(dni);


        // Acceso al objeto Table
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) jtablesociomodal.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (Socio emp : lista) {
            Object[] rowData = {
                emp.getIdSocio(),
                emp.getNombre(),
                emp.getApellido(),
                emp.getDNI(),
                emp.getEstado()
            };
            tabla.addRow(rowData);
        }

    }

}

