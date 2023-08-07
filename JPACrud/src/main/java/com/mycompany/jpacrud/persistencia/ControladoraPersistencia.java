package com.mycompany.jpacrud.persistencia;

import com.mycompany.jpacrud.logica.Alumno;


public class ControladoraPersistencia
{
    AlumnoJpaController alumnoJpaController = new AlumnoJpaController();

    public void CrearAlumno(Alumno alumno)
    {
        alumnoJpaController.create(alumno);
    }
}
