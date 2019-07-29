package dbstudent;
import java.sql.*;
public class Changesubject{
    public Changesubject(String n,String a,String s){
        Connection theConn=null;
        String SQL;
        
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="update tb_subject set subject_name ='"+a+"',"+"credit ='"+s+"'"+"  where id_subject='" +n+"'";
            stmt.executeUpdate(SQL);
            SQL = "select * from tb_subject where id_subject ='"+n+"'";
            ResultSet rs = stmt.executeQuery(SQL);
    
            while(rs.next()){
                System.out.printf(" %-20s %-20s %-20s  \n",rs.getString("id_subject"),rs.getString("subject_name"), rs.getString("credit"));
            
            }
        
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
