import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Teachers_exam  extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    JFrame frame;
    JTable table;
    String UID = login.userid();


    Teachers_exam(){
        setLayout(null);

//=====================================================================================================================
        JLabel qwe = new JLabel("");
        qwe.setBounds(212,90,150,20);
        add(qwe);
        Font qweb = new Font ("calibri",Font.BOLD,15);
        qwe.setFont(qweb);

//======================================================================================================================


        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Teachers/profile 01.png")));
        prof.setBounds(815,52,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Teachers/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setIcon(new ImageIcon(getClass().getResource("Teachers/profile.png")));
                profl.setBounds(813,50,76,76);
                prof.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                prof.setIcon(new ImageIcon(getClass().getResource("Teachers/profile 01.png")));
                profl.setBounds(0,0,0,0);

            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel tryp = new JLabel ("Teachers");
        tryp.setBounds(819,146,63,20);
        tryp.setForeground(new Color(0, 0, 0,250));
        add(tryp);
        Font tryp1 = new Font ("Segoe UI",Font.BOLD,15);
        tryp.setFont(tryp1);

        JLabel name = new JLabel ("A.N Wadugodapitiya");
        name.setBounds(776,125,150,20);
        name.setForeground(new Color(0, 0, 0,250));
        add(name);
        Font name1 = new Font ("Segoe UI",Font.BOLD,15);
        name.setFont(name1);
// ------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            Statement st = (Statement) con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE user_id = "+Integer.parseInt(UID));

            while(rs.next()){

                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");
                String Grade= rs.getString("Grade");
                String Class1= rs.getString("Class");


                name.setText(first_name+" "+last_name);



            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------

        JLabel q01 = new JLabel ("Search");
        q01.setBounds(557,55,70,20);
        q01.setForeground(Color.gray);
        add(q01);
        Font Qq01 = new Font ("Segoe UI",Font.BOLD,15);
        q01.setFont(Qq01);

        JTextField A1 = new JTextField();
        A1.setBounds (558,55,150,20);
        A1.setForeground(Color.BLACK);
        A1.setBackground(new Color(101, 52, 216, 0));
        A1.setBorder(null);
        A1.setEditable(true);
        A1.setOpaque(false);
        add(A1);
        Font Atet1 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A1.setFont(Atet1);




// Students full Name

        JLabel q02 = new JLabel ("");
        q02.setBounds(209,51,250,20);
        q02.setForeground(Color.BLACK);
        add(q02);
        Font Qq02 = new Font ("Segoe UI",Font.BOLD,15);
        q02.setFont(Qq02);


        JLabel User = new JLabel("Students");
//==================================================================================================

        JTextField A2 = new JTextField();
        A2.setBounds (375,345,82,28);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        Font Atet2 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A2.setFont(Atet2);



        JComboBox dura = new JComboBox();
        dura.setBounds(180,346,131,27);
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dura.setForeground(Color.BLACK);
        dura.setBackground(Color.white);
        dura.addItem("Subjects");
        dura.addItem("Sinhala");
        dura.addItem("English");
        dura.addItem("Tamil");
        dura.addItem("Buddhism");
        dura.addItem("Mathematics");
        dura.addItem("Science");
        dura.addItem("History");
        dura.addItem("Geography");
        dura.addItem("Health");
        dura.addItem("Commerce");
        dura.addItem("ICT");
        dura.addItem("Music");
        add(dura);
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,13);
        dura.setFont(duraa);

        JComboBox duraw = new JComboBox();
        duraw.setBounds(180,390,83,27);
        duraw.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        duraw.setForeground(Color.BLACK);
        duraw.setBackground(Color.white);
        duraw.addItem("Semester");
        duraw.addItem(" I Semester");
        duraw.addItem("II Semester");
        duraw.addItem("III Semester");
        add(duraw);
        Font duraaww = new Font ("Arial Rounded MT",Font.PLAIN,11);
        duraw.setFont(duraaww);
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Subject","semester I","semester II","semester III"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(177, 112, 562, 207);
        pane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.setLayout(null);
        add(pane);


//==============================================================================

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                q02.setText("");
                printIt(documentEvent);
                model.setRowCount(0);

                Object[] row = new Object[4];
//      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM exams  WHERE user_id = '"+A1.getText()+"'");

                    while (rs.next()) {
                        row[0] = rs.getString("Subject");
                        row[1] = rs.getString("one_Semester");
                        row[2] = rs.getString("two_Semester");
                        row[3] = rs.getString("three_Semester");

                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();
                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }

            }

            public void removeUpdate(DocumentEvent documentEvent) {
                q02.setText("");
                model.setRowCount(0);
                printIt(documentEvent);


                Object[] row = new Object[4];
//      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM exams  WHERE user_id = '"+A1.getText()+"'");

                    while (rs.next()) {
                        row[0] = rs.getString("Subject");
                        row[1] = rs.getString("one_Semester");
                        row[2] = rs.getString("two_Semester");
                        row[3] = rs.getString("three_Semester");

                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();
                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }


            }

            private void printIt(DocumentEvent documentEvent) {
                model.setRowCount(0);

                if(A1.getText().isEmpty()){
                    q01.setBounds(557,55,70,20);
                }
                else {
                    q01.setBounds(0,0,0,0);
                }
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
                    Statement st = (Statement) con.createStatement();

                    ResultSet rs=st.executeQuery("SELECT * FROM user_register WHERE user_id = '"+A1.getText()+ "' && User ='"+User.getText()+"'");

                    while(rs.next()){
                        String it= rs.getString("first_name");
                        String id= rs.getString("last_name");

                        q02.setText(it+" "+id);

                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }

            }
        };

        A1.getDocument().addDocumentListener(documentListener);

