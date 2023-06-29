package encapsulamiento;

import Logica.Alumno;

public class Encapsulamiento
{

    public static void main(String[] args)
    {
        Alumno alumno = new Alumno();
        Alumno  alumno1 = new Alumno(1, "Emilio", "Barerra Sepulveda");
        
        System.out.println("Datos del Alumnos!");
       
        System.out.println("Id: " + alumno1.getId() + " Nombre: " + alumno1.getNombre() + " Apellidos: " + alumno1.getApellido());
    }
    
}
