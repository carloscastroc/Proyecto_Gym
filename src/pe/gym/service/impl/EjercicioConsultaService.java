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
import pe.gym.model.EjercicioConsulta;
import pe.gym.service.espec.EjercicioConsultaServiceEspec;
import pe.gym.service.mapper.EjercicioConsultaMapper;

/**
 *
 * @author Carlos
 */
public class EjercicioConsultaService implements EjercicioConsultaServiceEspec{

    @Override
    public List<EjercicioConsulta> consultaE(String nom) {
        List<EjercicioConsulta> lista = new ArrayList<>();
        EjercicioConsulta bean = new EjercicioConsulta();
        Connection cn=null;
        try {
            cn=conectaBD.obtener();
            String sql=" select IdPlanE, TipoEjercicio, Ejercicio from "
                    + "v_ejercicios where Ejercicio like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm=cn.prepareStatement(sql);
            pstm.setString(1, nom);
            ResultSet rs = pstm.executeQuery();
            EjercicioConsultaMapper mapper = new EjercicioConsultaMapper();
            while (rs.next()) {
                EjercicioConsulta emp = mapper.mapRow(rs);
                lista.add(emp);
            }
            rs.close();
            pstm.close();
            if (bean == null) {
                throw new Exception("Ejercicio no existe.");
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
    public void crear(EjercicioConsulta bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(EjercicioConsulta bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EjercicioConsulta leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
