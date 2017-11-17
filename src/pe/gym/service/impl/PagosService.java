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
import pe.gym.model.Pagos;
import pe.gym.model.Socio;
import pe.gym.service.espec.PagosServiceEspec;

/**
 *
 * @author Alumno
 */
public class PagosService implements PagosServiceEspec{

    @Override
    public void crear(Pagos bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            //Comprobar que no haya un registro existente del nuevo socio
            //Pendiente

            //Obtener id de Socio
            String sql = "call ()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdSocio());
            pstm.setString(3, bean.getTipo_de_Pago());
            pstm.setDouble(4, bean.getIGV());
            pstm.setDouble(5, bean.getSubtotal());
            pstm.setDouble(6, bean.getTotal());
            pstm.setInt(7, bean.getNroCuotas());
            pstm.setString(8, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdPago(id);
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
            String texto = "Error en el proceso crear pago. ";
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
    public void modificar(Pagos bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pagos leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
