/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.model;

/**
 *
 * @author Alumno
 */
public class Planes {
    
    private String IdPlan;
    private String IdEmpleado;
    private String NombrePlan;
    private int NroMeses;
    private double importe;
    private String estado;
    
    public Planes(){
        
    }

    public String getIdPlan() {
        return IdPlan;
    }

    public void setIdPlan(String IdPlan) {
        this.IdPlan = IdPlan;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombrePlan() {
        return NombrePlan;
    }

    public void setNombrePlan(String NombrePlan) {
        this.NombrePlan = NombrePlan;
    }

    public int getNroMeses() {
        return NroMeses;
    }

    public void setNroMeses(int NroMeses) {
        this.NroMeses = NroMeses;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
