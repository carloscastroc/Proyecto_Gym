/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pe.gym.model.Empleado;

/**
 *
 * @author Carlos
 */
public class CargaComponentes {

    public void cargaTitulo(JLabel label) {
        // Obtener el usuario
        Empleado bean = (Empleado) Session.get("empleado");
        String cargo="";
        // El titulo
        switch (bean.getIdCargo()) {
            case "C0001":
                cargo="Administrador";
                break;
            case "C0002":
                cargo="Asistente";
                break;
            case "C0003":
                cargo="Cajero";
                break;
            case "C0004":
                cargo="Nutricionista";
                break;
            case "C0005":
                cargo="Evaluador";
                break;
            default:
                cargo="No tiene cargo";
                break;
        }
        String titulo = "THE 1ONE FITNESS CLUB - "+cargo+": "+bean.getApellido();
        label.setText(titulo);
    }

    public void cargaIdEmpleado(JLabel label) {
        Empleado bean = (Empleado) Session.get("empleado");
        label.setText(bean.getIdEmpleado());
    }

    public void cargaBotoneAdmi(JButton boton) {
        Empleado bean = (Empleado) Session.get("empleado");
        if ("C0001".equals(bean.getIdCargo())) {
            boton.setVisible(true);
        }

    }

}
