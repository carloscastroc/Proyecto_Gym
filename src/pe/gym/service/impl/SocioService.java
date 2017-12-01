/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.gym.db.conectaBD;
import pe.gym.model.Socio;
import pe.gym.service.espec.SocioServiceEspec;
import pe.gym.service.mapper.SocioMapper;

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
            //Comprobar que no haya un registro existente del nuevo socio
            //Pendiente

            //Obtener id de Socio
            String sql = "call GENERACODIGOSOCIO()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement(SQL_INSERT);
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdEmpleado());
            pstm.setString(3, bean.getNombre());
            pstm.setString(4, bean.getApellido());
            pstm.setString(5, bean.getDNI());
            pstm.setInt(6, bean.getTelefono());
            pstm.setString(7, bean.getEmail());
            pstm.setString(8, bean.getF_inscripcion());
            pstm.setString(9, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdSocio(id);
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
            String texto = "Error en el proceso crear socio. ";
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
    public void modificar(Socio bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);

            //Actualizar
            PreparedStatement pstm = cn.prepareStatement("UPDATE socio set Telefono=?, Email=?, Estado=? WHERE IdSocio=?");
            pstm.setInt(1, bean.getTelefono());
            pstm.setString(2, bean.getEmail());
            pstm.setString(3, bean.getEstado());
            pstm.setString(4, bean.getIdSocio());
            pstm.executeUpdate();
            pstm.close();
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            String texto = "Error en el proceso actualizar socio. ";
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
    public Socio leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Socio> consultar(String DNI) {
        List<Socio> lista = new ArrayList<>();
        Socio bean = new Socio();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = SQL_SELECT + " where dni like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, DNI);
            ResultSet rs = pstm.executeQuery();
            SocioMapper mapper = new SocioMapper();
            while (rs.next()) {
                Socio emp = mapper.mapRow(rs);
                lista.add(emp);
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
        return lista;
    }

    @Override
    public List<Socio> consultarxape(String ape) {
         List<Socio> lista = new ArrayList<>();
        Socio bean = new Socio();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = SQL_SELECT + " where Apellido like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, ape);
            ResultSet rs = pstm.executeQuery();
            SocioMapper mapper = new SocioMapper();
            while (rs.next()) {
                Socio emp = mapper.mapRow(rs);
                lista.add(emp);
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
        return lista;
    }

}
