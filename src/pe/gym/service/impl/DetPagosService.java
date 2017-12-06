/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.gym.db.conectaBD;
import pe.gym.model.DetPagos;
import pe.gym.model.Pagos;
import pe.gym.service.espec.DetPagosServiceEspec;
import pe.gym.service.mapper.DetPagosMapper;

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

    @Override
    public List<DetPagos> consultarDetPagos(String id) {
        List<DetPagos> lista = new ArrayList<>();
        Pagos bean = new Pagos();
        Connection cn= null;
        try {
            cn=conectaBD.obtener();
            String sql= "Select IdPago, IdEmpleado, NroCuota, Importe, F_UPago, "
                    + "Estado from detpagos where idPago=?";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            DetPagosMapper mapper = new DetPagosMapper();
            while (rs.next()){
                DetPagos emp = mapper.mapRow(rs);
                lista.add(emp);
            }
            rs.close();
            pstm.close();
            if(bean==null){
                throw new Exception("Id no existe.");
            }
        } catch (Exception e) {
            String texto ="Error en el proceso. ";
            texto +=e.getMessage();
            throw new RuntimeException(texto);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
}
