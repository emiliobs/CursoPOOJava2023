package apprelaciones;


import apprelaciones.Propietario;
import java.util.List;

public class Auto
{
    private Long id;
    private String marca;
    private String modelo;
    
    
//Relacion 1 a  1
    //private  Propietario propietario;
//Relacion 1 a N
   private List<Propietario> listaPropietario;

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietario)
    {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietario = listaPropietario;
    }
    
    public Auto()
    {
    }

//    public Auto(Long id, String marca, String modelo, Propietario propietario)
//    {
//        this.id = id;
//        this.marca = marca;
//        this.modelo = modelo;
//        this.propietario = propietario;
//    }

    public List<Propietario> getListaPropietario()
    {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario)
    {
        this.listaPropietario = listaPropietario;
    }

 

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getMarca()
    {
        return marca;
    }

    @Override
    public String toString()
    {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietario=" + listaPropietario + '}';
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

//    public Propietario getPropietario()
//    {
//        return propietario;
//    }
//
//    public void setPropietario(Propietario propietario)
//    {
//        this.propietario = propietario;
//    }
//    
    
}
