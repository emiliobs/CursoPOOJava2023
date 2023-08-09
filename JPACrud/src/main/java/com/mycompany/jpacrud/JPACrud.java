

package com.mycompany.jpacrud;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.logica.Carrera;
import com.mycompany.jpacrud.logica.Controladora;
import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

public class JPACrud {

    public static void main(String[] args) 
    {
        System.out.println("");
        Controladora controladora = new Controladora();
        
        //Creacion de Carrrera
        Carrera carrera = new Carrera(1, "BAses de Datos");
        
       //Guradar carrea en la bd:
        controladora.CrearCarrera(carrera);
        
        //Creacion delAlumnos (concarreras)
        Alumno alumno = new  Alumno(1, "Emilio", "Barrera", new Date(), carrera);
        
        //Guradamos el alumno en la bd;
        controladora.CrearAlumno(alumno);
        
        //Resultados
        System.out.println("");
        System.out.println("---------------------------------------------------------------");
        System.out.println("------------------------- Datos Alumno ------------------------");
        Alumno alumno1  = controladora.TraerAlumno(1);
        System.out.println("Alumno Con Nombre: " +  alumno.getNombre() + " y Apellido: " + alumno.getApellido() + " con Carrera: " + alumno.getCarrera().getNombre());
        
        
    }
}
