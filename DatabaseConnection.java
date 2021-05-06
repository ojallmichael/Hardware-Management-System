
package stock;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public final class DatabaseConnection {
    public Connection con;
    public Statement stat;
    public ResultSet res;
    
    public DatabaseConnection(){
        systemConnection();
    }
    
    public void systemConnection(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/hardwaredb", "root","");
             stat = (Statement) con.createStatement();
             JOptionPane.showMessageDialog(null, "Successful Connection To Database.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Unsuccessful Connection To Database.");
        }
    }
}
