import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teachers_settings extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();

    File fileToSave;
    Teachers_settings(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
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



        JLabel q01 = new JLabel ("Your Backup Code  = ");
        q01.setBounds(439,37,250,24);
        q01.setForeground(Color.BLACK);
        add(q01);
        Font Qq01 = new Font ("Segoe UI",Font.BOLD,18);
        q01.setFont(Qq01);

        JLabel q02 = new JLabel ("Your ID  = ");
        q02.setBounds(182,61,120,21);
        q02.setForeground(Color.BLACK);
        add(q02);
        Font Qq02 = new Font ("Segoe UI",Font.PLAIN,16);
        q02.setFont(Qq02);

        JLabel q022 = new JLabel ("First Name                 =");
        q022.setBounds(236,115,200,24);
        q022.setForeground(Color.BLACK);
        add(q022);
        Font Qq022 = new Font ("Segoe UI",Font.PLAIN,18);
        q022.setFont(Qq022);

        JTextField A1 = new JTextField();
        A1.setBounds (465,114,221,28);
        A1.setForeground(Color.BLACK);
        A1.setBackground(new Color(101, 52, 216, 0));
        A1.setBorder(null);
        A1.setEditable(true);
        A1.setOpaque(false);
        add(A1);
        Font Atet1 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A1.setFont(Atet1);

        JLabel q03 = new JLabel ("Last Name                  =");
        q03.setBounds(236,163,200,24);
        q03.setForeground(Color.BLACK);
        add(q03);
        Font Qq03 = new Font ("Segoe UI",Font.PLAIN,18);
        q03.setFont(Qq03);

        JTextField A2 = new JTextField();
        A2.setBounds (465,162,221,28);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        Font Atet2 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A2.setFont(Atet2);

        JLabel q04 = new JLabel ("Date Of Birth              =");
        q04.setBounds(236,211,200,24);
        q04.setForeground(Color.BLACK);
        add(q04);
        Font Qq04 = new Font ("Segoe UI",Font.PLAIN,18);
        q04.setFont(Qq04);

        JTextField A3 = new JTextField();
        A3.setBounds (465,210,221,28);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(true);
        A3.setOpaque(false);
        add(A3);
        Font Atet3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A3.setFont(Atet3);

        JLabel q05 = new JLabel ("Address                      =");
        q05.setBounds(236,259,200,24);
        q05.setForeground(Color.BLACK);
        add(q05);
        Font Qq05 = new Font ("Segoe UI",Font.PLAIN,18);
        q05.setFont(Qq05);

        JTextField A4 = new JTextField();
        A4.setBounds (465,258,221,28);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(true);
        A4.setOpaque(false);
        add(A4);
        Font Atet4 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A4.setFont(Atet4);

        JLabel q06 = new JLabel ("Telephone Numbers   =");
        q06.setBounds(236,307,200,24);
        q06.setForeground(Color.BLACK);
        add(q06);
        Font Qq06 = new Font ("Segoe UI",Font.PLAIN,18);
        q06.setFont(Qq06);

        JTextField A5 = new JTextField();
        A5.setBounds (465,306,221,28);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(true);
        A5.setOpaque(false);
        add(A5);
        Font Atet5 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A5.setFont(Atet5);

        JLabel q07 = new JLabel ("Change Password       =");
        q07.setBounds(236,355,200,24);
        q07.setForeground(Color.BLACK);
        add(q07);
        Font Qq07 = new Font ("Segoe UI",Font.PLAIN,18);
        q07.setFont(Qq07);

        JTextField A6 = new JTextField();
        A6.setBounds (465,354,221,28);
        A6.setForeground(Color.BLACK);
        A6.setBackground(new Color(101, 52, 216, 0));
        A6.setBorder(null);
        A6.setEditable(true);
        A6.setOpaque(false);
        add(A6);
        Font Atet6 = new Font ("Arial Rounded MT",Font.BOLD,17);
        A6.setFont(Atet6);


        JLabel q09 = new JLabel ("Last Update  = ");
        q09.setBounds(176,461,200,20);
        q09.setForeground(Color.BLACK);
        add(q09);
        Font Qq09 = new Font ("Segoe UI",Font.PLAIN,12);
        q09.setFont(Qq09);
//------------------------------------------------------------------------------------------------------------------------------

        JLabel update = new JLabel();
        update.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Update.png")));
        update.setBounds(628,451,104,28);
        add(update);

        JLabel updatex = new JLabel();
        updatex.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Update_B.png")));
        add(updatex);

        update.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                updatex.setBounds(626,448,108,34);
                update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        update.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                updatex.setBounds(0,0,0,0);
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------


        //------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");
            Statement st = (Statement) con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE user_id = "+Integer.parseInt(UID));

            while(rs.next()){

                String backup_code= rs.getString("Backup_Code");
                String user_id= rs.getString("user_id");
                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");
                String Date_of_birth= rs.getString("Date_of_birth");
                String tel1= rs.getString("Tel1");
                String Password= rs.getString("password");
                String Address= rs.getString("Address");
                String update_date= rs.getString("update_date");

                //     user_id	first_name	last_name	password	Date_Time	User	Backup_Code	update_date	Grade	Class	Tel1		Subject	Address	Date_of_birth

                name.setText(first_name+last_name);
                q01.setText("Your Backup Code  = "+ backup_code);
                q02.setText("Your ID  = "+ user_id);
                A1.setText(first_name);
                A2.setText(last_name);
                A3.setText(Date_of_birth);
                A4.setText(Address);
                A5.setText(tel1);
                A6.setText(Password);
                q09.setText("Last Update  =  "+ update_date);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }


        update.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                PreparedStatement pst;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                    java.sql.Statement stmt = con.createStatement();
                    pst = con.prepareStatement("update user_register set first_name=?,last_name=?,Date_of_birth=?,Address=?,Tel1=?,password=?,update_date=? WHERE user_id ="+Integer.parseInt(UID));

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);

                    {

                        pst.setString(1, A1.getText());
                        pst.setString(2, A2.getText());
                        pst.setString(3, A3.getText());
                        pst.setString(4, A4.getText());
                        pst.setString(5, A5.getText());
                        pst.setString(6, A6.getText());
                        pst.setString(7, formattedDate);


                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);

                        Teachers_settings Frame = new Teachers_settings();
                        dispose();

                    }
                    stmt.close();
                    con.close();
                }catch (Exception eo){
                    System.out.println(eo);
                }

            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
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
        a2.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/exit.png")));
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
        login.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Logout x.png")));
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
//------------------------------------------------------------------------------------------------------------------------------

        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Dashboard.png")));
        i1.setBounds(34,99,15,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Teachers.png")));
        i2.setBounds(37,139,14,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Students.png")));
        i3.setBounds(37,181,9,14);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Library.png")));
        i4.setBounds(34,225,16,12);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Exam.png")));
        i5.setBounds(34,265,15,17);
        add(i5);

        JLabel i6 = new JLabel();
        i6.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Massage.png")));
        i6.setBounds(34,311,17,10);
        add(i6);

        JLabel i7 = new JLabel();
        i7.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Settings.png")));
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
        T3.setForeground(new Color(104, 104, 104, 255));
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
        T7.setForeground(new Color(0, 0, 0, 255));
        add(T7);
        Font text7 = new Font ("Segoe UI",Font.BOLD,15);
        T7.setFont(text7);

//======================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Dashboard.png")));
                T1.setForeground(new Color(0, 0, 0,250));
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Dashboard.png")));
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
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Teachers.png")));
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i2.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Teachers.png")));
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
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Students.png")));
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Students.png")));
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
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Library.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Library.png")));
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
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Exam.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Exam.png")));
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
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/B Massage.png")));
                T6.setForeground(new Color(0, 0, 0,250));
                T6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T6.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i6.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Massage.png")));
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
                T7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {

            }

        });

        T7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Teachers_settings  Frame = new Teachers_settings ();
                dispose();
            }
        });
