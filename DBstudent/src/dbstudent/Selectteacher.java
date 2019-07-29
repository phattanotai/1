package dbstudent;
import java.sql.*;
class customer1{
    String id;
    String name;
    String sex;        
    String address;      
    String phone;    
    String email; 
           
}
    public class Selectteacher {
        public Selectteacher(customer1 cust){
       
       Connection theConn=null;
       String SQL;
       String n=cust.id;
       try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="select * from teacher where id_teacher='" +n+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                String x=rs.getString("name")+ ";" + rs.getString("sex") + ";" + rs.getString("address")+";"+ rs.getString("phone")+";"+ rs.getString("email");
                String[] y = x.split(";",5);
                cust.name =y[0];
                cust.sex =y[1];
                cust.address =y[2];
                cust.phone =y[3];
                cust.email =y[4];
        
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

