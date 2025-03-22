/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_project;

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
 * @author Ashen
 */
public class P_Teachers extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
P_Teachers(){ 
setLayout(null);

 JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
        l1.setBounds(120,13,500,20);
        l1.setForeground(Color.WHITE);
    add(l1);
 Font Atl1 = new Font ("calibri",Font.PLAIN,20);
        l1.setFont(Atl1);
        
        
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("P_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    
a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Login Frame = new P_Login();
     dispose();
           
      }
  });
        
  JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("P_Class/Students.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
       
    
a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Class Frame = new P_Class();
     dispose();
           
      }
  });
 
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("P_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);

 a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Teachers Frame = new P_Teachers();
     dispose();
           
      }
  });        
       
        
        

 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(25,250,20,250));
    add(a);
 
JPanel b = new JPanel();
        b.setLayout(null);
        b.setBounds(85,60,5,15);
        b.setBackground(new Color(25,250,20,250));
        add(b); 
        
 JLabel b1 = new JLabel ("Other Useful Tools:");
        b1.setBounds(95,57,250,20);
        b1.setForeground(Color.WHITE);
        add(b1);
        Font bteb = new Font ("calibri",Font.PLAIN,18);
        b1.setFont(bteb);
        
 JPanel c = new JPanel();
        c.setLayout(null);
        c.setBounds(85,235,5,15);
        c.setBackground(new Color(25,250,20,250));
        add(c);
    
 JLabel c1 = new JLabel ("Fix Common Problems:");
        c1.setBounds(95,232,250,20);
        c1.setForeground(Color.WHITE);
        add(c1);
        Font Cteb = new Font ("calibri",Font.PLAIN,18);
        c1.setFont(Cteb);
       
    
 JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(85,85,100,120);
        p1.setBackground(new Color(46,42,43,250));
    add(p1);
    
p1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
p1.setBackground(new Color(250,250,0,250));
  }
});


p1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
p1.setBackground(new Color(46,42,43,250));
  }
});     

 JLabel pl1 = new JLabel ("Teachers");
        pl1.setBounds(22,65,100,20);
        pl1.setForeground(Color.WHITE)    ;
 p1.add(pl1);
 
 p1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
pl1.setForeground(Color.BLACK);
  }
});


p1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
 pl1.setForeground(Color.WHITE);
  }
});

 
 
 JLabel pl2 = new JLabel ("Details");
        pl2.setBounds(30,80,100,20);
        pl2.setForeground(Color.WHITE);
 p1.add(pl2);
            

p1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
pl2.setForeground(Color.BLACK);
  }
});


p1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
 pl2.setForeground(Color.WHITE);
  }
}); 
 
 
 
 
        








 JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(200,85,100,120);
        p2.setBackground(new Color(46,42,43,250));
    add(p2);    
    
 JLabel Pl2 = new JLabel ("Add");
        Pl2.setBounds(40,65,100,20);
        Pl2.setForeground(Color.white);
 p2.add(Pl2);
 
 JLabel Pl3 = new JLabel ("Teachers");
        Pl3.setBounds(25,80,100,20);
        Pl3.setForeground(Color.white);
 p2.add(Pl3);

 
 
p2.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
p2.setBackground(new Color(250,250,0,250));
  }
});


p2.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
p2.setBackground(new Color(46,42,43,250));   
  }
});          
        
p2.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
Pl2.setForeground(Color.BLACK);
  }
});


p2.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
Pl2.setForeground(Color.white);   
  }
});  

p2.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
Pl3.setForeground(Color.BLACK);
  }
});


p2.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
Pl3.setForeground(Color.white);   
  }
});  


 JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(315,85,100,120);
        p3.setBackground(new Color(46,42,43,250));
    add(p3);    
    
    
 JLabel l3 = new JLabel ("Add");
        l3.setBounds(38,75,100,20);
        l3.setForeground(Color.white);
 p3.add(l3);

p3.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
p3.setBackground(new Color(250,250,0,250));
  }
});


p3.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
p3.setBackground(new Color(46,42,43,250));   
  }
});          
        
p3.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
l3.setForeground(Color.BLACK);
  }
});


p3.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
l3.setForeground(Color.white);   
  }
});                
              
        

 JPanel p4 = new JPanel();
        p4.setLayout(null);
        p4.setBounds(85,255,100,120);
        p4.setBackground(new Color(46,42,43,250));
    add(p4);
    
 JLabel l4 = new JLabel ("Principal");
        l4.setBounds(24,80,100,20);
        l4.setForeground(Color.WHITE);
 p4.add(l4);


      
p4.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
p4.setBackground(new Color(250,250,0,250));
  }
});


p4.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
p4.setBackground(new Color(46,42,43,250));
  }
});      
 
p4.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
l4.setForeground(Color.BLACK);
  }
});


p4.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
l4.setForeground(Color.WHITE);
  }
});      
  


       
            
  
        
        
        

setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(60,60,60,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           P_Teachers Frame = new P_Teachers();
   
        
           
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


