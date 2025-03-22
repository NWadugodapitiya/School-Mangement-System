import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class H_sports extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    private  Timer  timer,timer2,timer3,timer4,timer5,timer6,timer7,timer8;
    H_sports() {
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel("Exit");
        exit.setBounds(909, 470, 30, 20);
        exit.setForeground(Color.WHITE);
        add(exit);
        Font Exit = new Font("calibri", Font.BOLD, 18);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("H Sports/exit.png")));
        add(a2);
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                a2.setBounds(896, 468, 60, 25);
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0, 0, 0, 0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//-------------------------------------------------------------------------------------------------------------------------------
        JLabel S1 = new JLabel("1");
        S1.setBounds(138, 439, 6, 16);
        S1.setForeground(Color.WHITE);
        add(S1);
        Font S11 = new Font("calibri", Font.BOLD, 12);
        S1.setFont(S11);

        JLabel S2 = new JLabel("2");
        S2.setBounds(177, 439, 6, 16);
        S2.setForeground(Color.WHITE);
        add(S2);
        Font S22 = new Font("calibri", Font.BOLD, 12);
        S2.setFont(S22);

        JLabel S3 = new JLabel("3");
        S3.setBounds(216, 439, 6, 16);
        S3.setForeground(Color.WHITE);
        add(S3);
        Font S33 = new Font("calibri", Font.BOLD, 12);
        S3.setFont(S33);

        JLabel S4 = new JLabel("4");
        S4.setBounds(255, 439, 6, 16);
        S4.setForeground(Color.WHITE);
        add(S4);
        Font S44 = new Font("calibri", Font.BOLD, 12);
        S4.setFont(S44);

        JLabel S5 = new JLabel("5");
        S5.setBounds(294, 439, 6, 16);
        S5.setForeground(Color.WHITE);
        add(S5);
        Font S55 = new Font("calibri", Font.BOLD, 12);
        S5.setFont(S55);

        JLabel S6 = new JLabel("6");
        S6.setBounds(333, 439, 6, 16);
        S6.setForeground(Color.WHITE);
        add(S6);
        Font S66 = new Font("calibri", Font.BOLD, 12);
        S6.setFont(S66);

        JLabel S7 = new JLabel("7");
        S7.setBounds(372, 439, 6, 16);
        S7.setForeground(Color.WHITE);
        add(S7);
        Font S77 = new Font("calibri", Font.BOLD, 12);
        S7.setFont(S77);

        JLabel S8 = new JLabel("8");
        S8.setBounds(411, 439, 6, 16);
        S8.setForeground(Color.WHITE);
        add(S8);
        Font S88 = new Font("calibri", Font.BOLD, 12);
        S8.setFont(S88);
//--------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(54, 134, 447, 235);
        add(a);

        JLabel a1 = new JLabel();
        a1.setBounds(663, 99, 243, 243);
        add(a1);


        JLabel at = new JLabel();
        at.setForeground(Color.WHITE);
        add(at);
        Font ate = new Font("calibri", Font.BOLD, 35);
        at.setFont(ate);

        JLabel nam = new JLabel("");
        nam.setForeground(Color.black);
        add(nam);
        Font nam1 = new Font("calibri", Font.BOLD, 26);
        nam.setFont(nam1);

//------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------
        JPanel A0 = new JPanel();
        A0.setBackground(new Color(21,21,21,0));

        JPanel B0 = new JPanel();
        B0.setBackground(new Color(21,21,21,0));

        JPanel C0 = new JPanel();
        C0.setBackground(new Color(21,21,21,0));

        JPanel D0 = new JPanel();
        D0.setBackground(new Color(21,21,21,0));

        JPanel E0 = new JPanel();
        E0.setBackground(new Color(21,21,21,0));

        JPanel F0 = new JPanel();
        F0.setBackground(new Color(21,21,21,0));

        JPanel G0 = new JPanel();
        G0.setBackground(new Color(21,21,21,0));

        JPanel H0 = new JPanel();
        H0.setBackground(new Color(21,21,21,0));

        add(A0);
        add(B0);
        add(C0);
        add(D0);
        add(E0);
        add(F0);
        add(G0);
        add(H0);






        A0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                A0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        B0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                B0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        C0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                C0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        D0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                D0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        E0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                E0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        F0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                F0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        G0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                G0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        H0.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                H0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

