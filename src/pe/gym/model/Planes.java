/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.model;

import java.util.Objects;

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

    public Planes(String IdPlan, String IdEmpleado, String NombrePlan, int NroMeses, double importe, String estado) {
        this.IdPlan = IdPlan;
        this.IdEmpleado = IdEmpleado;
        this.NombrePlan = NombrePlan;
        this.NroMeses = NroMeses;
        this.importe = importe;
        this.estado = estado;
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
    
        @Override
    public String toString() {
        return NombrePlan;
    }
    
//    @Override
//    public boolean equals(Object otro){
//        return (this.IdPlan == null ? ((Planes) otro).IdPlan == null : this.IdPlan.equals(((Planes) otro).IdPlan));
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 37 * hash + Objects.hashCode(this.IdPlan);
//        hash = 37 * hash + Objects.hashCode(this.IdEmpleado);
//        hash = 37 * hash + Objects.hashCode(this.NombrePlan);
//        hash = 37 * hash + this.NroMeses;
//        hash = 37 * hash + (int) (Double.doubleToLongBits(this.importe) ^ (Double.doubleToLongBits(this.importe) >>> 32));
//        hash = 37 * hash + Objects.hashCode(this.estado);
//        return hash;
//    }
    
    
}
