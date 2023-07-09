
package apprelaciones;

import java.util.ArrayList;
import java.util.List;


public class AppRelaciones
{

   
    public static void main(String[] args)
    {
      Auto auto = new Auto();
      auto.setId(55l);
      auto.setMarca("Mercedes Bends");
      auto.setModelo("AMG 2023");
      
      List<Propietario> listaPropietario = new ArrayList<Propietario>();
      
      Propietario propietario = new Propietario();
      Propietario propietario1 = new Propietario();
      Propietario propietario2 = new Propietario();
      
      propietario.setId(23l);
      propietario.setNombre("Emilio");
      propietario.setApellido("Barrera");
      
      propietario1.setId(28l);
      propietario1.setNombre("Camila");
      propietario1.setApellido("Linda");
     
      propietario2.setId(55l);
      propietario2.setNombre("BLanca");
      propietario2.setApellido("Urrego");
      
      listaPropietario.add(propietario);
      listaPropietario.add(propietario1);
      listaPropietario.add(propietario2);
      
      auto.setListaPropietario(listaPropietario);
      
        System.out.println("---------------------------------- Mstrar Datos de la Relacion de 1 A  N -------------------------");
        System.out.println("El Auto: " + auto.getMarca() + " " + auto.getModelo() + " Tiene como Propietarios: " + auto.getListaPropietario().toString() );
      
      
    }
    
}
