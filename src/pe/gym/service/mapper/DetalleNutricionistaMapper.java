/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.DetalleNutricionista;
import pe.gym.model.Nutricionista;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author Brayian
 */
public class DetalleNutricionistaMapper implements RowMapper<DetalleNutricionista>{

    @Override
    public DetalleNutricionista mapRow(ResultSet rs) throws SQLException {
    DetalleNutricionista bean = new DetalleNutricionista();
    
    bean.setIdInfNutricional(rs.getString("IdInfNutricional"));
    bean.setFecha(rs.getString("Fecha"));
    bean.setPeso(rs.getDouble("Peso"));
    bean.setIMC(rs.getDouble("IMC"));
    bean.setMasa_Grasa(rs.getDouble("Masa_Grasa"));
    bean.setCuello(rs.getDouble("Cuello"));
    bean.setHombros(rs.getDouble("Hombros"));
    bean.setBrazos_Antebrazos(rs.getDouble("Brazos_Antebrazos"));
    bean.setPecho_Busto(rs.getDouble("Pecho_busto"));
    bean.setCintura(rs.getDouble("Cintura"));
    bean.setCaderaAlta(rs.getDouble("CaderaAlta"));
    bean.setGluteos(rs.getDouble("Gluteos"));
    bean.setMuslo(rs.getDouble("Muslo"));
    bean.setPantorillas(rs.getDouble("Pantorrillas"));
    
    return bean;
    }
    
    
}
