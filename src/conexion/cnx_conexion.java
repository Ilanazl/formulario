/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author Rosmery López
 */
public class cnx_conexion {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    private static final String USER = "root";
    
    private static final String PASSWORD = "Drt5fgy6";
    
    private static final String URL = "jdbc:mysql://localhost:3306/formulario?autoReconnect=true6useSSL=false";

    private Connection CN;
    
    public cnx_conexion() {
        CN =null;
    }
}
