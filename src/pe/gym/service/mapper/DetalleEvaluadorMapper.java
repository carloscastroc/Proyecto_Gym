/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.DetalleEvaluador;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author JORGE LUIS
 */
public class DetalleEvaluadorMapper implements RowMapper<DetalleEvaluador>{

    @Override
    public DetalleEvaluador mapRow(ResultSet rs) throws SQLException {
       DetalleEvaluador bean = new DetalleEvaluador();
        bean.setIdPlanEntrenamiento(rs.getString("IdPlanEntrenamiento"));
        bean.setEjercicio(rs.getString("Ejercicio"));
        bean.setN_Maquina(rs.getInt("N_Maquina"));
        bean.setSerie(rs.getInt("Serie"));
        bean.setRepeticiones(rs.getInt("Repeticiones"));
        return bean;
    }
    
}
