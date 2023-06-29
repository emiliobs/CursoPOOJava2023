package Clases;


public class ClaseHIjaConsulta extends ClasePadreAbstracta
{

    @Override
    public void Transacciones()
    {
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println(  "Tu Saldo actual es: " + getSaldo());
        System.out.println("------------------------------------------");
        System.out.println("");
    }
    
}
