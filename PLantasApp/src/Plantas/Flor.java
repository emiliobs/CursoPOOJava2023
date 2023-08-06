
package Plantas;


public class Flor extends Planta
{
    private String colorDePetalos;
    private int cantidadPromedioDePetalos;
    private String colorDelPistillo;
    private String variedadDeFlor;
    private String estacionQueflorece;

    public Flor()
    {
    }

    public Flor(String colorDePetalos, int cantidadPromedioDePetalos, String colorDelPistillo, String variedadDeFlor, String estacionQueflorece)
    {
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDelPistillo = colorDelPistillo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueflorece = estacionQueflorece;
    }

    public Flor(String colorDePetalos, int cantidadPromedioDePetalos, String colorDelPistillo, String variedadDeFlor, String estacionQueflorece, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal)
    {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDelPistillo = colorDelPistillo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueflorece = estacionQueflorece;
    }

  
    public String getColorDePetalos()
    {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos)
    {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantidadPromedioDePetalos()
    {
        return cantidadPromedioDePetalos;
    }

    public void setCantidadPromedioDePetalos(int cantidadPromedioDePetalos)
    {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public String getColorDelPistillo()
    {
        return colorDelPistillo;
    }

    public void setColorDelPistillo(String colorDelPistillo)
    {
        this.colorDelPistillo = colorDelPistillo;
    }

    public String getVariedadDeFlor()
    {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor)
    {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueflorece()
    {
        return estacionQueflorece;
    }

    public void setEstacionQueflorece(String estacionQueflorece)
    {
        this.estacionQueflorece = estacionQueflorece;
    }

    @Override
    public void DecirLoQueSoy()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
