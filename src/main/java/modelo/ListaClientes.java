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
public class ListaClientes {
    private ArrayList <Clientes> clientes;

    public ListaClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public ListaClientes() {
        this.clientes = new ArrayList<Clientes>();        
    }
    
    public void crearArrayList(){
        setClientes((ArrayList<Clientes>) new ArrayList());
    }
    
    public void añadirClientes(Clientes cliente){
        getClientes().add(cliente);
    }    

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }
        
}
