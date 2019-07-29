package dbstudent;
import java.sql.*;
public class SQLConnection {
    
    private Connection c;

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+"student";
            c=DriverManager.getConnection(url,"root","root");
        }catch(Exception e){
            System.out.println(e);
        }
        return c;
        
}   
}
   