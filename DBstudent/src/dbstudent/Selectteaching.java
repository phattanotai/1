package dbstudent;
import java.sql.*;
class customer4{
    String id_subject;
    String id_teacher;
    String semester;        
    String year;      
    String day;    
    String time; 
    String room;
           
}
    public class Selectteaching {
        public Selectteaching(customer4 cust){
       
       Connection theConn=null;
       String SQL;
       String n=cust.id_subject;
       String a=cust.id_teacher;
       try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="select * from teaching where id_subject='" +n+"' && id_teacher='"+a+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                String x=rs.getString("semester")+ ";" + rs.getString("year") + ";" + rs.getString("day")+";"+ rs.getString("time")+";"+ rs.getString("room");
                String[] y = x.split(";",5);
                cust.semester =y[0];
                cust.year =y[1];
                cust.day =y[2];
                cust.time =y[3];
                cust.room =y[4];
        
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

