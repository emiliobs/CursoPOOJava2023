

package com.mycompany.jpacrud;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.logica.Controladora;
import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;
import java.util.Date;

public class JPACrud {

    public static void main(String[] args) 
    {
        
        Controladora controladora = new Controladora();
        Alumno alumno = new Alumno(34, "Linda", "Carter", new Date());
        controladora.CrearAlumno(alumno);
        System.out.println("El Alumno ingresa en la BD con Id: " + alumno.getId() + " Nombre: " + alumno.getNombre() + " y Apellido: " + alumno.getApellido());
        
        
//        System.out.println("Creando la Identiry con JPA en la base de datos, tablas!");
//        System.out.println("");
//        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
       
    }
}
