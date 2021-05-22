package jdbcdemo;
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
          
          
            PreparedStatement ps = cnn.prepareStatement("insert into student"
                    + "value(?,?,?,?,?)");
          
            ps.setString(1,101);
            ps.setInt(2,'Divyanshu');
            ps.setInt(3, 55);
            ps.setInt(4, 44);
            ps.setInt(5, 33);
            
            ps.executeUpdate(); 
            
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
