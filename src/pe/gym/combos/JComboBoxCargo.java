/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.combos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import pe.gym.controller.EmpleadoController;
import pe.gym.model.Cargo;
import pe.gym.service.espec.EmpleadoServiceEspec;
import pe.gym.service.impl.EmpleadoService;

/**
 *
 * @author Carlos
 */
public class JComboBoxCargo extends JComboBox{
    
    List<Cargo> lista = new ArrayList<>();

    public JComboBoxCargo() {
        super();
        
        EmpleadoServiceEspec service = new EmpleadoService();
        lista=service.consultacombo();
        
         for (Cargo emp : lista) {

             this.addItem(emp);

        }

        this.addItem("Selecciona");
         
        
        
    }
    

    
}
