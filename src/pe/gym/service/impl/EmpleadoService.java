/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import pe.gym.db.conectaBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pe.gym.model.Empleado;
import pe.gym.service.mapper.EmpleadoMapper;
import pe.gym.service.espec.EmpleadoServiceEspec;

/**
 *
 * @author Carlos
 */
public class EmpleadoService implements EmpleadoServiceEspec {

    private final String SQL_SELECT = "select IdEmpleado, "
            + "IdCargo, Nombre, Apellido, DNI, Direccion, Telefono, Correo, Estado "
            + "from empleado ";
    
    private final String SQL_INSERT = "insert into empleado("
            + "IdEmpleado,IdCargo, Nombre, Apellido, DNI, Direccion, "
            + "Telefono, Correo, Estado) values (?,?,?,?,?,?,?,?,?) ";
    private final String SQL_UPDATE ="";
    

    @Override
    public Empleado validar(String usuario, String clave) {
        Empleado bean = null;
        Connection cn = null;
        int resultado = 0;
        try {
            cn = conectaBD.obtener();
            // Obtener el idemp
            String sql = "select IdEmpleado FROM usuario WHERE user=? and "
                    + "pass=SHA(?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, clave);
            ResultSet rs = pstm.executeQuery();
            String idemp = "";
            if (rs.next()) {
                resultado=1;
                idemp = rs.getString("IdEmpleado");
            }
            rs.close();
            pstm.close();
            if (resultado == 0) {
                throw new RuntimeException("Datos incorrectos.");
            }
            // Recuperar datos del empleado
            bean = leerPorId(idemp);
            System.out.println("Bienvenido usuario");

        } catch (Exception ex) {
            String texto = "Error en el proceso. ";
            texto += ex.getMessage();
            throw new RuntimeException(texto);
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
            String texto = "Error en el proceso 2. ";
            texto += ex.getMessage();
            }
        }
        return bean;

    }

    @Override
    public void crear(Empleado bean) {
        Connection cn = null;
    try {
      // Obtener objeto Connection
      cn = conectaBD.obtener();
      // Inicio de Tx
      cn.setAutoCommit(false);
      //Obtener id de empleado
      String sql="call GENERACODIGOEMPL()";
      PreparedStatement pstm=cn.prepareStatement(sql);
      ResultSet res = pstm.executeQuery();
      res.next();
      String id=res.getString("cod");
      
      // Registrar empleado
      pstm = cn.prepareStatement(SQL_INSERT);
      pstm.setString(1, id);
      pstm.setString(2, bean.getIdCargo());
      pstm.setString(3, bean.getNombre());
      pstm.setString(4, bean.getApellido());
      pstm.setInt(5, bean.getDNI());
      pstm.setString(6, bean.getDireccion());
      pstm.setInt(7, bean.getTelefono());
      pstm.setString(8, bean.getCorreo());
      pstm.setString(9, bean.getEstado());
      pstm.executeUpdate();
      pstm.close();
      // Recuperar ID del empleado
      bean.setIdEmpleado(id);
      // Confirmar Tx
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      String texto = "Error en el proceso crear empleado. ";
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
    public void modificar(Empleado bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Empleado leerPorId(String id) {
        Empleado bean = null;
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = SQL_SELECT + " where IdEmpleado = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            EmpleadoMapper mapper = new EmpleadoMapper();
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
        } 
        finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return bean;
    }




  

}
