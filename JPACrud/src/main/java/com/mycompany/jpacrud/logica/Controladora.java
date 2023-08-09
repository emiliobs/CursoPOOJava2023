package com.mycompany.jpacrud.logica;

import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora
{
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public  void CrearAlumno(Alumno alumno)
    {
        controladoraPersistencia.CrearAlumno(alumno);
    }
    
    //Alumnos
    
    public void EliminarAlumno(int id)
    {
        controladoraPersistencia.EliminarAlumno(id);
    }
    
    public  void EditarAlumno(Alumno alumno)
    {
        controladoraPersistencia.EditarAlumno(alumno);
    }
    
     public Alumno TraerAlumno(int id)
    {
      return controladoraPersistencia.TraerAlumno(id);
    }
    
    public ArrayList<Alumno> TraerAlumnos()
    {
      return controladoraPersistencia.TraerAlumnos();
    }
    
      // Carrera:
    
    public  void CrearCarrera(Carrera carrera)
    {
        controladoraPersistencia.CrearCarrera(carrera);
    }
    
    
    public void EliminarCarrera(int id)
    {
        controladoraPersistencia.EliminarCarrera(id);
    }
    
    public  void EditarCarrera(Carrera carrera)
    {
        controladoraPersistencia.EditarCarrera(carrera);
    }
    
    public Carrera TraerCarrera(int id)
    {
      return controladoraPersistencia.TraerCarrera(id);
    }
    
    public ArrayList<Carrera> TraerCarreras()
    {
      return controladoraPersistencia.TraerCarreras();
    }
    
    
}
