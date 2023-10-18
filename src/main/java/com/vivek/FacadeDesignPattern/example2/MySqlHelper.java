package com.vivek.FacadeDesignPattern.example2;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlDBConnection(){
        //getting MySql db connection using connection parameters
        return null;
    }
    public void generateMySqlPDFReport(String tableName, Connection con){
        //getting data from table and generate pdf report
    }
    public void generateMySqlHTMLReport(String tableName, Connection con){
        //getting data from table and generate HTML report
    }
}
