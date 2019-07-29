package dbstudent;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
public class Showteacher extends JFrame{
    private JTable table;
    String i,n;
     public Showteacher(customer1 cust){
        i=cust.id;
        n=cust.name;      
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
            SQL = "select * from teacher Where id_teacher like '%"+i+"%'|| name like '%"+n+"%'";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
            String[] col={"รหัส", "ชี่อ-นามสกุล", "เพศ",  "ที่อยู่", "เบอร์โทร", "E-mail"};   
            Object[][] data=new Object[l][6];
            ResultSet rs = stmt.executeQuery(SQL);
                String [][]t= new String[l][6];  
                int i=0;
                while(rs.next()){
                data[i][0]=rs.getString("id_teacher");
                data[i][1]=rs.getString("name");
                data[i][2]=rs.getString("sex");
                data[i][3]=rs.getString("address");
                data[i][4]=rs.getString("phone");
                data[i][5]=rs.getString("email");
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