//======================================================================================================================

        JLabel proadd = new JLabel();
        proadd.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/add.png")));
        add(proadd);

        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/profile 01.png")));
        prof.setBounds(815,52,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/profile.png")));
                profl.setBounds(813,50,76,76);
                proadd.setBounds(817,98,69,23);
                proadd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                prof.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/profile 01.png")));
                profl.setBounds(0,0,0,0);
                proadd.setBounds(0,0,0,0);
            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------


        prof.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //Saving an image in database table
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Specify a file to save");

                int userSelection = fileChooser.showSaveDialog(fileChooser);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    fileToSave = fileChooser.getSelectedFile();
                    System.out.println("Save as file: " + fileToSave);
                }


                Connection con;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
                    Statement st = con.createStatement();


                    File imgfile = new File(fileToSave.getAbsolutePath());
                    FileInputStream fin = new FileInputStream(imgfile);

                    PreparedStatement pre = con.prepareStatement("insert into user_images values(?,?,?)");

                    String url3 = fileToSave.getAbsolutePath();

                    String imageName = url3.substring(url3.lastIndexOf("/") + 3, url3.length());


                    pre.setString(1, (UID));
                    pre.setString(2, imageName);
                    pre.setBinaryStream(3, (InputStream) fin, (int) imgfile.length());
                    pre.executeUpdate();

                    pre.close();
                    con.close();
                } catch (Exception e1) {
                    System.out.println(e1);
                }

            }
        });



//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Teachers_settings/Main – 1.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
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
    }}

