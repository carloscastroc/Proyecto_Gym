/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Promociones;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Alumno
 */
public class PromocionesMapper implements RowMapper<Promociones>{
    
   @Override
    public Promociones mapRow(ResultSet rs) throws SQLException {
        Promociones bean = new Promociones();
        bean.setIdPromociones(rs.getString("IdPromociones"));
        bean.setIdEmpleado(rs.getString("IdEmpleado"));
        bean.setNombrePromocion(rs.getString("NombrePromocion"));
        bean.setDescuento(rs.getDouble("Descuento"));
        bean.setDescripcion(rs.getString("Descripcion"));
        return bean;
    }

}
