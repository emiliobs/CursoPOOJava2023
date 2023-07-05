package apppilas;

import java.util.Stack;

public class AppPIlas
{

    public static void main(String[] args)
    {
      Stack<Integer> pila = new Stack<>();
      
        System.out.println("Lista Pila Vacíá: " + pila);
        System.out.println("Está vacíá?       " + pila.empty());
        System.out.println("");
        //Agregar:
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //REcorrer la pila:
        for (Integer pilita : pila)
        {
            System.out.println("Datos de la PIla: " + pilita);
        }
        
        //MOstrar
        System.out.println("");        
         System.out.println("Lista PIla Vacíá: " + pila);
        System.out.println("Está vacíá?       " + pila.empty());
        System.out.println("");
        
        System.out.println("Eliminar ultimo registro que entro");
        pila.pop();
        System.out.println("");
        
        System.out.println("BUscar un registron en la PILA");
        System.out.println("Esta el 3? " + pila.search(3));
        System.out.println("");
        
        System.out.println("ULtimo Agregado en la Pila");
        System.out.println("Ultimo Agregado: " + pila.peek());
        System.out.println("");
        
         System.out.println("Lista Pila Vacíá: " + pila);
        System.out.println("Está vacíá?        " + pila.empty());
        System.out.println("");
        
    }
    
}
