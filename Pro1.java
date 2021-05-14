package jdbcdemo24feb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pro1 
{
    public static void main(String[] args) 
    {
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            
            String connectionUrl = "jdbc:mysql://localhost:3306/javadb";
            
            Connection cnn = DriverManager.getConnection(connectionUrl,"root","root");
            
            Statement stm = cnn.createStatement();
            
            String query = "insert into student value(101,'Vikas','Indore',55,44,33)";
            
            stm.executeUpdate(query); // DML- insert,update,delete
            
            stm.close();
            cnn.close();
            System.out.println("Success !");
        } catch (ClassNotFoundException ex) 
        {
            System.err.println("Driver Not Found !");
        } catch (SQLException ex) 
        {
            System.err.println("SQL Error : "+ex.getMessage());
        }
    }    
}
