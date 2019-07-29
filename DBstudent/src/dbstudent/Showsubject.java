package dbstudent;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class Showsubject extends JFrame{
    private JTable table;
    String i,n;
     public Showsubject(customer3 cust){
        i=cust.id_subject;
        n=cust.subject_name;
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
            SQL = "select * from tb_subject where id_subject like '%"+i+"%' || subject_name like '%"+n+"%' ";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            } 
            String[] col={ "รหัสวิชาเรียน", "ชื่อวิชาเรียน", "หน่วยกิต"};   
            Object[][] data=new Object[l][3];
            ResultSet rs = stmt.executeQuery(SQL);
                String [][]t= new String[l][3];  
                int i=0;
                while(rs.next()){              
                data[i][0]=rs.getString("id_subject");
                data[i][1]=rs.getString("subject_name");
                data[i][2]=rs.getString("credit");
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
