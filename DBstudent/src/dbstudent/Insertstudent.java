package dbstudent;
import java.sql.*;
public class Insertstudent {
    public Insertstudent(String id,String name,String sex,String birthday,String address,String phone,String email,String branch,String faculty){
        Connection theConn=null;
        String SQL;
    try{
    SQLConnection MyCon = new SQLConnection();
    theConn = MyCon.getConnection();
    Statement stmt=theConn.createStatement();
    SQL = "INSERT INTO tb_student (id_student,name,sex,birthday,address,phone,email,branch,faculty) VALUES "+"('"+id+"','"+name+"','"+sex+"','"+birthday+"','"+address+"','"+phone+"','"+email+"','"+branch+"','"+faculty+"')"; 
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

    

