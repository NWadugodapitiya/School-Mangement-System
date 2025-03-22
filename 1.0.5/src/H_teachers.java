import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class H_teachers extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    H_teachers(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.WHITE);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("H Teachers/exit.png")));
        add(a2);
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                a2.setBounds(896,468,60,25);
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//-------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel();
        T1.setBounds(605,85,294,294);
        add(T1);

        JLabel N = new JLabel ();
        N.setForeground(Color.BLACK);
        add(N);
        Font NNN = new Font ("calibri",Font.BOLD,30);
        N.setFont(NNN);

        JLabel A = new JLabel ();
        A.setForeground(Color.BLACK);
        add(A);
        Font AAA = new Font ("calibri",Font.BOLD,20);
        A.setFont(AAA);

        JLabel S = new JLabel ("Subjects");
        S.setBounds(31,42,208,70);
        S.setForeground(Color.GREEN);
        add(S);
        Font SSS = new Font ("calibri",Font.BOLD,53);
        S.setFont(SSS);

        JLabel S1 = new JLabel ("+ Sinhala");
        S1.setBounds(15,130,85,25);
        S1.setForeground(Color.WHITE);
        add(S1);
        Font S11 = new Font ("calibri",Font.BOLD,22);
        S1.setFont(S11);

        JLabel S2 = new JLabel ("+ English");
        S2.setBounds(15,169,80,25);
        S2.setForeground(Color.WHITE);
        add(S2);
        Font S22 = new Font ("calibri",Font.BOLD,22);
        S2.setFont(S22);

        JLabel S3 = new JLabel ("+ Tamil");
        S3.setBounds(15,208,68,25);
        S3.setForeground(Color.WHITE);
        add(S3);
        Font S33 = new Font ("calibri",Font.BOLD,22);
        S3.setFont(S33);

        JLabel S4 = new JLabel ("+ Mathematics");
        S4.setBounds(15,247,140,25);
        S4.setForeground(Color.WHITE);
        add(S4);
        Font S44 = new Font ("calibri",Font.BOLD,22);
        S4.setFont(S44);

        JLabel S5 = new JLabel ("+ Grography");
        S5.setBounds(15,286,120,25);
        S5.setForeground(Color.WHITE);
        add(S5);
        Font S55 = new Font ("calibri",Font.BOLD,22);
        S5.setFont(S55);

        JLabel S6 = new JLabel ("+ Science");
        S6.setBounds(15,325,94,25);
        S6.setForeground(Color.WHITE);
        add(S6);
        Font S66 = new Font ("calibri",Font.BOLD,22);
        S6.setFont(S66);

        JLabel S7 = new JLabel ("+ History");
        S7.setBounds(15,364,85,25);
        S7.setForeground(Color.WHITE);
        add(S7);
        Font S77 = new Font ("calibri",Font.BOLD,22);
        S7.setFont(S77);

        JLabel S8 = new JLabel ("+ Health");
        S8.setBounds(15,403,78,25);
        S8.setForeground(Color.WHITE);
        add(S8);
        Font S88 = new Font ("calibri",Font.BOLD,22);
        S8.setFont(S88);

        JLabel S9 = new JLabel ("+ Ict");
        S9.setBounds(212,130,50,25);
        S9.setForeground(Color.WHITE);
        add(S9);
        Font S99 = new Font ("calibri",Font.BOLD,22);
        S9.setFont(S99);

        JLabel S0 = new JLabel ("+ Drama");
        S0.setBounds(212,169,78,25);
        S0.setForeground(Color.WHITE);
        add(S0);
        Font S00 = new Font ("calibri",Font.BOLD,22);
        S0.setFont(S00);

        S0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S8.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        S9.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/1.jpg")));

        S1.setForeground(Color.YELLOW);
        S2.setForeground(Color.WHITE);
        S3.setForeground(Color.WHITE);
        S4.setForeground(Color.WHITE);
        S5.setForeground(Color.WHITE);
        S6.setForeground(Color.WHITE);
        S7.setForeground(Color.WHITE);
        S8.setForeground(Color.WHITE);
        S9.setForeground(Color.WHITE);
        S0.setForeground(Color.WHITE);

        N.setText("Olivia Wilson");
        A.setText("33 Years old");
        N.setBounds(685,388,200,30);
        A.setBounds(705,418,130,30);





        S1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/1.jpg")));

                S1.setForeground(Color.YELLOW);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Olivia Wilson");
                A.setText("33 Years old");
                N.setBounds(685,388,200,30);
                A.setBounds(705,418,130,30);


            }

        });

        S2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/5.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.YELLOW);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Sophia Martinez");
                A.setText("30 Years old");
                N.setBounds(662,388,220,30);
                A.setBounds(705,418,130,30);
            }

        });

        S3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/8.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.YELLOW);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Ava Robinson");
                A.setText("36 Years old");
                N.setBounds(682,388,200,30);
                A.setBounds(705,418,130,30);
            }
        });

        S4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/6.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.YELLOW);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Daniel Anderson");
                A.setText("38 Years old");
                N.setBounds(655,388,230,30);
                A.setBounds(705,418,130,30);
            }

        });

        S5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/2.jpg")));



                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.YELLOW);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Christopher Taylor");
                A.setText("37 Years old");
                N.setBounds(645,388,260,30);
                A.setBounds(705,418,130,30);
            }

        });

        S6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/3.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.YELLOW);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Benjamin Miller");
                A.setText("27 Years old");
                N.setBounds(660,388,200,30);
                A.setBounds(705,418,130,30);
            }
        });

        S7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/7.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.YELLOW);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Emma Turner");
                A.setText("29 Years old");
                N.setBounds(677,388,200,30);
                A.setBounds(705,418,130,30);
            }

        });

        S8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/10.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.YELLOW);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.WHITE);

                N.setText("Mia Mitchell");
                A.setText("38 Years old");
                N.setBounds(677,388,200,30);
                A.setBounds(705,418,130,30);
            }
        });

        S9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/4.jpg")));


                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.YELLOW);
                S0.setForeground(Color.WHITE);

                N.setText("Matthew Harris");
                A.setText("33 Years old");
                N.setBounds(665,388,200,30);
                A.setBounds(705,418,130,30);
            }

        });

        S0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                T1.setIcon(new ImageIcon(getClass().getResource("H Teachers/9.jpg")));

                S1.setForeground(Color.WHITE);
                S2.setForeground(Color.WHITE);
                S3.setForeground(Color.WHITE);
                S4.setForeground(Color.WHITE);
                S5.setForeground(Color.WHITE);
                S6.setForeground(Color.WHITE);
                S7.setForeground(Color.WHITE);
                S8.setForeground(Color.WHITE);
                S9.setForeground(Color.WHITE);
                S0.setForeground(Color.YELLOW);

                N.setText("Isabella Carter");
                A.setText("26 Years old");
                N.setBounds(675,388,200,30);
                A.setBounds(705,418,130,30);
            }

        });

