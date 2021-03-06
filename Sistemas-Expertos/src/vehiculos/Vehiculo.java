/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.Arrays;

/**
 *
 * @author ali
 */
public class Vehiculo {
    String nombre;
    int numllantas;
    int numPuertas[];
    boolean cajon;
    boolean motor;
    int numPasajeros;

    public Vehiculo(String nombre, int numllantas, int[] numPuertas, boolean cajon, boolean motor, int numPasajeros) {
        this.nombre = nombre;
        this.numllantas = numllantas;
        this.numPuertas = numPuertas;
        this.cajon = cajon;
        this.motor = motor;
        this.numPasajeros = numPasajeros;
    }
    
    
    public String toHtml()
    {
        return "<html><b>Nombre del Vehiculo:</b> " + this.nombre + "<br>" +
                "<b>Numero de llantas:</b> " + this.numllantas + "<br>" +
                "<b>Numero de puertas:</b> " + Arrays.toString(this.numPuertas)+ "<br>" +  
                "<b>Tiene cajon:</b> " + this.cajon + "<br>" + 
                "<b>Tiene motor:</b> " + this.motor + "<br>" +
                "<b>Capacidad de pasajeros:</b> " + this.numPasajeros + "<html>";
               
    }
    
    public String toString()
    {
        return "Nombre del Vehiculo:" + this.nombre + "\n" +
                "Numero de llantas:" + this.numllantas + "\n" +
                "Numero de puertas:" + Arrays.toString(this.numPuertas)+ "\n" +  
                "Tiene cajon:" + this.cajon + "\n" + 
                "Tiene motor:" + this.motor + "\n" +
                "Capacidad de pasajeros:" + this.numPasajeros + "\n \n";
               
    }
}