import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Home extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    Home(){
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
        a2.setIcon(new ImageIcon(getClass().getResource("Home/exit.png")));
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
        //   SCHOOL NAME =   ANURADHAPURA WHALISINGHA HARISCHANDRA COLLAGE
        JLabel n2 = new JLabel();
        add(n2);

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 100; lk <= 107; lk++){
                        for (int i = 30; i < 338; i=i+2) {

                            {
                                n2.setBounds(30,20,511,i);
                                n2.setIcon(new ImageIcon(getClass().getResource("Home/"+lk+".png")));
                                try {
                                    sleep(45);
                                } catch (InterruptedException ex) {}
                            }
                        }
                        //-----------

                        try
                        {
                            Thread.sleep(10000);
                            //-----------------------------------

                        }catch (InterruptedException ie)
                        {
                            System.out.println(ie.getMessage());
                        }  }   }    }
        };
        t1.start();
//-------------------------------------------------------------------------------------------------------------------------------
//    SING UP

        JLabel singup = new JLabel();
        singup.setIcon(new ImageIcon(getClass().getResource("Home/SIGN UP.png")));
        //            singup.setBounds(63,370,99,30);
        add(singup);

        JLabel singx = new JLabel();
        singx.setIcon(new ImageIcon(getClass().getResource("Home/sing up yo.png")));
        //           singx.setBounds(57,365,110,40);
        add(singx);

        singup.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               Register Frame = new Register();
                dispose();
            }
        });

        Thread sing = new Thread(){
            public void run (){
                for (int i = 0; i<63; i=i+2) {

                    singup.setBounds(i,370,99,30);
                    try{
                        sleep(80);
                    }catch(InterruptedException ex){}
                }
            }
        };
        sing.start();

        singup.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                singup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                singx.setBounds(57,365,110,40);
            }
        });

        singup.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                singx.setBounds(0,0,0,0);
            }
        });

//---------------------------------------------------------------------------------------------------------------------------------
//    LOGIN

        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("Home/LOGIN.png")));
        login.setBounds(63,411,99,30);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Home/login yo.png")));
        //           loginx.setBounds(57,365,110,40);
        add(loginx);


        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                login Frame = new login();
                dispose();
            }
        });

        Thread logi = new Thread(){
            public void run (){
                for (int i = 0; i<63; i=i+2) {

                    login.setBounds(i,411,99,30);
                    try{
                        sleep(90);
                    }catch(InterruptedException ex){}
                }
            }
        };
        logi.start();

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                loginx.setBounds(57,406,110,40);
            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                loginx.setBounds(0,0,0,0);
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
        my.setIcon(new ImageIcon(getClass().getResource("Home/yellow p.png")));
        my.setBounds(578,30,87,23);
        add(my);

// Main white p

        JLabel mw = new JLabel();
        mw.setIcon(new ImageIcon(getClass().getResource("Home/m panel.png")));
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
        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <= 4; lk++){
                        for (int i = 0; i < 100; i=i+14) {
                            {
                                a.setBounds(0,0,950,502);
                                a.setIcon(new ImageIcon(getClass().getResource("Home/"+lk+".png")));
                                try {
                                    sleep(50);
                                } catch (InterruptedException ex) {}
                            }
                        }
                        //-----------

                        try
                        {
                            Thread.sleep(15000);
                            //-----------------------------------

                        }catch (InterruptedException ie)
                        {
                            System.out.println(ie.getMessage());
                        }  }   }    }
        };
        snn.start();
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


