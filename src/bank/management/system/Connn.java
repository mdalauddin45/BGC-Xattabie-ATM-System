package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","123456");
//            connection = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12653399","sql12653399","FlYbGIQ4Gd");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
