package poo;

import Logica.Jefe;
import Logica.Alumno;
import Logica.Consultor;
import Logica.Empleado;
import Logica.Persona;

public class POO
{

    public static void main(String[] args)
    {
        
           Persona vectorPersona[] = new Persona[5];
           
           vectorPersona[0] = new Persona();
           vectorPersona[1] = new Empleado();
           vectorPersona[2] = new Consultor();
           vectorPersona[3] = new Jefe();
           
           
           Persona persona = new Persona();
           Consultor consultor = new Consultor();
           
           persona = consultor;
           
            //No puede, por que nu funciona el polimorfismo devido a que siempre es de padres a hijos o de super clase a subclases
           //consultor = persona;
           
           
//         Empleado empleado = new Empleado();
//         empleado.getNumeroLegajo();
//         empleado.getNombre();
//         empleado.getApellidos();
//         
//         Consultor consultor = new Consultor();
//         consultor.getNombreConsultor();
//         consultor.getNumeroConsultor();
//         consultor.getDomicilio();
        
//        Alumno alumno = new Alumno();
//        Alumno alumno1 = new Alumno(55555, "Emilio", "Barrera");
//        
//        System.out.println("Los datos del alumnos con DNI: " + alumno1.getId() +" son : " + alumno1.getApellido() + " " + alumno1.getApellido());
//    
//        System.out.println("Nuevos datos del Alumno");
//        
//        alumno1.setId(123445);
//        alumno1.setNombre("Camilo");
//        alumno1.setApellido("Lucakas Idalgo");
//        
//        System.out.println("-----------------------------------------------");
//        System.out.println("Los nuevos datos son Id: " + alumno1.getId() + " Nombre: " + alumno1.getNombre() + " Apellidos" + alumno1.getApellido());
//        
//        System.out.println("-----------------------------------");
//        alumno.setId(98765);
//        alumno.setNombre("Mary");
//        alumno.setApellido("Loca  Linda");
//        System.out.println("Los datos son :" + alumno.getId() + " " + alumno.getNombre() + " " +alumno.getApellido());
    
    }
    
}
