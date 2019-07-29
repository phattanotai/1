package dbstudent;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class Showteaching extends JFrame{
    private JTable table;
    String i,n;
     public Showteaching(customer4 cust){
        i=cust.id_teacher;
        n=cust.id_subject;
        setTitle("Database");
        setSize(835,300);
        buildPanel();
        setVisible(true);   
    }
   private void buildPanel(){
        setLayout(new FlowLayout());

        Connection theConn=null;
        String SQL;
      
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "select * from teaching where id_teacher like '%"+i+"%' || id_subject like '%"+n+"%'";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
                String[] col={"รหัสวิชา", "รหัสอาจารย์", "เทอม",  "ปี", "วันสอน", "เวลาสอน", "ห้องสอน"};   
                Object[][] data=new Object[l][7];
                ResultSet rs = stmt.executeQuery(SQL);
                String [][]t= new String[l][7];  
                int i=0;
                while(rs.next()){
                data[i][0]=rs.getString("id_subject");
                data[i][1]=rs.getString("id_teacher");
                data[i][2]=rs.getString("semester");
                data[i][3]=rs.getString("year");
                data[i][4]=rs.getString("day");
                data[i][5]=rs.getString("time");  
                data[i][6]=rs.getString("time");
                i++;
                }
                table=new JTable(data,col);
                table.setPreferredScrollableViewportSize(new Dimension(800,250));
                table.setFillsViewportHeight(true);
                
                JScrollPane scrollPane = new JScrollPane(table);
                add(scrollPane);
                
    
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
