package dbstudent;
import java.sql.*;
class customer2{
    String id_student;
    String id_subject;
    String semester;
    String year;        
    String grade;      
                
}
    public class Selectregister {
        public Selectregister(customer2 cust){
       
       Connection theConn=null;
       String SQL;
       String n=cust.id_student;
       String m=cust.id_subject;
       try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="select * from register where id_student='" +n+"'&&id_subject='"+m+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                String x=rs.getString("semester")+ ";" + rs.getString("year") + ";" + rs.getString("grade");
                String[] y = x.split(";",3);
                cust.semester =y[0];
                cust.year =y[1];
                cust.grade =y[2];
                      
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

