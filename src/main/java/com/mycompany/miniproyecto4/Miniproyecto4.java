/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.miniproyecto4;

import controlador.VentanaPrincipalControlador;
import modelo.VentanaPrincipalModelo;
import vista.VentanaPrincipal;

/**
 *
 * @author jsmr0
 */
public class Miniproyecto4 {

    public static void main(String[] args) {
        VentanaPrincipal vista = new VentanaPrincipal();
        VentanaPrincipalModelo modelo = new VentanaPrincipalModelo();
        VentanaPrincipalControlador controlador = new VentanaPrincipalControlador(modelo, vista);        
    }
}
