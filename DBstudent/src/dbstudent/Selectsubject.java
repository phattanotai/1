package dbstudent;
import java.sql.*;
class customer3{
    String id_subject;
    String subject_name;
    String credit;        
        
                
}
    public class Selectsubject{
        public Selectsubject(customer3 cust){
       
       Connection theConn=null;
       String SQL;       
       String m=cust.id_subject;
       try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL="select * from tb_subject where id_subject='"+m+"'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                String x=rs.getString("subject_name")+ ";" + rs.getString("credit") ;
                String[] y = x.split(";",2);
                cust.subject_name =y[0];
                cust.credit=y[1];
               
                      
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

