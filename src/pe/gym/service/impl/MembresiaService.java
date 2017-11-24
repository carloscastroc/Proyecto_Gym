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
import pe.gym.model.Membresia;
import pe.gym.service.espec.MembresiaServiceEspec;

/**
 *
 * @author Alumno
 */
public class MembresiaService implements MembresiaServiceEspec{

    @Override
    public void crear(Membresia bean) {
         Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            //Comprobar que no haya un registro existente del nuevo socio
            //Pendiente

            //Obtener id de Socio
            String sql = "call GENERACODIGOMEMBRESIA()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into membresia(IdMembresia, IdSocio, "
            + "IdEmpleado, IdPlan, IdPromociones, IdPago, F_Inicio, F_Fin, Estado)"
            + " values (?,?,?,?,?,?,?,?,?) ");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdSocio());
            pstm.setString(3, bean.getIdEmpleado());
            pstm.setString(4, bean.getIdPlan());
            pstm.setString(5, bean.getIdPromociones());
            pstm.setString(6, bean.getIdPago());
            pstm.setString(7, bean.getF_Inicio());
            pstm.setString(8, bean.getF_Fin());
            pstm.setString(9, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdMembresia(id);
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
    public void modificar(Membresia bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Membresia leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
