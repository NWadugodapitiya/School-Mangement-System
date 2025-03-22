import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Teachers_massage extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    Teachers_massage(){
        setLayout(null);

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Logout x.png")));
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
                    preparedStmt.setString(3,("Students"));
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

        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Students.png")));
        i3.setBounds(37,181,9,14);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Library.png")));
        i4.setBounds(34,225,16,12);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Exam.png")));
        i5.setBounds(34,265,15,17);
        add(i5);

        JLabel i6 = new JLabel();
        i6.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Massage.png")));
        i6.setBounds(34,311,17,10);
        add(i6);

        JLabel i7 = new JLabel();
        i7.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Settings.png")));
        i7.setBounds(34,352,15,15);
        add(i7);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(60,96,76,20);
        T1.setForeground(new Color(104, 104, 104, 255));
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
        T5.setForeground(new Color(112, 112, 112, 255));
        add(T5);
        Font text5 = new Font ("Segoe UI",Font.BOLD,15);
        T5.setFont(text5);

        JLabel T6 = new JLabel ("Message");
        T6.setBounds(60,306,65,20);
        T6.setForeground(new Color(0, 0, 0, 255));
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
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Dashboard.png")));
                T1.setForeground(new Color(0, 0, 0,250));
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Dashboard.png")));
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
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Teachers.png")));
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
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Students.png")));
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Students.png")));
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
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Library.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Library.png")));
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
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Exam.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Exam.png")));
                T5.setForeground(new Color(112, 112, 112, 255));}
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
                T6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T6.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {

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
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/B Settings.png")));
                T7.setForeground(new Color(0, 0, 0,250));
                T7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Settings.png")));
                T7.setForeground(new Color(112, 112, 112, 255));}
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_settings  Frame = new Teachers_settings ();
                dispose();
            }
        });
//======================================================================================================================
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
//======================================================================================================================
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
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel g = new JLabel();
        JLabel c = new JLabel();
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


                g.setText(Grade);
                c.setText(Class1);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        JComboBox dura = new JComboBox();
        dura.setBounds(181,396,96,26);
        dura.setForeground(Color.BLACK);
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dura.addItem("Students");
        add(dura);
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,14);
        dura.setFont(duraa);


        JButton Sent = new JButton("Sent");
        Sent.setBounds(181,445,96,26);
        Sent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(Sent);

        JTextArea t1 = new JTextArea();
        JScrollPane scrol = new JScrollPane(t1);
        scrol.setBounds(307,360,424,118);
        t1.setLineWrap(true);
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        t1.setBackground(new Color(253, 253, 254, 255));
        add(scrol);
        Font Atetl = new Font ("calibri",Font.BOLD,17);
        t1.setFont(Atetl);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel s1 = new JLabel("Teachers");
        JLabel s2 = new JLabel("");
        JLabel s3 = new JLabel(UID);
        JLabel s4 = new JLabel("Receive");
        JLabel s5 = new JLabel("Sent");


// ------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            Statement st = (Statement) con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE Grade = '"+g.getText()+ "' && Class ='"+c.getText()+ "' && User ='"+(String)dura.getSelectedItem()+"'");

            while(rs.next()){

                String usid= rs.getString("user_id");

                s2.setText(usid);


            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        Sent.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if(t1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, " Type Now ","Type Note",JOptionPane.WARNING_MESSAGE);

                }

                else{

                    Connection con;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                        String query = "insert into user_messages (Sender,user_id,Recipient,Recipient_id,Note,Date,Time,Type1,Type2)" + " values (?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStmt = con.prepareStatement(query);

                        LocalDate myDateObj = LocalDate.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date: " + formattedDate);

                        LocalTime myDateObjq = LocalTime.now();
                        DateTimeFormatter myFormatObjq = DateTimeFormatter.ofPattern("HH:mm:ss");

                        String formattedTime = myDateObjq.format(myFormatObjq);
                        System.out.println("Time: " + formattedTime);


                        preparedStmt.setString(1, s1.getText());
                        preparedStmt.setString(2, s3.getText());
                        preparedStmt.setString(3, (String)dura.getSelectedItem());
                        preparedStmt.setString(4, s2.getText());
                        preparedStmt.setString(5, t1.getText());
                        preparedStmt.setString(6, formattedDate);
                        preparedStmt.setString(7, formattedTime);
                        preparedStmt.setString(8, s4.getText());
                        preparedStmt.setString(9, s5.getText());


                        JOptionPane.showMessageDialog(null, " Sent success","Sent ok ",JOptionPane.WARNING_MESSAGE);
                        Teachers_massage  Frame = new Teachers_massage ();
                        dispose();

                        preparedStmt.execute();

                        con.close();
                    }
                    catch (ClassNotFoundException | SQLException en)
                    {
                        System.err.println("Got an excepttion!");

                        System.err.println(en.getMessage());

                    }
                }

            }
        });

        //------------------------------------------------------------------------------------------------------------------------------



        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"User","Note","Date","Time"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(185, 27, 550, 276);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[4];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_messages WHERE Type2 = '"+s4.getText()+ "' && Recipient_id = "+Integer.parseInt(UID));



            while (rs.next()) {

                row[0] = rs.getString("Sender");
                row[1] = rs.getString("Note");
                row[2] = rs.getString("Date");
                row[3] = rs.getString("Time");


                // add row to the model
                model.addRow(row);
                //int i = table.getSelectedRow();

            }
        } catch (Exception ew) {
            System.out.println(ew);
        }



        JButton Inbox = new JButton("Sent Box");
        Inbox.setBounds(181,347,96,26);
        Inbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(Inbox);

        JButton sentBox = new JButton("Inbox");
        sentBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(sentBox);


        Inbox.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Inbox.setBounds(0,0,0,0);
                sentBox.setBounds(181,347,96,26);


                Object[] columns = {"User","Note","Date","Time"};
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(columns);

                table.setModel(model);
                table.setBackground(Color.LIGHT_GRAY);
                table.setForeground(Color.black);


                Object[] row = new Object[4];


                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM user_messages WHERE Type2 = '"+s5.getText()+ "' && user_id = "+Integer.parseInt(UID));

                    while (rs.next()) {

                        row[0] = rs.getString("Recipient");
                        row[1] = rs.getString("Note");
                        row[2] = rs.getString("Date");
                        row[3] = rs.getString("Time");

                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();



                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }



            }
        });


        sentBox.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Teachers_massage  Frame = new Teachers_massage ();
                dispose();

            }
        });
//------------------------------------------------------------------------------------------------------------------------------

        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Teachers_massage/Main 1.png")));
        add(a);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

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
