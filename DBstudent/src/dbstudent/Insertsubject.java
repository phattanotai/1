package dbstudent;
import java.sql.*;
public class Insertsubject {
    public Insertsubject(String id_subject,String subject_name,String credit){
        Connection theConn=null;
        String SQL;
    try{
    SQLConnection MyCon = new SQLConnection();
    theConn = MyCon.getConnection();
    Statement stmt=theConn.createStatement();
    SQL = "INSERT INTO tb_subject (id_subject,subject_name,credit) VALUES "+"('"+id_subject+"','"+subject_name+"','"+credit+"')"; 
    stmt.executeUpdate(SQL);
   
    
    }catch (SQLException ex){
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

    

