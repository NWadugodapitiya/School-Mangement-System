import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Register extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    Register(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------------------
        JLabel singup = new JLabel ("Sign Up");
        singup.setBounds(84,42,171,52);
        singup.setForeground(Color.black);
        add(singup);
        Font Singup = new Font ("Arial Rounded MT",Font.BOLD,45);
        singup.setFont(Singup);
//------------------------------------------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (88,119,240,34);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        Font Atetl = new Font ("Arial Rounded MT",Font.BOLD,17);
        t1.setFont(Atetl);

        JTextField t2 = new JTextField();
        t2.setBounds (88,174,240,34);
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(101, 52, 216, 0));
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        Font Atet2 = new Font ("Arial Rounded MT",Font.BOLD,17);
        t2.setFont(Atet2);

        JTextField t3 =new JTextField();
        t3.setBounds(88,229,240,34);
        t3.setForeground(Color.black);
        t3.setBorder(null);
        t3.setEditable(true);
        t3.setOpaque(false);
        add(t3);
        Font Atet3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        t3.setFont(Atet3);

        JPasswordField t4 =new JPasswordField();
        t4.setBounds(88,284,240,34);
        t4.setForeground(Color.black);
        t4.setBorder(null);
        t4.setEditable(true);
        t4.setOpaque(false);
        add(t4);
        Font Atet4 = new Font ("Arial Rounded MT",Font.BOLD,11);
        t4.setFont(Atet4);
//------------------------------------------------------------------------------------------------------------------------------

// User ID

        JLabel QQ = new JLabel();
        QQ.setIcon(new ImageIcon(getClass().getResource("Register/usern.png")));
        add(QQ);

        JLabel l3 = new JLabel ("Your ID");
        l3.setForeground(new Color(58, 58, 58));
        add(l3);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l3.setFont(Atel3);

        QQ.setBounds(93,127,15,22);
        l3.setBounds(112,127,71,23);

        DocumentListener documentListenert1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    QQ.setBounds(93,127,15,22);
                    l3.setBounds(112,127,71,23);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    QQ.setBounds(93,127,15,22);
                    l3.setBounds(112,127,71,23);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    QQ.setBounds(93,127,15,22);
                    l3.setBounds(112,127,71,23);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListenert1);
//------------------------------------------------------------------------------------------------------------------------------

// User First Name

        JLabel nn = new JLabel();
        nn.setIcon(new ImageIcon(getClass().getResource("Register/usern.png")));
        add(nn);

        JLabel l4 = new JLabel ("Your First Name");
        l4.setForeground(new Color(58, 58, 58));
        add(l4);
        Font Atel4 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l4.setFont(Atel4);

        nn.setBounds(93,182,15,22);
        l4.setBounds(112,182,156,23);

        DocumentListener documentListenert2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    nn.setBounds(93,182,15,22);
                    l4.setBounds(112,182,156,23);
                } else{
                    l4.setBounds(0,0,0,0);
                    nn.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    nn.setBounds(93,182,15,22);
                    l4.setBounds(112,182,156,23);
                } else{
                    l4.setBounds(0,0,0,0);
                    nn.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    nn.setBounds(93,182,15,22);
                    l4.setBounds(112,182,156,23);
                } else{
                    l4.setBounds(0,0,0,0);
                    nn.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t2.getText());

            }
        };
        t2.getDocument().addDocumentListener(documentListenert2);
//------------------------------------------------------------------------------------------------------------------------------

// User Last Name

        JLabel bb = new JLabel();
        bb.setIcon(new ImageIcon(getClass().getResource("Register/usern.png")));
        add(bb);

        JLabel l5 = new JLabel ("Your Last Name");
        l5.setForeground(new Color(58, 58, 58));
        add(l5);
        Font Atel5 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l5.setFont(Atel5);

        bb.setBounds(93,237,15,22);
        l5.setBounds(112,237,154,23);

        DocumentListener documentListenert3 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    bb.setBounds(93,237,15,22);
                    l5.setBounds(112,237,154,23);
                } else{
                    l5.setBounds(0,0,0,0);
                    bb.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    bb.setBounds(93,237,15,22);
                    l5.setBounds(112,237,154,23);
                } else{
                    l5.setBounds(0,0,0,0);
                    bb.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    bb.setBounds(93,237,15,22);
                    l5.setBounds(112,237,154,23);
                } else{
                    l5.setBounds(0,0,0,0);
                    bb.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t3.getText());

            }
        };
        t3.getDocument().addDocumentListener(documentListenert3);
