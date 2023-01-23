/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.ListaClientes;
import modelo.ListaProductos;
import modelo.ListaProveedores;
import vista.VentanaClientes;
import vista.VentanaComprar;
import vista.VentanaPrincipal;
import vista.VentanaProductos;
import vista.VentanaProveedores;
import vista.VentanaVender;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class VentanaPrincipalControlador  implements ActionListener{
    VentanaPrincipal vista;
    
    public VentanaPrincipalControlador(VentanaPrincipal vista){
        this.vista = vista;        
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Supermercado Univalle");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null); 
        vista.getBotonAñadirProveedor().addActionListener(this);
        vista.getBotonAñadirProductos().addActionListener(this);
        vista.getBotonAñadirCliente().addActionListener(this);
        vista.getBotonComprar().addActionListener(this);
        vista.getBotonVender().addActionListener(this);         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBotonAñadirProveedor())){
            VentanaProveedores vista = new VentanaProveedores();
            ListaProveedores modelo = new ListaProveedores();
            VentanaProveedoresControlador controlador = new VentanaProveedoresControlador(vista, modelo);
        }else if(e.getSource().equals(vista.getBotonAñadirCliente())){
            VentanaClientes vista = new VentanaClientes();
            ListaClientes modelo = new ListaClientes();
            VentanaClientesControlador controlador = new VentanaClientesControlador(vista, modelo);
        }else if(e.getSource().equals(vista.getBotonAñadirProductos())){
            VentanaProductos vista = new VentanaProductos();
            ListaProductos modelo = new ListaProductos();
            VentanaProductosControlador controlador = new VentanaProductosControlador(vista, modelo);
        }else if(e.getSource().equals(vista.getBotonComprar())){
            VentanaComprar vista = new VentanaComprar();
            VentanaComprarControlador controlador = new VentanaComprarControlador(vista);
        }else if(e.getSource().equals(vista.getBotonVender())){
            VentanaVender vista = new VentanaVender();
            VentanaVenderControlador controlador = new VentanaVenderControlador(vista);            
        }
    }
}
