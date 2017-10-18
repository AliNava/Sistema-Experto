/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) 
    {
            Scanner leer = new Scanner(System.in);//instancia run objeto de la clase escaner 
            ArrayList<Integer> borrar = new ArrayList<Integer>();
            ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>()
            {{
        
            add(new Vehiculo("Sedan",4,new int[]{2,4}, false,true,4));
            add(new Vehiculo("Van",4,new int[]{4}, false,true,6));
            add(new Vehiculo("PickUp",4,new int[]{4,2},true,true,4));
            add(new Vehiculo("Bicicleta",2,new int[]{0},false,false,1));
            add(new Vehiculo("Helicoptero",0,new int[]{2},false,true,4));
            add(new Vehiculo("Avion",3,new int[]{6,8},false,true,100));
            add(new Vehiculo("Torton",4,new int[]{2},true,true,2));
            add(new Vehiculo("Trailer",6,new int[]{2},true,true,2));        
            add(new Vehiculo("Moto",2,new int[]{0},false,true,1));
       }};//crear un arraylist que contiene objetos tipo vehiculo
        //inicio de las puertas que tiene el vehiculo
        System.out.print("Seleccione el motor de interferencia: \n"+ 
                "1.- Encadenamiento hacia atras \n" + 
                "2.- Encadenamiento hacia adelante   $:");
        int opcion=leer.nextInt();
        switch(opcion)
        {
            case 2:
                 System.out.print("El vehiculo tiene motor? (si/no): ");
                borrar = new ArrayList<Integer>();
                boolean motor = leer.next().equals("si");
                vehiculos = preguntaMotor(vehiculos,motor);
                if(verificarCantidad(vehiculos))
                {
                    System.out.print("Cuantas puertas tiene? (0,2,4,6,8): ");
                    int numPuertas = leer.nextInt();
                    vehiculos=preguntaPuertas(vehiculos,numPuertas);
                    if(verificarCantidad(vehiculos))
                    {    
                        switch(numPuertas)
                        {
                            case 2:
                                System.out.print("Cuantas llantas tiene? (0,4,6):");
                            break;
                            case 4:
                                System.out.print("Cuantas llantas tiene? (4,6): ");
                            break;
                        }

                        int numllantas = leer.nextInt();
                        vehiculos = preguntaLlantas(vehiculos,numllantas);
                        if(verificarCantidad(vehiculos))
                        {
                            System.out.print("El vehiculo tiene cajones? (si/no): ");
                            boolean cajones  = leer.next().equals("si");
                            vehiculos = preguntaCajones(vehiculos,cajones);
                            if(verificarCantidad(vehiculos))
                            {
                                if(cajones)
                                {
                                    System.out.print("Capacidad de pasajeros (2,4): ");
                                }else
                                {
                                    System.out.print("Capacidad de pasajeros (4,6): ");
                                }
                                int numPasajeros= leer.nextInt();
                                vehiculos= preguntaPasajeros(vehiculos,numPasajeros);
                                verificarCantidad(vehiculos);
                            }
                        }
                    }
                }
            break;
            
            case 1:
                System.out.println("");
                int contador=0;
                for(Vehiculo vehiculo : vehiculos)
                {
                    System.out.println(contador+": "+vehiculo.nombre);
                    contador++;
                }
                System.out.print("Selecciona un vehiculo $:");
                int itemSeleccionado = leer.nextInt();
                Vehiculo vehiculoSeleccionado = vehiculos.get(itemSeleccionado);
                System.out.println(vehiculoSeleccionado.nombre);
                for(Vehiculo vehiculo : vehiculos)
                {
                    if(vehiculo.motor != vehiculoSeleccionado.motor)
                    {
                        borrar.add(vehiculos.indexOf(vehiculo));
                    }
                }
                
                for(int i =borrar.size()-1;i>=0;i--)
                {
                    vehiculos.remove(vehiculos.get(borrar.get(i)));
                }
                System.out.println("Motor("+vehiculoSeleccionado.motor+") ");
                for(Vehiculo vehiculo : vehiculos){System.out.print(vehiculo.nombre+",");}
                System.out.println("");
                if (vehiculos.size()<=1) { System.exit(0);}
                
                borrar = new ArrayList<Integer>();
                for(Vehiculo vehiculo : vehiculos)
                {   int cont=0;
                    for(int i=0;i<vehiculoSeleccionado.numPuertas.length;i++)
                    {
                        for (int j = 0;j<vehiculo.numPuertas.length; j++) {
                            if(vehiculo.numPuertas[j] == vehiculoSeleccionado.numPuertas[i])
                            {
                                cont++;
                            }
                        }
                    }
                    if (cont==0) {
                        borrar.add(vehiculos.indexOf(vehiculo));
                    } 
                }
                
                for(int i =borrar.size()-1;i>=0;i--)
                {
                    vehiculos.remove(vehiculos.get(borrar.get(i)));
                }
                System.out.println("\nPuertas ("+Arrays.toString(vehiculoSeleccionado.numPuertas)+") ");
                for(Vehiculo vehiculo : vehiculos){System.out.print(vehiculo.nombre+",");}
                System.out.println("");
                if (vehiculos.size()<=1) { System.exit(0);}
                
                borrar = new ArrayList<Integer>();
                for(Vehiculo vehiculo : vehiculos)
                {   
                        if(vehiculo.numllantas != vehiculoSeleccionado.numllantas)
                        {
                           borrar.add(vehiculos.indexOf(vehiculo));
                        }
                }
                
                for(int i =borrar.size()-1;i>=0;i--)
                {
                    vehiculos.remove(vehiculos.get(borrar.get(i)));
                }
                System.out.println("\nLlantas ("+vehiculoSeleccionado.numllantas+") ");
                for(Vehiculo vehiculo : vehiculos){System.out.print(vehiculo.nombre+",");}
                System.out.println("");
                if (vehiculos.size()<=1) { System.exit(0);}
                
                borrar = new ArrayList<Integer>();
                for(Vehiculo vehiculo : vehiculos)
                {   
                        if(vehiculo.cajon != vehiculoSeleccionado.cajon)
                        {
                           borrar.add(vehiculos.indexOf(vehiculo));
                        }
                }
                
                for(int i =borrar.size()-1;i>=0;i--)
                {
                    vehiculos.remove(vehiculos.get(borrar.get(i)));
                }
                System.out.println("\nCajon ("+vehiculoSeleccionado.cajon+") ");
                for(Vehiculo vehiculo : vehiculos){System.out.print(vehiculo.nombre+",");}
                System.out.println("");
                if (vehiculos.size()<=1) { System.exit(0);}
                
                
                borrar = new ArrayList<Integer>();
                for(Vehiculo vehiculo : vehiculos)
                {   
                        if(vehiculo.numPasajeros != vehiculoSeleccionado.numPasajeros)
                        {
                           borrar.add(vehiculos.indexOf(vehiculo));
                        }
                }
                
                for(int i =borrar.size()-1;i>=0;i--)
                {
                    vehiculos.remove(vehiculos.get(borrar.get(i)));
                }
                System.out.println("\nPasajeros ("+vehiculoSeleccionado.numPasajeros+") ");
                for(Vehiculo vehiculo : vehiculos){System.out.print(vehiculo.nombre+",");}
                System.out.println("");
                if (vehiculos.size()<=1) { System.exit(0);}
            break;
                
            default:
                main(new String[]{});
            break;
        }
        
       
     
    }
    
    static public ArrayList<Vehiculo> preguntaMotor(ArrayList<Vehiculo> vehiculos,boolean motor)
    {
        ArrayList<Integer> borrar = new ArrayList<Integer>();
        for(Vehiculo vehiculo : vehiculos)
        {
            if(vehiculo.motor != motor)
            {
                borrar.add(vehiculos.indexOf(vehiculo));
            }
        }
        
        for(int i =borrar.size()-1;i>=0;i--)
        {
            vehiculos.remove(vehiculos.get(borrar.get(i)));
        }
        return vehiculos;
    }
    
    static public ArrayList<Vehiculo> preguntaPuertas(ArrayList<Vehiculo> vehiculos,int numPuertas)
    {
        ArrayList<Integer> borrar = new ArrayList<Integer>();
        for(Vehiculo vehiculo : vehiculos)
        {   
            int cont=0;
            for (int j = 0;j<vehiculo.numPuertas.length; j++) 
            {

                if(vehiculo.numPuertas[j] == numPuertas)
                {
                    cont++;
                }
            }

            if (cont==0) 
            {

                borrar.add(vehiculos.indexOf(vehiculo));
            } 
        }
        
        for(int i =borrar.size()-1;i>=0;i--)
        {
            vehiculos.remove(vehiculos.get(borrar.get(i)));
        }
        return vehiculos;
    }
    
    static public ArrayList<Vehiculo> preguntaLlantas(ArrayList<Vehiculo> vehiculos,int numllantas)
    {
        ArrayList<Integer> borrar = new ArrayList<Integer>();
        for(Vehiculo vehiculo : vehiculos)
        {   
            if(vehiculo.numllantas != numllantas)
            {
               borrar.add(vehiculos.indexOf(vehiculo));
            }
        }
        
        for(int i =borrar.size()-1;i>=0;i--)
        {
            vehiculos.remove(vehiculos.get(borrar.get(i)));
        }
        return vehiculos;
    }
    
    static public ArrayList<Vehiculo> preguntaCajones(ArrayList<Vehiculo> vehiculos,boolean cajones)
    {
        ArrayList<Integer> borrar = new ArrayList<Integer>();
        
        
        for(Vehiculo vehiculo : vehiculos)
        {   
            if(vehiculo.cajon != cajones)
            {
               borrar.add(vehiculos.indexOf(vehiculo));
            }
        }
        
        for(int i =borrar.size()-1;i>=0;i--)
        {
            vehiculos.remove(vehiculos.get(borrar.get(i)));
        }
        return vehiculos;
    }
    
    static public ArrayList<Vehiculo> preguntaPasajeros(ArrayList<Vehiculo> vehiculos,int numPasajeros)
    {
        ArrayList<Integer> borrar = new ArrayList<Integer>();
        for(Vehiculo vehiculo : vehiculos)
        {   
            if(vehiculo.numPasajeros != numPasajeros)
            {
               borrar.add(vehiculos.indexOf(vehiculo));
            }
        }
        
        for(int i =borrar.size()-1;i>=0;i--)
        {
            vehiculos.remove(vehiculos.get(borrar.get(i)));
        }
        return vehiculos;
    }
    
    static public boolean verificarCantidad(ArrayList<Vehiculo> vehiculos)
    {
        if(vehiculos.size()==1)
        {
            System.out.println(vehiculos.get(0));
            System.exit(0);
            //return false;
        }
        return true;
    }
}      

    
