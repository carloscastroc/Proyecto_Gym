/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
         Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            
            // Registrar DetPagos
            PreparedStatement pstm;
            pstm = cn.prepareStatement("insert into detnutricional(IdInfNutricional, "
                    + "Fecha, Peso, IMC, Masa_Grasa, Cuello, Hombros, "
                    + "Brazos_Antebrazos, Pecho_Busto, Cintura, CaderaAlta, "
                    + "Gluteos, Muslo, Pantorrillas) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, bean.getIdInfNutricional());
            pstm.setString(2, bean.getFecha());
            pstm.setDouble(3, bean.getPeso());
            pstm.setDouble(4, bean.getIMC());
            pstm.setDouble(5, bean.getMasa_Grasa());
            pstm.setDouble(6, bean.getCuello());
            pstm.setDouble(7, bean.getHombros());
            pstm.setDouble(8, bean.getBrazos_Antebrazos());
            pstm.setDouble(9, bean.getPecho_Busto());
            pstm.setDouble(10, bean.getCintura());
            pstm.setDouble(11, bean.getCaderaAlta());
            pstm.setDouble(12, bean.getGluteos());
            pstm.setDouble(13, bean.getMuslo());
            pstm.setDouble(14, bean.getPantorillas());
            pstm.executeUpdate();
            pstm.close();
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
                String texto1= "Error en el Proceso ";
                 texto1 += e1.getMessage();
            }
            String texto = "Error en el proceso crear Detalle Nutricional. ";
            texto += e.getMessage();
            throw new RuntimeException(texto);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
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
