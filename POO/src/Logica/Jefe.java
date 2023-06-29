package Logica;


import Logica.Persona;

public class Jefe extends Persona
{
    private int idJefe;
    private String departamentoJefe;

    public Jefe()
    {
    }

    public Jefe(int idJefe, String departamentoJefe, int id, String nombre, String apellidos, String domicilio, String telefono)
    {
        super(id, nombre, apellidos, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public String getDepartamentoJefe()
    {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe)
    {
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe()
    {
        return idJefe;
    }

    public void setIdJefe(int idJefe)
    {
        this.idJefe = idJefe;
    }
    
    
}
