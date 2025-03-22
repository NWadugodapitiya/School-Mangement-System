import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.toedter.calendar.JCalendar;
import org.jdesktop.swingx.JXMonthView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Students extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    Students(){
        setLayout(null);

//------------------------------------------------------------------------------------------------------------------------------
        speakText("Welcome to the student home page.");
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Students/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Students/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Students/Logout x.png")));
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
        i1.setIcon(new ImageIcon(getClass().getResource("Students/B Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Students/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Students/Exam.png")));
        i3.setBounds(34,181,15,17);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Students/Massage.png")));
        i4.setBounds(34,225,17,10);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Students/Settings.png")));
        i5.setBounds(34,265,15,15);
        add(i5);

//------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(60,96,76,20);
        T1.setForeground(new Color(0, 0, 0, 255));
        add(T1);
        Font text1 = new Font ("Segoe UI",Font.BOLD,15);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Teachers");
        T2.setBounds(60,138,62,20);
        T2.setForeground(new Color(112, 112, 112, 255));
        add(T2);
        Font text2 = new Font ("Segoe UI",Font.BOLD,15);
        T2.setFont(text2);

        JLabel T3 = new JLabel ("Exam");
        T3.setBounds(60,180,40,20);
        T3.setForeground(new Color(112, 112, 112, 255));
        add(T3);
        Font text3 = new Font ("Segoe UI",Font.BOLD,15);
        T3.setFont(text3);

        JLabel T4 = new JLabel ("Message");
        T4.setBounds(60,222,65,20);
        T4.setForeground(new Color(112, 112, 112, 255));
        add(T4);
        Font text4 = new Font ("Segoe UI",Font.BOLD,15);
        T4.setFont(text4);

        JLabel T5 = new JLabel ("Settings");
        T5.setBounds(60,264,60,20);
        T5.setForeground(new Color(112, 112, 112, 255));
        add(T5);
        Font text5 = new Font ("Segoe UI",Font.BOLD,15);
        T5.setFont(text5);



//======================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              Students  Frame = new Students ();
                dispose();
            }
        });

//======================================================================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                i2.setIcon(new ImageIcon(getClass().getResource("Students/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Students/Teachers.png")));
                T2.setForeground(new Color(112, 112, 112, 255));}
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               Students_teacher  Frame = new Students_teacher ();
                dispose();
            }
        });

//======================================================================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                i3.setIcon(new ImageIcon(getClass().getResource("Students/B Exam.png")));
                T3.setForeground(new Color(0, 0, 0,250));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Students/Exam.png")));
                T3.setForeground(new Color(112, 112, 112, 255));}
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                         Students_exam  Frame = new Students_exam ();
                dispose();
            }
        });
//======================================================================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                i4.setIcon(new ImageIcon(getClass().getResource("Students/B Massage.png")));
                T4.setForeground(new Color(0, 0, 0,250));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Students/Massage.png")));
                T4.setForeground(new Color(112, 112, 112, 255));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              Students_massage  Frame = new Students_massage ();
                dispose();
            }
        });
//======================================================================================================================
        T5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                i5.setIcon(new ImageIcon(getClass().getResource("Students/B Settings.png")));
                T5.setForeground(new Color(0, 0, 0,250));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Students/Settings.png")));
                T5.setForeground(new Color(112, 112, 112, 255));}
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Students_settings  Frame = new Students_settings ();
                dispose();
            }
        });
//======================================================================================================================
        JLabel ai = new JLabel();
        ai.setIcon(new ImageIcon(getClass().getResource("Students/AI2.png")));
        ai.setBounds(17,292,128,158);
        add(ai);

        ai.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                ai.setIcon(new ImageIcon(getClass().getResource("Students/AI.png")));

            }
        });

        ai.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                ai.setIcon(new ImageIcon(getClass().getResource("Students/AI2.png")));


            }
        });

