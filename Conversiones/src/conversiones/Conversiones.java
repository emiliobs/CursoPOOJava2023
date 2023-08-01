
package conversiones;


public class Conversiones
{


    public static void main(String[] args)
    {
        System.out.println("Casteo de Double a Int y Long");
       double num = 1.67;
       
       //casteo a entero:
       int numInt = (int)num;
       
       //CAsteo a long:
       long numLong = (long)num;
       
        System.out.println("Double : " + num);
        System.out.println("int    : " + numInt);
        System.out.println("Long   : " + numLong);
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("");
        
        System.out.println("Casteo de String a Double , Int y Long");
        String cantidad = "15";
        String precio = "150.27";
        
        int canEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es: " + (canEntero * precioDouble));
        
        System.out.println("");
        System.out.println("=========================================================");
        System.out.println("");
        
        System.out.println("Casteo  Double , Int y Long a String");
        int edad = 55;
        double estatura = 1.67;
        
        String edaString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Ead :" + edaString  + " Estatura : " + estaturaString);
        
    }
    
}
