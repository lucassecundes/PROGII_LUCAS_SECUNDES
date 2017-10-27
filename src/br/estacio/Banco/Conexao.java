/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Conexao {

    private static final String URL_BANCO = "jdbc:postgres:5432/progii_bd";
    private static String USUARIO   = "´postgres";
    private static String SENHA     = "estacio@123"; //estacio@123
    
    private static String status          = "Não conectado ...";
    
    public static Connection criarConexao(){
        Connection conexao = null;
        
        try {
            conexao = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conexao !=null)
            status = "CONECTADO!!";
        else
            status = "NÃO CONECTADO!!";
        
        return conexao;
    }
    
    public String getStatus(){
        return status;
    }
}