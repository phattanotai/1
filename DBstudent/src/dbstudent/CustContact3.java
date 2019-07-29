package dbstudent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustContact3 extends JFrame {
    JPanel panel;
    JLabel idlbl,namelbl,creditlbl,messagelbl;
    JTextField idtxt,nametxt,credittxt;
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
    
    public CustContact3(){
        setTitle("Database");
        setSize(700,600);
        buildPanel();
        add(panel);
        setVisible(true);  
    }
    
    private void buildPanel(){
        idlbl =new JLabel("รหัสวิชาเรียน");
        namelbl=new JLabel("ชื่อวิชาเรียน");
        creditlbl=new JLabel("หน่วยกิต");
                
        messagelbl=new JLabel("ข้อมูลวิชา");           
        
        idtxt = new JTextField(20);
        nametxt= new JTextField(20);
        credittxt= new JTextField(5);      
          
        save= new JButton("Save");
        edit  = new JButton("Edit");     
        delete = new JButton("Delete");     
        reset= new JButton("Reset");
              
        idtxt.addActionListener(new TextListener());
        credittxt.addActionListener(new TextListener());
        
        save.addActionListener(new ButtonListener());
        edit.addActionListener(new ButtonListener());        
        delete.addActionListener(new ButtonListener());       
        reset.addActionListener(new ButtonListener());       
        
        idlbl.setFont(fn1);
        namelbl.setFont(fn1);
        creditlbl.setFont(fn1);
                   
        messagelbl.setFont(fn2);
                
        idtxt.setFont(fn1);
        nametxt.setFont(fn1);
        credittxt.setFont(fn1);
             
        save.setFont(fn1);
        edit.setFont(fn1);     
        delete.setFont(fn1);     
        reset.setFont(fn1);      
                   
        panel=new JPanel();
        panel.setLayout(new GridBagLayout());
      
        addItem(panel,messagelbl,2,0,2,1,GridBagConstraints.WEST);
        addItem(panel,idlbl,0,2,2,1,GridBagConstraints.WEST);
        addItem(panel,idtxt,2,2,3,1,GridBagConstraints.WEST);
        addItem(panel,namelbl,0,3,2,1,GridBagConstraints.WEST);
        addItem(panel,nametxt,2,3,3,1,GridBagConstraints.WEST);
        addItem(panel,creditlbl,0,4,2,1,GridBagConstraints.WEST);
        addItem(panel,credittxt,2,4,3,1,GridBagConstraints.WEST);
        
        addItem(panel,save,0,12,1,1,GridBagConstraints.WEST);      
        addItem(panel,edit,1,12,1,1,GridBagConstraints.WEST);
        addItem(panel,delete,2,12,1,1,GridBagConstraints.WEST);
        addItem(panel,reset,3,12,1,1,GridBagConstraints.WEST);
             
    }
    
    private class  TextListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
          if(e.getSource()==credittxt){
              String id_subject,name,credit;             
              id_subject=idtxt.getText();
              name=nametxt.getText();
              credit=credittxt.getText();

              if(add){
                  Insertsubject i = new Insertsubject(id_subject,name,credit);
              }else{
                  Changesubject i = new Changesubject(id_subject,name,credit);
              }
              
              idtxt.setText("");
              nametxt.setText("");
              credittxt.setText(""); 
              idtxt.setEditable(true);
              idtxt.requestFocus();
              add=true;
          
              }  
            
            if(e.getSource()==idtxt){
                customer3 cust=new customer3();
                cust.id_subject=idtxt.getText();
                Selectsubject i= new Selectsubject(cust);
                
                if((cust.subject_name)==null){
                    
                    nametxt.setEditable(true);
                    credittxt.setEditable(true);                   
                    nametxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    nametxt.setEditable(false);
                    credittxt.setEditable(false);
  
                    nametxt.setText(cust.subject_name);
                    credittxt.setText(cust.credit);
 
                }
            }          
        }    
    }

     private class  ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
            if(e.getSource()==save){
              String id,name,credit;
              id=idtxt.getText();
              name=nametxt.getText();
              credit=credittxt.getText();
              
              if(add){
                  Insertsubject i = new Insertsubject(id,name,credit);
              }else{
                  Changesubject i = new Changesubject(id,name,credit);
              }
              
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              
              idtxt.setText("");
              nametxt.setText("");
              credittxt.setText("");                
              idtxt.setEditable(true);
              idtxt.requestFocus(); 
              add=true;
   
            }

            if( e.getSource()== edit){
                customer3 cust=new customer3();
                cust.id_subject=idtxt.getText();
                Selectsubject i= new Selectsubject(cust);
                
                if((cust.subject_name)==null){
                    nametxt.setEditable(true);
                    credittxt.setEditable(true);
   
                    nametxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    nametxt.setEditable(false);
                    credittxt.setEditable(false);
 
                    nametxt.setText(cust.subject_name);
                    credittxt.setText(cust.credit);
  
                }
                
                add=false;
                nametxt.setEditable(true); 
                credittxt.setEditable(true);
                             
                nametxt.selectAll();
                nametxt.requestFocus();
                
            }
            if(e.getSource()== delete){
                String id_subject =idtxt.getText();               
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deletesubject l= new Deletesubject(id_subject);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
              idtxt.setText("");
              nametxt.setText(""); 
              credittxt.setText("");
              
              idtxt.setEditable(true);
              idtxt.requestFocus();             
              add=true;
              }
            
            if(e.getSource()==reset){
                add=true;
                idtxt.setEditable(true);
                nametxt.setEditable(true);
                credittxt.setEditable(true);
  
                idtxt.setText("");
                nametxt.setText("");  
                credittxt.setText("");

                idtxt.requestFocus();
                
            }    
    }
     
        
     }
      
}