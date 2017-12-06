/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import pe.gym.model.TipoEjercicio;
import pe.gym.service.espec.RowMapper;

/**
 *
 * @author JORGE LUIS
 */
public class TipoEjercicioMapper implements RowMapper<TipoEjercicio>{

    @Override
    public TipoEjercicio mapRow(ResultSet rs) throws SQLException {
        TipoEjercicio bean = new TipoEjercicio();
        bean.setIdTipo(rs.getString("IdTipo"));
        bean.setTipoEjercicio(rs.getString("TipoEjercicio"));
        return bean;
    }
    
}
