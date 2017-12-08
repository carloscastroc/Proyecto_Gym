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
import pe.gym.model.Ejercicio;
import pe.gym.service.espec.EjercicioEspec;
import pe.gym.service.mapper.EjercicioMapper;
import pe.gym.service.mapper.TipoEjercicioMapper;

/**
 *
 * @author JORGE LUIS
 */
public class EjercicioService implements EjercicioEspec{

    @Override
    public List<Ejercicio> consultar() {
        List<Ejercicio> lista = new ArrayList<>();
        Ejercicio bean = new Ejercicio();
        Connection cn = null;
        try {
            cn=conectaBD.obtener();
            String sql = "select IdPlanE,IdTipo,Ejercicio from ejercicio";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
            EjercicioMapper mapper = new EjercicioMapper();
            while (rs.next()) {
                Ejercicio ejer = mapper.mapRow(rs);
                lista.add(ejer);
            }
            rs.close();
            pstm.close();
            if(bean == null){
                throw new Exception("Id no existe. ");
            }
        } catch (Exception e) {
            String texto= "Error en el proceso. ";
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

    @Override
    public void crear(Ejercicio bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            
            //Obtener id de Socio
            String sql = "call GENERACODIGOEJERCICIO()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into ejercicio (IdPlanE, IdTipo, "
                    + "Ejercicio) "
                    + "values (?,?,?)");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdTipo());
            pstm.setString(3, bean.getEjercicio());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdPlanE(id);
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
            String texto = "Error en el proceso crear ejercicio. ";
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
    public void modificar(Ejercicio bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ejercicio leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ejercicio> consultarxtipo(String tipo) {
        List<Ejercicio> lista = new ArrayList<>();
        Ejercicio bean = new Ejercicio();
        Connection cn = null;
        try {
            cn=conectaBD.obtener();
            String sql = "select IdPlanE,IdTipo,Ejercicio from ejercicio where IdTipo=?";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, tipo);
            ResultSet rs= pstm.executeQuery();
            EjercicioMapper mapper = new EjercicioMapper();
            while (rs.next()) {
                Ejercicio ejer = mapper.mapRow(rs);
                lista.add(ejer);
            }
            rs.close();
            pstm.close();
            if(bean == null){
                throw new Exception("Id no existe. ");
            }
        } catch (Exception e) {
            String texto= "Error en el proceso. ";
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

    @Override
    public void eliminar(String id) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);

            //Actualizar
            PreparedStatement pstm = cn.prepareStatement("delete from ejercicio where IdPlanE=?");
            pstm.setString(1, id);
            pstm.executeUpdate();
            pstm.close();
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            String texto = "Error en el proceso eliminar ejercicio ";
            texto += e.getMessage();
            throw new RuntimeException(texto);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
    
}
