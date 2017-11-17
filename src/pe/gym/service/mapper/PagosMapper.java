/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Pagos;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Alumno
 */
public class PagosMapper implements RowMapper<Pagos> {

    @Override
    public Pagos mapRow(ResultSet rs) throws SQLException {
        Pagos bean = new Pagos();
        bean.setIdPago(rs.getString("IdPago"));
        bean.setIdSocio(rs.getString("IdSocio"));
        bean.setTipo_de_Pago(rs.getString("Tipo_de_Pago"));
        bean.setIGV(rs.getDouble("IGV"));
        bean.setSubtotal(rs.getDouble("Subtotal"));
        bean.setTotal(rs.getDouble("Total"));
        bean.setNroCuotas(rs.getInt("NroCuotas"));
        bean.setEstado(rs.getString("Estado"));
        
        return bean;
    }

}
