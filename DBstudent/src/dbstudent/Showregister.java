package dbstudent;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class Showregister extends JFrame{
    private JTable table;
    String i,n;
     public Showregister(customer2 cust){
        i=cust.id_student;
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
            SQL = "select * from register Where id_student like '%"+i+"%'||id_subject like '%"+n+"%'";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
                String[] col={"รหัสนักศึกษา", "รหัสวิชาเรียน", "เทอม", "ปี", "เกรด"};   
                Object[][] data=new Object[l][5];
                String [][]t= new String[l][5]; 
                ResultSet rs = stmt.executeQuery(SQL);
                int i=0;
                while(rs.next()){
                data[i][0]=rs.getString("id_student");
                data[i][1]=rs.getString("id_subject");
                data[i][2]=rs.getString("semester");
                data[i][3]=rs.getString("year");
                data[i][4]=rs.getString("grade");
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
