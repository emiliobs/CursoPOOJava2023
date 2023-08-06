package plantasapp;

import Plantas.Arbol;
import Plantas.Arbusto;
import Plantas.Flor;

public class PLantasApp
{

    public static void main(String[] args)
    {
        System.out.println("Inicio Programa");
        System.out.println("");
        //Objectode  las clases hijas:
        Arbol arbol = new Arbol();
        Flor flor = new Flor();
        Arbusto arbusto = new Arbusto();
        
        // LLamar al metodo comun para mOstrar por pantalla el resutado
        System.out.println("=====  Mosta datos por Pantalla  =====");
        System.out.println("");
        arbol.DecirLoQueSoy();
        System.out.println("");
        flor.DecirLoQueSoy();
        System.out.println("");
        arbusto.DecirLoQueSoy();
        System.out.println("");
        System.out.println("Fin del Programa");
    }

}
