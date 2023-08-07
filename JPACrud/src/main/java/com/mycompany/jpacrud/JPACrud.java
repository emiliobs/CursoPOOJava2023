

package com.mycompany.jpacrud;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.logica.Controladora;
import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;
import java.util.Date;

public class JPACrud {

    public static void main(String[] args) 
    {
        
        Controladora controladora = new Controladora();
        
        System.out.println("");
        System.out.println("=====   Ingresar Datos en la BD  =====");
        Alumno alumno = new Alumno(60, "Mary", "Linda", new Date());
        controladora.CrearAlumno(alumno);
        System.out.println("El Alumno ingresa en la BD con Id: " + alumno.getId() + " Nombre: " + alumno.getNombre() + " y Apellido: " + alumno.getApellido());
       
        System.out.println("");
        System.out.println("=====   Eliminar Datos de la BD   =====");
        controladora.EliminarAlumno(59);
        System.out.println("Dato Elimidado de forma Exitosa");
        
        System.out.println("");
        System.out.println("=====   Editar Datos de la BD   =====");
        alumno.setApellido("Sepulveda");
        controladora.EditarAlumno(alumno);
        System.out.println("Alumno Edtado con Id: " + alumno.getId()+ " y Nombre: " + alumno.getNombre() + " con Apellido: " + alumno.getApellido());
        
        
//        System.out.println("Creando la Identiry con JPA en la base de datos, tablas!");
//        System.out.println("");
//        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
       
    }
}
