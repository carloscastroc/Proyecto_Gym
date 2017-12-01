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
import pe.gym.controller.SocioController;
import pe.gym.form.RegistrarSocio;
import pe.gym.model.Socio;

/**
 *
 * @author Carlos
 */
public class jifinfnutricional extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifsocio
     */
    private List<Socio> lista = new ArrayList<>();

    public jifinfnutricional() {
        initComponents();
        jPanel4.setSize(this.getWidth(), this.getWidth());
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
        jtablesocio = new rojerusan.RSTableMetro();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new app.bolivia.swing.JCTextField();
        btnConsultarSocio = new org.edisoncor.gui.button.ButtonAction();
        btnModificarSocio = new rojeru_san.RSButtonRiple();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnRegistrarSocio = new rojeru_san.RSButtonRiple();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1048, 911));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtablesocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdSocio", "Nombres", "Apellidos", "DNI", "Telefono", "Email", "Fecha de Inscripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablesocio.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtablesocio.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtablesocio.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtablesocio.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtablesocio.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtablesocio.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtablesocio.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtablesocio.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtablesocio.setFuenteHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jtablesocio.setRowHeight(20);
        jtablesocio.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtablesocio);

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
        jLabel1.setText("DNI:");

        txtDni.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage7Layout.createSequentialGroup()
                .addGroup(panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImage8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 35, -1, -1));

        btnConsultarSocio.setText("CONSULTAR SOCIO");
        btnConsultarSocio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConsultarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSocioActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsultarSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 72, 193, 82));

        btnModificarSocio.setBackground(new java.awt.Color(38, 86, 186));
        btnModificarSocio.setText("MODIFICAR");
        btnModificarSocio.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnModificarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSocioActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificarSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 72, 177, 82));

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

        btnRegistrarSocio.setBackground(new java.awt.Color(38, 86, 186));
        btnRegistrarSocio.setText("NUEVO");
        btnRegistrarSocio.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnRegistrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSocioActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrarSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 72, 179, 82));

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

    private void btnRegistrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSocioActionPerformed
        new RegistrarSocio(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnRegistrarSocioActionPerformed

    private void btnConsultarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSocioActionPerformed
        try {

            cargarDatos();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarSocioActionPerformed

    private void btnModificarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSocioActionPerformed
        int row = jtablesocio.getSelectedRow();
    
    if( row == -1){
      return;
    }
        
    RegistrarSocio view;
    view = new RegistrarSocio(new JFrame(), true);
    view.setRowData(lista.get(row));
    view.setVisible(true);
    }//GEN-LAST:event_btnModificarSocioActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
//        try {
//
//            cargarDatos();
//            
//        } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
//        }
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
       try {

            cargarDatos();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error. " + e.getMessage());
        }
    }//GEN-LAST:event_txtDniKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnConsultarSocio;
    private rojeru_san.RSButtonRiple btnModificarSocio;
    private rojeru_san.RSButtonRiple btnRegistrarSocio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSTableMetro jtablesocio;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private rojerusan.RSPanelImage rSPanelImage1;
    private app.bolivia.swing.JCTextField txtDni;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        
        // Datos
            String dni = txtDni.getText();
            
            // Proceso
            SocioController control = new SocioController();
            lista = control.consultarxDNI(dni);


        // Acceso al objeto Table
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) jtablesocio.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (Socio emp : lista) {
            Object[] rowData = {
                emp.getIdSocio(),
                emp.getNombre(),
                emp.getApellido(),
                emp.getDNI(),
                emp.getTelefono(),
                emp.getEmail(),
                emp.getF_inscripcion()
            };
            tabla.addRow(rowData);
        }

    }
    


}