/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.EvaluadorConsulta;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author JORGE LUIS
 */
public class EvaluadorConsultaMapper implements RowMapper<EvaluadorConsulta>{

    @Override
    public EvaluadorConsulta mapRow(ResultSet rs) throws SQLException {
        EvaluadorConsulta bean= new EvaluadorConsulta();
        bean.setIdPlanEntrenamiento(rs.getString("IdPlanEntrenamiento"));
        bean.setIdSocio(rs.getString("IdSocio"));
        bean.setIdInfNutricional(rs.getString("IdInfNutricional"));
        bean.setDNI(rs.getString("DNI"));
        bean.setNombre(rs.getString("Nombre"));
        bean.setApellido(rs.getString("Apellido"));
        return bean;
    }
    
    
}
