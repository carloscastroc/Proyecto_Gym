/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.model;

/**
 *
 * @author Carlos
 */
public class Cargo {
    
    private String IdCargo;
    private String Descripcion;
    
    public Cargo(){
        
    }

    public Cargo(String IdCargo, String Descripcion) {
        this.IdCargo = IdCargo;
        this.Descripcion = Descripcion;
    }
    
    

    public String getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(String IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    @Override
    public String toString() {
        return Descripcion;
    }
    
}
