
package hoyinterfaces;

public class Cuadrado implements Figura, Dibujar
{
   private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    
   
   
    @Override
    public double CalcularArea()
    {
        double resultado = lado * lado;
        
        return  resultado;
    }

    @Override
    public void Dibujable()
    {
        System.out.println("Hola estoy Dibujando un Retangulo!");
    }
    
}
