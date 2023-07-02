package Controlador;

import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Interfaz;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorProducto implements ActionListener
{

    Producto producto = new Producto();
    ProductoDAO ProductoDAO = new ProductoDAO();
    Vista.Interfaz vista = new Interfaz();
    DefaultTableModel modeloTabla = new DefaultTableModel();

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
            vista.getTxtNombre().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 1).toString());
            vista.getTxtPrecio().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 2).toString());
            vista.getTxtInventario().setText(vista.getTblTabla().getModel().getValueAt(target.getSelectedRow(), 3).toString());

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }

}
