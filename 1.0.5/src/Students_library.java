import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import org.jdesktop.swingx.JXMonthView;

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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Students_library extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    Students_library(){
        setLayout(null);


//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Students_library/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Students_library/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Students_library/Logout x.png")));
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
        i1.setIcon(new ImageIcon(getClass().getResource("Students_library/B Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Students_library/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Students_library/Exam.png")));
        i3.setBounds(34,181,15,17);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Students_library/Massage.png")));
        i4.setBounds(34,225,17,10);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Students_library/Settings.png")));
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
                i2.setIcon(new ImageIcon(getClass().getResource("Students_library/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Students_library/Teachers.png")));
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
                i3.setIcon(new ImageIcon(getClass().getResource("Students_library/B Exam.png")));
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Students_library/Exam.png")));
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
                i4.setIcon(new ImageIcon(getClass().getResource("Students_library/B Massage.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Students_library/Massage.png")));
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
                i5.setIcon(new ImageIcon(getClass().getResource("Students_library/B Settings.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Students_library/Settings.png")));
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
        ai.setIcon(new ImageIcon(getClass().getResource("Students_library/AI2.png")));
        ai.setBounds(17,292,128,158);
        add(ai);

        ai.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                ai.setIcon(new ImageIcon(getClass().getResource("Students_library/AI.png")));

            }
        });

        ai.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                ai.setIcon(new ImageIcon(getClass().getResource("Students_library/AI2.png")));


            }
        });

//======================================================================================================================


        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Students_library/profile 01.png")));
        prof.setBounds(815,52,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Students_library/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                prof.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                profl.setIcon(new ImageIcon(getClass().getResource("Students_library/profile.png")));
                profl.setBounds(813,50,76,76);

            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                prof.setIcon(new ImageIcon(getClass().getResource("Students_library/profile 01.png")));
                profl.setBounds(0,0,0,0);

            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
//
//
//        JLabel l3 = new JLabel ("Search");
//        l3.setForeground(new Color(148, 148, 148, 255));
//        l3.setBounds(505,25,65,20);
//        add(l3);
//        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,13);
//        l3.setFont(Atel3);
//
//        JTextField t1 = new JTextField();
//        t1.setBounds (498,25,225,22);
//        t1.setForeground(Color.BLACK);
//        t1.setBackground(new Color(101, 52, 216, 0));
//        t1.setBorder(null);
//        t1.setEditable(true);
//        t1.setOpaque(false);
//        add(t1);
//        Font Atetl = new Font ("calibri",Font.BOLD,15);
//        t1.setFont(Atetl);

//==============================================================================

        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Book Name","Status","Date taken","Until when"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(203, 79, 515, 382);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[4];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_library WHERE user_id = "+Integer.parseInt(UID));

            while (rs.next()) {

                row[0] = rs.getString("Book_Name");
                row[1] = rs.getString("Status");
                row[2] = rs.getString("Date_taken");
                row[3] = rs.getString("Until_when");


                // add row to the model
                model.addRow(row);
                //int i = table.getSelectedRow();


            }
        } catch (Exception ew) {
            System.out.println(ew);
        }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        DocumentListener  documentListener = new DocumentListener() {
//            public void changedUpdate(DocumentEvent documentEvent) {
//                printIt(documentEvent);
//                if(t1.getText().isEmpty()){
//                    l3.setBounds(505,25,65,20);
//                } else{
//                    l3.setBounds(0,0,0,0);
//                }
//            }
//
//            public void insertUpdate(DocumentEvent documentEvent) {
//                printIt(documentEvent);
//                if(t1.getText().isEmpty()){
//                    l3.setBounds(505,25,65,20);
//                } else{
//                    l3.setBounds(0,0,0,0);
//                }
//            }
//
//            public void removeUpdate(DocumentEvent documentEvent) {
//                if(t1.getText().isEmpty()){
//                    l3.setBounds(505,25,65,20);
//                } else{
//                    l3.setBounds(0,0,0,0);
//                }
//                printIt(documentEvent);
//            }
//
//            private void printIt(DocumentEvent documentEvent) {
//                System.out.println(t1.getText());
//
//            }
//        };
//
//        t1.getDocument().addDocumentListener(documentListener);

//==============================================================================




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
                g.setText(Grade);
                c.setText(Class1);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------



//------------------------------------------------------------------------------------------------------------------------------

        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Students_library/Main.png")));
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
