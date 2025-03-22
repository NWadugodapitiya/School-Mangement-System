import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URI;

public class H_contacts extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    H_contacts(){
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
        a2.setIcon(new ImageIcon(getClass().getResource("H Contacts/exit.png")));
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
//------------------------------------------------------------------------------------------------------------------------------
        JLabel logot = new JLabel();
        logot.setIcon(new ImageIcon(getClass().getResource("H Contacts/2.png")));
        add(logot);


        Thread sing1t = new Thread(){
            public void run (){
                for (int i = 0; i<113; i=i+2) {

                    logot.setBounds(24,277,296,i);
                    try{
                        sleep(45);
                    }catch(InterruptedException ex){}
                }
            }
        };
        sing1t.start();
////------------------------------------------------------------------------------------------------------------------------------
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon(getClass().getResource("H Contacts/whc logos.png")));
        add(logo);


        Thread sing1 = new Thread(){
            public void run (){
                for (int i = 25; i<57; i=i+2) {

                    logo.setBounds(i,46,240,240);
                    try{
                        sleep(45);
                    }catch(InterruptedException ex){}
                }
            }
        };
        sing1.start();

////------------------------------------------------------------------------------------------------------------------------------

//
//
        JLabel Y = new JLabel ("Mr. W.W.A.P. Padmasiri (Principal)");
        Y.setBounds(25,407,315,26);
        Y.setForeground(new Color(41, 22, 112));
        add(Y);
        Font Y11 = new Font ("Segoe UI",Font.BOLD,19);
        Y.setFont(Y11);


        JLabel T = new JLabel ();
        T.setIcon(new ImageIcon(getClass().getResource("H Contacts/web.png")));
        T.setBounds(71,446,32,32);
        add(T);

        JLabel C = new JLabel ();
        C.setBounds(127,446,32,32);
        C.setIcon(new ImageIcon(getClass().getResource("H Contacts/call.png")));
        add(C);

        JLabel W = new JLabel ();
        W.setBounds(182,446,32,32);
        W.setIcon(new ImageIcon(getClass().getResource("H Contacts/email.png")));
        add(W);

        JLabel A = new JLabel ();
        A.setBounds(237,446,32,32);
        A.setIcon(new ImageIcon(getClass().getResource("H Contacts/loc.png")));
        add(A);


//------------------------------------------------------------------------------------------------------------------------------

        T.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T.setIcon(new ImageIcon(getClass().getResource("H Contacts/web  Yell.png")));
                T.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                T.setIcon(new ImageIcon(getClass().getResource("H Contacts/web.png")));
            }
        });

        C.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                C.setIcon(new ImageIcon(getClass().getResource("H Contacts/call  Yell.png")));
                C.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        C.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                C.setIcon(new ImageIcon(getClass().getResource("H Contacts/call.png")));
            }
        });

        W.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                W.setIcon(new ImageIcon(getClass().getResource("H Contacts/email  Yell.png")));
                W.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        W.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                W.setIcon(new ImageIcon(getClass().getResource("H Contacts/email.png")));
            }
        });

        A.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                A.setIcon(new ImageIcon(getClass().getResource("H Contacts/loc Yell.png")));
                A.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        A.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                A.setIcon(new ImageIcon(getClass().getResource("H Contacts/loc.png")));
            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        String webLink = "https://walisinghecollege.com/";
        String phonen = "https://walisinghecollege.com/contact-us/";
        String email = "https://walisinghecollege.com/contact-us/";
        String locat = "https://www.google.com/maps/place/Walisinghe+Harischandra+Maha+Vidyalaya/@8.333249,80.405004,17z/data=!4m6!3m5!1s0x3afcf5a8cbb46cd9:0x2791e7c1910a6c09!8m2!3d8.3332486!4d80.4050045!16s%2Fg%2F1tggm1_p?hl=en&entry=ttu";
