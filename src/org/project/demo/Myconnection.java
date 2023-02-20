/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.project.demo;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class Myconnection {
    private static String servername="localhost";
    private  static String username="root";
    private static String dbname="db";
    private static Integer portnumber=3306;
    private static String password="";
    
    
    public static Connection getConnection(){
    Connection con=null;
    MysqlDataSource datasource = new MysqlDataSource();
    datasource.setServerName(servername);
    datasource.setUser(username);
    datasource.setDatabaseName(dbname);
    datasource.setPortNumber(portnumber);
    datasource.setPassword(password);
    try{
    con=datasource.getConnection();
    }catch(SQLException ex){
     System.out.println("Error while connecting to the database");
    }
    
    
    
    return con;
    }

}
