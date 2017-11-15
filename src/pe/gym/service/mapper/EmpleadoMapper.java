/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Empleado;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Carlos
 */
public class EmpleadoMapper implements RowMapper<Empleado>{
    
    
    public Empleado mapRow(ResultSet rs) throws SQLException {
    Empleado bean = new Empleado();
    bean.setIdEmpleado(rs.getString("IdEmpleado"));
    bean.setIdCargo(rs.getString("IdCargo"));
    bean.setNombre(rs.getString("Nombre"));
    bean.setApellido(rs.getString("Apellido"));
    bean.setDNI(rs.getInt("DNI"));
    bean.setDireccion(rs.getString("Direccion"));
    bean.setTelefono(rs.getInt("Telefono"));
    bean.setCorreo(rs.getString("Correo"));
    bean.setEstado(rs.getString("Estado"));
    

    return bean;
    
}
}
