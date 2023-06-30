package Logica;

import Interfaz.IAgua;


public class Squirtle extends Pokemon implements IAgua
{

    public Squirtle()
    {
    }
    

    @Override
    protected void AtacaPlacaje()
    {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje.");
    }

    @Override
    protected void AtacaAranazo()
    {
        System.out.println("Hola soy Squirtle y este es mi ataque aranzo.");
    }

    @Override
    protected void AtacaMordisco()
    {
         System.out.println("Hola soy Squirtle y este es mi ataque mordisco.");
    }

    @Override
    public void AtacarHidroBomba()
    {
        System.out.println("Hola soy Squirtle y este es mi ataque hidro bonba");
    }

    @Override
    public void AtacarBurbuja()
    {
      System.out.println("Hola soy Squirtle y este es mi ataque burbuja.");
    }

    @Override
    public void AtacarPistolaAgua()
    {
       System.out.println("Hola soy Squirtle y este es mi ataque pistola agua.");
    }
    
}
