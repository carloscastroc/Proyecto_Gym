/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.model;

/**
 *
 * @author JORGE LUIS
 */
public class TipoEjercicio {
    
    private String IdTipo;
    private String TipoEjercicio;

    public TipoEjercicio(){
    }

    public TipoEjercicio(String IdTipo, String TipoEjercicio) {
        this.IdTipo = IdTipo;
        this.TipoEjercicio = TipoEjercicio;
    }
    
   
    
    public String getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(String IdTipo) {
        this.IdTipo = IdTipo;
    }

    public String getTipoEjercicio() {
        return TipoEjercicio;
    }

    public void setTipoEjercicio(String TipoEjercicio) {
        this.TipoEjercicio = TipoEjercicio;
    }

    @Override
    public String toString() {
        return TipoEjercicio;
    }

    
}
