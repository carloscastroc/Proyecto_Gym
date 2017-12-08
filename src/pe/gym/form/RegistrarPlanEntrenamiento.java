/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.form;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.gym.controller.DetalleEvaluadorController;
import pe.gym.controller.EvaluadorConsultaController;
import pe.gym.model.DetalleEvaluador;
import pe.gym.model.Ejercicio;
import pe.gym.model.EvaluadorConsulta;
import pe.gym.model.TipoEjercicio;
import pe.gym.util.CargaComponentes;

/**
 *
 * @author Carlos
 */
public class RegistrarPlanEntrenamiento extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarPlanEntrenamiento
     */
    DefaultTableModel tabla;

    public RegistrarPlanEntrenamiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        CargaComponentes carga = new CargaComponentes();
        carga.cargaIdEmpleado(jlblnomemp);
        jComboBoxEjercicio1.setEnabled(false);
        txtidinfnutricional.setEditable(false);
        tabla = (DefaultTableModel) jtejercicio.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new rojerusan.RSButtonMetro();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtejercicio = new rojerusan.RSTableMetro();
        jComboBoxTipoEjercicio1 = new pe.gym.combos.JComboBoxTipoEjercicio();
        jComboBoxEjercicio1 = new pe.gym.combos.JComboBoxEjercicio();
        btnAgregar = new rojerusan.RSButtonMetro();
        txtmaquina = new javax.swing.JTextField();
        txtserie = new javax.swing.JTextField();
        txtrepeticiones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        txtidinfnutricional = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jlblnomemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtejercicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPlanE", "Ejercicio", "N_Maquina", "Serie", "Repeticiones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
        jtejercicio.setAltoHead(40);
        jtejercicio.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtejercicio.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtejercicio.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtejercicio.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtejercicio.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtejercicio.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtejercicio.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtejercicio.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtejercicio.setFuenteHead(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtejercicio.setRowHeight(20);
        jtejercicio.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtejercicio);

        jComboBoxTipoEjercicio1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTipoEjercicio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoEjercicio1ItemStateChanged(evt);
            }
        });

        jComboBoxEjercicio1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAgregar.setText("Agregar Ejercicio");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtmaquina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtserie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtrepeticiones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("IdInfNutriconal:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ejercicio:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("N_Maquina:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Repeticiones:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Serie:");

        labelHeader1.setText("REGISTRAR PLAN DE ENTRENAMIENTO");
        labelHeader1.setColorDeSombra(new java.awt.Color(0, 112, 192));
        labelHeader1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        txtidinfnutricional.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtidinfnutricional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtidinfnutricionalMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de Ejercicio:");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(102, 0, 0));
        btnRegistrar.setText("REGISTRAR PLAN DE ENTRENAMIENTO");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("IdEmpleado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(txtmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(23, 23, 23)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtserie)
                                    .addComponent(txtrepeticiones)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jComboBoxTipoEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidinfnutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(88, 88, 88)
                                            .addComponent(jlblnomemp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6))
                                        .addGap(51, 51, 51)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addComponent(labelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jlblnomemp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtidinfnutricional, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addComponent(jLabel3)
                            .addComponent(txtmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoEjercicio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoEjercicio1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (jComboBoxTipoEjercicio1.getSelectedIndex() == 0) {
                jComboBoxEjercicio1.setSelectedIndex(0);
                jComboBoxEjercicio1.setEnabled(false);
                return;

            }

            TipoEjercicio tipo = (TipoEjercicio) jComboBoxTipoEjercicio1.getSelectedItem();
            String tip = tipo.getIdTipo();

            jComboBoxEjercicio1.setEnabled(true);
            jComboBoxEjercicio1.rellenaxcombo(tip);
        }
    }//GEN-LAST:event_jComboBoxTipoEjercicio1ItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (jComboBoxTipoEjercicio1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
            return;
        }
        if (jComboBoxEjercicio1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un ejercicio");
            return;
        }
        Ejercicio ejer = (Ejercicio) jComboBoxEjercicio1.getSelectedItem();

        if ("".equals(txtmaquina.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en maquina");
            return;
        }
        if ("".equals(txtserie.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en serie");
            return;
        }
        if ("".equals(txtrepeticiones.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en repeticiones");
            return;
        }
        int ma = Integer.parseInt(txtmaquina.getText());
        int se = Integer.parseInt(txtserie.getText());
        int re = Integer.parseInt(txtrepeticiones.getText());

        tabla.addRow(new Object[]{ejer.getIdPlanE(), ejer.getEjercicio(), ma, se, re});
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = jtejercicio.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea eliminar");
            return;
        }

        tabla.removeRow(row);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtidinfnutricionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidinfnutricionalMouseClicked
        BuscarInfNutricional view;
        view = new BuscarInfNutricional(new JFrame(), true);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }//GEN-LAST:event_txtidinfnutricionalMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {

            List<DetalleEvaluador> lista = new ArrayList<>();
            DetalleEvaluadorController controldet = new DetalleEvaluadorController();
            EvaluadorConsultaController controleva = new EvaluadorConsultaController();
            DetalleEvaluador bean = new DetalleEvaluador();
            EvaluadorConsulta eva = new EvaluadorConsulta();

            eva.setIdEmpleado(jlblnomemp.getText());
            eva.setIdInfNutricional(txtidinfnutricional.getText());
            
            controleva.crear(eva);
            
            int row = tabla.getRowCount();

            for (int i = 0; i < row; i++) {
                bean.setIdPlanEntrenamiento(eva.getIdPlanEntrenamiento());
                bean.setIdPlanE(jtejercicio.getValueAt(i, 0).toString());
                bean.setEjercicio(jtejercicio.getValueAt(i, 1).toString());
                bean.setN_Maquina(Integer.parseInt(jtejercicio.getValueAt(i, 2).toString()));
                bean.setSerie(Integer.parseInt(jtejercicio.getValueAt(i, 3).toString()));
                bean.setRepeticiones(Integer.parseInt(jtejercicio.getValueAt(i, 4).toString()));
                controldet.crear(bean);
            }
            
            JOptionPane.showMessageDialog(null, "Plan creado correctamente, su id es: "+eva.getIdPlanEntrenamiento());

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error."+e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jComboBoxEjercicio1.setSelectedIndex(0);
        jComboBoxTipoEjercicio1.setSelectedIndex(0);
        txtidinfnutricional.setText("");
        txtmaquina.setText("");
        txtrepeticiones.setText("");
        txtserie.setText("");
        tabla.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPlanEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarPlanEntrenamiento dialog = new RegistrarPlanEntrenamiento(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonMetro btnAgregar;
    private rojerusan.RSButtonMetro btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private pe.gym.combos.JComboBoxEjercicio jComboBoxEjercicio1;
    private pe.gym.combos.JComboBoxTipoEjercicio jComboBoxTipoEjercicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jlblnomemp;
    private rojerusan.RSTableMetro jtejercicio;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private rojerusan.RSButtonMetro rSButtonMetro1;
    private rojerusan.RSButtonMetro rSButtonMetro2;
    public static javax.swing.JTextField txtidinfnutricional;
    private javax.swing.JTextField txtmaquina;
    private javax.swing.JTextField txtrepeticiones;
    private javax.swing.JTextField txtserie;
    // End of variables declaration//GEN-END:variables
}
