import com.lowagie.text.*;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Students_exam extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();



    Students_exam(){
        setLayout(null);


        JLabel q03 = new JLabel ("Sinhala");
        q03.setBounds(200,97,70,24);
        q03.setForeground(Color.BLACK);
        add(q03);
        Font Qq03 = new Font ("Segoe UI",Font.PLAIN,18);
        q03.setFont(Qq03);

        JTextField A2 = new JTextField();
        A2.setBounds (347,95,82,28);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(false);
        A2.setOpaque(false);
        add(A2);
        Font Atet2 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A2.setFont(Atet2);

        JLabel q04 = new JLabel ("English");
        q04.setBounds(200,145,70,24);
        q04.setForeground(Color.BLACK);
        add(q04);
        Font Qq04 = new Font ("Segoe UI",Font.PLAIN,18);
        q04.setFont(Qq04);

        JTextField A3 = new JTextField();
        A3.setBounds (347,142,82,28);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(false);
        A3.setOpaque(false);
        add(A3);
        Font Atet3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A3.setFont(Atet3);

        JLabel q05 = new JLabel ("Tamil");
        q05.setBounds(200,193,70,24);
        q05.setForeground(Color.BLACK);
        add(q05);
        Font Qq05 = new Font ("Segoe UI",Font.PLAIN,18);
        q05.setFont(Qq05);

        JTextField A4 = new JTextField();
        A4.setBounds (347,189,82,28);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(false);
        A4.setOpaque(false);
        add(A4);
        Font Atet4 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A4.setFont(Atet4);

        JLabel q06 = new JLabel ("Buddhism");
        q06.setBounds(200,241,100,24);
        q06.setForeground(Color.BLACK);
        add(q06);
        Font Qq06 = new Font ("Segoe UI",Font.PLAIN,18);
        q06.setFont(Qq06);

        JTextField A5 = new JTextField();
        A5.setBounds (347,236,82,28);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(false);
        A5.setOpaque(false);
        add(A5);
        Font Atet5 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A5.setFont(Atet5);

        JLabel q07 = new JLabel ("Mathematics");
        q07.setBounds(200,289,120,24);
        q07.setForeground(Color.BLACK);
        add(q07);
        Font Qq07 = new Font ("Segoe UI",Font.PLAIN,18);
        q07.setFont(Qq07);

        JTextField A6 = new JTextField();
        A6.setBounds (347,283,82,28);
        A6.setForeground(Color.BLACK);
        A6.setBackground(new Color(101, 52, 216, 0));
        A6.setBorder(null);
        A6.setEditable(false);
        A6.setOpaque(false);
        add(A6);
        Font Atet6 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A6.setFont(Atet6);

        JLabel q08 = new JLabel ("Science");
        q08.setBounds(200,337,70,24);
        q08.setForeground(Color.BLACK);
        add(q08);
        Font Qq08 = new Font ("Segoe UI",Font.PLAIN,18);
        q08.setFont(Qq08);

        JTextField A7 = new JTextField();
        A7.setBounds (347,330,82,28);
        A7.setForeground(Color.BLACK);
        A7.setBackground(new Color(101, 52, 216, 0));
        A7.setBorder(null);
        A7.setEditable(false);
        A7.setOpaque(false);
        add(A7);
        Font Atet7 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A7.setFont(Atet7);

        JLabel w1 = new JLabel ("History");
        w1.setBounds(520,88,70,24);
        w1.setForeground(Color.BLACK);
        add(w1);
        Font ww1 = new Font ("Segoe UI",Font.PLAIN,18);
        w1.setFont(ww1);

        JTextField e1 = new JTextField();
        e1.setBounds (638,95,82,28);
        e1.setForeground(Color.BLACK);
        e1.setBackground(new Color(101, 52, 216, 0));
        e1.setBorder(null);
        e1.setEditable(false);
        e1.setOpaque(false);
        add(e1);
        Font ee1 = new Font ("Arial Rounded MT",Font.BOLD,17);
        e1.setFont(ee1);

        JLabel w2 = new JLabel ("Geography");
        w2.setBounds(520,136,100,24);
        w2.setForeground(Color.BLACK);
        add(w2);
        Font ww2 = new Font ("Segoe UI",Font.PLAIN,18);
        w2.setFont(ww2);

        JTextField e2 = new JTextField();
        e2.setBounds (638,142,82,28);
        e2.setForeground(Color.BLACK);
        e2.setBackground(new Color(101, 52, 216, 0));
        e2.setBorder(null);
        e2.setEditable(false);
        e2.setOpaque(false);
        add(e2);
        Font ee2 = new Font ("Arial Rounded MT",Font.BOLD,17);
        e2.setFont(ee2);

        JLabel w3 = new JLabel ("Health");
        w3.setBounds(520,184,70,24);
        w3.setForeground(Color.BLACK);
        add(w3);
        Font ww3 = new Font ("Segoe UI",Font.PLAIN,18);
        w3.setFont(ww3);

        JTextField e3 = new JTextField();
        e3.setBounds (638,189,82,28);
        e3.setForeground(Color.BLACK);
        e3.setBackground(new Color(101, 52, 216, 0));
        e3.setBorder(null);
        e3.setEditable(false);
        e3.setOpaque(false);
        add(e3);
        Font ee3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        e3.setFont(ee3);

        JLabel w4 = new JLabel ("Commerce");
        w4.setBounds(520,232,100,24);
        w4.setForeground(Color.BLACK);
        add(w4);
        Font ww4 = new Font ("Segoe UI",Font.PLAIN,18);
        w4.setFont(ww4);

        JTextField e4 = new JTextField();
        e4.setBounds (638,236,82,28);
        e4.setForeground(Color.BLACK);
        e4.setBackground(new Color(101, 52, 216, 0));
        e4.setBorder(null);
        e4.setEditable(false);
        e4.setOpaque(false);
        add(e4);
        Font ee4 = new Font ("Arial Rounded MT",Font.BOLD,17);
        e4.setFont(ee4);

        JLabel w5 = new JLabel ("Ict");
        w5.setBounds(520,280,70,24);
        w5.setForeground(Color.BLACK);
        add(w5);
        Font ww5 = new Font ("Segoe UI",Font.PLAIN,18);
        w5.setFont(ww5);

        JTextField e5 = new JTextField();
        e5.setBounds (638,283,82,28);
        e5.setForeground(Color.BLACK);
        e5.setBackground(new Color(101, 52, 216, 0));
        e5.setBorder(null);
        e5.setEditable(false);
        e5.setOpaque(false);
        add(e5);
        Font ee5 = new Font ("Arial Rounded MT",Font.BOLD,17);
        e5.setFont(ee5);

        JLabel w6 = new JLabel ("Music");
        w6.setBounds(520,328,70,24);
        w6.setForeground(Color.BLACK);
        add(w6);
        Font ww6 = new Font ("Segoe UI",Font.PLAIN,18);
        w6.setFont(ww6);

        JTextField e6 = new JTextField();
        e6.setBounds (638,330,82,28);
        e6.setForeground(Color.BLACK);
        e6.setBackground(new Color(101, 52, 216, 0));
        e6.setBorder(null);
        e6.setEditable(false);
        e6.setOpaque(false);
        add(e6);
        Font ee6 = new Font ("Arial Rounded MT",Font.BOLD,17);
        e6.setFont(ee6);

        JLabel q09 = new JLabel ("Total =  ");
        q09.setBounds(255,384,150,20);
        q09.setForeground(Color.BLACK);
        add(q09);
        Font Qq09 = new Font ("Segoe UI",Font.PLAIN,18);
        q09.setFont(Qq09);


        JLabel lu = new JLabel ("Last Update  =  ");
        lu.setBounds(200,463,250,20);
        lu.setForeground(Color.BLACK);
        add(lu);
        Font lup = new Font ("Segoe UI",Font.PLAIN,12);
        lu.setFont(lup);
//==============================================================================================

        JLabel B1 = new JLabel ("I");
        B1.setBounds(555,451,8,20);
        B1.setForeground(Color.BLACK);
        add(B1);
        Font BB1 = new Font ("Segoe UI",Font.BOLD,15);
        B1.setFont(BB1);

        JLabel B2 = new JLabel ("II");
        B2.setBounds(620,451,12,20);
        B2.setForeground(Color.BLACK);
        add(B2);
        Font BB2 = new Font ("Segoe UI",Font.BOLD,15);
        B2.setFont(BB2);

        JLabel B3 = new JLabel ("III");
        B3.setBounds(684,451,18,20);
        B3.setForeground(Color.BLACK);
        add(B3);
        Font BB3 = new Font ("Segoe UI",Font.BOLD,15);
        B3.setFont(BB3);


        JLabel bu = new JLabel();
        bu.setIcon(new ImageIcon(getClass().getResource("Students_exam/EX.png")));
        add(bu);

        JPanel i = new JPanel();
        i.setBounds(529,449,60,26);
        i.setBackground(new Color(21,21,21,0));
        add(i);

        JPanel ii = new JPanel();
        ii.setBounds(595,449,60,26);
        ii.setBackground(new Color(21,21,21,0));
        add(ii);

        JPanel iii = new JPanel();
        iii.setBounds(661,449,60,26);
        iii.setBackground(new Color(21,21,21,0));
        add(iii);


        i.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bu.setBounds(529,449,60,26);
                bu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                B1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        i.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bu.setBounds(0,0,0,0);
            }
        });

        ii.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bu.setBounds(595,449,60,26);
                bu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                B2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        ii.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bu.setBounds(0,0,0,0);
            }
        });

        iii.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bu.setBounds(661,449,60,26);
                bu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                B3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        iii.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bu.setBounds(0,0,0,0);
            }
        });


