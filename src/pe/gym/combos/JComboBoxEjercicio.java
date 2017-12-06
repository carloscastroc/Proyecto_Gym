/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.combos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import pe.gym.model.Ejercicio;
import pe.gym.service.espec.EjercicioEspec;
import pe.gym.service.impl.EjercicioService;

/**
 *
 * @author JORGE LUIS
 */
public class JComboBoxEjercicio extends JComboBox{
    List<Ejercicio> lista = new ArrayList<>();
    EjercicioEspec service = new EjercicioService();
    
    public JComboBoxEjercicio(){
        super();
        
        lista = service.consultar();
        this.addItem("Seleccionar");
        for(Ejercicio ej:lista){
            this.addItem(ej);
        }
    }
    
    public void rellenaxcombo(String tipo){
        this.removeAllItems();
        lista=service.consultarxtipo(tipo);
        this.addItem("Seleccionar");
        for(Ejercicio ej:lista){
            this.addItem(ej);
        }
    }


}
