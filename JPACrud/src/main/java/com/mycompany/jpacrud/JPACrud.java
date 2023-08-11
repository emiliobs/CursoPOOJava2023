package com.mycompany.jpacrud;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.logica.Carrera;
import com.mycompany.jpacrud.logica.Controladora;
import com.mycompany.jpacrud.logica.Materia;
import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JPACrud
{

    public static void main(String[] args)
    {
        System.out.println("");
        Controladora controladora = new Controladora();

        //Creamos lista de MAterias y las Agregamos:
        LinkedList<Materia> listaMAterias = new LinkedList<Materia>();

        //Creacion de Carrrera
        Carrera carrera = new Carrera(1, "Informatica", listaMAterias);

        //Guradar carrea en la bd:
        controladora.CrearCarrera(carrera);

        //Crear MAteria:
        Materia materia = new Materia(55, "Programacion", "Semestral",carrera);
        Materia materia1 = new Materia(56, "Logica", "Semestral", carrera);
        Materia materia2 = new Materia(57, "Matematicas", "Anual", carrera);

        // Guardar MAteria en la BD:
        controladora.CrearMateria(materia);
        controladora.CrearMateria(materia1);
        controladora.CrearMateria(materia2);

        
        //Agregar a la lista de materias.
        listaMAterias.add(materia);
        listaMAterias.add(materia1);
        listaMAterias.add(materia2);
        
        carrera.setListaMateria(listaMAterias);      
        controladora.EditarCarrera(carrera);

        //Creacion delAlumnos (concarreras)
        Alumno alumno = new Alumno(1, "Emilio", "Barrera", new Date(), carrera);

        //Guradamos el alumno en la bd;
        controladora.CrearAlumno(alumno);

        //Resultados
        System.out.println("");
        System.out.println("---------------------------------------------------------------");
        System.out.println("------------------------- Datos Alumno ------------------------");
        Alumno alumno1 = controladora.TraerAlumno(1);
        System.out.println("Alumno Con Nombre: " + alumno.getNombre() + " y Apellido: " + alumno.getApellido() + " con Carrera: " + alumno.getCarrera().getNombre());

    }
}
