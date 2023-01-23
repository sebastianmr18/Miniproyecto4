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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;
import modelo.ListaClientes;
import modelo.Proveedores;
import vista.VentanaClientes;
import vista.VentanaPrincipal;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaClientesControlador implements ActionListener, MouseListener{
    VentanaClientes vista;
    ListaClientes modelo;
    public VentanaClientesControlador(VentanaClientes vista, ListaClientes modelo){
        this.vista = vista;       
        this.modelo = modelo;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Agregar cliente");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null);    
        vista.getBotonAgregar().addActionListener(this);
        vista.getBotonEliminar().addActionListener(this);
        vista.getBotonModificar().addActionListener(this);
        vista.getBotonNuevo().addActionListener(this);  
        vista.getBotonVolver().addActionListener(this);          
        vista.getTablaClientes().addMouseListener(this);
        vista.crearTabla();
        cargarClientes();
    } 
    
    public void activar(){
        vista.getBotonModificar().setEnabled(false);
        vista.getBotonEliminar().setEnabled(false);        
        vista.getBotonAgregar().setEnabled(true);
        
        vista.getTextoCliente().setEnabled(true);
        vista.getTextoIDCliente().setEnabled(true);          
    }
    
    public void desactivar(){
        vista.getBotonModificar().setEnabled(false);
        vista.getBotonAgregar().setEnabled(false);
        vista.getBotonEliminar().setEnabled(false);        
        
        vista.getTextoCliente().setEnabled(false);
        vista.getTextoIDCliente().setEnabled(false);   
        
        vista.getTextoCliente().setText("");
        vista.getTextoIDCliente().setText("");         
    }   
    
    public void guardarClientes(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaClientes().getModel();
        
        try{
            FileWriter losClientes = new FileWriter("clientes.txt");
            for(int i=0; i<vista.getTablaClientes().getRowCount(); i++){
                losClientes.write(model.getValueAt(i, 0).toString()+"\n");
                losClientes.write(model.getValueAt(i, 1).toString()+"\n");                
            }
            losClientes.close();
        }catch(IOException jo){
            displayErrorMessage("Hubo un error");    
        }
    }
    
    private void cargarClientes(){
        DefaultTableModel model = (DefaultTableModel)this.vista.getTablaClientes().getModel();
        String nombreCliente, numeroIDCliente;
        String archivo = "clientes.txt";
        Scanner linea = null;
        File archivoLeer = new File(archivo);
        try{
            linea= new Scanner(archivoLeer);
            while(linea.hasNextLine()){
                nombreCliente=linea.nextLine();
                numeroIDCliente=linea.nextLine();
                
                model.addRow(new Object[]{nombreCliente, numeroIDCliente});
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
            String nombreClientes = vista.getClientes();
            String numeroIDClientes = vista.getIDClientes();
            if ("".equals(nombreClientes)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else if ("".equals(numeroIDClientes)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else{
                Clientes cliente = new Clientes(nombreClientes, numeroIDClientes);
                modelo.añadirClientes(cliente);
                vista.llenarTabla();
                desactivar();
                guardarClientes();
            }
        }
        if(e.getSource().equals(vista.getBotonEliminar())){
            DefaultTableModel dtm = (DefaultTableModel) vista.getTablaClientes().getModel();
            if(vista.getTablaClientes().getSelectedRow() == -1){
                return;
            }

            int numeroFila = vista.getTablaClientes().getSelectedRow();
            dtm.removeRow(numeroFila);
            guardarClientes();
            
            desactivar();
        } 
        if(e.getSource().equals(vista.getBotonModificar())){
            if(vista.getTablaClientes().getSelectedRow()==-1){
                return;
            }

            String nombre = vista.getClientes();
            String numeroID = vista.getIDClientes();
            int numeroFila = vista.getTablaClientes().getSelectedRow();

            if ("".equals(nombre)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else if ("".equals(numeroID)){
                displayErrorMessage("Debes llenar todos los campos correctamente");
            }else{
                Proveedores proveedor = new Proveedores(nombre, numeroID);
                vista.getTablaClientes().setValueAt(proveedor.getNombre(), numeroFila, 0);
                vista.getTablaClientes().setValueAt(proveedor.getNumeroID(), numeroFila, 1);
                guardarClientes();
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
            vista.getTextoCliente().setText("");
            vista.getTextoIDCliente().setText("");  
        }        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==2){
            int numeroFila = vista.getTablaClientes().getSelectedRow();
            System.out.println(numeroFila);            
            
            String nombre = (String) vista.getTablaClientes().getValueAt(numeroFila, 0);
            String numeroID = (String) vista.getTablaClientes().getValueAt(numeroFila, 1);    
            
            vista.getTextoCliente().setText(nombre);
            vista.getTextoIDCliente().setText(numeroID); 
            
            vista.getBotonModificar().setEnabled(true);
            vista.getBotonEliminar().setEnabled(true);
            vista.getBotonAgregar().setEnabled(false);
            
            vista.getTextoCliente().setEnabled(true);
            vista.getTextoIDCliente().setEnabled(true);
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
