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
import pe.gym.model.Planes;
import pe.gym.service.espec.PlanesServiceEspec;
import pe.gym.service.mapper.PlanesMapper;

/**
 *
 * @author carlos
 */
public class PlanesService implements PlanesServiceEspec{

    @Override
    public void crear(Planes bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            //Comprobar que no haya un registro existente del nuevo socio
            //Pendiente

            //Obtener id de Socio
            String sql = "call GENERACODIGOPLAN()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into planes (IdPlan, IdEmpleado, "
                    + "NombrePlan, Nro_Meses, Importe, Estado) values "
                    + "(?,?,?,?,?,?)");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdEmpleado());
            pstm.setString(3, bean.getNombrePlan());
            pstm.setInt(4, bean.getNroMeses());
            pstm.setDouble(5, bean.getImporte());
            pstm.setString(6, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdPlan(id);
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
            String texto = "Error en el proceso crear socio. ";
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
    public void modificar(Planes bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Planes leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Planes> consultar(String nomplan) {
       List<Planes> lista = new ArrayList<>();
        Planes bean = new Planes();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql =  "select IdPlan, IdEmpleado, NombrePlan, Nro_Meses, "
                    + "Importe, Estado from Planes where NombrePlan like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, nomplan);
            ResultSet rs = pstm.executeQuery();
            PlanesMapper mapper = new PlanesMapper();
            while (rs.next()) {
                Planes pla = mapper.mapRow(rs);
                lista.add(pla);
            }
            rs.close();
            pstm.close();
            if (bean == null) {
                throw new Exception("Id no existe.");
            }
        } catch (Exception e) {
            String texto = "Error en el proceso. ";
            texto += e.getMessage();
            throw new RuntimeException(texto);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
}