//------------------------------------------------------------------------------------------------------------------------------

// User Password

        JLabel vv = new JLabel();
        vv.setIcon(new ImageIcon(getClass().getResource("Register/pass.png")));
        add(vv);


        JLabel l6 = new JLabel ("Password");
        l6.setForeground(new Color(58, 58, 58));
        add(l6);
        Font Atel6 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l6.setFont(Atel6);

        l6.setBounds(114,290,97,23);
        vv.setBounds(94,293,13,17);

        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(114,290,97,23);
                    vv.setBounds(94,293,13,17);
                } else{
                    l6.setBounds(0,0,0,0);
                    vv.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(114,290,97,23);
                    vv.setBounds(94,293,13,17);
                } else{
                    l6.setBounds(0,0,0,0);
                    vv.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(114,290,97,23);
                    vv.setBounds(94,293,13,17);
                } else{
                    l6.setBounds(0,0,0,0);
                    vv.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t4.getText());

            }
        };
        t4.getDocument().addDocumentListener(documentListenert4);
//------------------------------------------------------------------------------------------------------------------------------

        JCheckBox a1 = new JCheckBox();
        a1.setBounds(80,334,17,17);
        a1.setForeground(new Color(255, 255, 255));
        a1.setOpaque(false);
        add(a1);

        JLabel l7 = new JLabel ("I agree all statements in");
        l7.setForeground(new Color(0,0,0));
        l7.setBounds(103,332,200,20);
        add(l7);
        Font Atel7 = new Font ("Arial Rounded MT",Font.BOLD,14);
        l7.setFont(Atel7);

        JLabel l8 = new JLabel ("Terms and Conditions");
        l8.setForeground(new Color(101, 52, 216));
        l8.setBounds(277,332,153,20);
        add(l8);
        Font Atel8 = new Font ("Arial Rounded MT",Font.BOLD,14);
        l8.setFont(Atel8);


        l8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                l8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l8.setForeground(new Color(101, 52, 216));
                l8.setBounds(277,332,170,20);
                Font Atel8 = new Font ("Arial Rounded MT",Font.BOLD,16);
                l8.setFont(Atel8);
            }
        });


        l8.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                l8.setForeground(new Color(101, 52, 216));
                l8.setBounds(277,332,153,20);
                Font Atel8 = new Font ("Arial Rounded MT",Font.BOLD,14);
                l8.setFont(Atel8);

            }
        });


        l8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Terms_c Frame = new Terms_c();
                dispose();
            }
        });

//------------------------------------------------------------------------------------------------------------------------------

        JLabel sing = new JLabel();
        sing.setIcon(new ImageIcon(getClass().getResource("Register/sign up.png")));
        sing.setBounds(84,386,127,41);
        add(sing);

        JLabel singx = new JLabel();
        singx.setIcon(new ImageIcon(getClass().getResource("Register/singup x.png")));
        //    singx.setBounds(61,337,166,59);
        add(singx);

        sing.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                singx.setBounds(81,383,133,47);
                sing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        sing.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                singx.setBounds(0,0,0,0);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------

        JLabel l9 = new JLabel ("I am already member");
        l9.setForeground(new Color(0,0,0));
        l9.setBounds(235,396,148,23);
        add(l9);
        Font Atel9 = new Font ("Arial Rounded MT",Font.BOLD,14);
        l9.setFont(Atel9);

        l9.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                l9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l9.setForeground(new Color(101, 52, 216));
                l9.setBounds(230,396,166,23);
                Font Atel9 = new Font ("Arial Rounded MT",Font.BOLD,16);
                l9.setFont(Atel9);
            }
        });


        l9.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                l9.setForeground(new Color(0,0,0));
                l9.setBounds(235,396,148,23);
                Font Atel9 = new Font ("Arial Rounded MT",Font.BOLD,14);
                l9.setFont(Atel9);
            }
        });


        l9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                login Frame = new login();
                dispose();
            }
        });
//------------------------------------------------------------------------------------------------------------------------------

        JComboBox dura = new JComboBox();
        dura.setBounds(349,123,102,19);
        dura.setForeground(Color.BLACK);
        dura.addItem("Students");
        dura.addItem("Teachers");
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(dura);
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,14);
        dura.setFont(duraa);
