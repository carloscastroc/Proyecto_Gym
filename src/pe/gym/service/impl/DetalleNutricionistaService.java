/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.gym.db.conectaBD;
import pe.gym.model.DetalleNutricionista;
import pe.gym.service.espec.DetalleNutricionistaEspec;
import pe.gym.service.mapper.DetalleNutricionistaMapper;

/**
 *
 * @author Brayian
 */
public class DetalleNutricionistaService implements DetalleNutricionistaEspec{
     private final String SQL_SELECT = "select IdInfNutricional,Fecha, Peso,IMC,"
            + " Masa_Grasa,Cuello,Hombros,Brazos_Antebrazos,Pecho_Busto,Cintura,CaderaAlta,Gluteos,Muslo,Pantorrillas from "
            + "detnutricional";
     

    @Override
    public void crear(DetalleNutricionista bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(DetalleNutricionista bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetalleNutricionista leerPorId(String id) {
        DetalleNutricionista bean=null;
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = SQL_SELECT+" where IdInfNutricional=?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            DetalleNutricionistaMapper mapper = new DetalleNutricionistaMapper();
            if (rs.next()) {
                bean = mapper.mapRow(rs);
            }
            rs.close();
            pstm.close();
            if (bean == null) {
                throw new Exception("Id no existe.");
            }
        } catch (Exception e) {
            String texto = "Error en el proceso. ";
            texto += e.getMessage();
            throw new RuntimeException(texto);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return bean;
    }
}
