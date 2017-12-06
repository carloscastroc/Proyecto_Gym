/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.pruebas;

import java.util.ArrayList;
import java.util.List;
import pe.gym.util.Herramientas;

/**
 *
 * @author Carlos
 */
public class PruebaFechasPago {

    public static void main(String[] args) {

        try {
            
            
            String fecha = "2017-12-01";
            int cuotas = 1;

            List lista = new ArrayList();

            lista = Herramientas.fechasdepago(fecha, cuotas);

            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Imprime: " + lista.get(i));

            }
            
            if (lista.isEmpty()) {
                System.out.println("Vacio");
            }
            
            System.out.println(lista.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
