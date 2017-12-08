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
            String sql = "select IdInfNutricional, IdEmpleado, IdSocio, Nombre, "
                    + "DNI, Fecha from v_nutricion where DNI like concat('%',?,'%') ";
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

    @Override
    public void crear(Nutricionista bean) {
       Connection cn = null;
        try {
            // Obtener objeto Connection
            cn = conectaBD.obtener();
            // Inicio de Tx
            cn.setAutoCommit(false);
            
            //Obtener id de Socio
            String sql = "call GENERACODIGOINFNUTRICIONAL()";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            res.next();
            String id = res.getString("cod");

            // Registrar Socio
            pstm = cn.prepareStatement("insert into infnutricional "
                    + "(IdInfNutricional, IdEmpleado, IdSocio) "
                    + "values (?,?,?)");
            pstm.setString(1, id);
            pstm.setString(2, bean.getIdEmpleado());
            pstm.setString(3, bean.getIdSocio());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID del socio
            bean.setIdInfNutricional(id);
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
            String texto = "Error en el proceso crear informacion nutricional. ";
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
    public void modificar(Nutricionista bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nutricionista leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