//======================================================================================================================


        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Students/profile 01.png")));
        prof.setBounds(815,52,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Students/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setIcon(new ImageIcon(getClass().getResource("Students/profile.png")));
                profl.setBounds(813,50,76,76);
                prof.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                prof.setIcon(new ImageIcon(getClass().getResource("Students/profile 01.png")));
                profl.setBounds(0,0,0,0);

            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        JLabel bord = new JLabel();
        add(bord);

        JLabel ssdp = new JLabel();
        ssdp.setIcon(new ImageIcon(getClass().getResource("Students/students rank.png")));
        JScrollPane scrol = new JScrollPane(ssdp);
        scrol.setBounds(542,228,203,245);
        ssdp.setBackground(Color.white);
        ssdp.getBorder();
        add(scrol);


    JPanel b1 = new JPanel();
        b1.setBounds(187,233,106,49);
        b1.setBackground(new Color(21,21,21,0));
    add(b1);

        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Students_library Frame = new Students_library();
                dispose();
            }
        });


        JPanel b2 = new JPanel();
        b2.setBounds(302,233,106,49);
        b2.setBackground(new Color(21,21,21,0));
        add(b2);

        JPanel b3 = new JPanel();
        b3.setBounds(419,233,106,49);
        b3.setBackground(new Color(21,21,21,0));
        add(b3);

        JPanel b4 = new JPanel();
        b4.setBounds(543,228,191,245);
        b4.setBackground(new Color(21,21,21,0));
        add(b4);

        JLabel www = new JLabel();
        www.setIcon(new ImageIcon(getClass().getResource("Students/n cal.png")));
        www.setBounds(187,292,244,32);
        add(www);

        JPanel b5 = new JPanel();
        b5.setBounds(195,295,225,160);
        b5.setBackground(new Color(166, 225, 244, 0));
        add(b5);

        JXMonthView monthView = new JXMonthView();
        monthView.setPreferredSize(new Dimension(250, 200));
        b5.add(monthView);


        monthView.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                www.setIcon(new ImageIcon(getClass().getResource("Students/n cal.png")));

            }
        });

        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                bord.setIcon(new ImageIcon(getClass().getResource("Students/bord.png")));
                bord.setBounds(187,233,106,49);}
        });

        b1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                bord.setIcon(new ImageIcon(getClass().getResource("Students/bord.png")));
                bord.setBounds(302,233,106,49);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                bord.setIcon(new ImageIcon(getClass().getResource("Students/bord.png")));
                bord.setBounds(419,233,106,49);}
        });

        b3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
            }
        });

        ssdp.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setIcon(new ImageIcon(getClass().getResource("Students/bord rank.png")));
                bord.setBounds(538,226,189,249);
            }
        });

        ssdp.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
            }
        });

        monthView.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                monthView.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                bord.setIcon(new ImageIcon(getClass().getResource("Students/bord calander.png")));
                bord.setBounds(187,306,244,159);
            }
        });

        monthView.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
                www.setIcon(new ImageIcon(getClass().getResource("Students/n cal.png")));
            }
        });






