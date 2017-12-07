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
import pe.gym.model.DetalleEvaluador;
import pe.gym.service.espec.DetalleEvaluadorEspec;
import pe.gym.service.mapper.DetalleEvaluadorMapper;

/**
 *
 * @author JORGE LUIS
 */
public class DetalleEvaluadorService implements DetalleEvaluadorEspec{
private final String SQL_SELECT = "select IdPlanEntrenamiento,Ejercicio,N_Maquina,Serie,Repeticiones from v_detplanentrenamiento";
    
    
    @Override
    public List<DetalleEvaluador> Detalle(String idmem) {
        List<DetalleEvaluador> lista = new ArrayList<>();
        DetalleEvaluador bean = new DetalleEvaluador();
        Connection cn=null;
        try {
            cn=conectaBD.obtener();
            String sql=SQL_SELECT + " where IdPlanEntrenamiento = ? ";
            PreparedStatement pstm;
            pstm=cn.prepareStatement(sql);
            pstm.setString(1, idmem);
            ResultSet rs = pstm.executeQuery();
            DetalleEvaluadorMapper mapper = new DetalleEvaluadorMapper();
            while (rs.next()) {
                DetalleEvaluador emp = mapper.mapRow(rs);
                lista.add(emp);
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

    @Override
    public void crear(DetalleEvaluador bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(DetalleEvaluador bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleEvaluador leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
