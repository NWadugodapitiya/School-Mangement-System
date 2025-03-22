import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teachers_teacher extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    Teachers_teacher(){
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
        a2.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Logout x.png")));
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

        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Students.png")));
        i3.setBounds(37,181,9,14);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Library.png")));
        i4.setBounds(34,225,16,12);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Exam.png")));
        i5.setBounds(34,265,15,17);
        add(i5);

        JLabel i6 = new JLabel();
        i6.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Massage.png")));
        i6.setBounds(34,311,17,10);
        add(i6);

        JLabel i7 = new JLabel();
        i7.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Settings.png")));
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
        T2.setForeground(new Color(0, 0, 0, 255));
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
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
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
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Students.png")));
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Students.png")));
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
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Library.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Library.png")));
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
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Exam.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Exam.png")));
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
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Massage.png")));
                T6.setForeground(new Color(0, 0, 0,250));
                T6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T6.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Massage.png")));
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
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/B Settings.png")));
                T7.setForeground(new Color(0, 0, 0,250));
                T7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Settings.png")));
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

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        JComboBox dura = new JComboBox();
        dura.setBounds(585,46,127,30);
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dura.setForeground(Color.BLACK);
        dura.addItem("Select");
        dura.addItem("Sinhala");
        dura.addItem("English");
        dura.addItem("Tamil");
        dura.addItem("Mathematics");
        dura.addItem("Grography");
        dura.addItem("Science");
        dura.addItem("History");
        dura.addItem("Health");
        dura.addItem("Ict");
        dura.addItem("Drama");
        add(dura);
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,14);
        dura.setFont(duraa);

//------------------------------------------------------------------------------------------------------------------------------

        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"First Name","last Name","Telephone Number"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(187, 35, 347, 442);
        frame.setLayout(null);
        add(pane);



        dura.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){

                Object[] row = new Object[3];

                model.setRowCount(0);

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE Subject = '"+(String)dura.getSelectedItem()+"'");

                    while(rs.next()){

                        row[0] = rs.getString("first_name");
                        row[1] = rs.getString("last_name");
                        row[2] = rs.getString("Tel1");

                        model.addRow(row);

                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }
            }
        });

////==============================================================================
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
//------------------------------------------------------------------------------------------------------------------------------

        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Teachers_teacher/Main.png")));
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
