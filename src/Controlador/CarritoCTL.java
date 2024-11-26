/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author orion
 */
public class CarritoCTL {
    private ArrayList<Producto> Carro;
    
    public CarritoCTL(){
        Carro = new ArrayList<>();
    }
    
    public void agregarCarrito(Producto pro){
        Carro.add(pro);
    }
    
    public void vaciarCarrito(){
        Carro.clear();
    }
    
    public ArrayList<Producto> getCarro(){
        return Carro;
    }
    
    public void listar(){
        for (Producto producto : Carro) {
            System.out.println(producto);
        }
    }
    
    public int calcularPrecio(){
        int precio = 0;
        for (Producto producto : Carro) {
            precio += producto.getPrecio();
        }
        return precio;
    }
}
