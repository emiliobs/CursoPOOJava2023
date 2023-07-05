
package appexcepciones;


public class AppExcepciones
{

   
    public static void main(String[] args)
    {
        int edades [] = {15, 23, 23, 45};
        
        try
        {
                     
             System.out.println("La edades de la posicion 5 es: " + edades[5]);
        }
        catch (Exception e)
        {
            System.out.println("ERROR del Vector es: " + e);
        }
        
    }
      
    
}