//------------------------------------------------------------------------------------------------------------------------------

        JLabel sign = new JLabel();
        sign.setIcon(new ImageIcon(getClass().getResource("Register/sign.png")));
        sign.setBounds(76,113,254,214);
        add(sign);

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.black);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//----------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Register/exit.png")));
        add(a2);
//----------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                a2.setBounds(896,468,60,25);
                exit.setForeground(Color.white);
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.black);
            }
        });
//----------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        JLabel H = new JLabel ("Home");
        H.setBounds(605,33,43,17);
        H.setForeground(Color.black);
        add(H);
        Font HOME = new Font ("Arial Rounded MT",Font.BOLD,15);
        H.setFont(HOME);

        JLabel T = new JLabel ("Teachers");
        T.setBounds(678,33,69,17);
        T.setForeground(Color.black);
        add(T);
        Font TEACHERS = new Font ("Arial Rounded MT",Font.BOLD,15);
        T.setFont(TEACHERS);

        JLabel S = new JLabel ("Sports");
        S.setBounds(777,33,48,17);
        S.setForeground(Color.black);
        add(S);
        Font Sports = new Font ("Arial Rounded MT",Font.BOLD,15);
        S.setFont(Sports);

        JLabel C = new JLabel ("Contacts");
        C.setBounds(855,33,66,17);
        C.setForeground(Color.black);
        add(C);
        Font Contacts = new Font ("Arial Rounded MT",Font.BOLD,15);
        C.setFont(Contacts);

//----------------------------------------------------------------------------------
// Main yellow p

        JLabel my = new JLabel();
        my.setIcon(new ImageIcon(getClass().getResource("Register/yellow p.png")));
        my.setBounds(578,30,87,23);
        add(my);

// Main white p

        JLabel mw = new JLabel();
        mw.setIcon(new ImageIcon(getClass().getResource("Register/m panel.png")));
        mw.setBounds(578,30,382,23);
        add(mw);


//--------------------------------------------------------------------------------------

        H.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                H.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }
        });

        H.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {

            }
        });

        T.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setBounds(669,30,87,23);
                T.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(578,30,87,23);
            }
        });

        S.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setBounds(758,30,87,23);
                S.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        S.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(578,30,87,23);
            }
        });

        C.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setBounds(845,30,87,23);
                C.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        C.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(578,30,87,23);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        H.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Home Frame = new Home();
                dispose();
            }
        });

        T.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               H_teachers Frame = new H_teachers();
                dispose();
            }
        });

        S.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               H_sports Frame = new H_sports();
                dispose();
            }
        });

        C.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              H_contacts Frame = new H_contacts();
                dispose();
            }
        });
//-------------------------------------------------------------------------------------------------------------------------------
        JLabel q9 = new JLabel ("");
        q9.setBounds(119,446,300,20);
        q9.setForeground(new Color(250,0,0));
        add(q9);
        Font Ateq9 = new Font ("Calibri (Body)",Font.BOLD,14);
        q9.setFont(Ateq9);

        JLabel s2 = new JLabel ("");
        s2.setForeground(new Color(0,0,0));
//           s2.setBounds(600,50,50,20);
        add(s2);
        s2.setText(String.valueOf(Register.generate(111111,999999)));

        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    t2.requestFocus(true);

                }
            }
        });

        t2.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    t3.requestFocus(true);

                }
            }
        });

        t3.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    t4.requestFocus(true);

                }
            }
        });
