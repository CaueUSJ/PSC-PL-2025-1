/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula1.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String url = "jbdc:mysql://localhost:3306/universidade?useTimezone=true&server=UTC";
    private static String usuario = "root";
    private static String senha = "usjt";
    
    public static Connection getConnection() {
        try{
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println(" Conexão estabelecida com sucesso.");
            return conexao;
        } catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }    
    
}
