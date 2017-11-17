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
public class PromocionesService implements PromocionesServiceEspec{

    @Override
    public List<Promociones> consultar(String nompromocion) {
       List<Promociones> lista= new ArrayList<>();
       Promociones bean = new Promociones();
       Connection cn= null;
        try {
            cn = conectaBD.obtener();
            String sql =  "select IdPromociones, IdEmpleado, NombrePromocion, Importe,Descripcion "
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
    
}
