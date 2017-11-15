/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import pe.gym.db.conectaBD;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class PruebaConexionBD {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Connection cn = conectaBD.obtener();
            System.out.println("Conexion ok");
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
