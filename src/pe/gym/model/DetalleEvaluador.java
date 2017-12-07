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
public class DetalleEvaluador {

    private String IdPlanEntrenamiento;
    private String Ejercicio;
    private Integer N_Maquina;
    private Integer Serie;
    private Integer Repeticiones;

    public DetalleEvaluador() {
    }

    public String getIdPlanEntrenamiento() {
        return IdPlanEntrenamiento;
    }

    public void setIdPlanEntrenamiento(String IdPlanEntrenamiento) {
        this.IdPlanEntrenamiento = IdPlanEntrenamiento;
    }

    public String getEjercicio() {
        return Ejercicio;
    }

    public void setEjercicio(String Ejercicio) {
        this.Ejercicio = Ejercicio;
    }

    public Integer getN_Maquina() {
        return N_Maquina;
    }

    public void setN_Maquina(Integer N_Maquina) {
        this.N_Maquina = N_Maquina;
    }

    public Integer getSerie() {
        return Serie;
    }

    public void setSerie(Integer Serie) {
        this.Serie = Serie;
    }

    public Integer getRepeticiones() {
        return Repeticiones;
    }

    public void setRepeticiones(Integer Repeticiones) {
        this.Repeticiones = Repeticiones;
    }

}