//------------------------------------------------------------------------------------------------------------------------------
        JLabel GClass = new JLabel ("08-C");
        GClass.setBounds(233,68,220,90);
        GClass.setForeground(new Color(250, 250, 250,250));
        add(GClass);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,68);
        GClass.setFont(GrClass);

        JLabel Uname = new JLabel ("K.G Wimukthi Perera");
        Uname.setBounds(240,146,280,20);
        Uname.setForeground(new Color(0, 0, 0,250));
        add(Uname);
        Font Usname = new Font ("Segoe UI",Font.BOLD,15);
        Uname.setFont(Usname);

        JLabel cat1 = new JLabel ("Library");
        cat1.setBounds(194,236,50,20);
        cat1.setForeground(new Color(0, 0, 0,250));
        add(cat1);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,15);
        cat1.setFont(calandertext);

        JLabel cat1l = new JLabel ("47");
        cat1l.setBounds(253,256,20,20);
        cat1l.setForeground(new Color(0, 0, 0,250));
        add(cat1l);
        Font librarytext = new Font ("Segoe UI",Font.BOLD,15);
        cat1l.setFont(librarytext);

        JLabel subject = new JLabel ("Subjects");
        subject.setBounds(314,236,60,20);
        subject.setForeground(new Color(0, 0, 0,250));
        add(subject);
        Font subject1 = new Font ("Segoe UI",Font.BOLD,15);
        subject.setFont(subject1);

        JLabel subjecttext = new JLabel ("12");
        subjecttext.setBounds(379,256,20,20);
        subjecttext.setForeground(new Color(0, 0, 0,250));
        add(subjecttext);
        Font subjecttext1 = new Font ("Segoe UI",Font.BOLD,15);
        subjecttext.setFont(subjecttext1);

        JLabel lessons = new JLabel ("Lessons");
        lessons.setBounds(430,236,60,20);
        lessons.setForeground(new Color(0, 0, 0,250));
        add(lessons);
        Font lessons1 = new Font ("Segoe UI",Font.BOLD,15);
        lessons.setFont(lessons1);

        JLabel lessonstext = new JLabel ("23/50");
        lessonstext.setBounds(473,256,50,20);
        lessonstext.setForeground(new Color(0, 0, 0,250));
        add(lessonstext);
        Font lessonstext1 = new Font ("Segoe UI",Font.BOLD,15);
        lessonstext.setFont(lessonstext1);

        JLabel l3 = new JLabel ("Search");
        l3.setForeground(new Color(148, 148, 148, 255));
        l3.setBounds(505,25,65,20);
        add(l3);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,13);
        l3.setFont(Atel3);

        JTextField t1 = new JTextField();
        t1.setBounds (498,25,225,22);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        Font Atetl = new Font ("calibri",Font.BOLD,15);
        t1.setFont(Atetl);


        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(505,25,65,20);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(505,25,65,20);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(505,25,65,20);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListener);


        JLabel tryp = new JLabel ("Students");
        tryp.setBounds(819,146,63,20);
        tryp.setForeground(new Color(0, 0, 0,250));
        add(tryp);
        Font tryp1 = new Font ("Segoe UI",Font.BOLD,15);
        tryp.setFont(tryp1);

        JLabel name = new JLabel ("A.N Wadugodapitiya");
        name.setBounds(776,125,200,20);
        name.setForeground(new Color(0, 0, 0,250));
        add(name);
        Font name1 = new Font ("Segoe UI",Font.BOLD,15);
        name.setFont(name1);
// ------------------------------------------------------------------------------------------------------------------------------
        JLabel g = new JLabel();
        JLabel c = new JLabel();
        JLabel u = new JLabel("Teachers");
        JLabel uu = new JLabel("Students");
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
                GClass.setText(Grade+"-"+Class1);
                g.setText(Grade);
                c.setText(Class1);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            Statement st = (Statement) con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE Grade = '"+g.getText()+ "' && Class ='"+c.getText()+ "' && User ='"+u.getText()+"'");


            while(rs.next()){

                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");
                String Grade= rs.getString("Grade");
                String Class1= rs.getString("Class");


                Uname.setText(first_name+" "+last_name);
                GClass.setText(Grade+"-"+Class1);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }

//------------------------------------------------------------------------------------------------------------------------------
        try{
            Connection con; Statement st; ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT COUNT(Book_id) FROM user_library WHERE user_id = "+Integer.parseInt(UID));
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            cat1l.setText(""+i);
            con.close();
            st.close();
            rs.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

//------------------------------------------------------------------------------------------------------------------------------

        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Students/Main.png")));
        add(a);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        setSize (950,502);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }

    private void speakText(String s) {
        // Set the voice manager using FreeTTS
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");

        if (voice == null) {
            System.out.println("Voice not found.");
            return;
        }

        // Allocate the synthesizer
        voice.allocate();

        // Speak the text
        voice.speak(s);

        // Deallocate the synthesizer after speaking
        voice.deallocate();
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