//==============================================================================




        JLabel q09 = new JLabel ("Date and Time  = ");
        q09.setBounds(176,461,540,20);
        q09.setForeground(Color.BLACK);
        add(q09);
        Font Qq09 = new Font ("Segoe UI",Font.PLAIN,12);
        q09.setFont(Qq09);

        Calendar cac = Calendar.getInstance();
        int day1 = cac.get(Calendar.DATE);
        int month1 = cac.get(Calendar.MONTH) + 1;
        int year1 = cac.get(Calendar.YEAR);

        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar da2 = Calendar.getInstance();

        final DateFormat df = new SimpleDateFormat("hh:mm:ss");
        final DateFormat dfd1 = new SimpleDateFormat(" a");


        javax.swing.Timer  timer = new javax.swing.Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar now = Calendar.getInstance();
                q09.setText(String.valueOf("Date and Time =  "+year1+"-"+month1+"-"+day1+"  "+"("+dayNames[da2.get(Calendar.DAY_OF_WEEK)])+")"+"  "+df.format(now.getTime())+dfd1.format(now.getTime()));
            }
        });
        timer.start();














//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/exit.png")));
        add(a2);
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                a2.setBounds(896,468,60,25);
                exit.setForeground(Color.WHITE);
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.BLACK);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Logout x.png")));
        //    loginx.setBounds(61,337,166,59);
        add(loginx);

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                loginx.setBounds(21,448,111,33);
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                loginx.setBounds(0,0,0,0);
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------

        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Logout success","Logout ok ",JOptionPane.WARNING_MESSAGE);
                Connection con;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                    String query = "insert into login_infor (User_id,Password,User,Date_time,login_and_logout)" + " values (?,?,?,?,?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);

                    preparedStmt.setString(1, (UID));
                    preparedStmt.setString(2, (""));
                    preparedStmt.setString(3,("Teachers"));
                    preparedStmt.setString(4, formattedDate);
                    preparedStmt.setString(5, ("Logout"));

                    preparedStmt.execute();

                    login  Frame = new login ();
                    dispose();

                    con.close();
                }
                catch (ClassNotFoundException | SQLException en)
                {
                    System.err.println("Got an excepttion!");
                    System.err.println(en.getMessage());

                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Students.png")));
        i3.setBounds(37,181,9,14);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Library.png")));
        i4.setBounds(34,225,16,12);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/B Exam.png")));
        i5.setBounds(34,265,15,17);
        add(i5);

        JLabel i6 = new JLabel();
        i6.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Massage.png")));
        i6.setBounds(34,311,17,10);
        add(i6);

        JLabel i7 = new JLabel();
        i7.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Settings.png")));
        i7.setBounds(34,352,15,15);
        add(i7);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(60,96,76,20);
        T1.setForeground(new Color(112, 112, 112, 255));
        add(T1);
        Font text1 = new Font ("Segoe UI",Font.BOLD,15);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Teachers");
        T2.setBounds(60,138,62,20);
        T2.setForeground(new Color(112, 112, 112, 255));
        add(T2);
        Font text2 = new Font ("Segoe UI",Font.BOLD,15);
        T2.setFont(text2);

        JLabel T3 = new JLabel ("Students");
        T3.setBounds(60,180,65,20);
        T3.setForeground(new Color(112, 112, 112, 255));
        add(T3);
        Font text3 = new Font ("Segoe UI",Font.BOLD,15);
        T3.setFont(text3);

        JLabel T4 = new JLabel ("Library");
        T4.setBounds(60,222,53,20);
        T4.setForeground(new Color(112, 112, 112, 255));
        add(T4);
        Font text4 = new Font ("Segoe UI",Font.BOLD,15);
        T4.setFont(text4);

        JLabel T5 = new JLabel ("Exam");
        T5.setBounds(60,264,40,20);
        T5.setForeground(new Color(0, 0, 0, 255));
        add(T5);
        Font text5 = new Font ("Segoe UI",Font.BOLD,15);
        T5.setFont(text5);

        JLabel T6 = new JLabel ("Massage");
        T6.setBounds(60,306,65,20);
        T6.setForeground(new Color(112, 112, 112, 255));
        add(T6);
        Font text6 = new Font ("Segoe UI",Font.BOLD,15);
        T6.setFont(text6);

        JLabel T7 = new JLabel ("Settings");
        T7.setBounds(60,349,60,20);
        T7.setForeground(new Color(112, 112, 112, 255));
        add(T7);
        Font text7 = new Font ("Segoe UI",Font.BOLD,15);
        T7.setFont(text7);

//======================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Dashboard.png")));
                T1.setForeground(new Color(0, 0, 0,250));
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Dashboard.png")));
                T1.setForeground(new Color(112, 112, 112, 255));

            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers  Frame = new Teachers ();
                dispose();
            }
        });

