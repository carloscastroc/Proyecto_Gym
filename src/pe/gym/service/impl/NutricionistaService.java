package pe.gym.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.gym.db.conectaBD;
import pe.gym.model.Nutricionista;
import pe.gym.service.espec.NutricionistaServiceEspec;
import pe.gym.service.mapper.NutricionistaMapper;

/**
 *
 * @author Brayian
 */
public class NutricionistaService implements NutricionistaServiceEspec{

    @Override
    public List<Nutricionista> consultar(String DNI) {
        List<Nutricionista> lista = new ArrayList<>();
        Nutricionista bean = new Nutricionista();
        Connection cn = null;
        try{
            cn = conectaBD.obtener();
            String sql = "select IdInfNutricional, IdSocio, IdMembresia, Nombre, DNI, Fecha from v_nutricion where DNI like concat('%',?,'%') ";
            PreparedStatement pstm;
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, DNI);
            ResultSet rs = pstm.executeQuery();
            NutricionistaMapper mapper = new NutricionistaMapper();
            while (rs.next()) {
                Nutricionista nut = mapper.mapRow(rs);
                lista.add(nut);
            }
            rs.close();
            pstm.close();
            if (bean == null) {
                throw new Exception("Id no existe. ");
            }
        } catch (Exception e){
            String texto = "Error en el proceso. ";
            texto += e.getMessage();
            throw new RuntimeException(texto);
        }finally{
            try {
                cn.close();
            }catch (Exception e){              
            }
        }
        return lista;
    }
    
    
    
    
}
