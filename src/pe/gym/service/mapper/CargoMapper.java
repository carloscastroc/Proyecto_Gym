/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Cargo;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Carlos
 */
public class CargoMapper implements RowMapper<Cargo>{

    @Override
    public Cargo mapRow(ResultSet rs) throws SQLException {
            Cargo bean = new Cargo();

    bean.setIdCargo(rs.getString("IdCargo"));
    bean.setDescripcion(rs.getString("Descripcion"));
  
    return bean;
    }

    
}
