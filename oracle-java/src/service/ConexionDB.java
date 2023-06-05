/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;

public class ConexionDB {
    
    private Connection conexion;

    public ConexionDB() {
    }

    public ConexionDB(String usuario, String puerto, String ip) throws SQLException {
        try {
            //Se carga el driver JDBC
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@//" + ip + ":" + puerto +"/FREEPDB1";        
            String password = "oracle";

            //Obtiene la conexion
            conexion = DriverManager.getConnection(url, usuario, password);

        } catch (SQLException e) {
            throw new SQLException("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return this.conexion;
    }
}
