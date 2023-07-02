package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD
{
    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String dbName = "productos";
    String url = "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&serverTimezone=UTC"; // Url de base de datos";
    String usuario = "root";
    String clave = "root";
    
    public Connection ConectarBaseDatos()
    {
        try
        {
            //Class.forName(driver);
            connection = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión Exitosa!");
        }
        catch (SQLException e)
        {
            System.out.println("Error en la Conexión :( " + e);
        }
        
        return  connection;
    }
    
//    public static void main(String[] args)
//    {
//        ConexionBD db = new ConexionBD();
//        db.ConectarBaseDatos();
//    }
    
}
