import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connection1 {
       static public Connection connection;
    static public Connection getConnection(){
        String dbName = "taxreturn";
        String userName ="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection( "jdbc:mysql://localhost/"+dbName,userName,password);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return  connection;
    }
}
