/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.espec;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public interface RowMapper<T> {
    
    T mapRow(ResultSet rs) throws SQLException;
}
