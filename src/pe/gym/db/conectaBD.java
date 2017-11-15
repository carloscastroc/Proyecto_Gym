/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.db;
import java.sql.*;

/**
 *
 * @author Carlos
 */
public class conectaBD {
       
   public static Connection obtener() {
      Connection cn = null;
    try {
      // Parámetros de conexión
      String driver = "com.mysql.jdbc.Driver";
      String urlDB = "jdbc:mysql://localhost:3306/gym";
      String user = "root";
      String pass = "";
      // Cargar el driver
      Class.forName(driver).newInstance();
      // Realizar la conexión
      cn = DriverManager.getConnection(urlDB, user, pass);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException("No se ha encontrado el driver.");
    } catch(SQLException e){
      throw new RuntimeException(e.getMessage());
    } catch(Exception e){
      throw new RuntimeException("No se tiene acceso a la base de datos.");
    }
    return cn;
   }
   
}