//------------------------------------------------------------------------------------------------------------------------------















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

        JLabel Sp = new JLabel ("Sports");
        Sp.setBounds(777,33,48,17);
        Sp.setForeground(Color.black);
        add(Sp);
        Font Sports = new Font ("Arial Rounded MT",Font.BOLD,15);
        Sp.setFont(Sports);

        JLabel C = new JLabel ("Contacts");
        C.setBounds(855,33,66,17);
        C.setForeground(Color.black);
        add(C);
        Font Contacts = new Font ("Arial Rounded MT",Font.BOLD,15);
        C.setFont(Contacts);

//----------------------------------------------------------------------------------
// Main yellow p

        JLabel my = new JLabel();
        my.setIcon(new ImageIcon(getClass().getResource("H Teachers/yellow p.png")));
        my.setBounds(669,30,87,23);
        add(my);

// Main white p

        JLabel mw = new JLabel();
        mw.setIcon(new ImageIcon(getClass().getResource("H Teachers/m panel.png")));
        mw.setBounds(578,30,382,23);
        add(mw);

//--------------------------------------------------------------------------------------

        H.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                H.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                my.setBounds(578,30,87,23);
            }
        });

        H.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(669,30,87,23);
            }
        });

        T.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {

            }
        });

        Sp.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setBounds(758,30,87,23);
                Sp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        Sp.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(669,30,87,23);
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
                my.setBounds(669,30,87,23);
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

        Sp.addMouseListener(new MouseAdapter() {
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
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("H Teachers/H Teachers.png")));
        xmain.setBounds(0,0,950,502);
        add(xmain);
//------------------------------------------------------------------------------------------------------------------------------
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

