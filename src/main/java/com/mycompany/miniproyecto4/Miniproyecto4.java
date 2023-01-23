/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.miniproyecto4;

import controlador.VentanaPrincipalControlador;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import modelo.Clientes;
import modelo.Productos;
import modelo.Proveedores;
import vista.VentanaPrincipal;

/**
 * Autor(es): Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class Miniproyecto4 {
    
    public static ArrayList <Proveedores> proveedores;
    public static ArrayList <Clientes> clientes;   
    public static ArrayList <Productos> productos;       

    public static void main(String[] args) throws FileNotFoundException {
        proveedores = new ArrayList<>();
        clientes = new ArrayList<>(); 
        productos = new ArrayList<>(); 
        
        VentanaPrincipal vista = new VentanaPrincipal();
        VentanaPrincipalControlador controlador = new VentanaPrincipalControlador(vista);      
    }
}
