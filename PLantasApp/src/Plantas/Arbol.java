
package Plantas;


public class Arbol extends Planta
{
    private String variedad;
    private String tipoDeTronco;
    private double radioTronco;
    private String tipodeHoja;

    public Arbol()
    {
    }

    public Arbol(String variedad, String tipoDeTronco, double radioTronco, String tipodeHoja)
    {
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioTronco = radioTronco;
        this.tipodeHoja = tipodeHoja;
    }

    public Arbol(String variedad, String tipoDeTronco, double radioTronco, String tipodeHoja, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal)
    {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioTronco = radioTronco;
        this.tipodeHoja = tipodeHoja;
    }
    
    public String getVariedad()
    {
        return variedad;
    }

    public void setVariedad(String variedad)
    {
        this.variedad = variedad;
    }

    public String getTipoDeTronco()
    {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco)
    {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioTronco()
    {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco)
    {
        this.radioTronco = radioTronco;
    }

    public String getTipodeHoja()
    {
        return tipodeHoja;
    }

    public void setTipodeHoja(String tipodeHoja)
    {
        this.tipodeHoja = tipodeHoja;
    }
        
    
    @Override
    public void DecirLoQueSoy()
    {
        System.out.println("Hola soy un Arbol.");
    }
    
}
