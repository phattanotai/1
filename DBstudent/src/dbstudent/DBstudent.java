package dbstudent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class DBstudent extends javax.swing.JFrame {
    private javax.swing.JMenu Menu_about;
    private javax.swing.JMenu Menu_file;
    private javax.swing.JMenuItem about;
    private javax.swing.JPanel add_rrgister;
    private javax.swing.JPanel add_student;
    private javax.swing.JPanel add_subject;
    private javax.swing.JPanel add_teacher;
    private javax.swing.JPanel add_teaching;
    private javax.swing.JLabel address_student;
    private javax.swing.JLabel address_teacher;
    private javax.swing.JLabel birthday_student;
    private javax.swing.JLabel branch;
    private javax.swing.JLabel credit;
    private javax.swing.JTabbedPane data1;
    private javax.swing.JTabbedPane data2;
    private javax.swing.JTabbedPane data3;
    private javax.swing.JTabbedPane data4;
    private javax.swing.JTabbedPane data5;
    private javax.swing.JTabbedPane data6;
    private javax.swing.JLabel daylbl;
    private javax.swing.JTextField daytxt;
    private javax.swing.JButton delete_regiter;
    private javax.swing.JButton delete_student;
    private javax.swing.JButton delete_subject;
    private javax.swing.JButton delete_teacher;
    private javax.swing.JButton delete_teaching;
    private javax.swing.JButton edit_register;
    private javax.swing.JButton edit_stdent;
    private javax.swing.JButton edit_subject;
    private javax.swing.JButton edit_teacher;
    private javax.swing.JButton edit_teaching;
    private javax.swing.JLabel email_student;
    private javax.swing.JLabel email_teacher;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel faculty;
    private javax.swing.JLabel grade;
    private javax.swing.JLabel id_student;
    private javax.swing.JLabel id_student1;
    private javax.swing.JLabel id_subject;
    private javax.swing.JLabel id_subject1;
    private javax.swing.JLabel id_subjectlbl;
    private javax.swing.JTextField id_subjecttxt;
    private javax.swing.JLabel id_teacher;
    private javax.swing.JLabel id_teacherlbl;
    private javax.swing.JTextField id_teachertxt;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message10;
    private javax.swing.JLabel message11;
    private javax.swing.JLabel message12;
    private javax.swing.JLabel message13;
    private javax.swing.JLabel message14;
    private javax.swing.JLabel message15;
    private javax.swing.JLabel message16;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel message3;
    private javax.swing.JLabel message4;
    private javax.swing.JLabel message6;
    private javax.swing.JLabel message7;
    private javax.swing.JLabel message8;
    private javax.swing.JLabel message9;
    private javax.swing.JLabel name_student;
    private javax.swing.JLabel name_teacher;
    private javax.swing.JPanel p_register;
    private javax.swing.JPanel p_student;
    private javax.swing.JPanel p_subject;
    private javax.swing.JPanel p_teacher;
    private javax.swing.JPanel p_teaching;
    private javax.swing.JLabel phone_student;
    private javax.swing.JLabel phone_teacher;
    private javax.swing.JMenuItem register;
    private javax.swing.JButton reset_register;
    private javax.swing.JButton reset_student;
    private javax.swing.JButton reset_subject;
    private javax.swing.JButton reset_teacher;
    private javax.swing.JButton reset_teaching;
    private javax.swing.JLabel roomlbl;
    private javax.swing.JTextField roomtxt;
    private javax.swing.JButton save_register;
    private javax.swing.JButton save_student;
    private javax.swing.JButton save_subject;
    private javax.swing.JButton save_teacher;
    private javax.swing.JButton save_teaching;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField search2;
    private javax.swing.JTextField search3;
    private javax.swing.JTextField search4;
    private javax.swing.JTextField search5;
    private javax.swing.JLabel semester;
    private javax.swing.JLabel semesterlbl;
    private javax.swing.JTextField semestertxt;
    private javax.swing.JLabel sex_student;
    private javax.swing.JLabel sex_teacher;
    private javax.swing.JPanel show_grade;
    private javax.swing.JPanel show_register;
    private javax.swing.JPanel show_subject;
    private javax.swing.JPanel show_teacher;
    private javax.swing.JPanel show_teaching;
    private javax.swing.JMenuItem student;
    private javax.swing.JMenuItem subject;
    private javax.swing.JLabel subject_name;
    private javax.swing.JTextArea t_addressstudent;
    private javax.swing.JTextArea t_addressteacher;
    private javax.swing.JTextField t_birthdaystudent;
    private javax.swing.JTextField t_branch;
    private javax.swing.JTextField t_credit;
    private javax.swing.JTextField t_emailstudent;
    private javax.swing.JTextField t_emailteacher;
    private javax.swing.JTextField t_faculty;
    private javax.swing.JTextField t_grade1;
    private javax.swing.JTextField t_id_subject;
    private javax.swing.JTextField t_idstudent;
    private javax.swing.JTextField t_idteacher;
    private javax.swing.JTextField t_namestudent;
    private javax.swing.JTextField t_nameteacher;
    private javax.swing.JTextField t_phonestudent;
    private javax.swing.JTextField t_phoneteacher;
    private javax.swing.JButton t_search1;
    private javax.swing.JButton t_search2;
    private javax.swing.JButton t_search3;
    private javax.swing.JButton t_search4;
    private javax.swing.JButton t_search5;
    private javax.swing.JTextField t_semester1;
    private javax.swing.JTextField t_sexstudent;
    private javax.swing.JTextField t_sexteacher;
    private javax.swing.JTextField t_student1;
    private javax.swing.JTextField t_subject1;
    private javax.swing.JTextField t_subject_name;
    private javax.swing.JTextField t_year1;
    private javax.swing.JMenuItem teacher;
    private javax.swing.JMenuItem teaching;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField timetxt;
    private javax.swing.JLabel year;
    private javax.swing.JLabel yearlbl;
    private javax.swing.JTextField yeartxt;
    private boolean add=true;
    public DBstudent() {
        initComponents();
        setTitle("ระบบฐานข้อมูลนักศึกษา ศูนย์การศึกษาวัดไตรมิตร รุ่นที่ 11");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        data1 = new javax.swing.JTabbedPane();
        p_student = new javax.swing.JPanel();
        message1 = new javax.swing.JLabel();
        data2 = new javax.swing.JTabbedPane();
        add_student = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        id_student = new javax.swing.JLabel();
        name_student = new javax.swing.JLabel();
        sex_student = new javax.swing.JLabel();
        birthday_student = new javax.swing.JLabel();
        address_student = new javax.swing.JLabel();
        phone_student = new javax.swing.JLabel();
        email_student = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        faculty = new javax.swing.JLabel();
        t_idstudent = new javax.swing.JTextField();
        t_namestudent = new javax.swing.JTextField();
        t_sexstudent = new javax.swing.JTextField();
        t_birthdaystudent = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_addressstudent = new javax.swing.JTextArea();
        t_phonestudent = new javax.swing.JTextField();
        t_emailstudent = new javax.swing.JTextField();
        t_branch = new javax.swing.JTextField();
        t_faculty = new javax.swing.JTextField();
        save_student = new javax.swing.JButton();
        edit_stdent = new javax.swing.JButton();
        delete_student = new javax.swing.JButton();
        reset_student = new javax.swing.JButton();
        message8 = new javax.swing.JLabel();
        show_grade = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        message7 = new javax.swing.JLabel();
        search1 = new javax.swing.JTextField();
        t_search1 = new javax.swing.JButton();
        p_teacher = new javax.swing.JPanel();
        message2 = new javax.swing.JLabel();
        data3 = new javax.swing.JTabbedPane();
        add_teacher = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        message9 = new javax.swing.JLabel();
        id_teacher = new javax.swing.JLabel();
        name_teacher = new javax.swing.JLabel();
        sex_teacher = new javax.swing.JLabel();
        address_teacher = new javax.swing.JLabel();
        phone_teacher = new javax.swing.JLabel();
        email_teacher = new javax.swing.JLabel();
        t_idteacher = new javax.swing.JTextField();
        t_nameteacher = new javax.swing.JTextField();
        t_sexteacher = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        t_addressteacher = new javax.swing.JTextArea();
        t_phoneteacher = new javax.swing.JTextField();
        t_emailteacher = new javax.swing.JTextField();
        save_teacher = new javax.swing.JButton();
        edit_teacher = new javax.swing.JButton();
        delete_teacher = new javax.swing.JButton();
        reset_teacher = new javax.swing.JButton();
        show_teacher = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        message10 = new javax.swing.JLabel();
        search2 = new javax.swing.JTextField();
        t_search2 = new javax.swing.JButton();
        p_register = new javax.swing.JPanel();
        message3 = new javax.swing.JLabel();
        data4 = new javax.swing.JTabbedPane();
        add_rrgister = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        message14 = new javax.swing.JLabel();
        id_student1 = new javax.swing.JLabel();
        id_subject1 = new javax.swing.JLabel();
        semester = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        t_student1 = new javax.swing.JTextField();
        t_subject1 = new javax.swing.JTextField();
        t_semester1 = new javax.swing.JTextField();
        t_year1 = new javax.swing.JTextField();
        t_grade1 = new javax.swing.JTextField();
        save_register = new javax.swing.JButton();
        edit_register = new javax.swing.JButton();
        delete_regiter = new javax.swing.JButton();
        reset_register = new javax.swing.JButton();
        show_register = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        message11 = new javax.swing.JLabel();
        search3 = new javax.swing.JTextField();
        t_search3 = new javax.swing.JButton();
        p_teaching = new javax.swing.JPanel();
        message4 = new javax.swing.JLabel();
        data5 = new javax.swing.JTabbedPane();
        add_teaching = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        message15 = new javax.swing.JLabel();
        id_subjectlbl = new javax.swing.JLabel();
        id_teacherlbl = new javax.swing.JLabel();
        semesterlbl = new javax.swing.JLabel();
        yearlbl = new javax.swing.JLabel();
        daylbl = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        roomlbl = new javax.swing.JLabel();
        id_subjecttxt = new javax.swing.JTextField();
        semestertxt = new javax.swing.JTextField();
        id_teachertxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        daytxt = new javax.swing.JTextField();
        timetxt = new javax.swing.JTextField();
        roomtxt = new javax.swing.JTextField();
        save_teaching = new javax.swing.JButton();
        edit_teaching = new javax.swing.JButton();
        delete_teaching = new javax.swing.JButton();
        reset_teaching = new javax.swing.JButton();
        show_teaching = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        message12 = new javax.swing.JLabel();
        search4 = new javax.swing.JTextField();
        t_search4 = new javax.swing.JButton();
        p_subject = new javax.swing.JPanel();
        message6 = new javax.swing.JLabel();
        data6 = new javax.swing.JTabbedPane();
        add_subject = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        message16 = new javax.swing.JLabel();
        id_subject = new javax.swing.JLabel();
        subject_name = new javax.swing.JLabel();
        credit = new javax.swing.JLabel();
        t_id_subject = new javax.swing.JTextField();
        t_subject_name = new javax.swing.JTextField();
        t_credit = new javax.swing.JTextField();
        save_subject = new javax.swing.JButton();
        edit_subject = new javax.swing.JButton();
        delete_subject = new javax.swing.JButton();
        reset_subject = new javax.swing.JButton();
        show_subject = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        message13 = new javax.swing.JLabel();
        search5 = new javax.swing.JTextField();
        t_search5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_file = new javax.swing.JMenu();
        student = new javax.swing.JMenuItem();
        teacher = new javax.swing.JMenuItem();
        register = new javax.swing.JMenuItem();
        teaching = new javax.swing.JMenuItem();
        subject = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        Menu_about = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        data1.setBackground(new java.awt.Color(204, 204, 255));
        data1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        p_student.setBackground(new java.awt.Color(204, 204, 255));

        message1.setBackground(new java.awt.Color(204, 204, 255));
        message1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message1.setText("รายละเอียด");

        data2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        id_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_student.setText("รหัสนักศึกษา");

        name_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_student.setText("ชื่อ-นามสกุล");

        sex_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sex_student.setText("เพศ");

        birthday_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        birthday_student.setText("วันเกิด");

        address_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address_student.setText("ที่อยู่");

        phone_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phone_student.setText("เบอร์โทร");

        email_student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email_student.setText("Email");

        branch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        branch.setText("สาขา");

        faculty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        faculty.setText("คณะ");

        t_idstudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_idstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idstudentActionPerformed(evt);
            }
        });

        t_namestudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_sexstudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_birthdaystudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_addressstudent.setColumns(20);
        t_addressstudent.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        t_addressstudent.setRows(5);
        jScrollPane1.setViewportView(t_addressstudent);

        t_phonestudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_phonestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_phonestudentActionPerformed(evt);
            }
        });

        t_emailstudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_branch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_faculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        save_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_student.setText("Save");
        save_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_studentActionPerformed(evt);
            }
        });

        edit_stdent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_stdent.setText("Edit");
        edit_stdent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_stdentActionPerformed(evt);
            }
        });

        delete_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_student.setText("Delete");
        delete_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_studentActionPerformed(evt);
            }
        });

        reset_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_student.setText("Reset");
        reset_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_studentActionPerformed(evt);
            }
        });

        message8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message8.setText("สามารถเพิ่ม/แก้ไข/ดูข้อมูลนักศึกษาได้ที่นี้");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(message8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save_student, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_stdent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_student, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_student, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name_student)
                                    .addComponent(sex_student)
                                    .addComponent(birthday_student)
                                    .addComponent(address_student)
                                    .addComponent(id_student))
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone_student, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email_student, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(faculty, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(branch, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(128, 128, 128)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_sexstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_idstudent, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                .addComponent(t_namestudent))
                            .addComponent(t_birthdaystudent, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_phonestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_emailstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 630, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(message8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_idstudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_student))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_student)
                    .addComponent(t_namestudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sex_student)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(t_sexstudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(birthday_student))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_birthdaystudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address_student))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_phonestudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_student))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_emailstudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_student))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branch)
                    .addComponent(t_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faculty)
                    .addComponent(t_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_student)
                    .addComponent(delete_student)
                    .addComponent(edit_stdent)
                    .addComponent(save_student))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout add_studentLayout = new javax.swing.GroupLayout(add_student);
        add_student.setLayout(add_studentLayout);
        add_studentLayout.setHorizontalGroup(
            add_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        add_studentLayout.setVerticalGroup(
            add_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        data2.addTab("เพิ่มข้อมูลนักศึกษา", add_student);

        show_grade.setBackground(new java.awt.Color(204, 204, 255));

        Connection theConn=null;
        String SQL;
        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "select * from tb_student order by id_student ASC ";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
            String[] col={"รหัส", "ชี่อ-นามสกุล", "เพศ", "วันเกิด", "ที่อยู่", "เบอร์โทร", "E-mail", "สาขา", "คณะ"};   
            Object[][] data=new Object[l][9]; 
            ResultSet rs = stmt.executeQuery(SQL);
                String [][]t= new String[l][9];  
                int i=0;
                while(rs.next()){
                data[i][0]=rs.getString("id_student");
                data[i][1]=rs.getString("name");
                data[i][2]=rs.getString("sex");
                data[i][3]=rs.getString("birthday");
                data[i][4]=rs.getString("address");
                data[i][5]=rs.getString("phone");
                data[i][6]=rs.getString("email");
                data[i][7]=rs.getString("branch");
                data[i][8]=rs.getString("faculty");
                i++;
                }
                jTable1=new JTable(data,col);
                jTable1.setFillsViewportHeight(true);

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
    
        jScrollPane2.setViewportView(jTable1);


        message7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message7.setText("ใส่รหัสค้นหา");

        search1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t_search1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t_search1.setText("ค้นหา");
        t_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_search1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout show_gradeLayout = new javax.swing.GroupLayout(show_grade);
        show_grade.setLayout(show_gradeLayout);
        show_gradeLayout.setHorizontalGroup(
            show_gradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_gradeLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(message7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_search1)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_gradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        show_gradeLayout.setVerticalGroup(
            show_gradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_gradeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(show_gradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_search1)
                    .addComponent(message7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        data2.addTab("ดูข้อมูลนักศึกษา", show_grade);

        javax.swing.GroupLayout p_studentLayout = new javax.swing.GroupLayout(p_student);
        p_student.setLayout(p_studentLayout);
        p_studentLayout.setHorizontalGroup(
            p_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_studentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data2)
                    .addGroup(p_studentLayout.createSequentialGroup()
                        .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_studentLayout.setVerticalGroup(
            p_studentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_studentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data2)
                .addContainerGap())
        );

        data1.addTab("ข้อมูลนักศึกษา", p_student);

        p_teacher.setBackground(new java.awt.Color(204, 204, 255));

        message2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message2.setText("รายละเอียด");

        data3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        add_teacher.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        message9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message9.setText("เพิ่มข้อมูลอาจารย์ได้ที่นี้");

        id_teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_teacher.setText("รหัสอาจารย์");

        name_teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_teacher.setText("ชื่อ-นามสกุล");

        sex_teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sex_teacher.setText("เพศ");

        address_teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address_teacher.setText("ที่อยู่");

        phone_teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phone_teacher.setText("เบอร์โทร");

        email_teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email_teacher.setText("Email");

        t_idteacher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_idteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idteacherActionPerformed(evt);
            }
        });

        t_nameteacher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_sexteacher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_addressteacher.setColumns(20);
        t_addressteacher.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        t_addressteacher.setRows(5);
        jScrollPane8.setViewportView(t_addressteacher);

        t_phoneteacher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_emailteacher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_emailteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_emailteacherActionPerformed(evt);
            }
        });

        save_teacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_teacher.setText("Save");
        save_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_teacherActionPerformed(evt);
            }
        });

        edit_teacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_teacher.setText("Edit");
        edit_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_teacherActionPerformed(evt);
            }
        });

        delete_teacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_teacher.setText("Delete");
        delete_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_teacherActionPerformed(evt);
            }
        });

        reset_teacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_teacher.setText("Reset");
        reset_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_teacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name_teacher)
                                    .addComponent(id_teacher)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(address_teacher)
                                    .addComponent(sex_teacher)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone_teacher, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email_teacher, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_nameteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_idteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_emailteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(message9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_phoneteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_sexteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(save_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_teacher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(message9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_teacher)
                    .addComponent(t_idteacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nameteacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_teacher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sex_teacher)
                    .addComponent(t_sexteacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_phoneteacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone_teacher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_emailteacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_teacher)))
                    .addComponent(address_teacher))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_teacher)
                    .addComponent(delete_teacher)
                    .addComponent(edit_teacher)
                    .addComponent(save_teacher))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel2);

        javax.swing.GroupLayout add_teacherLayout = new javax.swing.GroupLayout(add_teacher);
        add_teacher.setLayout(add_teacherLayout);
        add_teacherLayout.setHorizontalGroup(
            add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        add_teacherLayout.setVerticalGroup(
            add_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        data3.addTab("เพิ่มข้อมูลอาจารย์", add_teacher);

        show_teacher.setBackground(new java.awt.Color(204, 204, 255));

        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "select * from teacher order by id_teacher ASC ";
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
                jTable2=new JTable(data,col);             
                jTable2.setFillsViewportHeight(true);
   
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
    
        jScrollPane9.setViewportView(jTable2);

        message10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message10.setText("ใส่รหัสค้นหา");

        search2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t_search2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t_search2.setText("ค้นหา");
        t_search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_search2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout show_teacherLayout = new javax.swing.GroupLayout(show_teacher);
        show_teacher.setLayout(show_teacherLayout);
        show_teacherLayout.setHorizontalGroup(
            show_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_teacherLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(message10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_search2)
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_teacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );
        show_teacherLayout.setVerticalGroup(
            show_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_teacherLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(show_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_search2)
                    .addComponent(message10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        data3.addTab("ดูข้อมูลอาจารย์", show_teacher);

        javax.swing.GroupLayout p_teacherLayout = new javax.swing.GroupLayout(p_teacher);
        p_teacher.setLayout(p_teacherLayout);
        p_teacherLayout.setHorizontalGroup(
            p_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_teacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data3)
                    .addGroup(p_teacherLayout.createSequentialGroup()
                        .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_teacherLayout.setVerticalGroup(
            p_teacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_teacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(data3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        data1.addTab("ข้อมูลอาจารย์", p_teacher);

        p_register.setBackground(new java.awt.Color(204, 204, 255));

        message3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message3.setText("รายละเอียด");

        data4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        add_rrgister.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        message14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message14.setText("ลงทะเบียนเรียน");

        id_student1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_student1.setText("รหัสนักศึกษา");

        id_subject1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_subject1.setText("รหัสวิชาเรียน");

        semester.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        semester.setText("เทอม");

        year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        year.setText("ปีที่");

        grade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        grade.setText("เกรด");

        t_student1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_student1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_student1ActionPerformed(evt);
            }
        });

        t_subject1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_subject1ActionPerformed(evt);
            }
        });

        t_semester1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_semester1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_semester1ActionPerformed(evt);
            }
        });

        t_year1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_grade1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_grade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_grade1ActionPerformed(evt);
            }
        });

        save_register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_register.setText("Save");
        save_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_registerActionPerformed(evt);
            }
        });

        edit_register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_register.setText("Edit");
        edit_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_registerActionPerformed(evt);
            }
        });

        delete_regiter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_regiter.setText("Delete");
        delete_regiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_regiterActionPerformed(evt);
            }
        });

        reset_register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_register.setText("Reset");
        reset_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(save_register, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_register, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_regiter, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_register, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id_subject1)
                            .addComponent(id_student1)
                            .addComponent(semester)
                            .addComponent(year)
                            .addComponent(grade))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(message14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_student1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(t_subject1)
                                .addComponent(t_semester1)
                                .addComponent(t_year1)
                                .addComponent(t_grade1)))))
                .addContainerGap(743, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(message14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_student1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_student1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_subject1)
                    .addComponent(t_subject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semester)
                    .addComponent(t_semester1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year)
                    .addComponent(t_year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grade)
                    .addComponent(t_grade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_register)
                    .addComponent(delete_regiter)
                    .addComponent(edit_register)
                    .addComponent(save_register))
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel3);

        javax.swing.GroupLayout add_rrgisterLayout = new javax.swing.GroupLayout(add_rrgister);
        add_rrgister.setLayout(add_rrgisterLayout);
        add_rrgisterLayout.setHorizontalGroup(
            add_rrgisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        add_rrgisterLayout.setVerticalGroup(
            add_rrgisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        data4.addTab("ลงทะเบียนวิชา", add_rrgister);

        show_register.setBackground(new java.awt.Color(204, 204, 255));

        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "select * from register order by sequence ASC";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
            String[] col={"รหัสนักศึกษา", "รหัสวิชาเรียน", "เทอม", "ปี", "เกรด"};   
            Object[][] data=new Object[l][5];
            ResultSet rs = stmt.executeQuery(SQL);
                String [][]t= new String[l][5];  
                int i=0;
                while(rs.next()){
                data[i][0]=rs.getString("id_student");
                data[i][1]=rs.getString("id_subject");
                data[i][2]=rs.getString("semester");
                data[i][3]=rs.getString("year");
                data[i][4]=rs.getString("grade");
                i++;
                }
                jTable3=new JTable(data,col);
                jTable3.setFillsViewportHeight(true);
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
    
        jScrollPane10.setViewportView(jTable3);

        message11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message11.setText("ใส่รหัสค้นหา");

        search3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t_search3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t_search3.setText("ค้นหา");
        t_search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_search3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout show_registerLayout = new javax.swing.GroupLayout(show_register);
        show_register.setLayout(show_registerLayout);
        show_registerLayout.setHorizontalGroup(
            show_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_registerLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(message11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_search3)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        show_registerLayout.setVerticalGroup(
            show_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_registerLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(show_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_search3)
                    .addComponent(message11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        data4.addTab("ดูข้อมูลลงทะเบียน", show_register);

        javax.swing.GroupLayout p_registerLayout = new javax.swing.GroupLayout(p_register);
        p_register.setLayout(p_registerLayout);
        p_registerLayout.setHorizontalGroup(
            p_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_registerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data4)
                    .addGroup(p_registerLayout.createSequentialGroup()
                        .addComponent(message3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_registerLayout.setVerticalGroup(
            p_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data4)
                .addContainerGap())
        );

        data1.addTab("ลงทะเบียนวิชา", p_register);

        p_teaching.setBackground(new java.awt.Color(204, 204, 255));

        message4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message4.setText("รายละเอียด");

        data5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        add_teaching.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        message15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message15.setText("เพิ่มข้อมูลการสอน");

        id_subjectlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_subjectlbl.setText("รหัสวิชาเรียน");

        id_teacherlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_teacherlbl.setText("รหัสอาจารย์สอน");

        semesterlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        semesterlbl.setText("เทอม");

        yearlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yearlbl.setText("ปี");

        daylbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        daylbl.setText("วันที่สอน");

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        timelbl.setText("เวลาที่สอน");

        roomlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roomlbl.setText("ห้องที่สอน");

        id_subjecttxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_subjecttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_subjecttxtActionPerformed(evt);
            }
        });

        semestertxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        id_teachertxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_teachertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_teachertxtActionPerformed(evt);
            }
        });

        yeartxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        daytxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        timetxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        roomtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roomtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtxtActionPerformed(evt);
            }
        });

        save_teaching.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_teaching.setText("Save");
        save_teaching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_teachingActionPerformed(evt);
            }
        });

        edit_teaching.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_teaching.setText("Edit");
        edit_teaching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_teachingActionPerformed(evt);
            }
        });

        delete_teaching.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_teaching.setText("Delete");
        delete_teaching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_teachingActionPerformed(evt);
            }
        });

        reset_teaching.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_teaching.setText("Reset");
        reset_teaching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_teachingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roomlbl)
                            .addComponent(id_teacherlbl)
                            .addComponent(id_subjectlbl)
                            .addComponent(semesterlbl)
                            .addComponent(yearlbl)
                            .addComponent(daylbl)
                            .addComponent(timelbl))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_teachertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_subjecttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semestertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(save_teaching, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_teaching, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_teaching)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_teaching, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(660, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(message15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(message15)
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_subjecttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_subjectlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_teachertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_teacherlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(daytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomlbl))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset_teaching)
                            .addComponent(delete_teaching)
                            .addComponent(edit_teaching)
                            .addComponent(save_teaching))
                        .addContainerGap(190, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(daylbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane6.setViewportView(jPanel4);

        javax.swing.GroupLayout add_teachingLayout = new javax.swing.GroupLayout(add_teaching);
        add_teaching.setLayout(add_teachingLayout);
        add_teachingLayout.setHorizontalGroup(
            add_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        add_teachingLayout.setVerticalGroup(
            add_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        data5.addTab("เพิ่มข้อมูล", add_teaching);

        show_teaching.setBackground(new java.awt.Color(204, 204, 255));

        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "select * from teaching order by sequence ASC";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
            ResultSet rs = stmt.executeQuery(SQL);
            String[] col={"รหัสวิชา", "รหัสอาจารย์", "เทอม",  "ปี", "วันสอน", "เวลาสอน", "ห้องสอน"};   
            Object[][] data=new Object[l][7];
                String [][]t= new String[l][7];  
                int i=0;
                while(rs.next()){
                data[i][0]=rs.getString("id_subject");
                data[i][1]=rs.getString("id_teacher");
                data[i][2]=rs.getString("semester");
                data[i][3]=rs.getString("year");
                data[i][4]=rs.getString("day");
                data[i][5]=rs.getString("time");  
                data[i][6]=rs.getString("room");
                i++;
                }
                jTable4=new JTable(data,col);
                jTable4.setFillsViewportHeight(true);

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
    
        jScrollPane11.setViewportView(jTable4);


        message12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message12.setText("ใส่รหัสค้นหา");

        search4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t_search4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t_search4.setText("ค้นหา");
        t_search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_search4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout show_teachingLayout = new javax.swing.GroupLayout(show_teaching);
        show_teaching.setLayout(show_teachingLayout);
        show_teachingLayout.setHorizontalGroup(
            show_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_teachingLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(message12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_search4)
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_teachingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );
        show_teachingLayout.setVerticalGroup(
            show_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_teachingLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(show_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_search4)
                    .addComponent(message12))
                .addGap(43, 43, 43))
        );

        data5.addTab("ดูข้อมูลการสอน", show_teaching);

        javax.swing.GroupLayout p_teachingLayout = new javax.swing.GroupLayout(p_teaching);
        p_teaching.setLayout(p_teachingLayout);
        p_teachingLayout.setHorizontalGroup(
            p_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_teachingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data5)
                    .addGroup(p_teachingLayout.createSequentialGroup()
                        .addComponent(message4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_teachingLayout.setVerticalGroup(
            p_teachingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_teachingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data5)
                .addContainerGap())
        );

        data1.addTab("ข้อมูลการสอน", p_teaching);

        p_subject.setBackground(new java.awt.Color(204, 204, 255));

        message6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message6.setText("รายละเอียด");

        data6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        add_subject.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        message16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message16.setText("เพิ่มข้อมูลวิชาเรียน");

        id_subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id_subject.setText("รหัสวิชา");

        subject_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject_name.setText("ชื่อวิชา");

        credit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        credit.setText("หน่วยกิต");

        t_id_subject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_id_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_id_subjectActionPerformed(evt);
            }
        });

        t_subject_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_subject_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_subject_nameActionPerformed(evt);
            }
        });

        t_credit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_creditActionPerformed(evt);
            }
        });

        save_subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_subject.setText("Save");
        save_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_subjectActionPerformed(evt);
            }
        });

        edit_subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_subject.setText("Edit");
        edit_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_subjectActionPerformed(evt);
            }
        });

        delete_subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_subject.setText("Delete");
        delete_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_subjectActionPerformed(evt);
            }
        });

        reset_subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_subject.setText("Reset");
        reset_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_subjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(subject_name)
                                .addComponent(id_subject)
                                .addComponent(credit)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(339, 339, 339)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(message16)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(t_subject_name, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addComponent(t_id_subject))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(save_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_subject)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(t_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(853, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(message16)
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_subject)
                    .addComponent(t_id_subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_subject_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credit))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_subject)
                    .addComponent(edit_subject)
                    .addComponent(delete_subject)
                    .addComponent(reset_subject))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel6);

        javax.swing.GroupLayout add_subjectLayout = new javax.swing.GroupLayout(add_subject);
        add_subject.setLayout(add_subjectLayout);
        add_subjectLayout.setHorizontalGroup(
            add_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        add_subjectLayout.setVerticalGroup(
            add_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        data6.addTab("เพิ่มข้อมูลวิชา", add_subject);

        show_subject.setBackground(new java.awt.Color(204, 204, 255));

        try{
            SQLConnection MyCon = new SQLConnection();
            theConn = MyCon.getConnection();
            Statement stmt=theConn.createStatement();
            SQL = "select * from tb_subject ";
            ResultSet rs1 = stmt.executeQuery(SQL);
            int l=0;
            while(rs1.next()){
                l++;
            }
            ResultSet rs = stmt.executeQuery(SQL);
            String[] col={ "รหัสวิชาเรียน", "ชื่อวิชาเรียน", "หน่วยกิต"};   
            Object[][] data=new Object[l][3];
                String [][]t= new String[l][3];  
                int i=0;
                while(rs.next()){              
                data[i][0]=rs.getString("id_subject");
                data[i][1]=rs.getString("subject_name");
                data[i][2]=rs.getString("credit");
                i++;
                }
                jTable5=new JTable(data,col);
                jTable5.setFillsViewportHeight(true);

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
    
        jScrollPane12.setViewportView(jTable5);

        message13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message13.setText("ใส่รหัสค้นหา");

        search5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t_search5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t_search5.setText("ค้นหา");
        t_search5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_search5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout show_subjectLayout = new javax.swing.GroupLayout(show_subject);
        show_subject.setLayout(show_subjectLayout);
        show_subjectLayout.setHorizontalGroup(
            show_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(show_subjectLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(message13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_search5)
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(show_subjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12)
                .addContainerGap())
        );
        show_subjectLayout.setVerticalGroup(
            show_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_subjectLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(show_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_search5)
                    .addComponent(message13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        data6.addTab("ดูข้อมูลวิชา", show_subject);

        javax.swing.GroupLayout p_subjectLayout = new javax.swing.GroupLayout(p_subject);
        p_subject.setLayout(p_subjectLayout);
        p_subjectLayout.setHorizontalGroup(
            p_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_subjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data6)
                    .addGroup(p_subjectLayout.createSequentialGroup()
                        .addComponent(message6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_subjectLayout.setVerticalGroup(
            p_subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_subjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data6)
                .addContainerGap())
        );

        data1.addTab("ข้อมูลวิชา", p_subject);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));

        Menu_file.setText("File");
        Menu_file.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        student.setText("เพิ่มข้อมูลนักศึกษา");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        Menu_file.add(student);

        teacher.setText("เพิ่มข้อมูลอาจารย์สอน");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        Menu_file.add(teacher);

        register.setText("ลงทะเบียนเรียน");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        Menu_file.add(register);

        teaching.setText("เพิ่มข้อมูลการสอน");
        teaching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachingActionPerformed(evt);
            }
        });
        Menu_file.add(teaching);

        subject.setText("เพิ่มข้อมูลวิชา");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        Menu_file.add(subject);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        Menu_file.add(exit);

        jMenuBar1.add(Menu_file);

        Menu_about.setText("About");
        Menu_about.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        Menu_about.add(about);

        jMenuBar1.add(Menu_about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data1)
        );

        pack();
    }// </editor-fold>                        

    private void t_idstudentActionPerformed(java.awt.event.ActionEvent evt) {                                            
                customer cust=new customer();
                cust.id=t_idstudent.getText();
                Selectstudent i= new Selectstudent(cust);
                
                if((cust.name)==null){
                    t_namestudent.setEditable(true);
                    t_sexstudent.setEditable(true);
                    t_birthdaystudent.setEditable(true);
                    t_addressstudent.setEditable(true);
                    t_phonestudent.setEditable(true);
                    t_emailstudent.setEditable(true);
                    t_branch.setEditable(true);
                    t_faculty.setEditable(true);
                    t_namestudent.requestFocus();   
                }else{
                    t_idstudent.setEditable(false);
                    t_namestudent.setEditable(false);
                    t_birthdaystudent.setEditable(false);
                    t_sexstudent.setEditable(false);
                    t_addressstudent.setEditable(false);
                    t_phonestudent.setEditable(false);
                    t_emailstudent.setEditable(false);
                    t_branch.setEditable(false);
                    t_faculty.setEditable(false);
                    
                    t_namestudent.setText(cust.name);
                    t_sexstudent.setText(cust.sex);
                    t_birthdaystudent.setText(cust.birthday);
                    t_addressstudent.setText(cust.address);
                    t_phonestudent.setText(cust.phone);
                    t_emailstudent.setText(cust.email);
                    t_branch.setText(cust.branch);
                    t_faculty.setText(cust.faculty);
                    
                }
    }                                           

    private void t_phonestudentActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                      
        About i =new About();
    }                                     

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    

    private void save_studentActionPerformed(java.awt.event.ActionEvent evt) {                                             
            String id,name,sex,birthday,address,phone,email,branch,faculty;
              id=t_idstudent.getText();
              name=t_namestudent.getText();
              sex=t_sexstudent.getText();
              birthday=t_birthdaystudent.getText();
              address=t_addressstudent.getText();
              phone=t_phonestudent.getText();
              email=t_emailstudent.getText();
              branch=t_branch.getText();
              faculty=t_faculty.getText();
              
              if(add){
                  Insertstudent i = new Insertstudent(id,name,sex,birthday,address,phone,email,branch,faculty);
              }else{
                  Changestudent i = new Changestudent(id,name,sex,birthday,address,phone,email,branch,faculty);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              t_idstudent.setText("");
              t_namestudent.setText("");
              t_sexstudent.setText("");
              t_birthdaystudent.setText("");
              t_addressstudent.setText("");
              t_phonestudent.setText("");
              t_emailstudent.setText("");
              t_branch.setText("");
              t_faculty.setText("");
              t_idstudent.setEditable(true);
              t_idstudent.requestFocus();
              add=true;
   
    }                                            

    private void edit_stdentActionPerformed(java.awt.event.ActionEvent evt) {                                            
              customer cust=new customer();
                cust.id=t_idstudent.getText();
                Selectstudent i= new Selectstudent(cust);
                
                if((cust.name)==null){
                    t_namestudent.setEditable(true);
                    t_sexstudent.setEditable(true);
                    t_birthdaystudent.setEditable(true);
                    t_addressstudent.setEditable(true);
                    t_phonestudent.setEditable(true);
                    t_emailstudent.setEditable(true);
                    t_branch.setEditable(true);
                    t_faculty.setEditable(true);
                    t_namestudent.requestFocus();   
                }else{
                    t_idstudent.setEditable(false);
                    t_namestudent.setEditable(false);
                    t_birthdaystudent.setEditable(false);
                    t_sexstudent.setEditable(false);
                    t_addressstudent.setEditable(false);
                    t_phonestudent.setEditable(false);
                    t_emailstudent.setEditable(false);
                    t_branch.setEditable(false);
                    t_faculty.setEditable(false);
                    
                    t_namestudent.setText(cust.name);
                    t_sexstudent.setText(cust.sex);
                    t_birthdaystudent.setText(cust.birthday);
                    t_addressstudent.setText(cust.address);
                    t_phonestudent.setText(cust.phone);
                    t_emailstudent.setText(cust.email);
                    t_branch.setText(cust.branch);
                    t_faculty.setText(cust.faculty);
                    
                }
                
                add=false;
                t_idstudent.setEditable(true);
                t_namestudent.setEditable(true); 
                t_sexstudent.setEditable(true);
                t_birthdaystudent.setEditable(true);
                t_addressstudent.setEditable(true);
                t_phonestudent.setEditable(true);
                t_emailstudent.setEditable(true);
                t_branch.setEditable(true);
                t_faculty.setEditable(true);
                t_namestudent.selectAll();
                t_namestudent.requestFocus();
    }                                           

    private void delete_studentActionPerformed(java.awt.event.ActionEvent evt) {                                               
                String id =t_idstudent.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deletestudent i= new Deletestudent(id);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
                t_idstudent.setText("");
                t_namestudent.setText(""); 
                t_sexstudent.setText("");
                t_birthdaystudent.setText("");
                t_addressstudent.setText("");
                t_phonestudent.setText("");
                t_emailstudent.setText("");
                t_branch.setText("");
                t_faculty.setText("");
                t_idstudent.setEditable(true);
                t_idstudent.requestFocus();
                add=true;
    }                                              

    private void reset_studentActionPerformed(java.awt.event.ActionEvent evt) {                                              
                add=true;
                t_idstudent.setEditable(true);
                t_namestudent.setEditable(true);
                t_sexstudent.setEditable(true);
                t_birthdaystudent.setEditable(true);
                t_addressstudent.setEditable(true);
                t_phonestudent.setEditable(true);
                t_emailstudent.setEditable(true);
                t_branch.setEditable(true);
                t_faculty.setEditable(true);
                
                t_idstudent.setText("");
                t_namestudent.setText("");  
                t_sexstudent.setText("");
                t_birthdaystudent.setText("");
                t_addressstudent.setText("");
                t_phonestudent.setText("");
                t_emailstudent.setText("");
                t_branch.setText("");
                t_faculty.setText("");
                
                t_idstudent.requestFocus();
    }                                             

    private void t_emailteacherActionPerformed(java.awt.event.ActionEvent evt) {                                               
              String id,name,sex,address,phone,email;
              id=t_idteacher.getText();
              name=t_nameteacher.getText();
              sex=t_sexteacher.getText();
              
              address=t_addressteacher.getText();
              phone=t_phoneteacher.getText();
              email=t_emailteacher.getText();
              
              
              if(add){
                  Insertteacher i = new Insertteacher(id,name,sex,address,phone,email);
              }else{
                  Changeteacher i = new Changeteacher(id,name,sex,address,phone,email);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              t_idteacher.setText("");
              t_nameteacher.setText("");
              t_sexteacher.setText("");
              
              t_addressteacher.setText("");
              t_phoneteacher.setText("");
              t_emailteacher.setText("");
              
              t_idteacher.setEditable(true);
              t_idteacher.requestFocus();
              add=true;
   
    }                                              

    private void save_teacherActionPerformed(java.awt.event.ActionEvent evt) {                                             
              String id,name,sex,address,phone,email;
              id=t_idteacher.getText();
              name=t_nameteacher.getText();
              sex=t_sexteacher.getText();
              
              address=t_addressteacher.getText();
              phone=t_phoneteacher.getText();
              email=t_emailteacher.getText();
              
              
              if(add){
                  Insertteacher i = new Insertteacher(id,name,sex,address,phone,email);
              }else{
                  Changeteacher i = new Changeteacher(id,name,sex,address,phone,email);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              t_idteacher.setText("");
              t_nameteacher.setText("");
              t_sexteacher.setText("");
              
              t_addressteacher.setText("");
              t_phoneteacher.setText("");
              t_emailteacher.setText("");
              
              t_idteacher.setEditable(true);
              t_idteacher.requestFocus();
              add=true;
   
    }                                            

    private void edit_teacherActionPerformed(java.awt.event.ActionEvent evt) {                                             
                customer1 cust=new customer1();
                cust.id= t_idteacher.getText();
                Selectteacher i= new Selectteacher(cust);
                
                if((cust.name)==null){
                     t_nameteacher.setEditable(true);
                     t_sexteacher.setEditable(true);
                    
                     t_addressteacher.setEditable(true);
                     t_phoneteacher.setEditable(true);
                     t_emailteacher.setEditable(true);
                   
                     t_nameteacher.requestFocus();   
                }else{
                     t_idteacher.setEditable(false);
                     t_nameteacher.setEditable(false);
                    
                     t_sexteacher.setEditable(false);
                     t_addressteacher.setEditable(false);
                     t_phoneteacher.setEditable(false);
                     t_emailteacher.setEditable(false);
                    
                    
                     t_nameteacher.setText(cust.name);
                     t_sexteacher.setText(cust.sex);
                    
                     t_addressteacher.setText(cust.address);
                     t_phoneteacher.setText(cust.phone);
                     t_emailteacher.setText(cust.email);
                   
                    
                }
                
                add=false;
                 t_nameteacher.setEditable(true); 
                 t_sexteacher.setEditable(true);
                
                 t_addressteacher.setEditable(true);
                 t_phoneteacher.setEditable(true);
                 t_emailteacher.setEditable(true);
                
                 t_nameteacher.selectAll();
                 t_nameteacher.requestFocus();
    }                                            

    private void delete_teacherActionPerformed(java.awt.event.ActionEvent evt) {                                               
                String id =t_idteacher.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deleteteacher i= new Deleteteacher(id);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
              t_idteacher.setText("");
              t_nameteacher.setText(""); 
              t_sexteacher.setText("");
              
              t_addressteacher.setText("");
              t_phoneteacher.setText("");
              t_emailteacher.setText("");
             
              t_idteacher.setEditable(true);
              t_idteacher.requestFocus();
              add=true;
    }                                              

    private void reset_teacherActionPerformed(java.awt.event.ActionEvent evt) {                                              
                add=true;
                t_idteacher.setEditable(true);
                t_nameteacher.setEditable(true);
                t_sexteacher.setEditable(true);
               
                t_addressteacher.setEditable(true);
                t_phoneteacher.setEditable(true);
                t_emailteacher.setEditable(true);
             
                
                t_idteacher.setText("");
                t_nameteacher.setText("");  
                t_sexteacher.setText("");
               
                t_addressteacher.setText("");
                t_phoneteacher.setText("");
                t_emailteacher.setText("");
             
                
                t_idteacher.requestFocus();
    }                                             

    private void t_idteacherActionPerformed(java.awt.event.ActionEvent evt) {                                            
                customer1 cust=new customer1();
                cust.id= t_idteacher.getText();
                Selectteacher i= new Selectteacher(cust);
                
                if((cust.name)==null){
                     t_nameteacher.setEditable(true);
                     t_sexteacher.setEditable(true);
                    
                     t_addressteacher.setEditable(true);
                     t_phoneteacher.setEditable(true);
                     t_emailteacher.setEditable(true);
                   
                     t_nameteacher.requestFocus();   
                }else{
                     t_idteacher.setEditable(false);
                     t_nameteacher.setEditable(false);
                    
                     t_sexteacher.setEditable(false);
                     t_addressteacher.setEditable(false);
                     t_phoneteacher.setEditable(false);
                     t_emailteacher.setEditable(false);
                    
                    
                     t_nameteacher.setText(cust.name);
                     t_sexteacher.setText(cust.sex);
                    
                     t_addressteacher.setText(cust.address);
                     t_phoneteacher.setText(cust.phone);
                     t_emailteacher.setText(cust.email);
                   
                    
                }
    }                                           

    private void t_semester1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void delete_regiterActionPerformed(java.awt.event.ActionEvent evt) {                                               
                String id =t_student1.getText();
                String id2=t_subject1.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deleteregister i= new Deleteregister(id,id2);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
              t_student1.setText("");
              t_subject1.setText(""); 
              t_semester1.setText("");
              t_year1.setText("");
              t_grade1.setText("");
              
              t_student1.setEditable(true);
              t_student1.requestFocus();
              t_subject1.setEditable(true);
              add=true;
    }                                              

    private void save_registerActionPerformed(java.awt.event.ActionEvent evt) {                                              
              String id,id2,semester,year,grade;
              id=t_student1.getText();
              id2=t_subject1.getText();
              semester=t_semester1.getText();
              year=t_year1.getText();
              grade=t_grade1.getText();
             
              
              if(add){
                  Insertregister i = new Insertregister(id,id2,semester,year,grade);
              }else{
                  Changeregister i = new Changeregister(id,id2,semester,year,grade);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              t_student1.setText("");
              t_subject1.setText("");
              t_semester1.setText("");
              t_year1.setText("");
              t_grade1.setText("");           
              t_student1.setEditable(true);
              t_student1.requestFocus();
              t_subject1.setEditable(true);
              
              add=true;
   
    }                                             

    private void edit_registerActionPerformed(java.awt.event.ActionEvent evt) {                                              
                customer2 cust=new customer2();
                cust.id_student=t_student1.getText();
                cust.id_subject=t_subject1.getText();
                Selectregister i= new Selectregister(cust);
                
                if((cust.semester)==null){
                    t_semester1.setEditable(true);
                    t_year1.setEditable(true);
                    t_grade1.setEditable(true);
                    
                    t_semester1.requestFocus();   
                }else{
                    t_student1.setEditable(false);
                    t_subject1.setEditable(false);
                    t_semester1.setEditable(false);
                    t_year1.setEditable(false);
                    t_grade1.setEditable(false);                    
                    
                    t_semester1.setText(cust.semester);
                    t_year1.setText(cust.year);
                    t_grade1.setText(cust.grade);
                   
                    
                }
                
                add=false;
                t_semester1.setEditable(true); 
                t_year1.setEditable(true);
                t_grade1.setEditable(true);               
                t_semester1.selectAll();
                t_semester1.requestFocus();
    }                                             

    private void reset_registerActionPerformed(java.awt.event.ActionEvent evt) {                                               
                add=true;
                t_student1.setEditable(true);
                t_subject1.setEditable(true);
                t_semester1.setEditable(true);
                t_year1.setEditable(true);
                t_grade1.setEditable(true);
                
                
                t_student1.setText("");
                t_subject1.setText("");  
                t_semester1.setText("");
                t_year1.setText("");
                t_grade1.setText("");
              
                
                t_student1.requestFocus();
                
    }                                              

    private void t_student1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
                 
    }                                          

    private void t_subject1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
                customer2 cust=new customer2();
                cust.id_student=t_student1.getText();
                cust.id_subject=t_subject1.getText();
                Selectregister i= new Selectregister(cust);
                
                if((cust.semester)==null){
                    t_semester1.setEditable(true);
                    t_year1.setEditable(true);
                    t_grade1.setEditable(true);
                    
                    t_semester1.requestFocus();   
                }else{
                    t_student1.setEditable(false);
                    t_subject1.setEditable(false);
                    t_semester1.setEditable(false);
                    t_year1.setEditable(false);
                    t_grade1.setEditable(false);                    
                    
                    t_semester1.setText(cust.semester);
                    t_year1.setText(cust.year);
                    t_grade1.setText(cust.grade); }
    }                                          
    
    private void t_grade1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                   String id,id2,semester,year,grade;
                   id=t_student1.getText();
                   id2=t_subject1.getText();
                   semester=t_semester1.getText();
                   year=t_year1.getText();
                   grade=t_grade1.getText();
             
              
                   if(add){
                     Insertregister i = new Insertregister(id,id2,semester,year,grade);
                   }else{
                     Changeregister i = new Changeregister(id,id2,semester,year,grade);
                    }
                   JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
                   t_student1.setText("");
                   t_subject1.setText("");
                   t_semester1.setText("");
                   t_year1.setText("");
                   t_grade1.setText("");           
                   t_student1.setEditable(true);
                   t_student1.requestFocus();

                   add=true; 
    }                                        

    private void t_id_subjectActionPerformed(java.awt.event.ActionEvent evt) {                                             
                    customer3 cust=new customer3();
                    cust.id_subject=t_id_subject.getText();
                    Selectsubject i= new Selectsubject(cust);
                
                    if((cust.subject_name)==null){
                         t_subject_name.setEditable(true);
                         t_credit.setEditable(true);
   
                         t_subject_name.requestFocus();   
                    }else{
                         t_id_subject.setEditable(false);
                         t_subject_name.setEditable(false);
                         t_credit.setEditable(false);
 
                         t_subject_name.setText(cust.subject_name);
                         t_credit.setText(cust.credit);
  
                }
                
                add=false;
                t_subject_name.setEditable(true); 
                t_credit.setEditable(true);
                             
                t_subject_name.selectAll();
                t_subject_name.requestFocus();
    }                                            

    private void t_subject_nameActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void save_teachingActionPerformed(java.awt.event.ActionEvent evt) {                                              
              String id,id2,semester,year,day,time,room;
              id=id_subjecttxt.getText();
              id2=id_teachertxt.getText();
              semester=semestertxt.getText();
              year=yeartxt.getText();
              day=daytxt.getText();
              time=timetxt.getText();
              room=roomtxt.getText();
             
              
              if(add){
                  Insertteaching i = new Insertteaching(id,id2,semester,year,day,time,room);
              }else{
                  Changeteaching i = new Changeteaching(id,id2,semester,year,day,time,room);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              id_subjecttxt.setText("");
              id_teachertxt.setText("");
              semestertxt.setText("");
              yeartxt.setText("");
              daytxt.setText("");
              timetxt.setText("");
              roomtxt.setText("");
              
              id_subjecttxt.setEditable(true);
              id_subjecttxt.requestFocus(); 
              id_teachertxt.setEditable(true);
              add=true;
   
    }                                             

    private void edit_teachingActionPerformed(java.awt.event.ActionEvent evt) {                                              
              customer4 cust=new customer4();
                cust.id_subject=id_subjecttxt.getText();
                cust.id_teacher=id_teachertxt.getText();
                Selectteaching i= new Selectteaching(cust);
                
                if((cust.semester)==null){
                    semestertxt.setEditable(true);
                    yeartxt.setEditable(true);
                    daytxt.setEditable(true);
                    timetxt.setEditable(true);
                    roomtxt.setEditable(true);
                    
                    semestertxt.requestFocus();   
                }else{
                    id_subjecttxt.setEditable(false);
                    id_teachertxt.setEditable(false);
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

    private void delete_teachingActionPerformed(java.awt.event.ActionEvent evt) {                                                
                String id =id_subjecttxt.getText();
                String id2=id_teachertxt.getText();
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deleteteaching i= new Deleteteaching(id,id2);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
                id_subjecttxt.setText("");
                id_teachertxt.setText(""); 
                semestertxt.setText("");
                yeartxt.setText("");
                daytxt.setText("");
                timetxt.setText("");
                roomtxt.setText("");
              
                id_subjecttxt.setEditable(true);
                id_subjecttxt.requestFocus();
                id_teachertxt.setEditable(true);
                add=true;
    }                                               

    private void reset_teachingActionPerformed(java.awt.event.ActionEvent evt) {                                               
                add=true;
                id_subjecttxt.setEditable(true);
                id_teachertxt.setEditable(true);
                semestertxt.setEditable(true);
                yeartxt.setEditable(true);
                daytxt.setEditable(true);
                timetxt.setEditable(true);
                roomtxt.setEditable(true);
                
                
                id_subjecttxt.setText("");
                id_teachertxt.setText("");  
                semestertxt.setText("");
                yeartxt.setText("");
                daytxt.setText("");
                timetxt.setText("");
                roomtxt.setText("");
              
                
                id_subjecttxt.requestFocus();
    }                                              

    private void id_subjecttxtActionPerformed(java.awt.event.ActionEvent evt) {                                              
                
    }                                             

    private void id_teachertxtActionPerformed(java.awt.event.ActionEvent evt) {                                              
                customer4 cust=new customer4();
                cust.id_subject=id_subjecttxt.getText();
                cust.id_teacher=id_teachertxt.getText();
                Selectteaching i= new Selectteaching(cust);
                
                if((cust.semester)==null){
                    
                    semestertxt.setEditable(true);
                    yeartxt.setEditable(true);
                    daytxt.setEditable(true);
                    timetxt.setEditable(true);
                    roomtxt.setEditable(true);
                    semestertxt.requestFocus();   
                }else{
                    id_subjecttxt.setEditable(false);
                    id_teachertxt.setEditable(false);
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

    private void roomtxtActionPerformed(java.awt.event.ActionEvent evt) {                                        
              String id,id2,semester,year,day,time,room;
              id=id_subjecttxt.getText();
              id2=id_teachertxt.getText();
              semester=semestertxt.getText();
              year=yeartxt.getText();
              day=daytxt.getText();
              time=timetxt.getText();
              room=roomtxt.getText();
             
              
              if(add){
                  Insertteaching i = new Insertteaching(id,id2,semester,year,day,time,room);
              }else{
                  Changeteaching i = new Changeteaching(id,id2,semester,year,day,time,room);
              }
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              id_subjecttxt.setText("");
              id_teachertxt.setText("");
              semestertxt.setText("");
              yeartxt.setText("");
              daytxt.setText("");
              timetxt.setText("");
              roomtxt.setText("");
              
              id_subjecttxt.setEditable(true);
              id_subjecttxt.requestFocus();              
              add=true;
    }                                       

    private void save_subjectActionPerformed(java.awt.event.ActionEvent evt) {                                             
              String id,name,credit;
              id=t_id_subject.getText();
              name=t_subject_name.getText();
              credit=t_credit.getText();
              
              if(add){
                  Insertsubject i = new Insertsubject(id,name,credit);
              }else{
                  Changesubject i = new Changesubject(id,name,credit);
              }
              
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              
              t_id_subject.setText("");
              t_subject_name.setText("");
              t_credit.setText("");                
              t_id_subject.setEditable(true);
              t_id_subject.requestFocus(); 
              add=true;
    }                                            

    private void t_creditActionPerformed(java.awt.event.ActionEvent evt) {                                         
               String id,name,credit;
              id=t_id_subject.getText();
              name=t_subject_name.getText();
              credit=t_credit.getText();
              
              if(add){
                  Insertsubject i = new Insertsubject(id,name,credit);
              }else{
                  Changesubject i = new Changesubject(id,name,credit);
              }
              
              JOptionPane.showMessageDialog(null,"บันทึกข้อมูลเรียบร้อยแล้ว");
              
              t_id_subject.setText("");
              t_subject_name.setText("");
              t_credit.setText("");                
              t_id_subject.setEditable(true);
              t_id_subject.requestFocus(); 
              add=true;
    }                                        

    private void edit_subjectActionPerformed(java.awt.event.ActionEvent evt) {                                             
                customer3 cust=new customer3();
                cust.id_subject=t_id_subject.getText();
                Selectsubject i= new Selectsubject(cust);
                
                if((cust.subject_name)==null){
                    t_subject_name.setEditable(true);
                    t_credit.setEditable(true);
   
                    t_subject_name.requestFocus();   
                }else{
                    t_id_subject.setEditable(false);
                    t_subject_name.setEditable(false);
                    t_credit.setEditable(false);
 
                    t_subject_name.setText(cust.subject_name);
                    t_credit.setText(cust.credit);
  
                }
                
                add=false;
                t_subject_name.setEditable(true); 
                t_credit.setEditable(true);
                             
                t_subject_name.selectAll();
                t_subject_name.requestFocus();
                
    }                                            

    private void delete_subjectActionPerformed(java.awt.event.ActionEvent evt) {                                               
                String id_subject =t_id_subject.getText();               
                String data=JOptionPane.showInputDialog("ต้องการลบข้อมูล"+"  ยืนยัน กด 1");
                if(data.equals("1")){
                Deletesubject l= new Deletesubject(id_subject);
                JOptionPane.showMessageDialog(null,"ลบข้อมูลเรียบร้อยแล้ว");  
                }
                t_id_subject.setText("");
                t_subject_name.setText(""); 
                t_credit.setText("");
              
                t_id_subject.setEditable(true);
                t_id_subject.requestFocus();             
                add=true;
    }                                              

    private void reset_subjectActionPerformed(java.awt.event.ActionEvent evt) {                                              
                add=true;
                t_id_subject.setEditable(true);
                t_subject_name.setEditable(true);
                t_credit.setEditable(true);
  
                t_id_subject.setText("");
                t_subject_name.setText("");  
                t_credit.setText("");

                t_id_subject.requestFocus();
    }                                             

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {                                        
                CustContact i =new CustContact();
    }                                       

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {                                        
                CustContact1 i =new CustContact1();
    }                                       

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {                                         
                CustContact2 i =new CustContact2();
    }                                        

    private void teachingActionPerformed(java.awt.event.ActionEvent evt) {                                         
                CustContact4 i = new CustContact4();
    }                                        

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {                                        
                CustContact3 i =new CustContact3();
    }                                       

   private void t_search1ActionPerformed(java.awt.event.ActionEvent evt) {
                customer cust = new customer();
                cust.id =search1.getText();
                cust.name=search1.getText();
                Showstudent i = new Showstudent(cust);
    }                                         

    private void t_search2ActionPerformed(java.awt.event.ActionEvent evt) { 
                customer1 cust = new customer1();
                cust.id = search2.getText();
                cust.name= search2.getText();
                Showteacher i =new Showteacher(cust);
    }                                         

    private void t_search3ActionPerformed(java.awt.event.ActionEvent evt) { 
                customer2 cust = new customer2();
                cust.id_student = search3.getText();
                cust.id_subject= search3.getText();
                Showregister i =new Showregister(cust);
    }                                         

    private void t_search4ActionPerformed(java.awt.event.ActionEvent evt) { 
                 customer4 cust = new customer4();
                 cust.id_teacher = search4.getText();
                 cust.id_subject= search4.getText();
                 Showteaching i =new Showteaching (cust);
    }                                         

    private void t_search5ActionPerformed(java.awt.event.ActionEvent evt) {
                 customer3 cust = new customer3();
                 cust.subject_name = search5.getText();
                 cust.id_subject= search5.getText();
                 Showsubject i = new Showsubject(cust);
    }                                         
                                   
    
   
   
    
    
    
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DBstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBstudent().setVisible(true);
            }
        });
    }
                
}
