/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;

import javax.swing.JLabel;
import pe.gym.model.Empleado;

/**
 *
 * @author Carlos
 */
public class CargaComponentes {
    
    public void cargaTitulo(JLabel label){
        // Obtener el usuario
    Empleado bean = (Empleado) Session.get("empleado");

    // El titulo
    String titulo = "THE 1ONE FITNESS CLUB - Empleado: " + bean.getNombre() ;
    label.setText(titulo);
    }
    
    public void cargaIdEmpleado(JLabel label){
        Empleado bean = (Empleado) Session.get("empleado");
        label.setText(bean.getIdEmpleado());
    }
    
}
