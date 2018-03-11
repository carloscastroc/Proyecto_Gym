/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.panels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.gym.controller.PlanesController;
import pe.gym.form.RegistrarPlan;
import pe.gym.model.Planes;
import pe.gym.util.CargaComponentes;


/**
 *
 * @author Alumno
 */
public class jifplanes extends javax.swing.JInternalFrame {

    private List<Planes> lista = new ArrayList<>();

    /**
     * Creates new form jifplanes
     */
    public jifplanes() {

        initComponents();
        btnRegistrarPlan.setVisible(false);
        btnModificarPlan.setVisible(false);
        CargaComponentes carga = new CargaComponentes();
        carga.cargaBotoneAdmi(btnRegistrarPlan);
        carga.cargaBotoneAdmi(btnModificarPlan);
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

        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableplanes = new rojerusan.RSTableMetro();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new app.bolivia.swing.JCTextField();
        btnConsultarPlanes = new org.edisoncor.gui.button.ButtonAction();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnRegistrarPlan = new rojeru_san.RSButtonRiple();
        btnModificarPlan = new rojeru_san.RSButtonRiple();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1048, 911));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtableplanes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID-Plan", "Nombre Plan", "Nro de Meses", "Importe", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableplanes.setAltoHead(70);
        jtableplanes.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtableplanes.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtableplanes.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtableplanes.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtableplanes.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtableplanes.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtableplanes.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtableplanes.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtableplanes.setFuenteHead(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jtableplanes.setRowHeight(20);
        jtableplanes.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtableplanes);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 1000, 662));

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
        jLabel1.setText("NOMBRE:");

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage7Layout.createSequentialGroup()
                .addGroup(panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelImage8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImage8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 35, -1, -1));

        btnConsultarPlanes.setText("CONSULTAR PLANES");
        btnConsultarPlanes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConsultarPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPlanesActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsultarPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 72, 210, 82));

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

        btnRegistrarPlan.setBackground(new java.awt.Color(38, 86, 186));
        btnRegistrarPlan.setText("NUEVO");
        btnRegistrarPlan.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnRegistrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPlanActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 72, 179, 82));

        btnModificarPlan.setBackground(new java.awt.Color(38, 86, 186));
        btnModificarPlan.setText("MODIFICAR");
        btnModificarPlan.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnModificarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPlanActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 72, 177, 82));

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
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPlanesActionPerformed
        try {


            // Mostrar datos
            cargarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarPlanesActionPerformed

    private void btnRegistrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPlanActionPerformed
        new RegistrarPlan(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnRegistrarPlanActionPerformed

    private void btnModificarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPlanActionPerformed
        int row = jtableplanes.getSelectedRow();

        if (row == -1) {
            return;
        }

        RegistrarPlan view;
        view = new RegistrarPlan(new JFrame(), true);
        view.setRowData(lista.get(row));
        view.setVisible(true);
    }//GEN-LAST:event_btnModificarPlanActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        try {

            cargarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_txtNombreKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnConsultarPlanes;
    private rojeru_san.RSButtonRiple btnModificarPlan;
    private rojeru_san.RSButtonRiple btnRegistrarPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSTableMetro jtableplanes;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private rojerusan.RSPanelImage rSPanelImage1;
    private app.bolivia.swing.JCTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        
                    // Datos
            String nomplan = txtNombre.getText();

            // Proceso
            PlanesController control = new PlanesController();
            lista = control.consultarxNombre(nomplan);

        // Acceso al objeto Table
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) jtableplanes.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (Planes emp : lista) {
            Object[] rowData = {
                emp.getIdPlan(),
                emp.getNombrePlan(),
                emp.getNroMeses(),
                emp.getImporte(),
                emp.getEstado(),};
            tabla.addRow(rowData);
        }
    }
}
