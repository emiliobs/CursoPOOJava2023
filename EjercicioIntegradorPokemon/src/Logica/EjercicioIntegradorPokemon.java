
package Logica;


public class EjercicioIntegradorPokemon
{

    
    public static void main(String[] args)
    {
        System.out.println("Inicio del Programa");
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        
        squirtle.AtacaAranazo();
        squirtle.AtacarHidroBomba();
        
        charmander.AtacaAranazo();
        charmander.AtacarLanzaLlamas();
        
        bulbasaur.AtacaAranazo();
        bulbasaur.AtacarDrenaje();
        
        pikachu.AtacaAranazo();
        pikachu.AtacarImpacTrueno();
        
        System.out.println("Fin del Programa");
        
        
    }
    
}
