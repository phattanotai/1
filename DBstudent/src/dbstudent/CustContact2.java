package dbstudent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustContact2 extends JFrame {
    JPanel panel;
    JLabel idlbl,id2lbl,semesterlbl,yearlbl,gradelbl,messagelbl;
    JTextField idtxt,id2txt,semestertxt,yeartxt,gradetxt;
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
      
    public CustContact2(){
        setTitle("Database");
        setSize(700,600);
        buildPanel();
        add(panel);
        setVisible(true);  
    } 
    private void buildPanel(){
        idlbl =new JLabel("รหัสนักศึกษา");
        id2lbl=new JLabel("รหัสวิชาเรียน");
        semesterlbl=new JLabel("เทอม");
        yearlbl=new JLabel("ปี");       
        gradelbl=new JLabel("เกรด");         

        messagelbl=new JLabel("ข้อมูลลงทะเบียน");
                   
        idtxt = new JTextField(20);
        id2txt= new JTextField(20);
        semestertxt= new JTextField(5);      
        yeartxt = new JTextField(20);       
        gradetxt = new JTextField(20); 
      
   
        
        save= new JButton("Save");
        edit  = new JButton("Edit");     
        delete = new JButton("Delete");     
        reset= new JButton("Reset");
        
        
        id2txt.addActionListener(new TextListener());
        gradetxt.addActionListener(new TextListener());
        
        save.addActionListener(new ButtonListener());
        edit.addActionListener(new ButtonListener());        
        delete.addActionListener(new ButtonListener());       
        reset.addActionListener(new ButtonListener());
        
        
        idlbl.setFont(fn1);
        id2lbl.setFont(fn1);
        semesterlbl.setFont(fn1);
        yearlbl.setFont(fn1);       
        gradelbl.setFont(fn1);            
        messagelbl.setFont(fn2);
                
        idtxt.setFont(fn1);
        id2txt.setFont(fn1);
        semestertxt.setFont(fn1);
        yeartxt .setFont(fn1);     
        gradetxt.setFont(fn1);       
       
       
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
        addItem(panel,gradelbl,0,6,2,1,GridBagConstraints.WEST);
        addItem(panel,gradetxt,2,6,3,1,GridBagConstraints.WEST);
       
        
        addItem(panel,save,0,12,1,1,GridBagConstraints.WEST);        
        addItem(panel,edit,1,12,1,1,GridBagConstraints.WEST);
        addItem(panel,delete,2,12,1,1,GridBagConstraints.WEST);
        addItem(panel,reset,3,12,1,1,GridBagConstraints.WEST);
        
        
    }

    private class  TextListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
          if(e.getSource()==gradetxt){
              String id_student,id_subject,semester,year,grade;
              id_student=idtxt.getText();
              id_subject=id2txt.getText();
              semester=semestertxt.getText();
              year=yeartxt.getText();
              grade=gradetxt.getText();
              
              
              if(add){
                  Insertregister i = new Insertregister(id_student,id_subject,semester,year,grade);
              }else{
                  Changeregister i = new Changeregister(id_student,id_subject,semester,year,grade);
              }
              
              idtxt.setText("");
              id2txt.setText("");
              semestertxt.setText("");
              yeartxt.setText("");
              gradetxt.setText("");
              idtxt.setEditable(true);
              idtxt.requestFocus();
              add=true;
          
              }  
            
            if(e.getSource()==id2txt){
                customer2 cust=new customer2();
                cust.id_student=idtxt.getText();
                cust.id_subject=id2txt.getText();
                Selectregister i= new Selectregister(cust);
                
                if((cust.semester)==null){
                    
                    semestertxt.setEditable(true);
                    yeartxt.setEditable(true);
                    gradetxt.setEditable(true);
                    semestertxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    id2txt.setEditable(false);
                    semestertxt.setEditable(false);
                    yeartxt.setEditable(false);
                    gradetxt.setEditable(false);

                    semestertxt.setText(cust.semester);
                    yeartxt.setText(cust.year);
                    gradetxt.setText(cust.grade);
 
                }
            }          
        }    
    }

     private class  ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
            if(e.getSource()==save){
              String id,id2,semester,year,grade;
              id=idtxt.getText();
              id2=id2txt.getText();
              semester=semestertxt.getText();
              year=yeartxt.getText();
              grade=gradetxt.getText();

              if(add){
                  Insertregister i = new Insertregister(id,id2,semester,year,grade);
              }else{
                  Changeregister i = new Changeregister(id,id2,semester,year,grade);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              idtxt.setText("");
              id2txt.setText("");
              semestertxt.setText("");
              yeartxt.setText("");
              gradetxt.setText("");           
              idtxt.setEditable(true);
              idtxt.requestFocus();
              id2txt.setEditable(true);
              
              add=true;
            }

            if( e.getSource()== edit){
                customer2 cust=new customer2();
                cust.id_student=idtxt.getText();
                cust.id_subject=id2txt.getText();
                Selectregister i= new Selectregister(cust);
                
                if((cust.semester)==null){
                    semestertxt.setEditable(true);
                    yeartxt.setEditable(true);
                    gradetxt.setEditable(true);
                    
                    semestertxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    id2txt.setEditable(false);
                    semestertxt.setEditable(false);
                    yeartxt.setEditable(false);
                    gradetxt.setEditable(false);                    
                    
                    semestertxt.setText(cust.semester);
                    yeartxt.setText(cust.year);
                    gradetxt.setText(cust.grade);  
                }
                
                add=false;
                semestertxt.setEditable(true); 
                yeartxt.setEditable(true);
                gradetxt.setEditable(true);               
                semestertxt.selectAll();
                semestertxt.requestFocus();
                
            }
            if(e.getSource()== delete){
                String id =idtxt.getText();
                String id2=id2txt.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deleteregister i= new Deleteregister(id,id2);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
              idtxt.setText("");
              id2txt.setText(""); 
              semestertxt.setText("");
              yeartxt.setText("");
              gradetxt.setText("");
              
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
                gradetxt.setEditable(true);
         
                idtxt.setText("");
                id2txt.setText("");  
                semestertxt.setText("");
                yeartxt.setText("");
                gradetxt.setText("");
        
                idtxt.requestFocus();
                id2txt.requestFocus();
            }
   
    }
     
        
     }
      
}
