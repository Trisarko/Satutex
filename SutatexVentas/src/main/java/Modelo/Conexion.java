/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alejandro.roncancio
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
        try{
            String myBD = "jdbc:mysql://localhost:3306/SatutexBD?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        }catch (SQLException e){
            System.out.print(e.toString());
        }
        return null;
    }
    
}
