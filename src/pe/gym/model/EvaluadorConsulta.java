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

public class EvaluadorConsulta {
    private String IdSocio;
    private String IdPlanEntrenamiento;
    private String IdMembresia;
    private String DNI;
    private String Nombre;
    private String Apellido;
    
    
    public EvaluadorConsulta(){
    }

    public String getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(String IdSocio) {
        this.IdSocio = IdSocio;
    }

    public String getIdPlanEntrenamiento() {
        return IdPlanEntrenamiento;
    }

    public void setIdPlanEntrenamiento(String IdPlanEntrenamiento) {
        this.IdPlanEntrenamiento = IdPlanEntrenamiento;
    }

    public String getIdMembresia() {
        return IdMembresia;
    }

    public void setIdMembresia(String IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
} 