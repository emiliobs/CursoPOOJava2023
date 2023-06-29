
package cajeroautomatico;

import Clases.ClaseHIjaConsulta;
import Clases.ClasePadreAbstracta;


public class CajeroAutomatico
{

    public static void main(String[] args)
    {
        System.out.println("Incio del Programa");
       ClasePadreAbstracta clasePadreAbstracta = new ClaseHIjaConsulta();
       clasePadreAbstracta.setSaldo(555);
       clasePadreAbstracta.Operaciones();
        System.out.println("Fin del Programa");
    }
    
}
