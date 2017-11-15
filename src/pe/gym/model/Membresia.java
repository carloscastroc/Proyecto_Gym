/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.model;

import java.sql.Date;

/**
 *
 * @author Carlos
 */
public class Membresia {
    
    private String IdSocio;
    private String IdPlan;
    private String IdPago;
    private String F_Inicio;
    private String F_Fin;
    private String Estado;
    
    public Membresia(){
        
    }

    public String getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(String IdSocio) {
        this.IdSocio = IdSocio;
    }

    public String getIdPlan() {
        return IdPlan;
    }

    public void setIdPlan(String IdPlan) {
        this.IdPlan = IdPlan;
    }

    public String getIdPago() {
        return IdPago;
    }

    public void setIdPago(String IdPago) {
        this.IdPago = IdPago;
    }

    public String getF_Inicio() {
        return F_Inicio;
    }

    public void setF_Inicio(String F_Inicio) {
        this.F_Inicio = F_Inicio;
    }

    public String getF_Fin() {
        return F_Fin;
    }

    public void setF_Fin(String F_Fin) {
        this.F_Fin = F_Fin;
    }



    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