//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Students_exam/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Students_exam/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Students_exam/Logout x.png")));
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
        i1.setIcon(new ImageIcon(getClass().getResource("Students_exam/Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Students_exam/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Students_exam/B Exam.png")));
        i3.setBounds(34,181,15,17);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Students_exam/Massage.png")));
        i4.setBounds(34,225,17,10);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Students_exam/Settings.png")));
        i5.setBounds(34,265,15,15);
        add(i5);

//------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(60,96,76,20);
        T1.setForeground(new Color(112, 112, 112, 255));
        add(T1);
        Font text1 = new Font ("Segoe UI",Font.BOLD,15);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Teachers");
        T2.setBounds(60,138,62,20);
        T2.setForeground(new Color(104, 104, 104, 255));
        add(T2);
        Font text2 = new Font ("Segoe UI",Font.BOLD,15);
        T2.setFont(text2);

        JLabel T3 = new JLabel ("Exam");
        T3.setBounds(60,180,40,20);
        T3.setForeground(new Color(0, 0, 0, 255));
        add(T3);
        Font text3 = new Font ("Segoe UI",Font.BOLD,15);
        T3.setFont(text3);

        JLabel T4 = new JLabel ("Message");
        T4.setBounds(60,222,65,20);
        T4.setForeground(new Color(104, 104, 104, 255));
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
                i1.setIcon(new ImageIcon(getClass().getResource("Students_exam/B Dashboard.png")));
                T1.setForeground(new Color(0, 0, 0,250));
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Students_exam/Dashboard.png")));
                T1.setForeground(new Color(112, 112, 112, 255));

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
                i2.setIcon(new ImageIcon(getClass().getResource("Students_exam/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Students_exam/Teachers.png")));
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
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
}
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
                i4.setIcon(new ImageIcon(getClass().getResource("Students_exam/B Massage.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Students_exam/Massage.png")));
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
                i5.setIcon(new ImageIcon(getClass().getResource("Students_exam/B Settings.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Students_exam/Settings.png")));
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
        ai.setIcon(new ImageIcon(getClass().getResource("Students_exam/AI2.png")));
        ai.setBounds(17,292,128,158);
        add(ai);

        ai.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                ai.setIcon(new ImageIcon(getClass().getResource("Students_exam/AI.png")));
            }
        });

        ai.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                ai.setIcon(new ImageIcon(getClass().getResource("Students_exam/AI2.png")));
            }
        });

