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
public class ListaProveedores {
    private ArrayList <Proveedores> proveedores;

    public ListaProveedores(ArrayList<Proveedores> proveedores) {
        this.proveedores = proveedores;
    }

    public ListaProveedores() {
        this.proveedores = new ArrayList<Proveedores>();        
    }
    
    public void crearArrayList(){
        setProveedores((ArrayList<Proveedores>) new ArrayList());
    }
    
    public void añadirProveedor(Proveedores proveedor){
        getProveedores().add(proveedor);
    }    

    public ArrayList<Proveedores> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedores> proveedores) {
        this.proveedores = proveedores;
    }
    
}
