package dbstudent;
import java.sql.*;
class customer{
    String id;
    String name;
    String sex;
    String birthday;        
    String address;      
    String phone;    
    String email; 
    String branch;
    String faculty;            
}
    public class Selectstudent {
        public Selectstudent(customer cust){
       
       Connection theConn=null;
       String SQL;
       String n =cust.id;
       try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="select * from tb_student where id_student='" +n+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                String x=rs.getString("name")+ ";" + rs.getString("sex") + ";" + rs.getString("birthday")+";"+ rs.getString("address")+";"+ rs.getString("phone")+";"+ rs.getString("email")+";"+ rs.getString("branch")+";"+ rs.getString("faculty");
                String[] y = x.split(";",8);
                cust.name =y[0];
                cust.sex =y[1];
                cust.birthday =y[2];
                cust.address =y[3];
                cust.phone =y[4];
                cust.email =y[5];
                cust.branch =y[6];
                cust.faculty =y[7];        
             }
  
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

