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
public class DetPagos {
    
    private String IdPago;
    private String IdEmpleado;
    private int NroCuota;
    private double Importe;
    private String F_UPago;
    private String Estado;
    
    public DetPagos(){
        
    }

    public String getIdPago() {
        return IdPago;
    }

    public void setIdPago(String IdPago) {
        this.IdPago = IdPago;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public int getNroCuota() {
        return NroCuota;
    }

    public void setNroCuota(int NroCuota) {
        this.NroCuota = NroCuota;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public String getF_UPago() {
        return F_UPago;
    }

    public void setF_UPago(String F_UPago) {
        this.F_UPago = F_UPago;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
