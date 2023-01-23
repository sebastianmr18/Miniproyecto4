/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;  
import javax.swing.table.DefaultTableModel;
import vista.VentanaPrincipal;
import vista.VentanaVender;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaVenderControlador implements ActionListener{
    VentanaVender vista;
    
    public VentanaVenderControlador(VentanaVender vista){
        this.vista = vista;
                
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Registrar venta");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null);     
        vista.getBotonRegresar().addActionListener(this);
        vista.getBotonVender().addActionListener(this);
        vista.crearTabla();     
        cargarVentas();
        cargarComboProductos();
        cargarComboProveedores();
        cargarComboClientes();        
    }
    
    public void guardarVentas(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaVentas().getModel();
        try{
            FileWriter lasVentas = new FileWriter("ventas.txt");
            for(int i = 0;i<vista.getTablaVentas().getRowCount(); i++){
                lasVentas.write(model.getValueAt(i,0).toString()+"\n");
                lasVentas.write(model.getValueAt(i,1).toString()+"\n");
                lasVentas.write(model.getValueAt(i,2).toString()+"\n");
                lasVentas.write(model.getValueAt(i,3).toString()+"\n");                 
                lasVentas.write(model.getValueAt(i,4).toString()+"\n");                   
            }
            lasVentas.close();
        }catch(IOException xd){
        }
    }
    
    private void cargarVentas(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaVentas().getModel();
        String cliente, producto, proveedor, cantidad, precio;
        String archivo = "ventas.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{
           linea = new Scanner(archivoLeer);
            while(linea.hasNextLine()){
                cliente=linea.nextLine();
                producto=linea.nextLine();
                proveedor=linea.nextLine();                
                cantidad=linea.nextLine();
                precio=linea.nextLine(); 
                
                model.addRow(new Object[]{cliente, producto, proveedor, cantidad, precio});
            }                
        }catch(FileNotFoundException iox){
            System.out.println("nosirve XD");
        }
    }
    
    private void cargarComboProductos(){
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel)this.vista.getComboProducto().getModel();
        String productoNombre, productoID;
        String archivo = "productos.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{   
            linea = new Scanner(archivoLeer);            
            while(linea.hasNextLine()){
                productoNombre=linea.nextLine();
                productoID=linea.nextLine();             
                
                dcbm.addElement(productoNombre);
            }    
        }catch(FileNotFoundException fnd){
                    
        }
    }
    
    private void cargarComboProveedores(){
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel)this.vista.getComboProveedor().getModel();
        String proveedorNombre, proveedorID;
        String archivo = "proveedores.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{   
            linea = new Scanner(archivoLeer);            
            while(linea.hasNextLine()){
                proveedorNombre=linea.nextLine();
                proveedorID=linea.nextLine();             
                
                dcbm.addElement(proveedorNombre);
            }    
        }catch(FileNotFoundException fnd){
                    
        }
    }   
    
    private void cargarComboClientes(){
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel)this.vista.getComboClientes().getModel();
        String clienteNombre, clienteID;
        String archivo = "clientes.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{   
            linea = new Scanner(archivoLeer);            
            while(linea.hasNextLine()){
                clienteNombre=linea.nextLine();
                clienteID=linea.nextLine();             
                
                dcbm.addElement(clienteNombre);
            }    
        }catch(FileNotFoundException fnd){
                    
        }
    }     

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBotonRegresar())){
            VentanaPrincipal vista = new VentanaPrincipal();
            VentanaPrincipalControlador controlador = new VentanaPrincipalControlador(vista);
        }else if (e.getSource().equals(vista.getBotonVender())){
            vista.llenarTabla();
            guardarVentas();
        }     
    }
}
