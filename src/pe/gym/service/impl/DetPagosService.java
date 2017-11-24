/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.gym.db.conectaBD;
import pe.gym.model.DetPagos;
import pe.gym.service.espec.DetPagosServiceEspec;

/**
 *
 * @author Carlos
 */
public class DetPagosService implements DetPagosServiceEspec {

    @Override
    public void crear(DetPagos bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            
            // Registrar DetPagos
            PreparedStatement pstm;
            pstm = cn.prepareStatement("insert into membresia(IdMembresia, IdSocio, "
            + "IdEmpleado, IdPlan, IdPromociones, IdPago, F_Inicio, F_Fin, Estado)"
            + " values (?,?,?,?,?,?,?,?,?) ");
            pstm.setString(1, bean.getIdPago());
            pstm.setString(2, bean.getIdEmpleado());
            pstm.setInt(3, bean.getNroCuota());
            pstm.setDouble(4, bean.getImporte());
            pstm.setString(5, bean.getF_UPago());
            pstm.setString(6, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
                String texto1= "Error en el Proceso ";
                 texto1 += e1.getMessage();
            }
            String texto = "Error en el proceso crear Membresia. ";
            texto += e.getMessage();
            throw new RuntimeException(texto);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void modificar(DetPagos bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetPagos leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
