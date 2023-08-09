

package com.mycompany.jpacrud;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.logica.Controladora;
import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

public class JPACrud {

    public static void main(String[] args) 
    {
        
        Controladora controladora = new Controladora();
        
        System.out.println("");
        System.out.println("=====   Ingresar Datos en la BD  =====");
        
        Alumno alumnos = new Alumno();
        Alumno alumno = new Alumno(905, "Marcos", "Pinto", new Date());               
        controladora.CrearAlumno(alumno);
               
        System.out.println("El Alumno ingresa en la BD con Id: " + alumno.getId() + " Nombre: " + alumno.getNombre() + " y Apellido: " + alumno.getApellido());
       
        System.out.println("");
        System.out.println("=====   Eliminar Datos de la BD   =====");
        controladora.EliminarAlumno(905);
        System.out.println("Dato Elimidado de forma Exitosa");
        
        System.out.println("");
        System.out.println("=====   Editar Datos de la BD   =====");
        alumno.setApellido("Sepulveda");
        controladora.EditarAlumno(alumno);
        System.out.println("Alumno Editado con Id: " + alumno.getId()+ " y Nombre: " + alumno.getNombre() + " con Apellido: " + alumno.getApellido());
        
        System.out.println("");
        System.out.println("=====   Mostrar Alumno con Id de la BD   =====");
        controladora.TraerAlumno(65);
        System.out.println("El Alumno es: " + alumno.toString());
       // System.out.println("Alumno MOstrado con Id: " + alumno.getId()+ " y Nombre: " + alumno.getNombre() + " con Apellido: " + alumno.getApellido());
        
        System.out.println("");
        System.out.println("=====   Mostrar todos los Alumnos  de la BD   =====");
        ArrayList<Alumno> listaAlumnos = controladora.TraerAlumnos();
        for (Alumno listaAlumno : listaAlumnos)
        {
            System.out.println("El Alumno es: " + listaAlumno.toString());
        }
        System.out.println("");
       
        
        
//        System.out.println("Creando la Identiry con JPA en la base de datos, tablas!");
//        System.out.println("");
//        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
       
    }
}
