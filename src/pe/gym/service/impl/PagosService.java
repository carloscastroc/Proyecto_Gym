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
import pe.gym.model.Pagos;
import pe.gym.service.espec.PagosServiceEspec;
import pe.gym.service.mapper.PagosMapper;

/**
 *
 * @author Alumno
 */
public class PagosService implements PagosServiceEspec {

    @Override
    public void crear(Pagos bean) {
        Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            
            //Obtener id de Socio
            String sql = "call GENERACODIGOPAGO()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into pagos (IdPago, IdSocio, "
                    + "Tipo_de_Pago, IGV, Subtotal, Total, NroCuotas, Estado) "
                    + "values (?,?,?,?,?,?,?,?)");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdSocio());
            pstm.setString(3, bean.getTipo_de_Pago());
            pstm.setDouble(4, bean.getIGV());
            pstm.setDouble(5, bean.getSubtotal());
            pstm.setDouble(6, bean.getTotal());
            pstm.setInt(7, bean.getNroCuotas());
            pstm.setString(8, bean.getEstado());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdPago(id);
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
            String texto = "Error en el proceso crear pago. ";
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
    public void modificar(Pagos bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pagos leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagos> consultarPagoxDNI(String dni) {
         List<Pagos> lista = new ArrayList<>();
        Pagos bean = new Pagos();
        Connection cn= null;
        try {
            cn=conectaBD.obtener();
            String sql= "Select IdPago, IdMembresia, IdSocio, Nombre, Apellido, DNI, "
                    + "Tipo_de_Pago, IGV, Subtotal, Total, NroCuotas, Estado "
                    + "from v_pagos where DNI like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, dni);
            ResultSet rs = pstm.executeQuery();
            PagosMapper mapper = new PagosMapper();
            while (rs.next()){
                Pagos emp = mapper.mapRow(rs);
                lista.add(emp);
            }
            rs.close();
            pstm.close();
            if(bean==null){
                throw new Exception("Id no existe.");
            }
        } catch (Exception e) {
            String texto ="Error en el proceso. ";
            texto +=e.getMessage();
            throw new RuntimeException(texto);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }

}
