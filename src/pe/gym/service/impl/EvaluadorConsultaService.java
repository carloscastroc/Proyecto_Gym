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
import pe.gym.model.EvaluadorConsulta;
import pe.gym.service.espec.EvaluadorConsultaEspec;
import pe.gym.service.mapper.EvaluadorConsultaMapper;

/**
 *
 * @author JORGE LUIS
 */
public class EvaluadorConsultaService implements EvaluadorConsultaEspec{

    private final String SQL_SELECT = "select IdSocio,IdPlanEntrenamiento,"
            + "IdMembresia,DNI,Nombre,Apellido from consultarev";
    
    
    @Override
    public List<EvaluadorConsulta> consultar(String dni) {
        List<EvaluadorConsulta> lista = new ArrayList<>();
        EvaluadorConsulta bean = new EvaluadorConsulta();
        Connection cn= null;
        try {
            cn=conectaBD.obtener();
            String sql= SQL_SELECT + " where DNI like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, dni);
            ResultSet rs = pstm.executeQuery();
            EvaluadorConsultaMapper mapper = new EvaluadorConsultaMapper();
            while (rs.next()){
                EvaluadorConsulta emp = mapper.mapRow(rs);
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

    @Override
    public void crear(EvaluadorConsulta bean) {
        
    }

    @Override
    public void modificar(EvaluadorConsulta bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluadorConsulta leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visualizar_ProductoVO(EvaluadorConsulta eva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
