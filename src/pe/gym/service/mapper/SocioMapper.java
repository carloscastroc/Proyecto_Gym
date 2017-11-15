/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Socio;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Carlos
 */
public class SocioMapper implements RowMapper<Socio> {

    @Override
    public Socio mapRow(ResultSet rs) throws SQLException {
        Socio bean = new Socio();
        bean.setIdSocio(rs.getString("IdSocio"));
        bean.setIdEmpleado(rs.getString("IdEmpleado"));
        bean.setNombre(rs.getString("Nombre"));
        bean.setApellido(rs.getString("Apellido"));
        bean.setDNI(rs.getString("DNI"));
        bean.setTelefono(rs.getInt("Telefono"));
        bean.setEmail(rs.getString("Email"));
        bean.setF_inscripcion(rs.getString("F_Inscripcion"));
        bean.setEstado(rs.getString("Estado"));
        

        return bean;
    }

}