//------------------------------------------------------------------------------------------------------------------------------






        a.setIcon(new ImageIcon(getClass().getResource("H Sports/running/1.jpg")));

        A0.setBounds(0, 0, 0, 0);
        B0.setBounds(458, 435, 35, 35);
        C0.setBounds(0, 0, 0, 0);
        D0.setBounds(0, 0, 0, 0);
        E0.setBounds(0, 0, 0, 0);
        F0.setBounds(0, 0, 0, 0);
        G0.setBounds(0, 0, 0, 0);
        H0.setBounds(0, 0, 0, 0);

        S1.setForeground(Color.YELLOW);
        S2.setForeground(Color.WHITE);
        S3.setForeground(Color.WHITE);
        S4.setForeground(Color.WHITE);
        S5.setForeground(Color.WHITE);
        S6.setForeground(Color.WHITE);
        S7.setForeground(Color.WHITE);
        S8.setForeground(Color.WHITE);

        Timer timer = new Timer(1000, new ActionListener() {
            int imageIndex = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (imageIndex <= 3) {
                    a.setIcon(new ImageIcon(getClass().getResource("H Sports/running/" + imageIndex + ".jpg")));
                    imageIndex++;
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        timer.start();





        a1.setIcon(new ImageIcon(getClass().getResource("H Sports/running/run.jpg")));

        at.setText("RUNNING");
        at.setBounds(209, 387, 168, 27);
        nam.setText("John Smith");
        nam.setBounds(724, 356, 165, 28);



        A0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                Timer timer = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 3) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/running/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer.start();




                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(458, 435, 35, 35);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(0, 0, 0, 0);



                    S1.setForeground(Color.YELLOW);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.WHITE);






                //          a.setIcon(new ImageIcon(getClass().getResource("H Sports/running/2.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/running/run.jpg")));

                at.setText("RUNNING");
                at.setBounds(209, 387, 168, 27);
                nam.setText("John Smith");
                nam.setBounds(724, 356, 165, 28);
            }
        });
        B0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer2 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 2) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/Cricket/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer2.start();

                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(458, 435, 35, 35);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(0, 0, 0, 0);


                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.YELLOW);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.WHITE);




      //              a.setIcon(new ImageIcon(getClass().getResource("H Sports/Cricket/1.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/Cricket/Cricket.jpg")));

                    at.setText("CRICKET");
                at.setBounds(220, 387, 168, 27);
                nam.setText("Michael Johnson");
                nam.setBounds(701, 356, 200, 28);




            }
        });
        C0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer3 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 2) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/SWIMMING/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer3.start();

                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(458, 435, 35, 35);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(0, 0, 0, 0);


                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.YELLOW);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.WHITE);



   //                 a.setIcon(new ImageIcon(getClass().getResource("H Sports/SWIMMING/1.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/SWIMMING/SWIMMING.jpg")));

                    at.setText("SWIMMING");
                at.setBounds(194, 387, 200, 27);
                nam.setText("Sarah Davis");
                nam.setBounds(730, 356, 200, 28);




            }
        });
        D0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer4 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 3) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/football/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer4.start();

                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(458, 435, 35, 35);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(0, 0, 0, 0);


                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.YELLOW);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.WHITE);



         //           a.setIcon(new ImageIcon(getClass().getResource("H Sports/football/1.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/football/football.png")));

                    at.setText("FOOTBALL");
                at.setBounds(198, 387, 200, 27);
                nam.setText("David Williams");
                nam.setBounds(710, 356, 200, 28);


            }
        });
        E0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer5 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 2) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/busketball/" + imageIndex + ".png")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer5.start();

                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(458, 435, 35, 35);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(0, 0, 0, 0);

                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.YELLOW);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.WHITE);



          //          a.setIcon(new ImageIcon(getClass().getResource("H Sports/busketball/2.png")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/busketball/busketball.jpg")));

                    at.setText("BUSKETBALL");
                at.setBounds(192, 387, 200, 27);
                nam.setText("James Brown");
                nam.setBounds(730, 356, 200, 28);


            }
        });
        F0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer6 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 2) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/netball/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer6.start();

                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(458, 435, 35, 35);
                H0.setBounds(0, 0, 0, 0);

                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.YELLOW);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.WHITE);



         //           a.setIcon(new ImageIcon(getClass().getResource("H Sports/netball/1.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/netball/netball.jpg")));

                    at.setText("NETBALL");
                at.setBounds(210, 387, 200, 27);
                nam.setText("Emily Johnson");
                nam.setBounds(717, 356, 200, 28);




            }
        });
        G0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer7 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 2) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/batminton/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer7.start();

                A0.setBounds(0, 0, 0, 0);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(458, 435, 35, 35);

                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.YELLOW);
                    S8.setForeground(Color.WHITE);



           //         a.setIcon(new ImageIcon(getClass().getResource("H Sports/batminton/1.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/batminton/batminton.jpg")));

                    at.setText("BATMINTON");
                at.setBounds(192, 387, 200, 27);
                nam.setText("William Jones");
                nam.setBounds(720, 356, 200, 28);

            }
        });
        H0.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Timer timer8 = new Timer(1000, new ActionListener() {
                    int imageIndex = 1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageIndex <= 2) {
                            a.setIcon(new ImageIcon(getClass().getResource("H Sports/chess/" + imageIndex + ".jpg")));
                            imageIndex++;
                        } else {
                            ((Timer) e.getSource()).stop();
                        }
                    }
                });

                timer8.start();

                A0.setBounds(458, 435, 35, 35);
                B0.setBounds(0, 0, 0, 0);
                C0.setBounds(0, 0, 0, 0);
                D0.setBounds(0, 0, 0, 0);
                E0.setBounds(0, 0, 0, 0);
                F0.setBounds(0, 0, 0, 0);
                G0.setBounds(0, 0, 0, 0);
                H0.setBounds(0, 0, 0, 0);

                    S1.setForeground(Color.WHITE);
                    S2.setForeground(Color.WHITE);
                    S3.setForeground(Color.WHITE);
                    S4.setForeground(Color.WHITE);
                    S5.setForeground(Color.WHITE);
                    S6.setForeground(Color.WHITE);
                    S7.setForeground(Color.WHITE);
                    S8.setForeground(Color.YELLOW);




          //          a.setIcon(new ImageIcon(getClass().getResource("H Sports/chess/1.jpg")));

                    a1.setIcon(new ImageIcon(getClass().getResource("H Sports/chess/chess.jpg")));

                    at.setText("CHESS");
                at.setBounds(235, 387, 200, 27);
                nam.setText("Robert Davis");
                nam.setBounds(720, 356, 200, 28);
            }
        });
//---------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
        JLabel N = new JLabel(">");
        N.setBounds(465, 433, 35, 41);
        N.setForeground(Color.WHITE);
        add(N);
        Font N11 = new Font("calibri", Font.BOLD, 41);
        N.setFont(N11);


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
        my.setIcon(new ImageIcon(getClass().getResource("H Sports/yellow p.png")));
        my.setBounds(758,30,87,23);
        add(my);

// Main white p

        JLabel mw = new JLabel();
        mw.setIcon(new ImageIcon(getClass().getResource("H Sports/m panel.png")));
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
                my.setBounds(758,30,87,23);
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
                my.setBounds(758,30,87,23);            }
        });

        S.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                S.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        S.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {

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
                my.setBounds(758,30,87,23);
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
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("H Sports/H Sports.png")));
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

