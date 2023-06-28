
package appareaperimeterretangle;

import Logic.Rectangle;
import java.util.Scanner;


public class AppAreaPerimeterRetangle
{

   
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        Scanner teclado =new Scanner(System.in);
        double length, breadth;
        
        System.out.println("Start Programa.");
        System.out.println("");
        
        System.out.print("Enter the Length of the Rectangle : ");
        length = teclado.nextDouble();
        System.out.print("Enter the Breadth of the Rectangle: ");
        breadth = teclado.nextDouble();
        
        System.out.println("");
        System.out.println("The results of the Area ans Perimeter are:");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        
        System.out.println("The Area of the Rectangle id     : " + rectangle.Area(length, breadth));
        System.out.println("");
        System.out.println("The Perimeter of the Rectangle is: " + rectangle.Perimeter(length, breadth));
        
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("");
        System.out.println("End Programa.");
    }
    
}