//------------------------------------------------------------------------------------------------------------------------------
        T.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openWebLink(webLink); // Call the method to open the web link
            }
            private void openWebLink(String webLink) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(webLink));
                    } catch (Exception ex) {
 //                       System.out.println("Error opening the web link: " + ex.getMessage());
                    }
                } else {
  //                  System.out.println("Desktop browsing is not supported.");
                }
            }

        });

        C.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openWebLink(phonen); // Call the method to open the web link
            }
            private void openWebLink(String webLink) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(webLink));
                    } catch (Exception ex) {
                        //                       System.out.println("Error opening the web link: " + ex.getMessage());
                    }
                } else {
                    //                  System.out.println("Desktop browsing is not supported.");
                }
            }

        });

        W.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openWebLink(email); // Call the method to open the web link
            }
            private void openWebLink(String webLink) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(webLink));
                    } catch (Exception ex) {
                        //                       System.out.println("Error opening the web link: " + ex.getMessage());
                    }
                } else {
                    //                  System.out.println("Desktop browsing is not supported.");
                }
            }

        });

        A.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openWebLink(locat); // Call the method to open the web link
            }
            private void openWebLink(String webLink) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(webLink));
                    } catch (Exception ex) {
                        //                       System.out.println("Error opening the web link: " + ex.getMessage());
                    }
                } else {
                    //                  System.out.println("Desktop browsing is not supported.");
                }
            }

        });

//------------------------------------------------------------------------------------------------------------------------------

        JLabel H = new JLabel ("Home");
        H.setBounds(605,33,43,17);
        H.setForeground(Color.black);
        add(H);
        Font HOME = new Font ("Arial Rounded MT",Font.BOLD,15);
        H.setFont(HOME);

        JLabel TT = new JLabel ("Teachers");
        TT.setBounds(678,33,69,17);
        TT.setForeground(Color.black);
        add(TT);
        Font TEACHERS = new Font ("Arial Rounded MT",Font.BOLD,15);
        TT.setFont(TEACHERS);

        JLabel S = new JLabel ("Sports");
        S.setBounds(777,33,48,17);
        S.setForeground(Color.black);
        add(S);
        Font Sports = new Font ("Arial Rounded MT",Font.BOLD,15);
        S.setFont(Sports);

        JLabel Cc = new JLabel ("Contacts");
        Cc.setBounds(855,33,66,17);
        Cc.setForeground(Color.black);
        add(Cc);
        Font Contacts = new Font ("Arial Rounded MT",Font.BOLD,15);
        Cc.setFont(Contacts);

//----------------------------------------------------------------------------------
// Main yellow p

        JLabel my = new JLabel();
        my.setIcon(new ImageIcon(getClass().getResource("H Contacts/yellow p.png")));
        my.setBounds(845,30,87,23);
        add(my);

// Main white p

        JLabel mw = new JLabel();
        mw.setIcon(new ImageIcon(getClass().getResource("H Contacts/m panel.png")));
        mw.setBounds(578,30,382,23);
        add(mw);

//--------------------------------------------------------------------------------------

        H.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setBounds(578,30,87,23);
                H.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }
        });

        H.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(845,30,87,23);
            }
        });

        TT.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setBounds(669,30,87,23);
                TT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        TT.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                my.setBounds(845,30,87,23);
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
                my.setBounds(845,30,87,23);
            }
        });

        Cc.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Cc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        Cc.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {

            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        H.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Home Frame = new Home();
                dispose();
            }
        });

        TT.addMouseListener(new MouseAdapter() {
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

        Cc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                H_contacts Frame = new H_contacts();
                dispose();
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("H Contacts/Main.png")));
        xmain.setBounds(0,0,950,502);
        add(xmain);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel gif = new JLabel();
        gif.setIcon(new ImageIcon(getClass().getResource("H Contacts/Myw.gif")));
        gif.setBounds(342,0,608,502);
        add(gif);

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

