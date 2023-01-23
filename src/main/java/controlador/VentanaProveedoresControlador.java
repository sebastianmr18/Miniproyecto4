/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ListaProveedores;
import modelo.Proveedores;
import vista.VentanaPrincipal;
import vista.VentanaProveedores;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaProveedoresControlador implements ActionListener, MouseListener{
    VentanaProveedores vista;
    ListaProveedores modelo;
    public VentanaProveedoresControlador(VentanaProveedores vista, ListaProveedores modelo){
        this.vista = vista;       
        this.modelo = modelo;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Agregar proveedor");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null);    
        vista.getBotonAgregar().addActionListener(this);
        vista.getBotonEliminar().addActionListener(this);
        vista.getBotonModificar().addActionListener(this);
        vista.getBotonNuevo().addActionListener(this);  
        vista.getBotonVolver().addActionListener(this);          
        vista.getTablaProveedor().addMouseListener(this);
        vista.crearTabla();
        cargarProveedores();
    }
    
    public void activar(){
        vista.getBotonModificar().setEnabled(false);
        vista.getBotonEliminar().setEnabled(false);        
        vista.getBotonAgregar().setEnabled(true);
        
        vista.getTextoProveedor().setEnabled(true);
        vista.getTextoIDProveedor().setEnabled(true);          
    }
    
    public void desactivar(){
        vista.getBotonModificar().setEnabled(false);
        vista.getBotonAgregar().setEnabled(false);
        vista.getBotonEliminar().setEnabled(false);        
        
        vista.getTextoProveedor().setEnabled(false);
        vista.getTextoIDProveedor().setEnabled(false);   
        
        vista.getTextoProveedor().setText("");
        vista.getTextoIDProveedor().setText("");         
    }    
    
    public void guardarProveedores(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaProveedor().getModel();
        
        try{
            FileWriter losProveedores = new FileWriter("proveedores.txt");
            for(int i=0; i<vista.getTablaProveedor().getRowCount(); i++){
                losProveedores.write(model.getValueAt(i, 0).toString()+"\n");
                losProveedores.write(model.getValueAt(i, 1).toString()+"\n");                
            }
            losProveedores.close();
        }catch(IOException jo){
            displayErrorMessage("Hubo un error");    
        }
    }
    
    private void cargarProveedores(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaProveedor().getModel();
        String nombreProveedor, numeroIDProveedor;
        String archivo = "proveedores.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{
            linea= new Scanner(archivoLeer);
            while(linea.hasNextLine()){
                nombreProveedor=linea.nextLine();
                numeroIDProveedor=linea.nextLine();
                
                model.addRow(new Object[]{nombreProveedor, numeroIDProveedor});
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
            String nombreProveedor = vista.getProveedor();
            String numeroIDProveedor = vista.getIDProveedor();
            if ("".equals(nombreProveedor)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else if ("".equals(numeroIDProveedor)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else{
                Proveedores proveedor = new Proveedores(nombreProveedor, numeroIDProveedor);
                modelo.añadirProveedor(proveedor);
                vista.llenarTabla();
                desactivar();
                guardarProveedores();
            }
        }
        if(e.getSource().equals(vista.getBotonEliminar())){
            DefaultTableModel dtm = (DefaultTableModel) vista.getTablaProveedor().getModel();
            if(vista.getTablaProveedor().getSelectedRow() == -1){
                return;
            }

            int numeroFila = vista.getTablaProveedor().getSelectedRow();
            dtm.removeRow(numeroFila);
            guardarProveedores();
            
            desactivar();
        }
        if(e.getSource().equals(vista.getBotonModificar())){
            if(vista.getTablaProveedor().getSelectedRow()==-1){
                return;
            }

            String nombre = vista.getProveedor();
            String numeroID = vista.getIDProveedor();
            int numeroFila = vista.getTablaProveedor().getSelectedRow();

            if ("".equals(nombre)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else if ("".equals(numeroID)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else{
                Proveedores proveedor = new Proveedores(nombre, numeroID);
                vista.getTablaProveedor().setValueAt(proveedor.getNombre(), numeroFila, 0);
                vista.getTablaProveedor().setValueAt(proveedor.getNumeroID(), numeroFila, 1);
                guardarProveedores();
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
            vista.getTextoProveedor().setText("");
            vista.getTextoIDProveedor().setText("");              
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==2){
            int numeroFila = vista.getTablaProveedor().getSelectedRow();
            System.out.println(numeroFila);            
            
            String nombre = (String) vista.getTablaProveedor().getValueAt(numeroFila, 0);
            String numeroID = (String) vista.getTablaProveedor().getValueAt(numeroFila, 1);    
            
            vista.getTextoProveedor().setText(nombre);
            vista.getTextoIDProveedor().setText(numeroID); 
            
            vista.getBotonModificar().setEnabled(true);
            vista.getBotonEliminar().setEnabled(true);
            vista.getBotonAgregar().setEnabled(false);
            
            vista.getTextoProveedor().setEnabled(true);
            vista.getTextoIDProveedor().setEnabled(true);
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
