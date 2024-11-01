/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulario;



/**
 *
 * @author Rosmery López
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Formulario {
DefaultTableModel modelo;
String[] titulos=["Nombre","Documento","Correo","Telefono"];
String[] datos=new String[4];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            String usuario = "root";
            String password = "Drt5fgy6";
            String url = "jdbc:mysql://localhost:3306/libreta";
            Connection conexion;
            Statement statement;
            ResultSet rs;
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO USUARIO(DOMICILIO,TELEFONO) VALUES('AVELLANEDA','AVELLANEDA4458787')");
            rs = statement.executeQuery("SELECT * FROM USUARIO");
            rs.next();
            do{
                System.out.println(rs.getInt("id")+" : "+rs.getString("domicilio"));
            }while(rs.next());     
            
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hola mundo!");
        }
    }
}

