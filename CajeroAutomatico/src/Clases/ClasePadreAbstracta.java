package Clases;

import java.util.Scanner;

public class ClasePadreAbstracta
{

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones()
    {
        int bandera = 0;
        int seleccion = 0;

        do
        {

            do
            {
                System.out.println("");
                System.out.println("Por favor Selecciones una Opción: ");
                System.out.println("    1. Consulta de Saldo.");
                System.out.println("    2. Retiro de Efectivo.");
                System.out.println("    3. Deposito de Efectivo.");
                System.out.println("    4. Salir.");
                System.out.print("Opcion: ");

                seleccion = entrada.nextInt();

                //Valiar el campo:
                if (seleccion >= 1 && seleccion <= 4)
                {
                    bandera = 1;
                }
                else
                {
                    System.out.println("");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("-- Opción no disponible, vuelva a intentar por Favor. --");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("");
                }

            }
            while (bandera == 0);
            
            if (seleccion == 1)
            {
                System.out.println("");
                System.out.println("Consulta Saldo");
            }
            else if (seleccion == 2)
            {
                System.out.println("");
                System.out.println("Retiro enefectivo");
            }
            else if (seleccion == 3)
            {
                System.out.println("");
                System.out.println("Deposito enEfectivo");
            }
            else if (seleccion == 4)
            {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("-- Gracias!, vuelva pronto. --");
                System.out.println("------------------------------");
                System.out.println("");
                
                bandera = 2;
            }
        }
        while (bandera != 2);

    }

}
