/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.combos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import pe.gym.model.Promociones;
import pe.gym.service.espec.PromocionesServiceEspec;
import pe.gym.service.impl.PromocionesService;

/**
 *
 * @author Carlos
 */
public class JComboBoxPromociones extends JComboBox{
    
    List<Promociones> lista = new ArrayList<>();

    public JComboBoxPromociones() {
        super();
        
        PromocionesServiceEspec service = new PromocionesService();
        lista=service.consultar("");
        
        this.addItem("Seleccione una promocion");
        
         for (Promociones emp : lista) {

             this.addItem(emp);

        }
        
        
    }
    
}
