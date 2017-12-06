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
import pe.gym.model.TipoEjercicio;
import pe.gym.service.espec.TipoEjercicioEspec;
import pe.gym.service.mapper.TipoEjercicioMapper;

/**
 *
 * @author JORGE LUIS
 */
public class TipoEjercicioService implements TipoEjercicioEspec {

    @Override
    public List<TipoEjercicio> consultar() {
        List<TipoEjercicio> lista = new ArrayList<>();
        TipoEjercicio bean = new TipoEjercicio();
        Connection cn = null;
        try {
            cn = conectaBD.obtener();
            String sql = "select IdTipo,TipoEjercicio from tipoejercicio";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            TipoEjercicioMapper mapper = new TipoEjercicioMapper();
            while (rs.next()) {
                TipoEjercicio tipo = mapper.mapRow(rs);
                lista.add(tipo);
            }
            rs.close();
            pstm.close();
            if (bean == null) {
                throw new Exception("Id no existe.");
            }
        } catch (Exception e) {
            String texto = "Error en el proceso . ";
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
    public void crear(TipoEjercicio bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(TipoEjercicio bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoEjercicio leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
