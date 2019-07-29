package dbstudent;
import java.sql.*;
public class Deleteregister {
    public Deleteregister(String n,String m){
        
        Connection theConn=null;
        String SQL;
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "delete from register where id_student ='"+n+"'&& id_subject='"+m+"'";
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
    
        