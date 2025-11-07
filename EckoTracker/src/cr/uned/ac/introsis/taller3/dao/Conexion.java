/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.uned.ac.introsis.taller3.dao;

import java.sql.*;
/**
 *
 * @author ivanrojasgranados
 */
public class Conexion {
    private String urlConexion="jdbc:derby://localhost:1527/EckoTracker";
    private String userName="test";
    private String password="test";
    
    /**
     * Metodo para conectarse a la base de datos
     * @return Connection
     * @throws SQLException 
     */
    public Connection conectar() throws SQLException{
        return DriverManager.getConnection(urlConexion, userName, password);
    }
    
}
