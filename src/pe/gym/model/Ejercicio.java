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
public class Ejercicio {
    
    private String IdPlanE;
    private String IdTipo;
    private String Ejercicio;
    
    public Ejercicio(){
    }

    public Ejercicio(String IdPlanE, String IdTipo, String Ejercicio) {
        this.IdPlanE = IdPlanE;
        this.IdTipo = IdTipo;
        this.Ejercicio = Ejercicio;
    }

    public String getIdPlanE() {
        return IdPlanE;
    }

    public void setIdPlanE(String IdPlanE) {
        this.IdPlanE = IdPlanE;
    }

    public String getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(String IdTipo) {
        this.IdTipo = IdTipo;
    }

    public String getEjercicio() {
        return Ejercicio;
    }

    public void setEjercicio(String Ejercicio) {
        this.Ejercicio = Ejercicio;
    }

    @Override
    public String toString() {
        return Ejercicio;
    }
    
    
}
