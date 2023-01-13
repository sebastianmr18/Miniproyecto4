/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import modelo.VentanaPrincipalModelo;
import vista.VentanaPrincipal;
import vista.VentanaProductos;
import vista.VentanaProveedores;

/**
 *
 * @author jsmr0
 */
public class VentanaPrincipalControlador  implements ActionListener, MouseListener, ItemListener, PropertyChangeListener{
    VentanaPrincipal vista;
    VentanaPrincipalModelo modelo;
    
    public VentanaPrincipalControlador(VentanaPrincipalModelo modelo, VentanaPrincipal vista){
        this.modelo = modelo;
        this.vista = vista;        
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Servicio de Salud Univalle");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null); 
        vista.getBotonAñadirProveedor().addActionListener(this);
        vista.getBotonAñadirProductos().addActionListener(this);
        vista.getBotonAñadirCliente().addActionListener(this);
        vista.getBotonAsignarProducto().addActionListener(this);
        vista.getBotonComprar().addActionListener(this);
        vista.getBotonVender().addActionListener(this);         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBotonAñadirProveedor())){
            VentanaProveedores vista = new VentanaProveedores();
            VentanaProveedoresControlador controlador = new VentanaProveedoresControlador(vista);
        }
        if(e.getSource().equals(vista.getBotonAñadirProductos())){
            VentanaProductos vista = new VentanaProductos();
            VentanaProductosControlador controlador = new VentanaProductosControlador(vista);
        }        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
