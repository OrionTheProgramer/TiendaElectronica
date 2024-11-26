/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author orion
 */
public class Producto {
    private String fabricante, procesador, grafica, ram, disco;
    private int precio, id;

    public Producto() {
    }

    public Producto( String fabricante, String procesador, String grafica, String ram, String disco, int precio) {
        this.fabricante = fabricante;
        this.procesador = procesador;
        this.grafica = grafica;
        this.ram = ram;
        this.disco = disco;
        this.precio = precio;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{fabricante=" + fabricante + ", procesador=" + procesador + ", grafica=" + grafica + ", disco=" + disco + ", precio=" + precio + '}';
    }
    
    
}
