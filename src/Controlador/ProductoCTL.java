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

        try {
            Connection conn = Conexion.connect();
            PreparedStatement pc = conn.prepareStatement(query);

            pc.setInt(1, id_pc);
            

            try (ResultSet rs = pc.executeQuery()) {
                
                if (rs.next()) {
                    // Si se encuentra un registro, el inicio de sesión es exitoso
                    System.out.println("Ingrreso Correcto");
                    int id = rs.getInt("fabricante");
                    String fab = BuscarFabricante(id);
                    
                    data.setFabricante(fab);
                    data.setId(rs.getInt("id_pc"));
                    data.setProcesador(rs.getString("procesador"));
                    data.setGrafica(rs.getString("grafica"));
                    data.setRam(rs.getString("ram"));
                    data.setDisco(rs.getString("disco"));
                    data.setPrecio(rs.getInt("precio"));
                    
                    
                }
                else{
                    data = null;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar las credenciales: " + e.getMessage());
            data = null;
        }
        return data;
    }
    
    public boolean eliminar(int id_pc){
        try {
            
            Connection conn = Conexion.connect();
            
            //SQL
            String query = "DELETE FROM pc WHERE id_pc=?" ;
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id_pc);
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error, id inexistente " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error al ejecutar el metodo" + e.getMessage());
            return false;
        }
    }
    
    public boolean Buscar(int id_pc){
        boolean encontrao = false;
        
        try {
            
            Connection conn = Conexion.connect();
            
            //SQL
            String query = "SELECT * FROM pc WHERE id_pc=?" ;
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id_pc);
            
            return encontrao = true;
        } catch (SQLException e) {
            System.out.println("Error, id inexistente " + e.getMessage());
            return encontrao;
        }
        catch(Exception e){
            System.out.println("Error al ejecutar el metodo" + e.getMessage());
            return encontrao;
        }
    }
    
    public static String BuscarFabricante(int id_fabricante){
        
        String fabricante = null;
        
        try {
            
            Connection conn = Conexion.connect();
            
            //SQL
            String query = "SELECT * FROM fabricante WHERE id_fabricante=?" ;
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id_fabricante);
            
            try(ResultSet rs = stmt.executeQuery()){
                if (rs.next()){
                    System.out.println("Conexion exitozaaaaaaaaaaa");
                    fabricante = rs.getString("fab_name");
                }
                else{
                    fabricante = null;
                }
            } catch (Exception e) {
                System.out.println("Error");
            }

        } catch (SQLException e) {
            System.out.println("Error, id inexistente " + e.getMessage());
            return fabricante;
        }
        catch(Exception e){
            System.out.println("Error al ejecutar el metodo" + e.getMessage());
            return fabricante;
        }
        return fabricante;
    }
//    public static void main(String[] args) {
//        Producto por = Componentes(1);
//        System.out.println(por.toString());
//    }
}
