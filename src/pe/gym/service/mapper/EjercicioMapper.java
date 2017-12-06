/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Ejercicio;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author JORGE LUIS
 */
public class EjercicioMapper implements RowMapper<Ejercicio>{

    @Override
    public Ejercicio mapRow(ResultSet rs) throws SQLException {
        Ejercicio bean = new Ejercicio();
        bean.setIdPlanE(rs.getString("IdPlanE"));
        bean.setIdTipo(rs.getString("IdTipo"));
        bean.setEjercicio(rs.getString("Ejercicio"));
        return bean;
    }
    
}