//======================================================================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Teachers.png")));
                T2.setForeground(new Color(112, 112, 112, 255));}
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_teacher  Frame = new Teachers_teacher ();
                dispose();
            }
        });

//======================================================================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/B Students.png")));
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Students.png")));
                T3.setForeground(new Color(112, 112, 112, 255));}
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_students  Frame = new Teachers_students ();
                dispose();
            }
        });
//======================================================================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/B Library.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Library.png")));
                T4.setForeground(new Color(112, 112, 112, 255));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_library  Frame = new Teachers_library ();
                dispose();
            }
        });
//======================================================================================================================
        T5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_exam  Frame = new Teachers_exam ();
                dispose();
            }
        });
//======================================================================================================================
        T6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/B Massage.png")));
                T6.setForeground(new Color(0, 0, 0,250));
                T6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T6.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Massage.png")));
                T6.setForeground(new Color(112, 112, 112, 255));
            }
        });

        T6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_massage  Frame = new Teachers_massage ();
                dispose();
            }
        });
//======================================================================================================================
        T7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/B Settings.png")));
                T7.setForeground(new Color(0, 0, 0,250));
                T7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Settings.png")));
                T7.setForeground(new Color(112, 112, 112, 255));}
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_settings  Frame = new Teachers_settings ();
                dispose();
            }
        });
//======================================================================================================================

//------------------------------------------------------------------------------------------------------------------------------




        A2.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){


                Object selectedItem = duraw.getSelectedItem();
                String selectedItemAsString = (selectedItem != null) ? selectedItem.toString() : "";



                if ("Semester".equals(selectedItemAsString)) {


                    JOptionPane.showMessageDialog(null, "Select a Semester","Select a Semester",JOptionPane.OK_CANCEL_OPTION);

                } else if (" I Semester".equals(selectedItemAsString)) {


                    if(A1.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, " Search Now","Search Now",JOptionPane.OK_CANCEL_OPTION);
                    }

                    if(q02.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, " invalid id","invalid id",JOptionPane.OK_CANCEL_OPTION);
                    }

                    if(A2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, " Enter the score","Enter the score",JOptionPane.OK_CANCEL_OPTION);
                    }

                    else {

                        Connection con;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");

                            String query = "insert into exams (user_id,Subject,one_Semester,two_Semester,three_Semester,I_Date_and_time,II_Date_and_time,III_Date_and_time)" + " values (?,?,?,?,?,?,?,?)";
                            PreparedStatement preparedStmt = con.prepareStatement(query);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                            String formattedDate = myDateObj.format(myFormatObj);
                            System.out.println("Date and Time: " + formattedDate);


                            preparedStmt.setString(1, A1.getText());
                            preparedStmt.setString(2, (String)dura.getSelectedItem());
                            preparedStmt.setString(3, A2.getText());
                            preparedStmt.setString(4, (""));
                            preparedStmt.setString(5, (""));
                            preparedStmt.setString(6, formattedDate);
                            preparedStmt.setString(7, (""));
                            preparedStmt.setString(8, (""));


                            JOptionPane.showMessageDialog(null, " Scores entered for the first Semester ", "first Semester ", JOptionPane.CLOSED_OPTION);


                            preparedStmt.execute();

                            con.close();
                        } catch (ClassNotFoundException | SQLException en) {
                            System.err.println("Got an excepttion!");

                            System.err.println(en.getMessage());

                        }
                    }


