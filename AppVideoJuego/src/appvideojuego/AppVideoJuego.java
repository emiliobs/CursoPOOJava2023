
package appvideojuego;

import Logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;


public class AppVideoJuego
{

   
    public static void main(String[] args)
    {
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        
        VideoJuego videoJuego  = new VideoJuego(1234, "Najo Kazooie",
                      "Nitendo 64", 5, "Plataforma");
        VideoJuego videoJuego1 = new VideoJuego(1235, "Mario Party 5",
                       "Nitendo 64", 4, "Plataforma");
        VideoJuego videoJuego2 = new VideoJuego(1236, "Age of Empire II",
                       "PC", 1, "Estrategia");
        VideoJuego videoJuego3 = new VideoJuego(1237, "Counter Strike 1.6", 
                       "PC", 2, "Shooter");
        VideoJuego videoJuego4 = new VideoJuego(1238, "Mario Kart 64",
                       "Nitendo 64", 6, "Plataforma");
        
        
        listaVideoJuegos.add(videoJuego);
        listaVideoJuegos.add(videoJuego1);
        listaVideoJuegos.add(videoJuego2);
        listaVideoJuegos.add(videoJuego3);
        listaVideoJuegos.add(videoJuego4);
        
        System.out.println("Inicio del Programa!");
        System.out.println("");
        System.out.println("----------------------------- Mostrar Lista -----------------------------------");
       
        for (VideoJuego listaVideoJuego : listaVideoJuegos)
        {
             System.out.println("Titulo         : " + listaVideoJuego.getTitulo()  +
                                "Consola        : " + listaVideoJuego.getConsola() +
                                "# de Jugadores : " + listaVideoJuego.getCantidadJugadores());
        }
        
        System.out.println("");
        System.out.println("---------------------------- Mostrar y Cambios en la lista -------------------------------");
        
        videoJuego2.setTitulo("Age of Empire II V");
        videoJuego2.setCantidadJugadores(55);
        
        videoJuego4.setTitulo("Super Marioo Kart 65");
        videoJuego4.setCantidadJugadores(8);
        
              
        for (VideoJuego listaVideoJuego : listaVideoJuegos)
        {
           System.out.println("Titulo         : " + listaVideoJuego.getTitulo()  +
                              " Consola       : " + listaVideoJuego.getConsola() +
                              " # de Jugadores: " + listaVideoJuego.getCantidadJugadores());
        }
        
        System.out.println("");
        System.out.println("---------------------------- Mostrar Solo los datos de Nitendo 64 -------------------------------");
        
        for (VideoJuego listaVideoJuego : listaVideoJuegos)
        {
            if (listaVideoJuego.getConsola().equals("Nitendo 64"))
            {
//               System.out.println("Titulo         : " + listaVideoJuego.getTitulo()  +
//                                  " Consola       : " + listaVideoJuego.getConsola() +
//                                  " # de Jugadores: " + listaVideoJuego.getCantidadJugadores());
            
                System.out.println(listaVideoJuego.toString());
             
            }
         
        }
         

        
        System.out.println("");
        System.out.println("Fin del Programa!");
    }
    
}
