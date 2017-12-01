/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.combos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import pe.gym.model.Planes;
import pe.gym.service.espec.PlanesServiceEspec;
import pe.gym.service.impl.PlanesService;

/**
 *
 * @author Carlos
 */
public class JComboBoxPlanes extends JComboBox{
    
    List<Planes> lista = new ArrayList<>();

    public JComboBoxPlanes() {
        super();
        
        PlanesServiceEspec service = new PlanesService();
        lista=service.consultar("");
        
         for (Planes emp : lista) {

             this.addItem(emp);

        }
        
        
    }
    
}
