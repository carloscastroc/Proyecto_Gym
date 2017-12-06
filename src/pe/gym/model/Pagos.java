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
public class Pagos {

    private String IdPago;
    private String IdMembresia;
    private String IdSocio;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Tipo_de_Pago;
    private double IGV;
    private double Subtotal;
    private double Total;
    private int NroCuotas;
    private String Estado;

    public Pagos() {

    }

    public String getIdPago() {
        return IdPago;
    }

    public void setIdPago(String IdPago) {
        this.IdPago = IdPago;
    }

    public String getIdMembresia() {
        return IdMembresia;
    }

    public void setIdMembresia(String IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    public String getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(String IdSocio) {
        this.IdSocio = IdSocio;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTipo_de_Pago() {
        return Tipo_de_Pago;
    }

    public void setTipo_de_Pago(String Tipo_de_Pago) {
        this.Tipo_de_Pago = Tipo_de_Pago;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getNroCuotas() {
        return NroCuotas;
    }

    public void setNroCuotas(int NroCuotas) {
        this.NroCuotas = NroCuotas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
