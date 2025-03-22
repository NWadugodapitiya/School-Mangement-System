import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Terms_c extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    Terms_c(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel tc = new JLabel ("Terms And Conditions");
        tc.setBounds(45,23,620,52);
        tc.setForeground(Color.black);
        add(tc);
        Font Temc = new Font ("Arial Rounded MT",Font.BOLD,45);
        tc.setFont(Temc);
//------------------------------------------------------------------------------------------------------------------------------

        JLabel sing = new JLabel();
        sing.setIcon(new ImageIcon(getClass().getResource("Terms_c/sign up.png")));
        sing.setBounds(535,434,127,41);
        add(sing);

        JLabel singx = new JLabel();
        singx.setIcon(new ImageIcon(getClass().getResource("Terms_c/singup x.png")));
        //    singx.setBounds(61,337,166,59);
        add(singx);

        sing.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                singx.setBounds(532,431,133,47);
                sing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        sing.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                singx.setBounds(0,0,0,0);
            }
        });

        sing.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Register Frame = new Register();
                dispose();
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.black);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//----------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Terms_c/exit.png")));
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
        my.setIcon(new ImageIcon(getClass().getResource("Terms_c/yellow p.png")));
        my.setBounds(578,30,87,23);
        add(my);

// Main white p

        JLabel mw = new JLabel();
        mw.setIcon(new ImageIcon(getClass().getResource("Terms_c/m panel.png")));
        mw.setBounds(578,30,382,23);
        add(mw);
//--------------------------------------------------------------------------------------


        H.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                my.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

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

        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Terms And Conditions"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBorder(null);
        table.setGridColor(table.getBackground());
        table.setBackground(Color.white);
        table.setForeground(Color.black);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(539, 100, 376, 302);
        pane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[1];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/School_m_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  terms_and_conditions");

            while (rs.next()) {

                row[0] = rs.getString("conditions");
                model.addRow(row);

            }
        } catch (Exception ew) {
            System.out.println(ew);
        }

//-------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <= 1; lk++){
                        for (int i = 0; i < 45; i=i+14) {
                            {
                                a.setBounds(i,28,468,447);
                                a.setIcon(new ImageIcon(getClass().getResource("Terms_c/"+lk+".png")));
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
        xmain.setIcon(new ImageIcon(getClass().getResource("Terms_c/Main.png")));
        xmain.setBounds(0,0,950,502);
        add(xmain);
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
