/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Database.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author orion
 */
public class ClienteCTL {
    public static boolean registrarCliente(Cliente cliente) {
        String query = "INSERT INTO cliente (nombre, correo, contraseña) VALUES (?, ?, ?)";
        boolean registroExitoso = false;

        try (Connection conn = Conexion.connect();
             PreparedStatement cliente_datos = conn.prepareStatement(query)) {

            cliente_datos.setString(1, cliente.getNombre());
            cliente_datos.setString(2, cliente.getCorreo());
            cliente_datos.setString(3, cliente.getContraseña());

            int filasInsertadas = cliente_datos.executeUpdate();
            if (filasInsertadas > 0) {
                registroExitoso = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
        }

        return registroExitoso;
    }
    
    public static Cliente IniciarSesion(String correo, String contraseña) {
        String query = "SELECT * FROM Cliente WHERE correo = ? AND contraseña = ?";
        Cliente data = new Cliente();
        int contador = 0;

        try (Connection conn = Conexion.connect();
             PreparedStatement cliente = conn.prepareStatement(query)) {

            cliente.setString(1, correo);
            cliente.setString(2, contraseña);

            try (ResultSet rs = cliente.executeQuery()) {
                
                if (rs.next()) {
                    // Si se encuentra un registro, el inicio de sesión es exitoso
                    System.out.println("Ingrreso Correcto");
                    data.setNombre(rs.getString("nombre"));
                    data.setCorreo(rs.getString("correo"));
                    data.setContraseña(rs.getString("contraseña"));
                    
                    
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
    
    public ArrayList<Cliente> buscarTodos(String dato)
    {
        ArrayList<Cliente> lista = new ArrayList<>();
        
        try {
            Connection cnx = Conexion.connect();
            
            //SQL
            String query = "SELECT * FROM cliente ORDER BY "+dato ;
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setContraseña(rs.getString("contraseña"));
                
                lista.add(cliente);
            }
            rs.close();
            stmt.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al listar libros " + e.getMessage());
        }
       return lista;
    }
    
    public boolean eliminar(int id_cliente)
    {
        try {
            
            Connection conn = Conexion.connect();
            
            //SQL
            String query = "DELETE FROM cliente WHERE id_cliente=?" ;
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id_cliente);
            
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
   
}
