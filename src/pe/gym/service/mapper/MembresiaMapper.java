/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Membresia;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Alumno
 */
public class MembresiaMapper implements  RowMapper<Membresia>{

    @Override
    public Membresia mapRow(ResultSet rs) throws SQLException {
        Membresia bean = new Membresia();
        bean.setIdMembresia(rs.getString("IdPago"));
        bean.setIdSocio(rs.getString("IdSocio"));
        bean.setIdEmpleado(rs.getString("Tipo_de_Pago"));
        bean.setIdPlan(rs.getString("Importe"));
        bean.setIdPromociones(rs.getString("Fecha"));
        bean.setIdPago(rs.getString("IGV"));
        bean.setF_Inicio(rs.getString("Subtotal"));
        bean.setF_Fin(rs.getString("Total"));
        bean.setEstado(rs.getString("Estado"));
        return bean;
    }
    
}
