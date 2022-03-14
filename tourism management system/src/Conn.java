import java.sql.*;

public class Conn {

    Statement s;

    Conn()
    {
       Connection con;
       
       try 
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TMS","root","pa$$word");
           s = con.createStatement();
       }
       catch(Exception e)
       {
           e.printStackTrace();   
       }
    }
    
}
