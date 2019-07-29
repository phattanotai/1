package dbstudent;
import java.sql.*;
public class Deleteteaching {
    public Deleteteaching(String n,String a){
        
        Connection theConn=null;
        String SQL;
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "delete from teaching where id_subject ='"+n+"'&& id_teacher ='"+a+"'";
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
    
        