//======================================================================================================================


        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Students_exam/profile 01.png")));
        prof.setBounds(815,52,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Students_exam/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setIcon(new ImageIcon(getClass().getResource("Students_exam/profile.png")));
                profl.setBounds(813,50,76,76);
                prof.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                prof.setIcon(new ImageIcon(getClass().getResource("Students_exam/profile 01.png")));
                profl.setBounds(0,0,0,0);

            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
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

//------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel g = new JLabel();
        JLabel c = new JLabel();
        JLabel u = new JLabel("Teachers");
        JLabel Uname = new JLabel();

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
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            Statement st = (Statement) con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE Grade = '"+g.getText()+ "' && Class ='"+c.getText()+ "' && User ='"+u.getText()+"'");


            while(rs.next()){

                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");

                Uname.setText(first_name+" "+last_name);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }

        JLabel aaa = new JLabel(" I Semester");
        JLabel bbb = new JLabel("II Semester");
        JLabel ccc = new JLabel("III Semester");

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            Statement st = (Statement) con.createStatement();


            ResultSet rs = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q03.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(rs.next()){
                String sinhala= rs.getString("one_Semester");
                A2.setText(sinhala);
            }

            ResultSet s2 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q04.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s2.next()){
                String english= s2.getString("one_Semester");
                A3.setText(english);
            }

            ResultSet s3 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q05.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s3.next()){
                String tamil= s3.getString("one_Semester");
                A4.setText(tamil);
            }

            ResultSet s4 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q06.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s4.next()){
                String buddhism= s4.getString("one_Semester");
                A5.setText(buddhism);
            }

            ResultSet s5 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q07.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s5.next()){
                String maths= s5.getString("one_Semester");
                A6.setText(maths);
            }

            ResultSet s6 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q08.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s6.next()){
                String science= s6.getString("one_Semester");
                A7.setText(science);
            }

            ResultSet s7 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w1.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s7.next()){
                String history= s7.getString("one_Semester");
                e1.setText(history);
            }

            ResultSet s8 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w2.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s8.next()){
                String geography= s8.getString("one_Semester");
                e2.setText(geography);
            }

            ResultSet s9 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w3.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s9.next()){
                String helth= s9.getString("one_Semester");
                e3.setText(helth);
            }

            ResultSet s10 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w4.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s10.next()){
                String commerce= s10.getString("one_Semester");
                e4.setText(commerce);
            }

            ResultSet s11 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w5.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s11.next()){
                String ict= s11.getString("one_Semester");
                e5.setText(ict);
            }

            ResultSet s12 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s12.next()){
                String music= s12.getString("one_Semester");
                e6.setText(music);
            }

            ResultSet s13 = st.executeQuery("SELECT SUM(one_Semester) FROM exams WHERE  user_id = "+Integer.parseInt(UID));
            while(s13.next()){
                int a1 = s13.getInt(1);
                q09.setText(String.valueOf("Total =  "+a1));
            }

            ResultSet s14 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
            while(s14.next()){
                String datetime= s14.getString("I_Date_and_time");
                lu.setText("Last Update  =  "+datetime);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }




        i.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
                        Statement st = (Statement) con.createStatement();


                        ResultSet rs = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q03.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(rs.next()){
                            String sinhala= rs.getString("one_Semester");
                            A2.setText(sinhala);
                        }

                        ResultSet s2 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q04.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s2.next()){
                            String english= s2.getString("one_Semester");
                            A3.setText(english);
                        }

                        ResultSet s3 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q05.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s3.next()){
                            String tamil= s3.getString("one_Semester");
                            A4.setText(tamil);
                        }

                        ResultSet s4 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q06.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s4.next()){
                            String buddhism= s4.getString("one_Semester");
                            A5.setText(buddhism);
                        }

                        ResultSet s5 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q07.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s5.next()){
                            String maths= s5.getString("one_Semester");
                            A6.setText(maths);
                        }

                        ResultSet s6 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q08.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s6.next()){
                            String science= s6.getString("one_Semester");
                            A7.setText(science);
                        }

                        ResultSet s7 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w1.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s7.next()){
                            String history= s7.getString("one_Semester");
                            e1.setText(history);
                        }

                        ResultSet s8 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w2.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s8.next()){
                            String geography= s8.getString("one_Semester");
                            e2.setText(geography);
                        }

                        ResultSet s9 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w3.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s9.next()){
                            String helth= s9.getString("one_Semester");
                            e3.setText(helth);
                        }

                        ResultSet s10 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w4.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s10.next()){
                            String commerce= s10.getString("one_Semester");
                            e4.setText(commerce);
                        }

                        ResultSet s11 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w5.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s11.next()){
                            String ict= s11.getString("one_Semester");
                            e5.setText(ict);
                        }

                        ResultSet s12 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s12.next()){
                            String music= s12.getString("one_Semester");
                            e6.setText(music);
                        }

                        ResultSet s13 = st.executeQuery("SELECT SUM(one_Semester) FROM exams WHERE  user_id = "+Integer.parseInt(UID));
                        while(s13.next()){
                            int a1 = s13.getInt(1);
                            q09.setText(String.valueOf("Total =  "+a1));
                        }

                        ResultSet s14 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
                        while(s14.next()){
                            String datetime= s14.getString("I_Date_and_time");
                            lu.setText("Last Update  =  "+datetime);
                        }
                    }
                    catch(Exception ew){
                        System.out.println(ew);
                    }




            }
        });

        ii.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
                    Statement st = (Statement) con.createStatement();


                    ResultSet rs = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q03.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(rs.next()){
                        String sinhala= rs.getString("two_Semester");
                        A2.setText(sinhala);
                    }

                    ResultSet s2 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q04.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s2.next()){
                        String english= s2.getString("two_Semester");
                        A3.setText(english);
                    }

                    ResultSet s3 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q05.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s3.next()){
                        String tamil= s3.getString("two_Semester");
                        A4.setText(tamil);
                    }

                    ResultSet s4 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q06.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s4.next()){
                        String buddhism= s4.getString("two_Semester");
                        A5.setText(buddhism);
                    }

                    ResultSet s5 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q07.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s5.next()){
                        String maths= s5.getString("two_Semester");
                        A6.setText(maths);
                    }

                    ResultSet s6 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q08.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s6.next()){
                        String science= s6.getString("two_Semester");
                        A7.setText(science);
                    }

                    ResultSet s7 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w1.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s7.next()){
                        String history= s7.getString("two_Semester");
                        e1.setText(history);
                    }

                    ResultSet s8 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w2.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s8.next()){
                        String geography= s8.getString("two_Semester");
                        e2.setText(geography);
                    }

                    ResultSet s9 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w3.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s9.next()){
                        String helth= s9.getString("two_Semester");
                        e3.setText(helth);
                    }

                    ResultSet s10 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w4.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s10.next()){
                        String commerce= s10.getString("two_Semester");
                        e4.setText(commerce);
                    }

                    ResultSet s11 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w5.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s11.next()){
                        String ict= s11.getString("two_Semester");
                        e5.setText(ict);
                    }

                    ResultSet s12 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s12.next()){
                        String music= s12.getString("two_Semester");
                        e6.setText(music);
                    }

                    ResultSet s13 = st.executeQuery("SELECT SUM(two_Semester) FROM exams WHERE  user_id = "+Integer.parseInt(UID));
                    while(s13.next()){
                        int a1 = s13.getInt(1);
                        q09.setText(String.valueOf("Total =  "+a1));
                    }

                    ResultSet s14 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s14.next()){
                        String datetime= s14.getString("II_Date_and_time");
                        lu.setText("Last Update  =  "+datetime);
                    }

                }
                catch(Exception ew){
                    System.out.println(ew);
                }



            }
        });


        iii.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
                    Statement st = (Statement) con.createStatement();


                    ResultSet rs = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q03.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(rs.next()){
                        String sinhala= rs.getString("three_Semester");
                        A2.setText(sinhala);
                    }

                    ResultSet s2 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q04.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s2.next()){
                        String english= s2.getString("three_Semester");
                        A3.setText(english);
                    }

                    ResultSet s3 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q05.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s3.next()){
                        String tamil= s3.getString("three_Semester");
                        A4.setText(tamil);
                    }

                    ResultSet s4 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q06.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s4.next()){
                        String buddhism= s4.getString("three_Semester");
                        A5.setText(buddhism);
                    }

                    ResultSet s5 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q07.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s5.next()){
                        String maths= s5.getString("three_Semester");
                        A6.setText(maths);
                    }

                    ResultSet s6 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+q08.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s6.next()){
                        String science= s6.getString("three_Semester");
                        A7.setText(science);
                    }

                    ResultSet s7 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w1.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s7.next()){
                        String history= s7.getString("three_Semester");
                        e1.setText(history);
                    }

                    ResultSet s8 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w2.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s8.next()){
                        String geography= s8.getString("three_Semester");
                        e2.setText(geography);
                    }

                    ResultSet s9 = st.executeQuery("SELECT * FROM exams WHERE  Subject = '"+w3.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s9.next()){
                        String helth= s9.getString("three_Semester");
                        e3.setText(helth);
                    }

                    ResultSet s10 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w4.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s10.next()){
                        String commerce= s10.getString("three_Semester");
                        e4.setText(commerce);
                    }

                    ResultSet s11 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w5.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s11.next()){
                        String ict= s11.getString("three_Semester");
                        e5.setText(ict);
                    }

                    ResultSet s12 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s12.next()){
                        String music= s12.getString("three_Semester");
                        e6.setText(music);
                    }

                    ResultSet s13 = st.executeQuery("SELECT SUM(three_Semester) FROM exams WHERE  user_id = "+Integer.parseInt(UID));
                    while(s13.next()){
                        int a1 = s13.getInt(1);
                        q09.setText(String.valueOf("Total =  "+a1));
                    }

                    ResultSet s14 = st.executeQuery("SELECT * FROM exams WHERE Subject = '"+w6.getText()+ "' && user_id = "+Integer.parseInt(UID));
                    while(s14.next()){
                        String datetime= s14.getString("III_Date_and_time");
                        lu.setText("Last Update  =  "+datetime);
                    }

                }
                catch(Exception ew){
                    System.out.println(ew);
                }



            }
        });



        JLabel pri = new JLabel ("Print");
        pri.setBounds(659,398,40,16);
        pri.setForeground(new Color(0, 0, 0, 255));
        add(pri);
        Font prin = new Font ("Segoe UI",Font.BOLD,15);
        pri.setFont(prin);

        JLabel pt = new JLabel();
        pt.setIcon(new ImageIcon(getClass().getResource("Students_exam/butt.png")));
        add(pt);

        JPanel ww = new JPanel();
        ww.setBounds(635,396,85,24);
        ww.setBackground(new Color(21,21,21,0));
        add(ww);

        ww.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                pt.setBounds(635,396,85,24);
                pt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        ww.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                pt.setBounds(0,0,0,0);
            }
        });




        ww.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                com.lowagie.text.Document document = new com.lowagie.text.Document(PageSize.A4, 50, 70, 50, 50) {

                };

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection conx = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                    java.sql.Statement st = (java.sql.Statement) conx.createStatement();
                    ResultSet query_set = st.executeQuery("SELECT * FROM exams WHERE user_id = " + Integer.parseInt(UID));


                    Document my_pdf_report = new Document();

                    PdfWriter writer = PdfWriter.getInstance(my_pdf_report, new FileOutputStream("My first.pdf"));


                    BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
                    BaseFont bf1 = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
                    BaseFont bf5 = BaseFont.createFont(BaseFont.TIMES_ITALIC, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);


                    int u = 1;
                    my_pdf_report.open();
                    float[] columnWidths = {0, 10, 4, 4, 4};
                    PdfPTable my_report_table = new PdfPTable(columnWidths);
                    my_report_table.setWidthPercentage(100);


                    com.lowagie.text.Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
                    PdfContentByte cb = writer.getDirectContent();

                    com.lowagie.text.Image image = com.lowagie.text.Image.getInstance("D:/Softwear/school management system/src/Students_exam/Test.png"); // Replace with actual image path

                    // Calculate the desired image dimensions based on the page size
                    float pageWidth = my_pdf_report.getPageSize().width();
                    float pageHeight = my_pdf_report.getPageSize().height();
                    float desiredImageWidth = pageWidth * 1f; // Adjust the scaling factor as needed
                    float desiredImageHeight = pageHeight * 1; // Adjust the scaling factor as needed

                    // Set image position and dimensions
                    float xPosition = (pageWidth - desiredImageWidth) / 2;
                    float yPosition = (pageHeight - desiredImageHeight) / 2;
                    image.setAbsolutePosition(xPosition, yPosition);
                    image.scaleAbsolute(desiredImageWidth, desiredImageHeight);

                    // Add image to the current page
                    my_pdf_report.add(image);

                    Phrase header = new Phrase("   ", ffont);
                    Phrase footer = new Phrase("Softwared by @Color Studio - 0703620555", ffont);
                    ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, header, (my_pdf_report.right() - my_pdf_report.left()) / 2 + my_pdf_report.leftMargin(), my_pdf_report.top() + 10, 0);
                    ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, footer, (my_pdf_report.right() - my_pdf_report.left()) / 2 + my_pdf_report.leftMargin(), my_pdf_report.bottom() - 10, 0);


                    FontSelector selector = new FontSelector();
                    com.lowagie.text.Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
                    com.lowagie.text.Font f2 = FontFactory.getFont("MSung-Light", "UniCNS-UCS2-H", BaseFont.NOT_EMBEDDED);

                    selector.addFont(f1);
                    selector.addFont(f2);

                    cb.setFontAndSize(bf, 12);
                    cb.beginText();


                    PdfPCell cell = new PdfPCell(new Phrase("This is a header", f1));
                    cell.setBackgroundColor(GrayColor.WHITE);


                    String title = ("Grade/Class      =   " + g.getText() + " - " + c.getText());
                    cb.setFontAndSize(bf1, 13);
                    cb.setTextMatrix(35, 235);
                    cb.showText(title);

                    String title2 = ("Class Teacher   =   " + Uname.getText());
                    cb.setFontAndSize(bf1, 13);
                    cb.setTextMatrix(35, 210);
                    cb.showText(title2);

                    String LINE1 = ("Student Name   =   " + name.getText());
                    cb.setFontAndSize(bf1, 13);
                    cb.setTextMatrix(35, 185);
                    cb.showText(LINE1);

                    String LINE2 = ("List of semester marks of students");
                    cb.setFontAndSize(bf5, 27);
                    cb.setTextMatrix(125, 575);
                    cb.showText(LINE2);

                    String sch_d10 = ("Subject                                         First semester          Second semester       Third semester");
                    cb.setFontAndSize(bf, 11);
                    cb.setTextMatrix(137, 540);
                    cb.showText(sch_d10);


                    com.lowagie.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14);
                    //       Paragraph para = new Paragraph(underline);
                    //     para.setLeading(0, 1);
                    PdfPTable table2 = new PdfPTable(1);
                    table2.setWidthPercentage(50);
                    table2.getDefaultCell().setBorder(Rectangle.BOTTOM);


                    PdfPCell cell1 = new PdfPCell();

                    cell1.setBorder(Rectangle.NO_BORDER);
                    cell1.setMinimumHeight(275);
                    cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    table2.addCell(cell1);
                    my_pdf_report.add(table2);


                    PdfPCell table_cell;

                    while (query_set.next()) {

//                        //String id = query_set.getString(u);
                        table_cell = new PdfPCell(new Phrase(u));
                        my_report_table.addCell(table_cell);

                        String dept_id = query_set.getString("Subject");
                        table_cell = new PdfPCell(new Phrase(dept_id));
                        my_report_table.addCell(table_cell);

                        String dept_name = query_set.getString("one_Semester");
                        table_cell = new PdfPCell(new Phrase(dept_name));
                        my_report_table.addCell(table_cell);

                        String manager_id = query_set.getString("two_Semester");
                        table_cell = new PdfPCell(new Phrase(manager_id));
                        my_report_table.addCell(table_cell);

                        String location_id = query_set.getString("three_Semester");
                        table_cell = new PdfPCell(new Phrase(location_id));
                        my_report_table.addCell(table_cell);

                    }


                    my_pdf_report.add(my_report_table);
                    my_pdf_report.close();


                    try {

                        File pdfFile = new File("My First.pdf");
                        if (pdfFile.exists()) {

                            if (Desktop.isDesktopSupported()) {
                                Desktop.getDesktop().open(pdfFile);
                            } else {
                                System.out.println("Awt Desktop is not supported!");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "No file found ", "No files", javax.swing.JOptionPane.WARNING_MESSAGE);
                        }

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (HeadlessException ex) {
                        throw new RuntimeException(ex);
                    }

                    query_set.close();
                } catch (Exception ew) {
                    System.out.println(ew);
                }

                    /* Close all DB related objects */


                //-----------------------------------------------------


            }});

//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Students_exam/Main.png")));
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