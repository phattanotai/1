package dbstudent;
import java.sql.*;
public class Deletestudent {
    public Deletestudent(String n){
        
        Connection theConn=null;
        String SQL;
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "delete from tb_student where id_student ='"+n+"'";
            stmt.executeUpdate(SQL);
            
           
         }catch ( SQLException ex){
            System.out.println(ex);
         }finally{
            try{
            if(theConn !=null){
                theConn.close();
            }
             }catch(Exception e){
            
             }
        } 
    }
}
    
        