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
public class Promociones {
     private String IdPromociones ;
     private String IdEmpleado ;
     private String NombrePromocion ;
     private double Importe ;
     private String Descripcion ;
     
      public Promociones(){
      }

    public Promociones(String IdPromociones, String IdEmpleado, String NombrePromocion, double Importe, String Descripcion) {
        this.IdPromociones = IdPromociones;
        this.IdEmpleado = IdEmpleado;
        this.NombrePromocion = NombrePromocion;
        this.Importe = Importe;
        this.Descripcion = Descripcion;
    }

      
      
    public String getIdPromociones() {
        return IdPromociones;
    }

    public void setIdPromociones(String IdPromociones) {
        this.IdPromociones = IdPromociones;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombrePromocion() {
        return NombrePromocion;
    }

    public void setNombrePromocion(String NombrePromocion) {
        this.NombrePromocion = NombrePromocion;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
     
      
          @Override
    public String toString() {
        return NombrePromocion;
    }
      
     }
