/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package a1.stationary.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Basher
 */
public class Databaseconnection {

    private static final String USERID = "root" , Password = "";
    static  final String Driver = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/a1station"  ; 
    
    static Connection conn;
    static Statement statement ;
    static ResultSet rs ;
    static ResultSet rs1 ;
      
    public static void getcon(){
        
        try{
            Class.forName(Driver);
            
        }catch(ClassNotFoundException ex){
            System.err.println(ex.getMessage());
            
        }
        try{
            conn= DriverManager.getConnection(URL,USERID,Password);
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
        }catch(SQLException ex ){
            System.err.println(ex);
               
        }
        
    }
    
    
  public static void readRecords() {
      
        String strSQL = "SELECT itemID,itemDesc,itemprice,itemQty,dateRntry,supplierID,supplierName FROM items";
        try {
            rs = statement.executeQuery(strSQL);
        }
        catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    public static void readSupplierRecords() {
      
        String strSQL = "SELECT supplierID,suplliername FROM supplier";
        try {
            rs = statement.executeQuery(strSQL);
        }
        catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
  public static void readEmpRecords() {
        String strSQL = "SELECT empID,empname,emplastname,mepdob,phone,address,gender,username,password,type FROM employee";
       
      
        try {
            rs = statement.executeQuery(strSQL);
        }
        catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    public static void displayData() {
        try {
            rs.beforeFirst();
            while (rs.next()) {
                String username = rs.getString(8);
                String password = rs.getString(9);
                String type = rs.getString(10);
                
                System.out.printf("%-12s%-12s%-12s\n",username, password, type);
               
            } 
        } catch (SQLException ex) {
            System.err.println("SQLException1: " + ex.getMessage());
        }
     }
     public static void readCusRecords() {
        String strSQL = "SELECT customerID,cusname,cuslastname,cusdob, phone, address, email From customer" ;
       
      
        try {
            rs = statement.executeQuery(strSQL);
        }
        catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
          getcon();
      //readRecords();
      readEmpRecords();
    displayData();
    }
    
}
