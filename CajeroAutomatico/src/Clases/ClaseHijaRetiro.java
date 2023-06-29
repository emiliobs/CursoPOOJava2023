package Clases;

public class ClaseHijaRetiro extends ClasePadreAbstracta
{

    @Override
    public void Transacciones()
    {
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.print("Cuando deseas Retirar: ");
        Retiro();
        System.out.println("------------------------------------------");
        
        if (retiro <= getSaldo())
        {
          transacciones = getSaldo();
          setSaldo(transacciones - retiro);
          
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("Retiraste         : " + retiro);
            System.out.println("Ti Saldo actual es: " + getSaldo());
            System.out.println("------------------------------------------");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("Sorry!, Saldo Insuficiente :( ");
            System.out.println("------------------------------------------");
            System.out.println("");
        }
      
       
    }
    
}
