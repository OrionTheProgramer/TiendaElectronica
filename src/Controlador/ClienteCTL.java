/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Database.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author orion
 */
public class ClienteCTL {
    public static boolean registrarCliente(Cliente cliente) {
        String query = "INSERT INTO cliente (nombre, correo, password) VALUES (?, ?, ?)";
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
}
