package com.mycompany.jpacrud.persistencia;

import com.mycompany.jpacrud.logica.Alumno;
import com.mycompany.jpacrud.logica.Carrera;
import com.mycompany.jpacrud.logica.Materia;
import com.mycompany.jpacrud.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia
{
    AlumnoJpaController alumnoJpaController = new AlumnoJpaController();
    CarreraJpaController carreraJpaController = new CarreraJpaController();
    MateriaJpaController materiaJpaController = new   MateriaJpaController();

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

    public void EditarAlumno(Alumno alumno)
    {
        try
        {
            alumnoJpaController.edit(alumno);
        }
        catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Alumno TraerAlumno(int id)
    {
        return alumnoJpaController.findAlumno(id);
    }

    
    public ArrayList<Alumno> TraerAlumnos()
    {
        List<Alumno> listaAlumnos = alumnoJpaController.findAlumnoEntities();
        
          ArrayList<Alumno> ArrayAlumnos  = new ArrayList<Alumno>(listaAlumnos);
          
          return ArrayAlumnos;
    }

    public void CrearCarrera(Carrera carrera)
    {
        carreraJpaController.create(carrera);
    }

    public void EliminarCarrera(int id)
    {
        try
        {
            carreraJpaController.destroy(id);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EditarCarrera(Carrera carrera)
    {
        try
        {
            carreraJpaController.edit(carrera);
        }
        catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public Carrera TraerCarrera(int id)
    {
         return carreraJpaController.findCarrera(id);
        
    }

    public ArrayList<Carrera> TraerCarreras()
    {
        List<Carrera> listCarrera =  carreraJpaController.findCarreraEntities();
        ArrayList<Carrera> arrayCarrera =new ArrayList<Carrera>(listCarrera);
        
        return arrayCarrera;
    }

    public void CrearMateria(Materia materia)
    {
        materiaJpaController.create(materia);
    }

    public void EliminarMateria(int id)
    {
        try
        {
            materiaJpaController.destroy(id);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EditarMateria(Materia materia)
    {
        try
        {
            materiaJpaController.edit(materia);
        }
        catch (Exception ex)
        {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia TraerMateria(int id)
    {
        return materiaJpaController.findMateria(id);
    }

    public LinkedList<Materia> TraerListaMateria()
    {
        List<Materia> listaMateria = materiaJpaController.findMateriaEntities();
        LinkedList<Materia> lista = new LinkedList(listaMateria);
        
        return lista;
                
    }

    
    
}
