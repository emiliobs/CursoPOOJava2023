package com.mycompany.jpacrud.persistencia;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.persistencia.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia
{
    AlumnoJpaController alumnoJpaController = new AlumnoJpaController();

    public void CrearAlumno(Alumno alumno)
    {
        alumnoJpaController.create(alumno);
    }

    public void EliminarAlumno(int id)
    {
        try
        {
            alumnoJpaController.destroy(id);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