//      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    model.setRowCount(0);
                    Object[] row = new Object[4];

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM exams  WHERE user_id = '"+A1.getText()+"'");

                        while (rs.next()) {
                            row[0] = rs.getString("Subject");
                            row[1] = rs.getString("one_Semester");
                            row[2] = rs.getString("two_Semester");
                            row[3] = rs.getString("three_Semester");

                            // add row to the model
                            model.addRow(row);
                            //int i = table.getSelectedRow();
                        }
                    } catch (Exception ew) {
                        System.out.println(ew);
                    }

 //      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                } else if ("II Semester".equals(selectedItemAsString)) {

                    PreparedStatement pstx;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                        java.sql.Statement stmtx = conx.createStatement();
                        pstx = (PreparedStatement) conx.prepareStatement("update exams set two_Semester=?,II_Date_and_time=? WHERE user_id = '"+A1.getText()+ "' && Subject ='"+ (String) dura.getSelectedItem()+"'");

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date and Time: " + formattedDate);

                        {

                            pstx.setString(1, A2.getText());
                            pstx.setString(2, formattedDate);
                            pstx.executeUpdate();
                            JOptionPane.showMessageDialog(null, " II Semester","Update Ok",JOptionPane.CLOSED_OPTION);


                        }
                        stmtx.close();
                        conx.close();
                    }catch (Exception eo){
                        System.out.println(eo);
                    }
 //      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    model.setRowCount(0);
                    Object[] row = new Object[4];

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM exams  WHERE user_id = '"+A1.getText()+"'");

                        while (rs.next()) {
                            row[0] = rs.getString("Subject");
                            row[1] = rs.getString("one_Semester");
                            row[2] = rs.getString("two_Semester");
                            row[3] = rs.getString("three_Semester");

                            // add row to the model
                            model.addRow(row);
                            //int i = table.getSelectedRow();
                        }
                    } catch (Exception ew) {
                        System.out.println(ew);
                    }

 //      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

                    }else {

                    PreparedStatement pstx;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                        java.sql.Statement stmtx = conx.createStatement();
                        pstx = (PreparedStatement) conx.prepareStatement("update exams set three_Semester=?,III_Date_and_time=? WHERE user_id = '"+A1.getText()+ "' && Subject ='"+ (String) dura.getSelectedItem()+"'");

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date and Time: " + formattedDate);

                        {

                            pstx.setString(1, A2.getText());
                            pstx.setString(2, formattedDate);
                            pstx.executeUpdate();
                            JOptionPane.showMessageDialog(null, " III Semester","Update Ok",JOptionPane.CLOSED_OPTION);


                        }
                        stmtx.close();
                        conx.close();
                    }catch (Exception eo){
                        System.out.println(eo);
                    }
                    //      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    model.setRowCount(0);
                    Object[] row = new Object[4];

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM exams  WHERE user_id = '"+A1.getText()+"'");

                        while (rs.next()) {
                            row[0] = rs.getString("Subject");
                            row[1] = rs.getString("one_Semester");
                            row[2] = rs.getString("two_Semester");
                            row[3] = rs.getString("three_Semester");

                            // add row to the model
                            model.addRow(row);
                            //int i = table.getSelectedRow();
                        }
                    } catch (Exception ew) {
                        System.out.println(ew);
                    }

                    //      ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    }

                }
            }
        });





//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Teachers_exam/Main.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
        setSize (950,502);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        Home Frame = new Home();

        Frame.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                mouseDownScreenCoords = e.getLocationOnScreen();
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });
        Frame.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }
            public void mouseDragged(MouseEvent e) {


                Point currCoords = e.getLocationOnScreen();
                Frame.setLocation(mouseDownScreenCoords.x + (currCoords.x -
                                mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                        mouseDownScreenCoords.y + (currCoords.y -
                                mouseDownScreenCoords.y) - mouseDownCompCoords.y);


            }
        });
    }

}