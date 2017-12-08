package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.Nutricionista;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Brayian
 */
public class NutricionistaMapper implements RowMapper<Nutricionista>{

    @Override
    public Nutricionista mapRow(ResultSet rs) throws SQLException {
        Nutricionista bean = new Nutricionista();
        bean.setIdInfNutricional(rs.getString("IdInfNutricional"));
        bean.setIdEmpleado(rs.getString("IdEmpleado"));
        bean.setIdSocio(rs.getString("IdSocio"));
        bean.setNombre(rs.getString("Nombre"));
        bean.setDNI(rs.getString("DNI"));
        bean.setFecha(rs.getString("Fecha"));
        return bean;
    }
    
}
