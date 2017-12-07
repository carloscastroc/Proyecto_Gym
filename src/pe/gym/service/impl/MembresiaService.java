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
import pe.gym.model.Membresia;
import pe.gym.service.espec.MembresiaServiceEspec;
import pe.gym.service.mapper.MembresiaMapper;

/**
 *
 * @author Alumno
 */
public class MembresiaService implements MembresiaServiceEspec {

    @Override
    public void crear(Membresia bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            //Comprobar que no haya una membresia activa con el socio

            //Pendiente
            //Obtener id de Socio
            String sql = "call GENERACODIGOMEMBRESIA()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into membresia(IdMembresia, IdSocio, "
                    + "IdEmpleado, IdPlan, IdPromociones, IdPago, F_Inicio, F_Fin, Estado)"
                    + " values (?,?,?,?,?,?,?,?,?) ");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdSocio());
            pstm.setString(3, bean.getIdEmpleado());
            pstm.setString(4, bean.getIdPlan());
            pstm.setString(5, bean.getIdPromociones());
            pstm.setString(6, bean.getIdPago());
            pstm.setString(7, bean.getF_Inicio());
            pstm.setString(8, bean.getF_Fin());
            pstm.setString(9, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdMembresia(id);
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
                String texto1 = "Error en el Proceso ";
                texto1 += e1.getMessage();
            }
            String texto = "Error en el proceso crear Membresia. ";
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
    public void modificar(Membresia bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);

            //Actualizar
            PreparedStatement pstm = cn.prepareStatement("UPDATE membresia set F_Inicio=?, F_Fin=?, Estado=? WHERE IdMembresia=?");
            pstm.setString(1, bean.getF_Inicio());
            pstm.setString(2, bean.getF_Fin());
            pstm.setString(3, bean.getEstado());
            pstm.setString(4, bean.getIdMembresia());
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
    public Membresia leerPorId(String id) {
        Membresia bean = null;
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "Select IdMembresia, IdEmpleado, IdSocio, DNI, Nombre, "
                    + "Apellido, IdPlan, NombrePlan, IdPromociones, NombrePromocion, "
                    + "IdPago, F_Inicio, F_Fin, Estado from v_membresia where IdMembresia = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            MembresiaMapper mapper = new MembresiaMapper();
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

    @Override
    public List<Membresia> consultaMembresia(String dni) {
        List<Membresia> lista = new ArrayList<>();
        Membresia bean = new Membresia();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "Select IdMembresia, IdEmpleado, IdSocio, DNI, Nombre, "
                    + "Apellido, IdPlan, NombrePlan, IdPromociones, NombrePromocion, "
                    + "IdPago, F_Inicio, F_Fin, Estado from v_membresia where DNI like concat('%',?,'%') "
                    + "order by IdMembresia asc";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, dni);
            ResultSet rs = pstm.executeQuery();
            MembresiaMapper mapper = new MembresiaMapper();
            while (rs.next()) {
                Membresia emp = mapper.mapRow(rs);
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
//            e.printStackTrace();
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
    public List<Membresia> compruebaestado(String idsocio) {
        List<Membresia> lista = new ArrayList<>();
        Membresia bean = new Membresia();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "Select IdMembresia, IdEmpleado, IdSocio, DNI, Nombre, "
                    + "Apellido, IdPlan, NombrePlan, IdPromociones, NombrePromocion, "
                    + "IdPago, F_Inicio, F_Fin, Estado from v_membresia where IdSocio=? "
                    + "and Estado='Activo' or IdSocio=? and Estado='Congelado' ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, idsocio);
            pstm.setString(2, idsocio);
            ResultSet rs = pstm.executeQuery();
            MembresiaMapper mapper = new MembresiaMapper();
            while (rs.next()) {
                Membresia emp = mapper.mapRow(rs);
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
//            e.printStackTrace();
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
    public void congelarMembresia(String idmem, String ffinc, String estado) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);

            PreparedStatement pstm;
            // Registrar Congelamiento
            pstm = cn.prepareStatement("insert into congelamiento(IdMembresia, Fecha_FinC, "
                    + "Estado) values (?,?,?) ");
            pstm.setString(1, idmem);
            pstm.setString(2, ffinc);
            pstm.setString(3, estado);

            pstm.executeUpdate();
            pstm.close();

            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
                String texto1 = "Error en el Proceso ";
                texto1 += e1.getMessage();
            }
            String texto = "Error en el proceso crear Congelamiento. ";
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
    public void insertaPago(String idp, String idpago) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);

            //Actualizar
            PreparedStatement pstm = cn.prepareStatement("UPDATE membresia set IdPago=? WHERE IdMembresia=?");
            pstm.setString(1, idpago);
            pstm.setString(2, idp);

            pstm.executeUpdate();
            pstm.close();
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            String texto = "Error en el proceso inserta pago. ";
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
    public List<Membresia> compruebaestadopago(String idmem) {
        List<Membresia> lista = new ArrayList<>();
        Membresia bean = new Membresia();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "Select IdMembresia, IdEmpleado, IdSocio, DNI, Nombre, "
                    + "Apellido, IdPlan, NombrePlan, IdPromociones, NombrePromocion, "
                    + "IdPago, F_Inicio, F_Fin, Estado from v_membresia where IdMembresia=?"
                    + " and IdPago='No generado'";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, idmem);
            ResultSet rs = pstm.executeQuery();
            MembresiaMapper mapper = new MembresiaMapper();
            while (rs.next()) {
                Membresia emp = mapper.mapRow(rs);
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
//            e.printStackTrace();
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
    public int congelamiento(String id) {
        int cont = 0;
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "Select IdMembresia, Fecha_FinC, Estado from congelamiento where IdMembresia=?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                cont++;
            }

            rs.close();
            pstm.close();
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
        return cont;
    }

}
