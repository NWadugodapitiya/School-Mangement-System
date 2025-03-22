import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teachers_students extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    Teachers_students(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------


        JLabel Grade = new JLabel("");
        JLabel G_Class = new JLabel("");

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
                String grade= rs.getString("Grade");
                String aclass= rs.getString("Class");

                //     user_id	first_name	last_name	password	Date_Time	User	Backup_Code	update_date	Grade	Class	Tel1	Tel2	Subject	Address	Date_of_birth


                Grade.setText(grade);
                G_Class.setText(aclass);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//---------------------------------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Teachers_students/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Logout x.png")));
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
        JLabel q03 = new JLabel ("Student Full Name      =");
        q03.setBounds(190,160,225,24);
        q03.setForeground(Color.BLACK);
        add(q03);
        Font Qq03 = new Font ("Segoe UI",Font.PLAIN,19);
        q03.setFont(Qq03);

        JTextField A2 = new JTextField();
        A2.setBounds (425,158,315,24);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        Font Atet2 = new Font ("Arial Rounded MT",Font.PLAIN,18);
        A2.setFont(Atet2);

        JLabel q04 = new JLabel ("Address                        =");
        q04.setBounds(190,212,225,24);
        q04.setForeground(Color.BLACK);
        add(q04);
        Font Qq04 = new Font ("Segoe UI",Font.PLAIN,19);
        q04.setFont(Qq04);

        JTextField A3 = new JTextField();
        A3.setBounds (425,210,315,24);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(true);
        A3.setOpaque(false);
        add(A3);
        Font Atet3 = new Font ("Arial Rounded MT",Font.PLAIN,18);
        A3.setFont(Atet3);

        JLabel q05 = new JLabel ("Date Of Birth               =");
        q05.setBounds(190,260,225,20);
        q05.setForeground(Color.BLACK);
        add(q05);
        Font Qq05 = new Font ("Segoe UI",Font.PLAIN,19);
        q05.setFont(Qq05);

        JTextField A4 = new JTextField();
        A4.setBounds (425,262,315,24);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(true);
        A4.setOpaque(false);
        add(A4);
        Font Atet4 = new Font ("Arial Rounded MT",Font.PLAIN,18);
        A4.setFont(Atet4);

        JLabel q06 = new JLabel ("Telephone Numbers    =");
        q06.setBounds(190,314,225,20);
        q06.setForeground(Color.BLACK);
        add(q06);
        Font Qq06 = new Font ("Segoe UI",Font.PLAIN,19);
        q06.setFont(Qq06);

        JTextField A5 = new JTextField();
        A5.setBounds (425,314,315,24);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(true);
        A5.setOpaque(false);
        add(A5);
        Font Atet5 = new Font ("Arial Rounded MT",Font.PLAIN,18);
        A5.setFont(Atet5);


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


        JLabel User = new JLabel("Students");

//==================================================================================================



        //==============================================================================

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                A2.setText("");
                A3.setText("");
                A4.setText("");
                A5.setText("");

                printIt(documentEvent);
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                A2.setText("");
                A3.setText("");
                A4.setText("");
                A5.setText("");


                printIt(documentEvent);
            }

            private void printIt(DocumentEvent documentEvent) {

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

                    ResultSet rs=st.executeQuery("SELECT * FROM user_register WHERE user_id = '"+A1.getText()+ "' && User ='"+User.getText()+"'&& Grade ='"+Grade.getText()+"'&& Class ='"+G_Class.getText()+"'");

                    while(rs.next()){
                        String first_name= rs.getString("first_name");
                        String last_name= rs.getString("last_name");
                        String address= rs.getString("Address");
                        String date_of_birth= rs.getString("Date_of_birth");
                        String tel1= rs.getString("Tel1");


                        //     user_id	first_name	last_name	password	Date_Time	User	Backup_Code	update_date	Grade	Class	Tel1		Subject	Address	Date_of_birth

                        A2.setText(first_name+" "+last_name);
                        A3.setText(address);
                        A4.setText(date_of_birth);
                        A5.setText(tel1);



                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }


            }
        };

        A1.getDocument().addDocumentListener(documentListener);

//==============================================================================
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exax = new JLabel();
        exax.setIcon(new ImageIcon(getClass().getResource("Teachers_students/SWRE_X.png")));
        //    exax.setBounds(61,337,166,59);
        add(exax);

        JLabel Exa = new JLabel();
        Exa.setIcon(new ImageIcon(getClass().getResource("Teachers_students/SWRE.png")));
        Exa.setBounds(558,393,180,29);
        add(Exa);



        Exa.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                exax.setBounds(558,393,180,29);
                exax.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        Exa.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                exax.setBounds(0,0,0,0);
            }
        });
// -----------------------------------------------------------------------------------------------------------------------------
//        JLabel Printx = new JLabel();
//        Printx.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Print x.png")));
//        //    Printx.setBounds(61,337,166,59);
//        add(Printx);
//
//        JLabel print = new JLabel();
//        print.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Print.png")));
//        add(print);
//
//
//
//        print.addMouseListener(new MouseAdapter() {
//            public void mouseEntered(MouseEvent e) {
//                Printx.setBounds(682,393,56,29);
//
//            }
//        });
//
//        print.addMouseListener(new MouseAdapter() {
//            public void mouseExited(MouseEvent e) {
//                Printx.setBounds(0,0,0,0);
//            }
//        });
//------------------------------------------------------------------------------------------------------------------------------

        Exa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Teachers_exam  Frame = new Teachers_exam ();
                dispose();

            }
        });

//------------------------------------------------------------------------------------------------------------------------------

        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Students.png")));
        i3.setBounds(37,181,9,14);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Library.png")));
        i4.setBounds(34,225,16,12);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Exam.png")));
        i5.setBounds(34,265,15,17);
        add(i5);

        JLabel i6 = new JLabel();
        i6.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Massage.png")));
        i6.setBounds(34,311,17,10);
        add(i6);

        JLabel i7 = new JLabel();
        i7.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Settings.png")));
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
        T3.setForeground(new Color(0, 0, 0, 255));
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
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Dashboard.png")));
                T1.setForeground(new Color(0, 0, 0,250));
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Dashboard.png")));
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
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Teachers.png")));
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
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
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
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Library.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Library.png")));
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
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Exam.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Exam.png")));
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
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Massage.png")));
                T6.setForeground(new Color(0, 0, 0,250));
                T6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T6.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Massage.png")));
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
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_students/B Settings.png")));
                T7.setForeground(new Color(0, 0, 0,250));
                T7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i7.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Settings.png")));
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



                name.setText(first_name+" "+last_name);



            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }


//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Teachers_students/Main.png")));
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