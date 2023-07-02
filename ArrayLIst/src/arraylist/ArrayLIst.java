package arraylist;

import java.util.ArrayList;
import java.util.List;


public class ArrayLIst
{

    
    public static void main(String[] args)
    {
       
        List<Persona> listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona(5555, "Emilio", 45));
        listaPersona.add(new Persona(23, "Lina", 23));
        listaPersona.add(new Persona(56, "Blanca", 34));
        listaPersona.add(new Persona(11111, "Mona", 98));
        listaPersona.add(new Persona(23222, "Hector", 34));
         System.out.println("");
         System.out.println("With for and index");
        for (int i = 0; i < listaPersona.size(); i++)
        {
            System.out.println("Persona en BD con Id: " + listaPersona.get(i).getNumero() 
                                                        + " Nombre: " + listaPersona.get(i).getNombre() 
                                                        + " Edad  : " + listaPersona.get(i).getEdad());
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("With Foreach");

        for (Persona persona : listaPersona)
        {
            System.out.println("Datos en la BD Id : " + persona.getNumero() + " Nombre: " 
                                                      + persona.getNombre() + " Edad   : " 
                                                      + persona.getEdad());
        }
        
    }

      
}
