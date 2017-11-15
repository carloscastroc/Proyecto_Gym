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
import pe.gym.model.Socio;
import pe.gym.service.espec.SocioServiceEspec;

/**
 *
 * @author Carlos
 */
public class SocioService implements SocioServiceEspec {

    private final String SQL_SELECT = "select IdSocio, IdEmpleado, "
            + "Nombre, Apellido, DNI, Telefono, Email, F_Inscripcion, Estado "
            + "from socio ";

    private final String SQL_INSERT = "insert into socio(IdSocio, IdEmpleado, " 
            + "Nombre, Apellido, DNI, Telefono, Email, F_Inscripcion, Estado)"
            + " values (?,?,?,?,?,?,?,?,?) ";
    private final String SQL_UPDATE = "";

    @Override
    public void crear(Socio bean) {
        Connection cn = null;
    try {
      // Obtener objeto Connection
      cn = conectaBD.obtener();
      // Inicio de Tx
      cn.setAutoCommit(false);
      //Obtener id de Socio
      String sql="call GENERACODIGOSOCIO()";
      PreparedStatement pstm=cn.prepareStatement(sql);
      ResultSet res = pstm.executeQuery();
      res.next();
      String id=res.getString("cod");
      
      // Registrar Socio
      pstm = cn.prepareStatement(SQL_INSERT);
      pstm.setString(1, id);
      pstm.setString(2, bean.getIdEmpleado());
      pstm.setString(3, bean.getNombre());
      pstm.setString(4, bean.getApellido());
      pstm.setInt(5, bean.getDNI());
      pstm.setInt(6, bean.getTelefono());
      pstm.setString(7, bean.getEmail());
      pstm.setString(8, bean.getF_inscripcion());
      pstm.setString(9, bean.getEstado());
      pstm.executeUpdate();
      pstm.close();
      // Recuperar ID del empleado
      bean.setIdSocio(id);
      // Confirmar Tx
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      String texto = "Error en el proceso crear socio. ";
      texto += e.getMessage();
      throw new RuntimeException(texto);
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    }

    @Override
    public void modificar(Socio bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Socio leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Socio consultar(int DNI, String ape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
