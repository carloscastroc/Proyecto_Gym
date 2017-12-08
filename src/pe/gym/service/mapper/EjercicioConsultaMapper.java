/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.EjercicioConsulta;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Carlos
 */
public class EjercicioConsultaMapper implements RowMapper<EjercicioConsulta>{

    @Override
    public EjercicioConsulta mapRow(ResultSet rs) throws SQLException {
        EjercicioConsulta bean = new EjercicioConsulta();
        bean.setIdPlanE(rs.getString("IdPlanE"));
        bean.setTipoEjercicio(rs.getString("TipoEjercicio"));
        bean.setEjercicio(rs.getString("Ejercicio"));
        return bean;
    }
    
    
    
}
