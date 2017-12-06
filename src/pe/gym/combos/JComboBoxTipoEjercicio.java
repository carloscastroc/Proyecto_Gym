/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.combos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import pe.gym.model.TipoEjercicio;
import pe.gym.service.espec.TipoEjercicioEspec;
import pe.gym.service.impl.TipoEjercicioService;

/**
 *
 * @author JORGE LUIS
 */
public class JComboBoxTipoEjercicio extends JComboBox{
    List<TipoEjercicio> lista = new ArrayList<>();
    
    public JComboBoxTipoEjercicio(){
        super();
        
        TipoEjercicioEspec service = new TipoEjercicioService();
        lista= service.consultar();
        this.addItem("Seleccionar");
        for(TipoEjercicio tip : lista){
            this.addItem(tip);
        }
    }
}
