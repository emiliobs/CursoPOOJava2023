
package Logica;

import Interfaz.IElectrico;


public class Pikachu extends Pokemon implements IElectrico
{

    public Pikachu()
    {
    }
    

    @Override
    protected void AtacaPlacaje()
    {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje.");
    }

    @Override
    protected void AtacaAranazo()
    {
       System.out.println("Hola soy Pikachu y este es mi ataque aranazo.");

    }

    @Override
    protected void AtacaMordisco()
    {
       System.out.println("Hola soy Pikachu y este es mi ataque mordisco.");
    }

    @Override
    public void AtacarImpacTrueno()
    {
       System.out.println("Hola soy Pikachu y este es mi ataque impact trueno.");
    }

    @Override
    public void AtacaPunioTrueno()
    {
      System.out.println("Hola soy Pikachu y este es mi ataque impact punio trueno.");
    }
    
}
