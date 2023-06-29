package Clases;

public class ClaseHijaDeposito extends ClasePadreAbstracta
{

    @Override
    public void Transacciones()
    {
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.print("Cuando deseas Depositar: ");
            Deposito();
            System.out.println("------------------------------------------");
            
            transacciones = getSaldo();
            setSaldo(transacciones + deposito);
            
            System.out.println("------------------------------------------");
            System.out.println("Deposistaste      : " + deposito);
            System.out.println("Ti Saldo actual es: " + getSaldo());
            System.out.println("------------------------------------------");
            System.out.println("");
    }
    
}
