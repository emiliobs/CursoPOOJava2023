
package Logica;


public class Consultor extends Persona
{
    String nombreConsultor;
    int numeroConsultor;

    public Consultor()
    {
    }

    public Consultor(String nombreConsultor, int numeroConsultor, int id, String nombre, String apellidos, String domicilio, String telefono)
    {
        super(id, nombre, apellidos, domicilio, telefono);
        this.nombreConsultor = nombreConsultor;
        this.numeroConsultor = numeroConsultor;
    }

    public String getNombreConsultor()
    {
        return nombreConsultor;
    }

    public void setNombreConsultor(String nombreConsultor)
    {
        this.nombreConsultor = nombreConsultor;
    }

    public int getNumeroConsultor()
    {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor)
    {
        this.numeroConsultor = numeroConsultor;
    }
    
    
}
