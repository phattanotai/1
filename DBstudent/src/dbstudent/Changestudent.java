package dbstudent;
import java.sql.*;
public class Changestudent {
    public Changestudent(String n,String a,String s,String d,String f,String g,String h,String j,String k){
        Connection theConn=null;
        String SQL;
        
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="update tb_student set name ='"+a+"',"+"sex ='"+s+"',"+"birthday ='"+d+"',"+"address ='"+f+"',"+"phone ='"+g+"',"+"email ='"+h+"',"+""
            + "branch ='"+j+"',"+"faculty ='"+k+"'"+"   where id_student='" +n+"'";
            stmt.executeUpdate(SQL);
            SQL = "select * from tb_student where id_student ='"+n+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","ID","NAME","SEX","BIRTHDAY","ADDRESS","PHONE","EMAIL","BRANCH","FACULTY");
            
            while(rs.next()){
                System.out.printf(" %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n",rs.getString("id"),rs.getString("name"), rs.getString("sex") ,rs.getString("birthday"), rs.getString("address"), rs.getString("phone"), rs.getString("email"), rs.getString("branch"),rs.getString("faculty"));
            
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
