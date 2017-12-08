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
import pe.gym.controller.EjercicioController;
import pe.gym.form.RegistrarEjercicio;
import pe.gym.model.EjercicioConsulta;
import pe.gym.util.CargaComponentes;


/**
 *
 * @author Alumno
 */
public class jifejercicios extends javax.swing.JInternalFrame {

    private List<EjercicioConsulta> lista = new ArrayList<>();

    /**
     * Creates new form jifplanes
     */
    public jifejercicios() {

        initComponents();
        CargaComponentes carga = new CargaComponentes();

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
        jtableejercicios = new rojerusan.RSTableMetro();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new app.bolivia.swing.JCTextField();
        btnConsultarPlanes = new org.edisoncor.gui.button.ButtonAction();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        btnRegistrar = new rojeru_san.RSButtonRiple();
        btnEliminar = new rojeru_san.RSButtonRiple();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1048, 911));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtableejercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPlanE", "TipoEjercicio", "Ejercicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableejercicios.setAltoHead(70);
        jtableejercicios.setColorBackgoundHead(new java.awt.Color(38, 86, 186));
        jtableejercicios.setColorBordeHead(new java.awt.Color(38, 86, 186));
        jtableejercicios.setColorFilasBackgound2(new java.awt.Color(0, 0, 0));
        jtableejercicios.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtableejercicios.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        jtableejercicios.setColorSelBackgound(new java.awt.Color(102, 0, 0));
        jtableejercicios.setFuenteFilas(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtableejercicios.setFuenteFilasSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtableejercicios.setFuenteHead(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jtableejercicios.setRowHeight(20);
        jtableejercicios.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtableejercicios);

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

        btnConsultarPlanes.setText("CONSULTAR EJERCICIOS");
        btnConsultarPlanes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConsultarPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPlanesActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsultarPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 240, 82));

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

        btnRegistrar.setBackground(new java.awt.Color(38, 86, 186));
        btnRegistrar.setText("NUEVO");
        btnRegistrar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 179, 82));

        btnEliminar.setBackground(new java.awt.Color(38, 86, 186));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 177, 82));

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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistrarEjercicio(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = jtableejercicios.getSelectedRow();
        String codigo=jtableejercicios.getValueAt(row, 0).toString();

        if (row == -1) {
            return;
        }
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de esta accion?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            try {
                EjercicioController control= new EjercicioController();
                control.eliminar(codigo);
                JOptionPane.showMessageDialog(null, "Ejercicio eliminado correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar ejercicio, asociado a un plan de entrenamiento");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnConsultarPlanes;
    private rojeru_san.RSButtonRiple btnEliminar;
    private rojeru_san.RSButtonRiple btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private rojerusan.RSTableMetro jtableejercicios;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private rojerusan.RSPanelImage rSPanelImage1;
    private app.bolivia.swing.JCTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        
                    // Datos
            String nomplan = txtNombre.getText();

            // Proceso
            EjercicioController control = new EjercicioController();
            lista = control.consultar(nomplan);

        // Acceso al objeto Table
        DefaultTableModel tabla;
        tabla = (DefaultTableModel) jtableejercicios.getModel();

        // Eliminar  todas las filas
        tabla.setRowCount(0);

        // Cargar Datos
        for (EjercicioConsulta emp : lista) {
            Object[] rowData = {
                emp.getIdPlanE(),
                emp.getTipoEjercicio(),
                emp.getEjercicio()};
            tabla.addRow(rowData);
        }
    }
}