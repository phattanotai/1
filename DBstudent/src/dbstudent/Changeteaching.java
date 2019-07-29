package dbstudent;
import java.sql.*;
public class Changeteaching {
    public Changeteaching(String n,String a,String s,String d,String f,String g,String h){
        Connection theConn=null;
        String SQL;
        
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="update teaching set semester ='"+s+"',"+"year ='"+d+"',"+"day ='"+f+"',"+"time='"+g+"',"+"room='"+h+"'"+" where id_subject='"+n+"'&& id_teacher='" +a+"'";
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
