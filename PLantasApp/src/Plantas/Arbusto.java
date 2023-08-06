
package Plantas;

public class Arbusto extends Planta
{
    private double anchoArbusto;
    private double esDomestico;
    private String variedadArbusto;
    private String colordeHojas;
    private double sePodaONo;

    public Arbusto()
    {
    }

    public Arbusto(double anchoArbusto, double esDomestico, String variedadArbusto, String colordeHojas, double sePodaONo)
    {
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colordeHojas = colordeHojas;
        this.sePodaONo = sePodaONo;
    }

    public Arbusto(double anchoArbusto, double esDomestico, String variedadArbusto, String colordeHojas, double sePodaONo, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal)
    {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colordeHojas = colordeHojas;
        this.sePodaONo = sePodaONo;
    }

    

    public double getAnchoArbusto()
    {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto)
    {
        this.anchoArbusto = anchoArbusto;
    }

    public double getEsDomestico()
    {
        return esDomestico;
    }

    public void setEsDomestico(double esDomestico)
    {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto()
    {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto)
    {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColordeHojas()
    {
        return colordeHojas;
    }

    public void setColordeHojas(String colordeHojas)
    {
        this.colordeHojas = colordeHojas;
    }

    public double getSePodaONo()
    {
        return sePodaONo;
    }

    public void setSePodaONo(double sePodaONo)
    {
        this.sePodaONo = sePodaONo;
    }
    
    
    
    @Override
    public void DecirLoQueSoy()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
