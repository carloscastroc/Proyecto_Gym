/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.gym.model.DetalleEvaluador;
import pe.gym.model.Ejercicio;
import pe.gym.model.TipoEjercicio;

/**
 *
 * @author Carlos
 */
public class PruebaTablaconCombo extends javax.swing.JFrame {

    /**
     * Creates new form PruebaTablaconCombo
     */
    DefaultTableModel tabla;

    public PruebaTablaconCombo() {
        initComponents();
        jComboBoxEjercicio1.setEnabled(false);
        tabla = (DefaultTableModel) jtableprueba.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableprueba = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBoxTipoEjercicio1 = new pe.gym.combos.JComboBoxTipoEjercicio();
        jComboBoxEjercicio1 = new pe.gym.combos.JComboBoxEjercicio();
        txtmaquina = new javax.swing.JTextField();
        txtserie = new javax.swing.JTextField();
        txtrepeticiones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtableprueba.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtableprueba);

        jButton1.setText("Agregar Ejercicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBoxTipoEjercicio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoEjercicio1ItemStateChanged(evt);
            }
        });

        jComboBoxEjercicio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEjercicio1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxTipoEjercicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxEjercicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jComboBoxTipoEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jComboBoxEjercicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtrepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBoxTipoEjercicio1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
            return;
        }
        if (jComboBoxEjercicio1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un ejercicio");
            return;
        }
        Ejercicio ejer = (Ejercicio) jComboBoxEjercicio1.getSelectedItem();

        if("".equals(txtmaquina.getText())){
            JOptionPane.showMessageDialog(null, "Ingrese un valor en maquina");
            return;}
        if("".equals(txtserie.getText())){
            JOptionPane.showMessageDialog(null, "Ingrese un valor en serie");
            return;}
        if("".equals(txtrepeticiones.getText())){
            JOptionPane.showMessageDialog(null, "Ingrese un valor en repeticiones");
            return;}
        int ma=Integer.parseInt(txtmaquina.getText());
        int se=Integer.parseInt(txtserie.getText());
        int re=Integer.parseInt(txtrepeticiones.getText());
            
        tabla.addRow(new Object[]{ejer.getIdPlanE(), ejer.getEjercicio(), ma, se, re});

    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = jtableprueba.getSelectedRow();

        if (row == -1) {
            return;
        }
        
        tabla.removeRow(row);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
      List<DetalleEvaluador> lista=new ArrayList<>();
      
      DetalleEvaluador bean= new DetalleEvaluador();

        
    int row=tabla.getRowCount();


        for (int i = 0; i < row; i++) {
            bean.setIdPlanEntrenamiento(jtableprueba.getValueAt(i,0).toString());
            bean.setEjercicio(jtableprueba.getValueAt(i,1).toString());
            bean.setN_Maquina(Integer.parseInt(jtableprueba.getValueAt(i,2).toString()));
            bean.setSerie(Integer.parseInt(jtableprueba.getValueAt(i,3).toString()));
            bean.setRepeticiones(Integer.parseInt(jtableprueba.getValueAt(i,4).toString()));
            lista.add(bean);
        }
try{
for(DetalleEvaluador r: lista){
            System.out.println(r.getIdPlanEntrenamiento()
                    + " - "+ r.getEjercicio()
                    + " - "+ r.getN_Maquina()
                    + " - "+ r.getSerie()
                    + " - "+ r.getRepeticiones());
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxEjercicio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEjercicio1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEjercicio1ItemStateChanged

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
            java.util.logging.Logger.getLogger(PruebaTablaconCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaTablaconCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaTablaconCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaTablaconCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaTablaconCombo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private pe.gym.combos.JComboBoxEjercicio jComboBoxEjercicio1;
    private pe.gym.combos.JComboBoxTipoEjercicio jComboBoxTipoEjercicio1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableprueba;
    private javax.swing.JTextField txtmaquina;
    private javax.swing.JTextField txtrepeticiones;
    private javax.swing.JTextField txtserie;
    // End of variables declaration//GEN-END:variables

}
