package Controlador;

import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Interfaz;
import com.sun.source.tree.IfTree;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorProducto implements ActionListener
{
    //Instancias
    Producto producto = new Producto();
    ProductoDAO ProductoDAO = new ProductoDAO();
    Vista.Interfaz vista = new Interfaz();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    //Variables Globales
    private int codigo;
    private String nombre;
    private double precio;
    private  int inventario;

    public ControladorProducto(Vista.Interfaz vista)
    {
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        AgregarEventos();
        ListarTabla();

    }

    private void AgregarEventos()
    {
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnBorrar().addActionListener(this);
        vista.getBtnActualizar().addActionListener(this);
        vista.getBtnLImpiar().addActionListener(this);
        vista.getTblTabla().addMouseListener(new MouseAdapter()
        {

            public void mouseClicked(MouseEvent me)
            {
                LlenarCampos(me);
            }

        });

    }

    private void ListarTabla()
    {
        String[] titulo = new String[]
        {
            "Codigo", "Nombre", "Precio", "Inventario"
        };
        modeloTabla = new DefaultTableModel(titulo, 0);
        List<Producto> listaProductos = new ProductoDAO().Listar();

        for (Producto productos : listaProductos)
        {
            modeloTabla.addRow(new Object[]
            {
                productos.getCodigo(),
                productos.getNombre(),
                productos.getPrecio(),
                productos.getInventario(),
            });
        }

        vista.getTblTabla().setModel(modeloTabla);
        vista.getTblTabla().setPreferredSize(new Dimension(350, modeloTabla.getRowCount() * 16));
    }

    private void LlenarCampos(MouseEvent me)
    {
        try
        {
            JTable target = (JTable) me.getSource();
            codigo = (int) vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 0);
            vista.getTxtNombre().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 1).toString());
            vista.getTxtPrecio().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 2).toString());
            vista.getTxtInventario().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 3).toString());

        }
        catch (Exception e)
        {
            System.out.println("Error en Controlador: " + e);
        }

    }
    
    //---------------------------------------------------Validar Formulario:
    
    private boolean ValidarDatos()
    {
        if ("".equals(vista.getTxtNombre().getText()))
        {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese Nombre","ERROR", JOptionPane.ERROR_MESSAGE);
            
            return false;
        }
        
        if ("".equals(vista.getTxtPrecio().getText()))
        {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese Precio","ERROR", JOptionPane.ERROR_MESSAGE);
            
            return  false;
        }
        
        if ("".equals(vista.getTxtInventario().getText()))
        {
            JOptionPane.showMessageDialog(null,"Por favor Ingrese Inventario","ERROR", JOptionPane.ERROR_MESSAGE);
            
            return  false;
        }
        
        return true;
   
    }
    
    //<etodo 3 en 1:
    // 1. cargando las variables globales
    // 2 .parseando los valores
    // 3 .Estamos validando que precio y inventario sean numericos
    private boolean CargarDatos()
    {
        try
        {
            nombre = vista.getTxtNombre().getText();
            precio = Double.parseDouble(vista.getTxtPrecio().getText());
            inventario =  Integer.parseInt( vista.getTxtInventario().getText());
            
            return true;
        }
        catch (NumberFormatException e)
        {
            
            JOptionPane.showConfirmDialog(null, "Los campo Precio e INventario deben ser Númericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR al cargar Datos: " + e);
        
            return false;
        }  
     
    }
    
    private void  LimpiarCampo()
    {
        vista.getTxtNombre().setText("");
        vista.getTxtPrecio().setText("");
        vista.getTxtInventario().setText("");
        codigo = 0;
        nombre = "";
        precio = 0;
        inventario = 0;
    }
    
    //----------------------------------------------------------------------------------------------
    
    private  void AgregarProducto()
    {
        try
        {
            if (ValidarDatos())
            {
                if (CargarDatos())
                {
                    Producto producto = new Producto(nombre, precio, inventario);
                    ProductoDAO.Agregar(producto);
                    
                    JOptionPane.showMessageDialog(null,"Registro Guardado de forma Exitosa!");
                    LimpiarCampo();
                }
            }
        }
        catch (HeadlessException e)
        {
            System.out.println("ERROR en agregar datos en elcontroloador: " + e);
        }
        finally
        {
          ListarTabla();
          
        }
    }
    
    
    private  void Actializar()
    {
        try
        {
            if (ValidarDatos())
            {
                if (CargarDatos())
                {
                    Producto producto = new Producto(codigo, nombre, precio, inventario);
                    ProductoDAO.Actualizar(producto);
                    JOptionPane.showMessageDialog(null, "Registro Actualizado");
                    LimpiarCampo();
                }
            }
        }
        catch (HeadlessException e)
        {
            System.out.println("ERROR Actualizar Controlador: " + e);
        }
        finally
        {
            ListarTabla();
        }
    }
    
    //Dar acciones a los botones:
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == vista.getBtnAgregar())
        {
            AgregarProducto();
        }
        
        if (e.getSource() == vista.getBtnLImpiar())
        {
            LimpiarCampo();
        }
        
        if (e.getSource() == vista.getBtnActualizar())
        {
            Actializar();
        }
    }

}
