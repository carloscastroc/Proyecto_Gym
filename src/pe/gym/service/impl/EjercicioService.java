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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
