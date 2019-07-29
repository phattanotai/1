package dbstudent;
import java.sql.*;
public class Insertteacher {
    public Insertteacher(String id,String name,String sex,String address,String phone,String email){
        Connection theConn=null;
        String SQL;
    try{
    SQLConnection MyCon = new SQLConnection();
    theConn = MyCon.getConnection();
    Statement stmt=theConn.createStatement();
    SQL = "INSERT INTO teacher (id_teacher,name,sex,address,phone,email) VALUES "+"('"+id+"','"+name+"','"+sex+"','"+address+"','"+phone+"','"+email+"')"; 
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

    

