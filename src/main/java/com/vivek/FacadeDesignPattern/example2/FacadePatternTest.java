package com.vivek.FacadeDesignPattern.example2;

import java.sql.Connection;

//suppose we have an application with set of interfaces to use MySql/Oracle
//database and to generate different types of reports, such as html report ,pdf report etc.
//So we will have different set of interfaces to work with different 
//types of databases. Now, a client application can use these interfaces to get the
//required database connection and generate the reports. But when the complexity
//increases or interface behaviour names are confusing, client application will find it difficult 
//to manage it. So, we can apply facade design pattern here and provide a wrapper interface on top 
//of the existing interface to help client application.

//We have two helper interface, namely MySqlHelper and OracleHelper
//We can create a facade pattern interface. 

//below is the client code without using facade pattern and with using facade pattern.
//As you can see that using facade pattern interface is a lot easier and cleaner way to 
//avoid having a lot of logic at client side. JDBC Driver manager class to get the database connection 
//is a wonderful example of facade design pattern.

// Facade Design Pattern Important Points
// Facade design pattern is more like a helper for client applications, it doesn’t hide subsystem interfaces from the client. Whether to use Facade or not is completely dependent on client code.
// Facade design pattern can be applied at any point of development, usually when the number of interfaces grow and system gets complex.
// Subsystem interfaces are not aware of Facade and they shouldn’t have any reference of the Facade interface.
// Facade design pattern should be applied for similar kind of interfaces, its purpose is to provide a single interface rather than multiple interfaces that does the similar kind of jobs.
// We can use Factory pattern with Facade to provide better interface to client systems.

//client class
public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName = "Employee";
        //generating mysql HTML report and Oracle pdf report without using facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);
        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //generating mysql html report and oracle pdf report using facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
