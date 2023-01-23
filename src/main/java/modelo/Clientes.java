/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 * Autor(es):Juan Sebastian Muñoz Rojas <juan.munoz.rojas@correounivalle.edu.co> 
              Carol Sofia Rubiano Valderrama <carol.rubiano@correounivalle.edu.co>  
 * 
 */
public class Clientes {
    String nombre;
    String numeroID;  

    public Clientes(String nombre, String numeroID) {
        this.nombre = nombre;
        this.numeroID = numeroID;
    }
    
    public Clientes(){
        this.nombre = "";
        this.numeroID = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }
    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", numeroID=" + numeroID + '}';
    }    
}
