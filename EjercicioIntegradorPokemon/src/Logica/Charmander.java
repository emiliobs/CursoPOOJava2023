
package Logica;

import Interfaz.IFuego;

public class Charmander extends Pokemon implements IFuego
{

    public Charmander()
    {
    }
    

    @Override
    protected void AtacaPlacaje()
    {
        System.out.println("Hola soy Charmander y este es mi ataque plcaje.");
    }

    @Override
    protected void AtacaAranazo()
    {
      System.out.println("Hola soy Charmander y este es mi ataque aranazo.");

    }

    @Override
    protected void AtacaMordisco()
    {
      System.out.println("Hola soy Charmander y este es mi ataque mordisco.");

    }

    @Override
    public void AtacarPunioFuego()
    {
        System.out.println("Hola soy Charmander y este es mi ataque puno fuego.");
    }

    @Override
    public void AtacarLanzaLlamas()
    {
        System.out.println("Hola soy Charmander y este es mi ataque lanza llamas.");
    }

    @Override
    public void AtacaAscuas()
    {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas.");
    }
    
}
