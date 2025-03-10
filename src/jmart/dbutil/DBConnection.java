
package jmart.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection conn;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sb","root","root");
//            JOptionPane.showMessageDialog(null, "Conn opend Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException cnf)
        {
            JOptionPane.showMessageDialog(null, "Error in loading th Oralce Driver","Driver Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(null, "Error in Opening the Connection","Connection Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    
    public static void closeConnection()
    {
        try{
            JOptionPane.showMessageDialog(null, "Conn Close Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            conn.close();
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(null, "Error in Closing the Connection","Connection Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
