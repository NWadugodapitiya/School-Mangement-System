/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ashen_NW
 */
class Contacts extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
Contacts(){ 
setLayout(null);




 JLabel F = new JLabel ("Walisinghe Harischandra College");
        F.setBounds(120,80,250,18); 
        F.setForeground(Color.WHITE);
    add(F);
   Font F11 = new Font ("calibri",Font.BOLD,18);
        F.setFont(F11);

 JLabel Y = new JLabel ("Walisinghe Harischandra College");
        Y.setBounds(120,143,250,18); 
        Y.setForeground(Color.WHITE);
    add(Y);
   Font Y11 = new Font ("calibri",Font.BOLD,18);
        Y.setFont(Y11);

 JLabel T = new JLabel ("Walisinghe Harischandra College");
        T.setBounds(120,200,250,18); 
        T.setForeground(Color.WHITE);
    add(T);
   Font T11 = new Font ("calibri",Font.BOLD,18);
        T.setFont(T11);        

 JLabel C = new JLabel ("025-245-2455 / 025-896-8967");
        C.setBounds(120,263,220,18); 
        C.setForeground(Color.WHITE);
    add(C);
   Font C11 = new Font ("calibri",Font.BOLD,18);
        C.setFont(C11);

 JLabel W = new JLabel ("walisingcollege@gmail.com");
        W.setBounds(120,315,215,18); 
        W.setForeground(Color.WHITE);
    add(W);
   Font W11 = new Font ("calibri",Font.BOLD,18);
        W.setFont(W11);        

 JLabel A = new JLabel ("Walisinghe Harischandra");
        A.setBounds(120,365,185,18); 
        A.setForeground(Color.WHITE);
    add(A);
   Font AA1 = new Font ("calibri",Font.BOLD,18);
        A.setFont(AA1);

 JLabel AA = new JLabel ("College Anuradhapura");
        AA.setBounds(120,385,175,18); 
        AA.setForeground(Color.WHITE);
    add(AA);
   Font AAA = new Font ("calibri",Font.BOLD,18);
        AA.setFont(AAA);








   














//------------------------------------------------------------------------------------------------------------------------------

 JLabel A1 = new JLabel ("Home");
        A1.setBounds(355,20,40,15); 
        A1.setForeground(Color.BLACK);
    add(A1);
   Font A11 = new Font ("calibri",Font.BOLD,15);
        A1.setFont(A11);
        
 JLabel A2 = new JLabel ("Teachers");
        A2.setBounds(435,20,60,15); 
        A2.setForeground(Color.BLACK);
    add(A2);
   Font A22 = new Font ("calibri",Font.BOLD,15);
        A2.setFont(A22);       

 JLabel A3 = new JLabel ("Sports");
        A3.setBounds(534,20,40,15); 
        A3.setForeground(Color.BLACK);
    add(A3);
   Font A33 = new Font ("calibri",Font.BOLD,15);
        A3.setFont(A33); 

 JLabel A4 = new JLabel ("Library");
        A4.setBounds(623,20,45,15); 
        A4.setForeground(Color.BLACK);
    add(A4);
   Font A44 = new Font ("calibri",Font.BOLD,15);
        A4.setFont(A44); 

 JLabel A5 = new JLabel ("Contacts");
        A5.setBounds(707,20,55,15); 
        A5.setForeground(Color.BLACK);
    add(A5);
   Font A55 = new Font ("calibri",Font.BOLD,15);
        A5.setFont(A55); 


 JLabel exit = new JLabel ("Exit");
        exit.setBounds(740,421,30,20);
        exit.setForeground(Color.BLACK);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit); 

//------------------------------------------------------------------------------------------------------------------------------

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Icons/exit.png")));      
       add(a2);

    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("Icons/pannnel.png")));
           a4.setBounds(700,15,80,25); 
       add(a4); 
       
    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("Icons/pannel.png")));
           a5.setBounds(342,17,480,21);
       add(a5);   
    
       
       
       
 
//================================================================================================================       
    JLabel dz = new JLabel();
           dz.setIcon(new ImageIcon(getClass().getResource("Icons/Menu.png")));
           dz.setBounds(15,20,30,20);
       add(dz);    
 
    JLabel dh = new JLabel();
           dh.setIcon(new ImageIcon(getClass().getResource("Icons/Home.png")));
           dh.setBounds(10,150,30,30);
       add(dh);  
       
    JLabel dt = new JLabel();
           dt.setIcon(new ImageIcon(getClass().getResource("Icons/Teachers.png")));
           dt.setBounds(10,200,30,30);
       add(dt);   
       
    JLabel ds = new JLabel();
           ds.setIcon(new ImageIcon(getClass().getResource("Icons/Students.png")));
           ds.setBounds(10,250,30,30);
       add(ds);
       
    JLabel dL = new JLabel();
           dL.setIcon(new ImageIcon(getClass().getResource("Icons/Library.png")));
           dL.setBounds(10,300,30,30);
       add(dL);   
 
    JLabel dC = new JLabel();
           dC.setIcon(new ImageIcon(getClass().getResource("Icons/Creater.png")));
           dC.setBounds(10,400,30,30);
       add(dC);   
       
 JLabel D = new JLabel ("");
        D.setForeground(Color.WHITE);
    add(D);
   Font DDD = new Font ("calibri",Font.BOLD,15);
        D.setFont(DDD);  


 
       
       
       
       
dC.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dC.setIcon(new ImageIcon(getClass().getResource("Icons/S_Creater.png")));

