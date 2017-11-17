/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Carlos
 */
public final class Session {

  private Session() {
  }
  
  private static final Map<String,Object> datos;
  
  static{
    datos = new HashMap<>();
  }
  
  public static void put(String key, Object value){
    datos.put(key, value);
  }
  
  public static Object get(String key){
    return datos.get(key);
  }
  
  public static void destruirdatos(){
     datos.clear();
  }
  
 
}



