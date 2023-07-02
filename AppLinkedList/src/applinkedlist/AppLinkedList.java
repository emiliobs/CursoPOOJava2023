
package applinkedlist;

import java.util.LinkedList;

public class AppLinkedList
{


    public static void main(String[] args)
    {
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
                                                     + " Nombre: " + linkPersona.getNombre() 
                                                     + " Edad  : " + linkPersona.getEdad());
        }
    }
    
}
