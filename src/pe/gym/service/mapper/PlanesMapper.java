/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Planes;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Alumno
 */
public class PlanesMapper implements RowMapper<Planes>{

    @Override
    public Planes mapRow(ResultSet rs) throws SQLException {
        Planes bean = new Planes();
        bean.setIdPlan(rs.getString("IdPlan"));
        bean.setIdEmpleado(rs.getString("IdEmpleado"));
        bean.setNombrePlan(rs.getString("NombrePlan"));
        bean.setNroMeses(rs.getInt("Nro_Meses"));
        bean.setImporte(rs.getDouble("Importe"));
        bean.setEstado(rs.getString("Estado"));

        return bean;
    }
    
    
    
}
