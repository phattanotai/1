package dbstudent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CustContact1 extends JFrame {
    JPanel panel;
    JLabel idlbl,namelbl,sexlbl,addresslbl,phonelbl,emaillbl,messagelbl;
    JTextField idtxt,nametxt,sextxt,phonetxt,emailtxt;
    JTextArea addresstxt;
    JScrollPane jScrollPane1 = new JScrollPane();
    JButton save,edit,delete,reset;
    Font fn1 =new Font ("Tahoma",Font.BOLD,14);
    Font fn2 =new Font ("Courier New",Font.BOLD,16);
    Font fn3 =new Font ("Tahoma",Font.BOLD,20);
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
    
    
    public CustContact1(){
        setTitle("ระบบฐานข้อมูลนักศึกษา ศูนย์การศึกษาวัดไตรมิตร รุ่นที่ 11");
        setSize(700,600);
        buildPanel();
        add(panel);
        setVisible(true);  
    }
    
    private void buildPanel(){
        idlbl =new JLabel("รหัสอาจารย์");
        namelbl=new JLabel("ชื่อ-นามสกุล");
        sexlbl=new JLabel("เพศ");            
        addresslbl=new JLabel("ที่อยู่");         
        phonelbl =new JLabel("เบอร์โทร");       
        emaillbl =new JLabel("E-mail");         
        messagelbl=new JLabel("ข้อมูลอาจารย์ ");
        
        
        
        idtxt = new JTextField(20);
        nametxt= new JTextField(20);
        sextxt= new JTextField(5);                    
        addresstxt = new JTextArea(); 
        addresstxt.setColumns(20);
        addresstxt.setRows(4);
        

        phonetxt = new JTextField(20);       
        emailtxt = new JTextField(20);       
         
        
        save= new JButton("Save");
        edit  = new JButton("Edit");     
        delete = new JButton("Delete");     
        reset= new JButton("Reset");

        idtxt.addActionListener(new TextListener());
        emailtxt.addActionListener(new TextListener());
        
        save.addActionListener(new ButtonListener());
        edit.addActionListener(new ButtonListener());        
        delete.addActionListener(new ButtonListener());       
        reset.addActionListener(new ButtonListener());      
        
        idlbl.setFont(fn1);
        namelbl.setFont(fn1);
        sexlbl.setFont(fn1);
              
        addresslbl.setFont(fn1);      
        phonelbl .setFont(fn1);      
        emaillbl .setFont(fn1);      
        messagelbl.setFont(fn3);
                
        idtxt.setFont(fn1);
        nametxt.setFont(fn1);
        sextxt.setFont(fn1);    
        addresstxt.setFont(fn1);       
        phonetxt.setFont(fn1);       
        emailtxt .setFont(fn1);   
        
       
        save.setFont(fn2);
        edit.setFont(fn2);     
        delete.setFont(fn2);     
        reset.setFont(fn2); 

        jScrollPane1.setViewportView(addresstxt);
                
        panel=new JPanel();
        panel.setLayout(new GridBagLayout());
      
        addItem(panel,messagelbl,2,0,2,1,GridBagConstraints.WEST);
        addItem(panel,idlbl,0,2,2,1,GridBagConstraints.WEST);
        addItem(panel,idtxt,2,2,3,1,GridBagConstraints.WEST);
        addItem(panel,namelbl,0,3,2,1,GridBagConstraints.WEST);
        addItem(panel,nametxt,2,3,3,1,GridBagConstraints.WEST);
        addItem(panel,sexlbl,0,4,2,1,GridBagConstraints.WEST);
        addItem(panel,sextxt,2,4,3,1,GridBagConstraints.WEST);
        addItem(panel,addresslbl,0,6,2,1,GridBagConstraints.WEST);
        addItem(panel,jScrollPane1,2,6,3,1,GridBagConstraints.WEST);
        addItem(panel,phonelbl,0,7,2,1,GridBagConstraints.WEST);
        addItem(panel,phonetxt,2,7,3,1,GridBagConstraints.WEST);
        addItem(panel,emaillbl,0,8,2,1,GridBagConstraints.WEST);
        addItem(panel,emailtxt,2,8,3,1,GridBagConstraints.WEST);
        
        
        addItem(panel,save,0,12,1,1,GridBagConstraints.WEST);       
        addItem(panel,edit,1,12,1,1,GridBagConstraints.WEST);
        addItem(panel,delete,2,12,1,1,GridBagConstraints.WEST);
        addItem(panel,reset,3,12,1,1,GridBagConstraints.WEST);
        
        
    }

    private class  TextListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
          if(e.getSource()==emailtxt){
              String id,name,sex,address,phone,email;
              id=idtxt.getText();
              name=nametxt.getText();
              sex=sextxt.getText();            
              address=addresstxt.getText();
              phone=phonetxt.getText();
              email=emailtxt.getText();
        
              if(add){
                  Insertteacher i = new Insertteacher(id,name,sex,address,phone,email);
              }else{
                  Changeteacher i = new Changeteacher(id,name,sex,address,phone,email);
              }           
              idtxt.setText("");
              nametxt.setText("");
              sextxt.setText("");
            
              addresstxt.setText("");
              phonetxt.setText("");
              emailtxt.setText("");
              
              idtxt.setEditable(true);
              idtxt.requestFocus();
              add=true;        
              }  
           
            if(e.getSource()==idtxt){
                customer1 cust=new customer1();
                cust.id=idtxt.getText();
                Selectteacher i= new Selectteacher(cust);
                
                if((cust.name)==null){
                    nametxt.setEditable(true);
                    sextxt.setEditable(true);
                 
                    addresstxt.setEditable(true);
                    phonetxt.setEditable(true);
                    emailtxt.setEditable(true);
                    
                    nametxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    nametxt.setEditable(false);
                    sextxt.setEditable(false);
                    
                    addresstxt.setEditable(false);
                    phonetxt.setEditable(false);
                    emailtxt.setEditable(false);
                    
                    
                    nametxt.setText(cust.name); 
                    sextxt.setText(cust.sex);
                    
                    addresstxt.setText(cust.address);
                    phonetxt.setText(cust.phone);
                    emailtxt.setText(cust.email);
  
                }
            }          
        }    
    }

     private class  ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            
            if(e.getSource()==save){
              String id,name,sex,address,phone,email;
              id=idtxt.getText();
              name=nametxt.getText();
              sex=sextxt.getText();
              
              address=addresstxt.getText();
              phone=phonetxt.getText();
              email=emailtxt.getText();
              
              
              if(add){
                  Insertteacher i = new Insertteacher(id,name,sex,address,phone,email);
              }else{
                  Changeteacher i = new Changeteacher(id,name,sex,address,phone,email);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              idtxt.setText("");
              nametxt.setText("");
              sextxt.setText("");
              
              addresstxt.setText("");
              phonetxt.setText("");
              emailtxt.setText("");
              
              idtxt.setEditable(true);
              idtxt.requestFocus();
              add=true;
            }
            if( e.getSource()== edit){
                customer1 cust=new customer1();
                cust.id=idtxt.getText();
                Selectteacher i= new Selectteacher(cust);
                
                if((cust.name)==null){
                    nametxt.setEditable(true);
                    sextxt.setEditable(true);
                    
                    addresstxt.setEditable(true);
                    phonetxt.setEditable(true);
                    emailtxt.setEditable(true);
                   
                    nametxt.requestFocus();   
                }else{
                    idtxt.setEditable(false);
                    nametxt.setEditable(false);
                    
                    sextxt.setEditable(false);
                    addresstxt.setEditable(false);
                    phonetxt.setEditable(false);
                    emailtxt.setEditable(false);
                    
                    
                    nametxt.setText(cust.name);
                    sextxt.setText(cust.sex);
                    
                    addresstxt.setText(cust.address);
                    phonetxt.setText(cust.phone);
                    emailtxt.setText(cust.email);
   
                }
                
                add=false;
                nametxt.setEditable(true); 
                sextxt.setEditable(true);
                
                addresstxt.setEditable(true);
                phonetxt.setEditable(true);
                emailtxt.setEditable(true);
                
                nametxt.selectAll();
                nametxt.requestFocus();
                
            }
            if(e.getSource()== delete){
                String id =idtxt.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deleteteacher i= new Deleteteacher(id);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
              idtxt.setText("");
              nametxt.setText(""); 
              sextxt.setText("");
              
              addresstxt.setText("");
              phonetxt.setText("");
              emailtxt.setText("");
             
              idtxt.setEditable(true);
              idtxt.requestFocus();
              add=true;
              }
            
            if(e.getSource()==reset){
                add=true;
                idtxt.setEditable(true);
                nametxt.setEditable(true);
                sextxt.setEditable(true);
               
                addresstxt.setEditable(true);
                phonetxt.setEditable(true);
                emailtxt.setEditable(true);
             
                
                idtxt.setText("");
                nametxt.setText("");  
                sextxt.setText("");
               
                addresstxt.setText("");
                phonetxt.setText("");
                emailtxt.setText("");

                idtxt.requestFocus();
            }
            

    }
     
        
     }
      
}
