package Logica;

public class Alumno
{
    int id;
    String nombre;
    String apellido;
    
    public  void MostrarNombre()
    {
        System.out.println("Hola soy un Alumno y se decir mi nombre");
    }
    
    public  void SaberAprobado(double  calificacion)
    {
        if (calificacion >= 5)
        {
            System.out.println("Aprobé la Materia");
        }
        else
        {
            System.out.println("Uyy no Aprobé");    
        }
    }
}
