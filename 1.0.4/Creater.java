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
 * @author Blocker
 */
class Creater extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
     private static String z;
    String xx;
    
Creater(){ 
setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------





 JLabel F = new JLabel ("Nirmal Wadugodapitiya");
        F.setBounds(120,80,250,18); 
        F.setForeground(Color.WHITE);
    add(F);
   Font F11 = new Font ("calibri",Font.BOLD,18);
        F.setFont(F11);

 JLabel Y = new JLabel ("Ashen_NW");
        Y.setBounds(120,143,250,18); 
        Y.setForeground(Color.WHITE);
    add(Y);
   Font Y11 = new Font ("calibri",Font.BOLD,18);
        Y.setFont(Y11);

 JLabel T = new JLabel ("Nirmal Wadugodapitiya");
        T.setBounds(120,200,250,18); 
        T.setForeground(Color.WHITE);
    add(T);
   Font T11 = new Font ("calibri",Font.BOLD,18);
        T.setFont(T11);        

 JLabel C = new JLabel ("070-362-0555 / 070-362-0707");
        C.setBounds(120,263,220,18); 
        C.setForeground(Color.WHITE);
    add(C);
   Font C11 = new Font ("calibri",Font.BOLD,18);
        C.setFont(C11);

 JLabel W = new JLabel ("ashennirmalww@gmail.com");
        W.setBounds(120,315,215,18); 
        W.setForeground(Color.WHITE);
    add(W);
   Font W11 = new Font ("calibri",Font.BOLD,18);
        W.setFont(W11);        




   

















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


//------------------------------------------------------------------------------------------------------------------------------

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });





    JLabel l1 = new JLabel();
           l1.setIcon(new ImageIcon(getClass().getResource("Creater/logo1.png"))); 
           l1.setBounds(600,150,45,45);
       add(l1);
       
       
    JLabel l2 = new JLabel();
           l2.setIcon(new ImageIcon(getClass().getResource("Creater/logo2.png"))); 
           l2.setBounds(600,250,45,45);
       add(l2);       












JPanel p = new JPanel();
       p.setBounds(0,0,50,450);
       p.setBackground(Color.BLACK);
   add(p); 
   
   
 
    JLabel D1 = new JLabel();
           D1.setIcon(new ImageIcon(getClass().getResource("Creater/DD.png"))); 
           D1.setBounds(0,0,800,450);
       add(D1);
  
   

setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(220,220,220,250));
setVisible(true); 
   }

 public static void main(String[] args) {
    Creater Frame = new Creater();
       
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



