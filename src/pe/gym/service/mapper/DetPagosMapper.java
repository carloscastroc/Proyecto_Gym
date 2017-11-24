/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.DetPagos;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Carlos
 */
public class DetPagosMapper implements RowMapper<DetPagos>{

    @Override
    public DetPagos mapRow(ResultSet rs) throws SQLException {
        DetPagos bean = new DetPagos();
        bean.setIdPago(rs.getString("IdPago"));
        bean.setIdEmpleado(rs.getString("IdEmpleado"));
        bean.setNroCuota(rs.getInt("NroCuota"));
        bean.setImporte(rs.getInt("Importe"));
        bean.setF_UPago(rs.getString("F_UPago"));
        bean.setEstado(rs.getString("Estado"));
        
        return bean;

    }
    
}
