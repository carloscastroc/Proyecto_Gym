/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.panels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pe.gym.controller.NutricionistaController;

import pe.gym.form.DetalleNutricional;
import pe.gym.model.Nutricionista;
import pe.gym.util.Render;

/**
 *
 * @author Carlos
 */
public class jifinfnutricional extends javax.swing.JInternalFrame {

    private List<Nutricionista> lista = new ArrayList<>();

    public jifinfnutricional() {
        initComponents();
        
        cargaDatosI();



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
        jtableinfnu = new rojerusan.RSTableMetro();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new app.bolivia.swing.JCTextField();
        btnConsultarSocio = new org.edisoncor.gui.button.ButtonAction();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnRegistrarPlan2 = new rojeru_san.RSButtonRiple();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1048, 911));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtableinfnu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdInfNutricional", "IdSocio", "IdMembresia", "Nombre", "DNI", "Fecha", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jtableinfnu.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtableinfnu.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtableinfnu.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtableinfnu.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtableinfnu.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtableinfnu.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtableinfnu.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtableinfnu.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtableinfnu.setFuenteHead(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jtableinfnu.setRowHeight(20);
        jtableinfnu.getTableHeader().setReorderingAllowed(false);
        jtableinfnu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableinfnuMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtableinfnu);

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

        btnRegistrarPlan2.setBackground(new java.awt.Color(38, 86, 186));
        btnRegistrarPlan2.setText("NUEVO");
        btnRegistrarPlan2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        jPanel4.add(btnRegistrarPlan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 72, 179, 82));

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

    private void btnConsultarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSocioActionPerformed
        try{
            
                    
            cargaDatosI();
            
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error" +  e.getMessage());
        }
       
    }//GEN-LAST:event_btnConsultarSocioActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed

    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
     
    }//GEN-LAST:event_txtDniKeyPressed

    private void jtableinfnuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableinfnuMouseClicked
        int column = jtableinfnu.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY() / jtableinfnu.getRowHeight();
            if (row < jtableinfnu.getRowCount() && row >= 0 && column < jtableinfnu.getColumnCount() && column >=0){
               Object value = jtableinfnu.getValueAt(row, column);
               if (value instanceof JButton){
                   ((JButton) value).doClick();
                   JButton boton = (JButton) value;
                   
                   int rows = jtableinfnu.getSelectedRow();
                   if(rows == -1){
                       return;
                   }
                   
                DetalleNutricional view;
                view = new DetalleNutricional(new JFrame(), true);
                view.setRowData(lista.get(row));
                view.setLocationRelativeTo(null);
                view.setVisible(true);
               }
            }
    }//GEN-LAST:event_jtableinfnuMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnConsultarSocio;
    private rojeru_san.RSButtonRiple btnRegistrarPlan;
    private rojeru_san.RSButtonRiple btnRegistrarPlan1;
    private rojeru_san.RSButtonRiple btnRegistrarPlan2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSTableMetro jtableinfnu;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private rojerusan.RSPanelImage rSPanelImage1;
    private app.bolivia.swing.JCTextField txtDni;
    // End of variables declaration//GEN-END:variables

    public void cargaDatosI(){
        
        jtableinfnu.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Detalle");
        // Datos
        String dni = txtDni.getText();

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
        tabla = (DefaultTableModel) jtableinfnu.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (Nutricionista men : lista) {
            Object[] rowData = {
                men.getIdInfNutricional(),
                men.getIdSocio(),
                men.getIdMembresia(),
                men.getNombre(),
                men.getDNI(),
                men.getFecha(),
                btn1
            };
            tabla.addRow(rowData);
        }

    }

}
