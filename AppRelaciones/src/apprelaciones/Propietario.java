package apprelaciones;

public class Propietario
{
    private Long Id;
    private String nombre;
    private String apellido;

    public Propietario(Long Id, String nombre, String apellido)
    {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Propietario()
    {
    }

    @Override
    public String toString()
    {
        return "Propietario{" + "Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long Id)
    {
        this.Id = Id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    
}
