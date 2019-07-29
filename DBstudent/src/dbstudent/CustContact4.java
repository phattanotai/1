package dbstudent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustContact4 extends JFrame {
    JPanel panel;
    JLabel idlbl,id2lbl,semesterlbl,yearlbl,daylbl,timelbl,roomlbl,messagelbl;
    JTextField idtxt,id2txt,semestertxt,yeartxt,daytxt,timetxt,roomtxt;
    JButton save,edit,delete,reset;
    Font fn1 =new Font ("Tahoma",Font.BOLD,14);
    
    Font fn2 =new Font ("Tahoma",Font.BOLD,20);
    boolean add=true;
   
    public static void addItem(JPanel p,JComponent c, int x,int y,int width,int height,int align){
      GridBagConstraints gc = new GridBagConstraints(); 
      gc.gridx=x;
      gc.gridy=y;
      gc.gridwidth=width;
      gc.gridheight=height;
      gc.insets= new Insets(5,5,5,5);
      gc.anchor=align;
      gc.fill=GridBagConstraints.NONE;
      p.add(c,gc);
    }

    public CustContact4(){
        setTitle("Database");
        setSize(700,600);
        buildPanel();
        add(panel);
        setVisible(true);  
    }
    
    private void buildPanel(){
        idlbl =new JLabel("รหัสวิชา");
        id2lbl=new JLabel("รหัสอาจารย์");
        semesterlbl=new JLabel("เทอม");
        yearlbl=new JLabel("ปี");       
        daylbl=new JLabel("วันที่สอน");
        timelbl=new JLabel("เวลาที่สอน");
        roomlbl=new JLabel("ห้องที่สอน");

        messagelbl=new JLabel("ข้อมูลวิชาที่สอน");
 
        idtxt = new JTextField(20);
        id2txt= new JTextField(20);
        semestertxt= new JTextField(5);      
        yeartxt = new JTextField(10);       
        daytxt = new JTextField(20); 
        timetxt = new JTextField(5);
        roomtxt = new JTextField(5);
        
        save= new JButton("Save");
        edit  = new JButton("Edit");     
        delete = new JButton("Delete");     
        reset= new JButton("Reset");
        
        
        id2txt.addActionListener(new TextListener());
        roomtxt.addActionListener(new TextListener());
        
        save.addActionListener(new ButtonListener());
        edit.addActionListener(new ButtonListener());        
        delete.addActionListener(new ButtonListener());       
        reset.addActionListener(new ButtonListener());
        
        idlbl.setFont(fn1);
        id2lbl.setFont(fn1);
        semesterlbl.setFont(fn1);
        yearlbl.setFont(fn1);       
        daylbl.setFont(fn1); 
        timelbl.setFont(fn1);
        roomlbl.setFont(fn1);
        
        messagelbl.setFont(fn2);
                
        idtxt.setFont(fn1);
        id2txt.setFont(fn1);
        semestertxt.setFont(fn1);
        yeartxt .setFont(fn1);     
        daytxt.setFont(fn1);
        timetxt.setFont(fn1);
        roomtxt.setFont(fn1);
       
       
        save.setFont(fn1);
        edit.setFont(fn1);     
        delete.setFont(fn1);     
        reset.setFont(fn1); 
        
        
       
                
        panel=new JPanel();
        panel.setLayout(new GridBagLayout());
      
        addItem(panel,messagelbl,2,0,2,1,GridBagConstraints.WEST);
        addItem(panel,idlbl,0,2,2,1,GridBagConstraints.WEST);
        addItem(panel,idtxt,2,2,3,1,GridBagConstraints.WEST);
        addItem(panel,id2lbl,0,3,2,1,GridBagConstraints.WEST);
        addItem(panel,id2txt,2,3,3,1,GridBagConstraints.WEST);
        addItem(panel,semesterlbl,0,4,2,1,GridBagConstraints.WEST);
        addItem(panel,semestertxt,2,4,3,1,GridBagConstraints.WEST);
        addItem(panel,yearlbl,0,5,2,1,GridBagConstraints.WEST);
        addItem(panel,yeartxt,2,5,3,1,GridBagConstraints.WEST);
        addItem(panel,daylbl,0,6,2,1,GridBagConstraints.WEST);
        addItem(panel,daytxt,2,6,3,1,GridBagConstraints.WEST);
        addItem(panel,timelbl,0,7,2,1,GridBagConstraints.WEST);
        addItem(panel,timetxt,2,7,3,1,GridBagConstraints.WEST);
        addItem(panel,roomlbl,0,8,2,1,GridBagConstraints.WEST);
        addItem(panel,roomtxt,2,8,3,1,GridBagConstraints.WEST);
       
        
        addItem(panel,save,0,12,1,1,GridBagConstraints.WEST);     
        addItem(panel,edit,1,12,1,1,GridBagConstraints.WEST);
        addItem(panel,delete,2,12,1,1,GridBagConstraints.WEST);
        addItem(panel,reset,3,12,1,1,GridBagConstraints.WEST);
        
        
    }
    
    

    private class  TextListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
          if(e.getSource()==roomtxt){
              String id_subject,id_teacher,semester,year,day,time,room;
              
              id_subject=idtxt.getText();
              id_teacher=id2txt.getText();
              semester=semestertxt.getText();
              year=yeartxt.getText();
              day=daytxt.getText();
              time=timetxt.getText();
              room=roomtxt.getText();
              
              
              if(add){
                  Insertteaching i = new Insertteaching(id_subject,id_teacher,semester,year,day,time,room);
              }else{
                  Changeteaching i = new Changeteaching(id_subject,id_teacher,semester,year,day,time,room);
              }
              
              idtxt.setText("");
              id2txt.setText("");
              semestertxt.setText("");
              yeartxt.setText("");
              daytxt.setText("");
              timetxt.setText("");
              roomtxt.setText("");
              idtxt.setEditable(true);
              idtxt.requestFocus();
              add=true;
          
              }  
            
            if(e.getSource()==id2txt){
                customer4 cust=new customer4();
                cust.id_subject=idtxt.getText();
                cust.id_teacher=id2txt.getText();
                Selectteaching i= new Selectteaching(cust);
                
                if((cust.semester)==null){
                    
                    semestertxt.setEditable(true);
                    yeartxt.setEditable(true);
                    daytxt.setEditable(true);
                    timetxt.setEditable(true);
                    roomtxt.setEditable(true);
                    semestertxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    id2txt.setEditable(false);
                    semestertxt.setEditable(false);
                    yeartxt.setEditable(false);
                    daytxt.setEditable(false);
                    timetxt.setEditable(false);
                    roomtxt.setEditable(false);
                  
                    
                    
                    semestertxt.setText(cust.semester);
                    yeartxt.setText(cust.year);
                    daytxt.setText(cust.day);
                    timetxt.setText(cust.time);
                    roomtxt.setText(cust.room);
                 
                    
                }
            }          
        }    
    }

     private class  ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
            if(e.getSource()==save){
              String id,id2,semester,year,day,time,room;
              id=idtxt.getText();
              id2=id2txt.getText();
              semester=semestertxt.getText();
              year=yeartxt.getText();
              day=daytxt.getText();
              time=daytxt.getText();
              room=daytxt.getText();
             
              
              if(add){
                  Insertteaching i = new Insertteaching(id,id2,semester,year,day,time,room);
              }else{
                  Changeteaching i = new Changeteaching(id,id2,semester,year,day,time,room);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              idtxt.setText("");
              id2txt.setText("");
              semestertxt.setText("");
              yeartxt.setText("");
              daytxt.setText("");
              timetxt.setText("");
              roomtxt.setText("");
              
              idtxt.setEditable(true);
              idtxt.requestFocus();
              id2txt.setEditable(true);
              add=true;
   
            }

            if( e.getSource()== edit){
                customer4 cust=new customer4();
                cust.id_subject=idtxt.getText();
                cust.id_teacher=id2txt.getText();
                Selectteaching i= new Selectteaching(cust);
                
                if((cust.semester)==null){
                    semestertxt.setEditable(true);
                    yeartxt.setEditable(true);
                    daytxt.setEditable(true);
                    timetxt.setEditable(true);
                    roomtxt.setEditable(true);
                    
                    semestertxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    id2txt.setEditable(false);
                    semestertxt.setEditable(false);
                    yeartxt.setEditable(false);
                    daytxt.setEditable(false);
                    timetxt.setEditable(false);
                    roomtxt.setEditable(false);
                    
                    semestertxt.setText(cust.semester);
                    yeartxt.setText(cust.year);
                    daytxt.setText(cust.day);
                    timetxt.setText(cust.time);
                    roomtxt.setText(cust.room);
                   
                    
                }
                
                add=false;
                semestertxt.setEditable(true); 
                yeartxt.setEditable(true);
                daytxt.setEditable(true); 
                timetxt.setEditable(true); 
                roomtxt.setEditable(true); 
                semestertxt.selectAll();
                semestertxt.requestFocus();
                
            }
            if(e.getSource()== delete){
                String id =idtxt.getText();
                String id2=id2txt.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deleteteaching i= new Deleteteaching(id,id2);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
              idtxt.setText("");
              id2txt.setText(""); 
              semestertxt.setText("");
              yeartxt.setText("");
              daytxt.setText("");
              timetxt.setText("");
              roomtxt.setText("");
              
              idtxt.setEditable(true);
              idtxt.requestFocus();
              id2txt.setEditable(true);        
              add=true;
              }
            
            if(e.getSource()==reset){
                add=true;
                idtxt.setEditable(true);
                id2txt.setEditable(true);
                semestertxt.setEditable(true);
                yeartxt.setEditable(true);
                daytxt.setEditable(true);
                timetxt.setEditable(true);
                roomtxt.setEditable(true);
                
                
                idtxt.setText("");
                id2txt.setText("");  
                semestertxt.setText("");
                yeartxt.setText("");
                daytxt.setText("");
                timetxt.setText("");
                roomtxt.setText("");
              
                
                idtxt.requestFocus();
                
            }
            
            
    }
     
        
     }
      
}
