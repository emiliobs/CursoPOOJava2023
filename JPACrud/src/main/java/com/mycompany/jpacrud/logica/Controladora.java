package com.mycompany.jpacrud.logica;

import com.mycompany.jpacrud.persistencia.ControladoraPersistencia;

public class Controladora
{
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public  void CrearAlumno(Alumno alumno)
    {
        controladoraPersistencia.CrearAlumno(alumno);
    }
    
    
    public void EliminarAlumno(int id)
    {
        controladoraPersistencia.EliminarAlumno(id);
    }
    
}
