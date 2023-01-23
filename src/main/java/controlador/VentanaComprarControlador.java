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
import vista.VentanaComprar;
import vista.VentanaPrincipal;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaComprarControlador implements ActionListener{
    VentanaComprar vista;
    
    public VentanaComprarControlador(VentanaComprar vista){
        this.vista = vista;   
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Registrar compra");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null);     
        vista.getBotonRegresar().addActionListener(this);
        vista.getBotonComprar().addActionListener(this);   
        vista.crearTabla();
        cargarCompras();
        cargarComboProductos();
        cargarComboProveedores();       
    }  
    
    public void guardarCompras(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaCompras().getModel();
        try{
            FileWriter lasCompras = new FileWriter("compras.txt");
            for(int i = 0;i<vista.getTablaCompras().getRowCount(); i++){
                lasCompras.write(model.getValueAt(i,0).toString()+"\n");
                lasCompras.write(model.getValueAt(i,1).toString()+"\n");
                lasCompras.write(model.getValueAt(i,2).toString()+"\n");
                lasCompras.write(model.getValueAt(i,3).toString()+"\n");        
            }
            lasCompras.close();
        }catch (IOException iow){
        }
    }
    
    private void cargarCompras(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaCompras().getModel();
        String proveedor, producto, cantidad, precio;
        String archivo = "compras.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{
            linea = new Scanner(archivoLeer);
            while(linea.hasNextLine()){
                proveedor=linea.nextLine();
                producto=linea.nextLine();
                cantidad=linea.nextLine();
                precio=linea.nextLine();
                
                model.addRow(new Object[]{proveedor, producto, cantidad, precio});
            }
        }catch(FileNotFoundException xd){
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
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel)this.vista.getComboProveedores().getModel();
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBotonRegresar())){
            VentanaPrincipal vista = new VentanaPrincipal();
            VentanaPrincipalControlador controlador = new VentanaPrincipalControlador(vista);
        }
        else if(e.getSource().equals(vista.getBotonComprar())){
            vista.llenarTabla();
            guardarCompras();
        }
    }    
        
}
