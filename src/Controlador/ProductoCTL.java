/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Database.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author orion
 */
public class ProductoCTL {
    public static Producto Componentes(int id_pc) {
        String query = "SELECT * FROM pc WHERE id_pc = ?";
        Producto data = new Producto();

        try (Connection conn = Conexion.connect();
             PreparedStatement pc = conn.prepareStatement(query)) {

            pc.setInt(1, id_pc);

            try (ResultSet rs = pc.executeQuery()) {
                
                if (rs.next()) {
                    // Si se encuentra un registro, el inicio de sesión es exitoso
                    System.out.println("Ingrreso Correcto");
                    data.setFabricante(rs.getString("fabricante"));
                    data.setProcesador(rs.getString("procesador"));
                    data.setGrafica(rs.getString("Grafica"));
                    data.setRam(rs.getString("ram"));
                    data.setDisco(rs.getString("disco"));
                    data.setPrecio(rs.getInt("Precio"));
                    
                    
                }
                else{
                    data = null;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
            data = null;
        }
        return data;
    }
}