D.setText("Creater");
D.setBounds(55,406,120,20);
  }
});

dC.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dC.setIcon(new ImageIcon(getClass().getResource("Icons/Creater.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});        
       
dL.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dL.setIcon(new ImageIcon(getClass().getResource("Icons/S_Library.png")));

D.setText("Library Login");
D.setBounds(55,306,120,20);
  }
});

dL.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dL.setIcon(new ImageIcon(getClass().getResource("Icons/Library.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});      

ds.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
ds.setIcon(new ImageIcon(getClass().getResource("Icons/S_Students.png")));

D.setText("Students Login");
D.setBounds(55,256,120,20);
  }
});

ds.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
ds.setIcon(new ImageIcon(getClass().getResource("Icons/Students.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});

dt.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dt.setIcon(new ImageIcon(getClass().getResource("Icons/S_Teachers.png")));

D.setText("Teachers Login");
D.setBounds(55,206,120,20);
  }
});

dt.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dt.setIcon(new ImageIcon(getClass().getResource("Icons/Teachers.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});
 
dh.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dh.setIcon(new ImageIcon(getClass().getResource("Icons/S_Home.png")));

D.setText("Home");
D.setBounds(55,156,80,20);
  }
});

dh.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dh.setIcon(new ImageIcon(getClass().getResource("Icons/Home.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});       

dz.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dz.setIcon(new ImageIcon(getClass().getResource("Icons/S_Menu.png")));

D.setText("Menu");
D.setBounds(55,21,80,20);
  }
});

dz.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dz.setIcon(new ImageIcon(getClass().getResource("Icons/Menu.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});  


 dC.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Creater Frame = new Creater();
     dispose();
           
      }
  });  

 dL.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Library_login Frame = new Library_login();
     dispose();
           
      }
  });       

 ds.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Students_login Frame = new Students_login();
     dispose();
           
      }
  });

 dt.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Teachers_login Frame = new Teachers_login();
     dispose();
           
      }
  }); 
 
 dh.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  });      
             
 dz.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Contacts Frame = new Contacts();
     dispose();
           
      }
  });      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
            
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
//------------------------------------------------------------------------------------------------------------------------------
 
    
       
       
exit.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a2.setBounds(718,420,70,25);
exit.setForeground(Color.WHITE);
  }
});

exit.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a2.setBounds(0,0,0,0);
exit.setForeground(Color.BLACK);
  }
}); 

A1.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
 a4.setBounds(340,15,80,25);
A1.setForeground(Color.BLACK);
  }
});

A1.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a4.setBounds(700,15,80,25);
   A1.setForeground(Color.BLACK);
  }
});

A2.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
  a4.setBounds(430,15,80,25);     
  A2.setForeground(Color.BLACK);
  }
});

A2.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
A2.setForeground(Color.BLACK);
a4.setBounds(700,15,80,25);
  }
});

A3.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
   a4.setBounds(520,15,80,25);    
  A3.setForeground(Color.BLACK);
  }
});

A3.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
   A3.setForeground(Color.BLACK);    
   a4.setBounds(700,15,80,25);
  }
});

A4.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a4.setBounds(610,15,80,25);
A4.setForeground(Color.BLACK);
  }
});

A4.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a4.setBounds(700,15,80,25); 
A4.setForeground(Color.BLACK);
  }
});

A5.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  

  }
});

A5.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  


  }
});

//------------------------------------------------------------------------------------------------------------------------------

F.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
F.setForeground(Color.YELLOW);
  }
});

F.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   F.setForeground(Color.WHITE);
  }
});

Y.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
Y.setForeground(Color.YELLOW);
  }
});

Y.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   Y.setForeground(Color.WHITE);
  }
});

T.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
T.setForeground(Color.YELLOW);
  }
});

T.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   T.setForeground(Color.WHITE);
  }
});

C.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
C.setForeground(Color.YELLOW);
  }
});

C.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   C.setForeground(Color.WHITE);
  }
});

W.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
W.setForeground(Color.YELLOW);
  }
});

W.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   W.setForeground(Color.WHITE);
  }
});

A.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
A.setForeground(Color.YELLOW);
AA.setForeground(Color.YELLOW);
  }
});

A.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   A.setForeground(Color.WHITE);
   AA.setForeground(Color.WHITE);
  }
});

AA.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
AA.setForeground(Color.YELLOW);
A.setForeground(Color.YELLOW);
  }
});

AA.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
   AA.setForeground(Color.WHITE);
    A.setForeground(Color.WHITE);
  }
});

//------------------------------------------------------------------------------------------------------------------------------

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });

A1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  }); 

A2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Teachers Frame = new Teachers();
     dispose();
           
      }
  }); 

A3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Sports Frame = new Sports();
     dispose();
           
      }
  });

A4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Library Frame = new Library();
     dispose();
           
      }
  });

A5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Contacts Frame = new Contacts();
     dispose();
           
      }
  });









//------------------------------------------------------------------------------------------------------------------------------
 
JPanel p = new JPanel();
       p.setBounds(0,0,50,450);
       p.setBackground(Color.BLACK);
   add(p);  
   
//------------------------------------------------------------------------------------------------------------------------------

    JLabel D1 = new JLabel();
           D1.setIcon(new ImageIcon(getClass().getResource("Contacts/DD.png"))); 
           D1.setBounds(0,0,800,450);
       add(D1);

   


setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(21,21,21,250));
setVisible(true); 
   }

 public static void main(String[] args) {
    Contacts Frame = new Contacts();
       
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



