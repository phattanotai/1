package dbstudent;
import java.sql.*;
public class Insertteaching {
    public Insertteaching(String id_subject,String id_teacher,String semester,String year,String day,String time,String room){
        Connection theConn=null;
        String SQL;
    try{
    SQLConnection MyCon = new SQLConnection();
    theConn = MyCon.getConnection();
    Statement stmt=theConn.createStatement();
    SQL = "INSERT INTO teaching (id_subject,id_teacher,semester,year,day,time,room) VALUES "+"('"+id_subject+"','"+id_teacher+"','"+semester+"','"+year+"','"+day+"','"+time+"','"+room+"')"; 
    stmt.executeUpdate(SQL);
    //SQLSelectAllTable all = new SQLSelectAllTable();
    
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

    

