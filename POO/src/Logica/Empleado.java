
package Logica;

public class Empleado extends Persona
{
    //Atributos propios:
    
    private int numeroLegajo;
    private String cargo;
    private Double sueldo;

    public Empleado()
    {
    }

    public Empleado(int numeroLegajo, String cargo, Double sueldo, int id, String nombre, String apellidos, String domicilio, String telefono)
    {
        super(id, nombre, apellidos, domicilio, telefono);
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(Double sueldo)
    {
        this.sueldo = sueldo;
    }

    public int getNumeroLegajo()
    {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo)
    {
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

  
    
}
