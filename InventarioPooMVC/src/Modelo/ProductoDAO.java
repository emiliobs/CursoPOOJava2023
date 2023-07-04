package Modelo;

import Controlador.ConexionBD;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProductoDAO
{
    ConexionBD conexionBD = new ConexionBD();
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public List Listar()            
    {
        String sql = "Select * From productos";
        List<Producto> lista = new ArrayList<>();
        
        try
        {
            connection = conexionBD.ConectarBaseDatos();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next())
            {                
                Producto producto = new Producto();
                producto.setCodigo(resultSet.getInt(1));
                producto.setNombre(resultSet.getNString(2));
                producto.setPrecio(resultSet.getDouble(3));
                producto.setInventario(resultSet.getInt(4));
                
                lista.add(producto);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error LIstar: " + e);
        }
        
        return  lista;
    }
    
    
    //Metodo Agregar
    public  void Agregar(Producto producto)
    {
        String sql = "Insert Into productos (nombre, precio, inventario) Values(?, ?, ?)";
        
        try
        {
          connection = conexionBD.ConectarBaseDatos();
          preparedStatement = connection.prepareStatement(sql);
          preparedStatement.setString(1, producto.getNombre());
          preparedStatement.setDouble(2, producto.getPrecio());
          preparedStatement.setInt(3, producto.getInventario());
          
          preparedStatement.executeQuery();
        }
        catch (SQLException e)
        {
            System.out.println("ERROR en Agregar " + e );
        }
    }
    
    
}
