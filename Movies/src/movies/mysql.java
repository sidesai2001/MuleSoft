package movies;

import java.sql.*;
import javax.swing.JOptionPane;

public class mysql 
{
    Connection conn = null;

    public static Connection ConnectDb() 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/movies","root","");
            return conn;
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
