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
import pe.gym.model.Promociones;
import pe.gym.service.espec.PromocionesServiceEspec;
import pe.gym.service.mapper.PromocionesMapper;

/**
 *
 * @author Alumno
 */
public class PromocionesService implements PromocionesServiceEspec {

    @Override
    public List<Promociones> consultar(String nompromocion) {
        List<Promociones> lista = new ArrayList<>();
        Promociones bean = new Promociones();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "select IdPromociones, IdEmpleado, NombrePromocion, Descuento,Descripcion "
                    + "from Promociones where NombrePromocion like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, nompromocion);
            ResultSet rs = pstm.executeQuery();
            PromocionesMapper mapper = new PromocionesMapper();
            while (rs.next()) {
                Promociones pro = mapper.mapRow(rs);
                lista.add(pro);
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
    public void crear(Promociones bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            //Comprobar que no haya un registro existente del nuevo socio
            //Pendiente

            //Obtener id de Socio
            String sql = "call GENERACODIGOPROMO()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into promociones (IdPromociones, IdEmpleado, "
                    + "NombrePromocion, Descuento, Descripcion) values "
                    + "(?,?,?,?,?)");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdEmpleado());
            pstm.setString(3, bean.getNombrePromocion());
            pstm.setDouble(4, bean.getDescuento());
            pstm.setString(5, bean.getDescripcion());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdPromociones(id);
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
            String texto = "Error en el proceso crear promocion. ";
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
    public void modificar(Promociones bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);

            //Actualizar
            PreparedStatement pstm = cn.prepareStatement("UPDATE promociones set Descuento=?, Descripcion=? WHERE IdPromociones=?");
            pstm.setDouble(1, bean.getDescuento());
            pstm.setString(2, bean.getDescripcion());
            pstm.setString(3, bean.getIdPromociones());
            pstm.executeUpdate();
            pstm.close();
            // Confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            String texto = "Error en el proceso actualizar promocion. ";
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
    public Promociones leerPorId(String id) {
        Promociones bean = new Promociones();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "select IdPromociones, IdEmpleado, NombrePromocion, Descuento,Descripcion "
                    + "from Promociones where IdPromociones=? ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            PromocionesMapper mapper = new PromocionesMapper();
            while (rs.next()) {
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
