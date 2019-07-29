package dbstudent;
import java.sql.*;
public class Changeteacher {
    public Changeteacher(String n,String a,String s,String f,String g,String h){
        Connection theConn=null;
        String SQL;
        
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="update teacher set name ='"+a+"',"+"sex ='"+s+"',"+"address ='"+f+"',"+"phone ='"+g+"',"+"email ='"+h+"'"+" where id_teacher='" +n+"'";
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
