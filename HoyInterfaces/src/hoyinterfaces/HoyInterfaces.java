
package hoyinterfaces;

public class HoyInterfaces
{

     public static void main(String[] args)
    {
        Cuadrado cuadrado = new Cuadrado(20);
        Circulo circulo = new Circulo(55);
        
        System.out.println("Rectangulo");
        System.out.println("");
        System.out.println("El Área del un Rectangulo es " + cuadrado.CalcularArea());
        cuadrado.Dibujable();
        System.out.println("");
        
        System.out.println("Circulo");
        System.out.println("");
        System.out.println("El Área del Circulo es: " + circulo.CalcularArea());
        circulo.Dibujable();
        circulo.Rotable();
        System.out.println("");
        
                
    }
    
}
