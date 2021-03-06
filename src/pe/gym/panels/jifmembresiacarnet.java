/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.panels;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.gym.controller.MembreController;
import pe.gym.controller.SocioController;

import pe.gym.form.RegistrarMembresias;
import pe.gym.model.Membresia;
import pe.gym.model.Socio;
import pe.gym.util.CreaAcuerdo;
import pe.gym.util.CreaCarnet;

/**
 *
 * @author Carlos
 */
public class jifmembresiacarnet extends javax.swing.JInternalFrame {

    private List<Membresia> lista = new ArrayList<>();

    /**
     * Creates new form jifmembresia
     */
    public jifmembresiacarnet() {
        initComponents();
        jPanel4.setSize(this.getWidth(), this.getHeight());
        cargarDatosM();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtdni = new app.bolivia.swing.JCTextField();
        btnConsultarMembresia = new org.edisoncor.gui.button.ButtonAction();
        btnAsignaCarnet = new rojeru_san.RSButtonRiple();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtmembresia = new rojerusan.RSTableMetro();
        btnAsignaAcuerdo = new rojeru_san.RSButtonRiple();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1048, 911));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelImage8Layout = new javax.swing.GroupLayout(panelImage8);
        panelImage8.setLayout(panelImage8Layout);
        panelImage8Layout.setHorizontalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImage8Layout.setVerticalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("DNI:");

        txtdni.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdniKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage7Layout.createSequentialGroup()
                .addGroup(panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage7Layout.createSequentialGroup()
                        .addGroup(panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImage8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImage8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 35, -1, -1));

        btnConsultarMembresia.setText("CONSULTAR MEMBRESIA");
        btnConsultarMembresia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConsultarMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMembresiaActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsultarMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 72, 260, 82));

        btnAsignaCarnet.setBackground(new java.awt.Color(38, 86, 186));
        btnAsignaCarnet.setText("ASIGNAR CARNET");
        btnAsignaCarnet.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnAsignaCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaCarnetActionPerformed(evt);
            }
        });
        jPanel4.add(btnAsignaCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 230, 50));

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 0, -1, -1));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtmembresia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdMembresia", "IdSocios", "Apellidos", "Nombres", "DNI", "NombrePlan", "NombrePromocion", "IdPago", "F. Inicio", "F. Fin", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtmembresia.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtmembresia.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtmembresia.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtmembresia.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtmembresia.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtmembresia.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtmembresia.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtmembresia.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtmembresia.setFuenteHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jtmembresia.setRowHeight(20);
        jtmembresia.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtmembresia);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1000, 662));

        btnAsignaAcuerdo.setBackground(new java.awt.Color(38, 86, 186));
        btnAsignaAcuerdo.setText("ASIGNAR ACUERDO");
        btnAsignaAcuerdo.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnAsignaAcuerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaAcuerdoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAsignaAcuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 102, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMembresiaActionPerformed
        try {

            cargarDatosM();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarMembresiaActionPerformed

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed

    }//GEN-LAST:event_txtdniActionPerformed

    private void txtdniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyPressed
        try {

            cargarDatosM();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_txtdniKeyPressed

    private void btnAsignaCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaCarnetActionPerformed

        try {

            int row = jtmembresia.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione el socio a asignar el carnet");
                return;
            }

            Membresia bean = new Membresia();
            bean.setApellido(jtmembresia.getValueAt(row, 2).toString());
            bean.setNombre(jtmembresia.getValueAt(row, 3).toString());
            bean.setDNI(jtmembresia.getValueAt(row, 4).toString());
            bean.setNombrePlan(jtmembresia.getValueAt(row, 5).toString());
            bean.setF_Inicio(jtmembresia.getValueAt(row, 8).toString());
            bean.setF_Fin(jtmembresia.getValueAt(row, 9).toString());
            bean.setIdPago(jtmembresia.getValueAt(row, 7).toString());

            if ("No generado".equals(bean.getIdPago())) {
                JOptionPane.showMessageDialog(null, "Debe generar su pago primero");
                return;
            }

            CreaCarnet make = new CreaCarnet();
            make.CrearCarnet(bean);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnAsignaCarnetActionPerformed

    private void btnAsignaAcuerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaAcuerdoActionPerformed
        try {

            int row = jtmembresia.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione el socio a asignar el acuerdo");
                return;
            }

            Membresia bean = new Membresia();
            bean.setApellido(jtmembresia.getValueAt(row, 2).toString());
            bean.setNombre(jtmembresia.getValueAt(row, 3).toString());
            bean.setDNI(jtmembresia.getValueAt(row, 4).toString());
            bean.setNombrePlan(jtmembresia.getValueAt(row, 5).toString());
            bean.setF_Inicio(jtmembresia.getValueAt(row, 8).toString());
            bean.setF_Fin(jtmembresia.getValueAt(row, 9).toString());
            bean.setIdPago(jtmembresia.getValueAt(row, 7).toString());
            bean.setNombrePromocion(jtmembresia.getValueAt(row, 6).toString());
            bean.setIdSocio(jtmembresia.getValueAt(row, 1).toString());
            bean.setIdMembresia(jtmembresia.getValueAt(row, 0).toString());
            
            Socio bean2 = new Socio();
            SocioController controlsocio= new SocioController();
            bean2=controlsocio.consultaxid(bean.getIdSocio());

            if ("No generado".equals(bean.getIdPago())) {
                JOptionPane.showMessageDialog(null, "Debe generar su pago primero");
                return;
            }

            CreaAcuerdo makea = new CreaAcuerdo();
            makea.CreaAcuerdo(bean, bean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAsignaAcuerdoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnAsignaAcuerdo;
    private rojeru_san.RSButtonRiple btnAsignaCarnet;
    private org.edisoncor.gui.button.ButtonAction btnConsultarMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSTableMetro jtmembresia;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private rojerusan.RSPanelImage rSPanelImage1;
    private app.bolivia.swing.JCTextField txtdni;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosM() {

        // Datos
        String dni = txtdni.getText();

        // Proceso
        MembreController control = new MembreController();
        lista = control.consultaxdni(dni);

        // Acceso al objeto Table
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) jtmembresia.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (Membresia men : lista) {
            Object[] rowData = {
                men.getIdMembresia(),
                men.getIdSocio(),
                men.getApellido(),
                men.getNombre(),
                men.getDNI(),
                men.getNombrePlan(),
                men.getNombrePromocion(),
                men.getIdPago(),
                men.getF_Inicio(),
                men.getF_Fin(),
                men.getEstado()
            };
            tabla.addRow(rowData);

        }

    }

}
