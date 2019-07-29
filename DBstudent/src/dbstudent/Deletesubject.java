package dbstudent;
import java.sql.*;
public class Deletesubject{
    public Deletesubject(String n){
        
        Connection theConn=null;
        String SQL;
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "delete from tb_subject where id_subject ='"+n+"'";
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
    
        