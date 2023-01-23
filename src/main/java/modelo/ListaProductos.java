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
public class ListaProductos {
    private ArrayList <Productos> productos;
    
    public ListaProductos(ArrayList <Productos> productos){
        this.productos = productos;
    }
    
    public ListaProductos(){
        this.productos = new ArrayList<Productos>();
    }
    
    public void crearArrayList(){
        setProductos((ArrayList<Productos>) new ArrayList());
    }
    
    public void añadirProducto(Productos producto){
        getProductos().add(producto);
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }    
    
}
