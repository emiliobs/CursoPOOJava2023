
package applinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppLinkedList
{


    public static void main(String[] args)
    {
        System.out.println("-----   LinkedList   ------");
        LinkedList<Persona> linkPersonas = new LinkedList<Persona>();
        
        
        //Agregar personas al final de la la listas
        linkPersonas.add(new Persona(2, "EMilio", 55));
        linkPersonas.add(new Persona(3, "Mariana Duke", 35));
        linkPersonas.add(new Persona(4, "HEctor Barrera", 45));
        linkPersonas.add(new Persona(5, "Carla linda", 25));
        linkPersonas.add(new Persona(6, "Lina", 75));
        
        //Agregar al principio
        linkPersonas.add(0, new Persona(98, "Al principio", 45));
        linkPersonas.add(new Persona(23, "Juana de Arco", 456));
        
        System.out.println("");
        for (Persona linkPersona : linkPersonas)
        {
            System.out.println("Datos en la BD Id: " +  linkPersona.getId()
                                        + "Nombre: " +  linkPersona.getNombre() 
                                        + " Edad : " +  linkPersona.getEdad());
        }
        
        
        System.out.println("");
        System.out.println("-----  ################################################  ------");
        System.out.println("");
        
        System.out.println("-----   ArrayList   ------");
       
        ArrayList<Persona> arrayList = new ArrayList<Persona>();
        
        arrayList.add(new Persona(1, "Minera", 23));
        arrayList.add(new Persona(2, "Buena", 23));
        arrayList.add(new Persona(3, "Mala", 23));
        arrayList.add(new Persona(4, "Adios", 23));
        arrayList.add(new Persona(5, "HLa", 23));
        
        for (Persona persona : arrayList)
        {
            System.out.println("DAtos en la BD Id: " + persona.getId() 
                                       + " Nombre: " + persona.getNombre() 
                                       + " Edad  : " + persona.getEdad());
        }
        
        
        
        System.out.println("");
        System.out.println("-----  Eliminacion de datosn en ArrayList y LinkedList  ------");
        System.out.println("");
        
        System.out.println("Remove in ArrayList");
        arrayList.remove(1);
        System.out.println("Registro Eliminado!");
        System.out.println("");
        
        System.out.println("Remove en LinkedList");
        //String nombreBOrrar = "Lina";
        
        for (Persona personas : linkPersonas)
        {
            if (personas.getNombre().equals("Lina"))
            {
                linkPersonas.remove(personas);                 
                 break;
            }
           
           
        }
        
        System.out.println("Dato Borrado!");

        
       
        System.out.println("");
        
        System.out.println("----------   Despues de Eliminar los datos ----------");
        System.out.println("");
        
        System.out.println("---------- ARRAYLIST ----------");
        for (Persona persona : arrayList)
        {
            System.out.println("Datos en la BD Id: " + persona.getId() 
                                       + " Nombre: " + persona.getNombre() 
                                       + " Edad  : " + persona.getEdad());
        }
        
        System.out.println("");
        
        System.out.println("---------- LINKEDLIST ----------");
         for (Persona persona : linkPersonas)
        {
            System.out.println("Datos en la BD Id: " +  persona.getId()
                                        + "Nombre: " +  persona.getNombre() 
                                        + " Edad : " +  persona.getEdad());
          
        }
         
         System.out.println("Dato Borrado!");
        System.out.println("");
        
        
        
        System.out.println("-------------------------  Que tamano tiene la Lista? ------------------------------");
        
        System.out.println("LinkedList: " + linkPersonas.size());
        System.out.println("ArrayList : " +  arrayList.size());
        System.out.println("");
       
        System.out.println("------------------------- Primero y Ultimo Onjeto (Solo para LinkedList) ------------------------------");
        System.out.println("Primero de LinkedList : " + linkPersonas.getFirst().toString());
        System.out.println("Ultimo de LinkedList: " + linkPersonas.getLast().toString());
        System.out.println("");
        
        System.out.println("------------------------- Borrando Listas ------------------------------");
        linkPersonas.clear();
        arrayList.clear();
        System.out.println("Listas Borradas con Exito!");
        System.out.println("");
        
        System.out.println("-------------------------  Comprobando si esta vacia alguna Lista? ------------------------------");
        System.out.println("ArrayList   : " + arrayList.isEmpty());
        System.out.println("LinkedList: " + linkPersonas.isEmpty());
        System.out.println("");
        
        System.out.println("-------------------------  MOstrando datos actializados de ArrayList y LinkedList ------------------------------");


        System.out.println("");
        System.out.println("-----   LinkedList   ------");
        for (Persona linkPersona : linkPersonas)
        {
            System.out.println("Datos en la BD Id: " +  linkPersona.getId()
                                        + "Nombre: " +  linkPersona.getNombre() 
                                        + " Edad : " +  linkPersona.getEdad());
        }
        
        
        System.out.println("");
        System.out.println("-----  ################################################  ------");
        System.out.println("");
        
        System.out.println("-----   ArrayList   ------");
       
               
        for (Persona persona : arrayList)
        {
            System.out.println("DAtos en la BD Id: " + persona.getId() 
                                       + " Nombre: " + persona.getNombre() 
                                       + " Edad  : " + persona.getEdad());
        }
        
        
        System.out.println("Fin del Programa!");

        
    }
    
}
