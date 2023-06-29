package hoyinterfaces;


public class Circulo implements  Figura, Rotable, Dibujar
{
    private  double radio;

    public Circulo()
    {
    }

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    
    
    @Override
    public double CalcularArea()
    {
        double pi = 3.14;
        
        double resultado = pi * radio * radio;
        
        return  resultado;
    }

    @Override
    public void Rotable()
    {
        System.out.println("Holla estoy dibujando un Circulo");
    }

    @Override
    public void Dibujable()
    {
        System.out.println("Hola estoy rontando como un Circulo");
    }
    
}
