/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import javax.swing.JFrame;
import vista.VentanaProveedores;

/**
 *
 * @author jsmr0
 */
public class VentanaProveedoresControlador {
    VentanaProveedores vista;
    public VentanaProveedoresControlador(VentanaProveedores vista){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); 
        vista.setTitle ("Servicio de Salud Univalle");
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true); 
        vista.setResizable(false);
        vista.setLayout(null);     
    }
    
}