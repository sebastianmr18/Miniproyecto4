/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ListaProductos;
import modelo.Productos;
import vista.VentanaPrincipal;
import vista.VentanaProductos;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaProductosControlador implements ActionListener, MouseListener{
    VentanaProductos vista;
    ListaProductos modelo;
    
    public VentanaProductosControlador(VentanaProductos vista, ListaProductos modelo){
        this.vista = vista; 
        this.modelo = modelo;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Añadir producto");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null);  
        vista.getBotonAgregar().addActionListener(this);
        vista.getBotonEliminar().addActionListener(this);
        vista.getBotonModificar().addActionListener(this);
        vista.getBotonNuevo().addActionListener(this);  
        vista.getBotonVolver().addActionListener(this);          
        vista.getTablaProductos().addMouseListener(this);
        vista.crearTabla();
        cargarProductos();
    }  
    
    public void activar(){
        vista.getBotonModificar().setEnabled(false);
        vista.getBotonEliminar().setEnabled(false);        
        vista.getBotonAgregar().setEnabled(true);
        
        vista.getTextoProducto().setEnabled(true);
        vista.getTextoIDProducto().setEnabled(true);          
    }
    
    public void desactivar(){
        vista.getBotonModificar().setEnabled(false);
        vista.getBotonAgregar().setEnabled(false);
        vista.getBotonEliminar().setEnabled(false);        
        
        vista.getTextoProducto().setEnabled(false);
        vista.getTextoIDProducto().setEnabled(false); 
       
        vista.getTextoProducto().setText("");
        vista.getTextoIDProducto().setText("");         
    }    
    
    public void guardarProductos(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaProductos().getModel();
        
        try{
            FileWriter losProductos = new FileWriter("productos.txt");
            for(int i=0; i<vista.getTablaProductos().getRowCount(); i++){
                losProductos.write(model.getValueAt(i, 0).toString()+"\n");
                losProductos.write(model.getValueAt(i, 1).toString()+"\n");               
            }
            losProductos.close();
        }catch(IOException jo){
            displayErrorMessage("Hubo un error");    
        }
    }
    
    private void cargarProductos(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaProductos().getModel();
        String nombreProducto, numeroIDProducto;
        String archivo = "productos.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{
            linea= new Scanner(archivoLeer);
            while(linea.hasNextLine()){
                nombreProducto=linea.nextLine();
                numeroIDProducto=linea.nextLine();             
                
                model.addRow(new Object[]{nombreProducto, numeroIDProducto});
            }
        }catch(FileNotFoundException ju){                
            displayErrorMessage("Hubo un error");    
        }
    } 
    
    public void displayErrorMessage(String erroMessage) {
        JOptionPane.showMessageDialog(vista, erroMessage);
    }      

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBotonAgregar())){
            String nombreProducto = vista.getProducto();
            String numeroIDProducto = vista.getIDProducto();           
            if ("".equals(nombreProducto)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else if ("".equals(numeroIDProducto)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else{
                Productos producto = new Productos(nombreProducto, numeroIDProducto);
                modelo.añadirProducto(producto);
                vista.llenarTabla();
                desactivar();
                guardarProductos();
            }
        }    
        if(e.getSource().equals(vista.getBotonEliminar())){
            DefaultTableModel dtm = (DefaultTableModel) vista.getTablaProductos().getModel();
            if(vista.getTablaProductos().getSelectedRow() == -1){
                return;
            }

            int numeroFila = vista.getTablaProductos().getSelectedRow();
            dtm.removeRow(numeroFila);
            guardarProductos();
            
            desactivar();
        }
        if(e.getSource().equals(vista.getBotonModificar())){
            if(vista.getTablaProductos().getSelectedRow()==-1){
                return;
            }

            String nombreProducto = vista.getProducto();
            String IDProducto = vista.getIDProducto();
            int numeroFila = vista.getTablaProductos().getSelectedRow();

            if ("".equals(nombreProducto)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else if ("".equals(IDProducto)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else{
                Productos producto = new Productos(nombreProducto, IDProducto);
                vista.getTablaProductos().setValueAt(producto.getNombre(), numeroFila, 0);
                vista.getTablaProductos().setValueAt(producto.getID(), numeroFila, 1);            
                guardarProductos();
                desactivar();
            }
        }
        if(e.getSource().equals(vista.getBotonVolver())){
            VentanaPrincipal vista = new VentanaPrincipal();
            VentanaPrincipalControlador controlador = new VentanaPrincipalControlador(vista);
        }
        if(e.getSource().equals(vista.getBotonNuevo())){
            vista.getBotonAgregar().setEnabled(true);
            activar();
            vista.getTextoProducto().setText("");
            vista.getTextoIDProducto().setText("");              
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==2){
            int numeroFila = vista.getTablaProductos().getSelectedRow();
            
            String nombreProducto = (String)vista.getTablaProductos().getValueAt(numeroFila, 0);
            String IDProducto = (String)vista.getTablaProductos().getValueAt(numeroFila, 1); 
            
            vista.getTextoProducto().setText(nombreProducto);
            vista.getTextoIDProducto().setText(IDProducto);
            
            vista.getBotonModificar().setEnabled(true);
            vista.getBotonEliminar().setEnabled(true);
            vista.getBotonAgregar().setEnabled(false);
            
            vista.getTextoProducto().setEnabled(true);
            vista.getTextoIDProducto().setEnabled(true);            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
