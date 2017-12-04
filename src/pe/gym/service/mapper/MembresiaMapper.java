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
public class MembresiaMapper implements RowMapper<Membresia> {

    @Override
    public Membresia mapRow(ResultSet rs) throws SQLException {
        Membresia bean = new Membresia();
        bean.setIdMembresia(rs.getString("IdMembresia"));
        bean.setIdEmpleado(rs.getString("IdEmpleado"));
        bean.setIdSocio(rs.getString("IdSocio"));
        bean.setDNI(rs.getString("DNI"));
        bean.setNombre(rs.getString("Nombre"));
        bean.setApellido(rs.getString("Apellido"));
        bean.setIdPlan(rs.getString("IdPlan"));
        bean.setNombrePlan(rs.getString("NombrePlan"));
        bean.setIdPromociones(rs.getString("IdPromociones"));
        bean.setNombrePromocion(rs.getString("NombrePromocion"));
        bean.setIdPago(rs.getString("IdPago"));
        bean.setF_Inicio(rs.getString("F_Inicio"));
        bean.setF_Fin(rs.getString("F_Fin"));
        bean.setEstado(rs.getString("Estado"));

        return bean;
    }

}