//===============================================================================================================================

        t4.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    if(t1.getText().isEmpty()){
                        q9.setText("Type ID");

                    }

                    if(t2.getText().isEmpty()){
                        q9.setText("Type First Name");

                    }

                    if(t3.getText().isEmpty()){
                        q9.setText("Type Last Name");

                    }

                    if(t4.getText().isEmpty()){
                        q9.setText("Type Password");

                    }

                    if(t1.getText().isEmpty() && t2.getText().isEmpty()&& t3.getText().isEmpty()&& t4.getText().isEmpty()){
                        q9.setText("Type Items");

                    }
                    else{

                        Connection con;
                        try{
                            Class.forName("com.mysql.jdbc.Driver");
                            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                            String query = "insert into user_register (user_id,first_name,last_name,password,Date_Time,User,Backup_Code,update_date,Grade,Class,Tel1,Subject,Address,Date_of_birth,imageName,img_url)" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            PreparedStatement preparedStmt = con.prepareStatement(query);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                            String formattedDate = myDateObj.format(myFormatObj);
                            System.out.println("Date and Time: " + formattedDate);




                            preparedStmt.setString(1, t1.getText());
                            preparedStmt.setString(2, t2.getText());
                            preparedStmt.setString(3, t3.getText());
                            preparedStmt.setString(4, t4.getText());
                            preparedStmt.setString(5, formattedDate);
                            preparedStmt.setString(6, (String)dura.getSelectedItem());
                            preparedStmt.setString(7, s2.getText());
                            preparedStmt.setString(8, formattedDate);
                            preparedStmt.setString(9,  (""));
                            preparedStmt.setString(10, (""));
                            preparedStmt.setString(11, (""));
                            preparedStmt.setString(12, (""));
                            preparedStmt.setString(13, (""));
                            preparedStmt.setString(14, (""));
                            preparedStmt.setString(15, (""));
                            preparedStmt.setString(16, (""));

                            JOptionPane.showMessageDialog(null, " Registrasion success","Registrasion ok ",JOptionPane.WARNING_MESSAGE);

                           login Frame = new login();
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
            }
        });


        sing.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if(t1.getText().isEmpty()){
                    q9.setText("Type ID");

                }

                if(t2.getText().isEmpty()){
                    q9.setText("Type First Name");

                }

                if(t3.getText().isEmpty()){
                    q9.setText("Type Last Name");

                }

                if(t4.getText().isEmpty()){
                    q9.setText("Type Password");

                }

                if(t1.getText().isEmpty() && t2.getText().isEmpty()&& t3.getText().isEmpty()&& t4.getText().isEmpty()){
                    q9.setText("Type Items");

                }
                else{

                    Connection con;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/School_m_system","root","");

                        String query = "insert into user_register (user_id,first_name,last_name,password,Date_Time,User,Backup_Code,update_date,Grade,Class,Tel1,Subject,Address,Date_of_birth,imageName,img_url)" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStmt = con.prepareStatement(query);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date and Time: " + formattedDate);




                        preparedStmt.setString(1, t1.getText());
                        preparedStmt.setString(2, t2.getText());
                        preparedStmt.setString(3, t3.getText());
                        preparedStmt.setString(4, t4.getText());
                        preparedStmt.setString(5, formattedDate);
                        preparedStmt.setString(6, (String)dura.getSelectedItem());
                        preparedStmt.setString(7, s2.getText());
                        preparedStmt.setString(8, formattedDate);
                        preparedStmt.setString(9,  (""));
                        preparedStmt.setString(10, (""));
                        preparedStmt.setString(11, (""));
                        preparedStmt.setString(12, (""));
                        preparedStmt.setString(13, (""));
                        preparedStmt.setString(14, (""));
                        preparedStmt.setString(15, (""));
                        preparedStmt.setString(16, (""));

                        JOptionPane.showMessageDialog(null, " Registrasion success","Registrasion ok ",JOptionPane.WARNING_MESSAGE);
                        login Frame = new login();
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

//-------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <= 1; lk++){
                        for (int i = 389; i < 456; i=i+14) {
                            {
                                a.setBounds(i,28,468,447);
                                a.setIcon(new ImageIcon(getClass().getResource("Register/"+lk+".png")));
                                try {
                                    sleep(100);
                                } catch (InterruptedException ex) {}
                            }
                        }
                        //-----------

                        try
                        {
                            Thread.sleep(5000);
                            //-----------------------------------

                        }catch (InterruptedException ie)
                        {
                            System.out.println(ie.getMessage());
                        }  }   }    }
        };
        snn.start();
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("Register/Main.png")));
        xmain.setBounds(0,0,950,502);
        add(xmain);
//------------------------------------------------------------------------------------------------------------------------------
        setSize (950,502);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(255, 255, 255,0));
        setVisible(true);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        Home Frame = new Home();

        System.out.println(String.valueOf(Register.generate(111111,999999)));

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
    public static int generate(int min, int max)
    {
        return min +(int)(Math.random()* ((max - min)+1));
    }
}
