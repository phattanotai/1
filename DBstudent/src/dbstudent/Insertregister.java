package dbstudent;
import java.sql.*;
public class Insertregister {
    public Insertregister(String id_student,String id_subject,String semester,String year,String grade){
        Connection theConn=null;
        String SQL;
    try{
    SQLConnection MyCon = new SQLConnection();
    theConn = MyCon.getConnection();
    Statement stmt=theConn.createStatement();
    SQL = "INSERT INTO register (id_student,id_subject,semester,year,grade) VALUES "+"('"+id_student+"','"+id_subject+"','"+semester+"','"+year+"','"+grade+"')"; 
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

    

