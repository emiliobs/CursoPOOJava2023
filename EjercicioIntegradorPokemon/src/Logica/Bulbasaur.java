package Logica;

import Interfaz.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta
{

    public Bulbasaur()
    {
    }
    

    @Override
    protected void AtacaPlacaje()
    {
        System.out.println("Hola soy Bulbasaur y este es un ataque placaje.");
    }

    @Override
    protected void AtacaAranazo()
    {
        System.out.println("Hola soy Bulbasaur y este es mi ataque aranazo.");
    }

    @Override
    protected void AtacaMordisco()
    {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco.");
    }

    @Override
    public void AtacarDrenaje()
    {
        System.out.println("Hola soy Bulbasour y este es mi ataque drenaje. ");
    }

    @Override
    public void AtacarParalizar()
    {
      System.out.println("Hola soy Bulbasour y este es mi ataque paralizar. ");
    }
    
}
