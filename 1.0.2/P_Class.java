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
public class P_Class extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
P_Class(){ 
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
        a.setBackground(new Color(250,250,0,250));
    add(a);
 
    
 JPanel b = new JPanel();
        b.setLayout(null);
        b.setBounds(85,60,5,15);
        b.setBackground(new Color(255,250,0,250));
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
        c.setBackground(new Color(250,250,0,250));
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
    
    JLabel p1i = new JLabel();
           p1i.setIcon(new ImageIcon(getClass().getResource("P_Class/Student DBlack.png")));
           p1i.setBounds(20,-13,100,120); 
       p1.add(p1i);
    
   
 JLabel ll = new JLabel ("Student Details");
        ll.setBounds(7,85,100,20);
        ll.setForeground(Color.white);
 p1.add(ll);

        
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
        
p1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
ll.setForeground(Color.BLACK);
  }
});


p1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
ll.setForeground(Color.white);   
  }
});   

p1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_S_Details Frame = new P_S_Details();
     dispose();
           
      }
  });







 JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(200,85,100,120);
        p2.setBackground(new Color(46,42,43,250));
    add(p2);    
    
    JLabel p2i = new JLabel();
           p2i.setIcon(new ImageIcon(getClass().getResource("P_Class/P_Exam M.png")));
           p2i.setBounds(20,-13,100,120); 
       p2.add(p2i);
    
 JLabel l2 = new JLabel ("Exam Marks");
        l2.setBounds(15,85,100,20);
        l2.setForeground(Color.white);
 p2.add(l2);

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
l2.setForeground(Color.BLACK);
  }
});


p2.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
l2.setForeground(Color.white);   
  }
});     

p2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Exam_Marks Frame = new P_Exam_Marks();
     dispose();
           
      }
  });


 JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(315,85,100,120);
        p3.setBackground(new Color(46,42,43,250));
    add(p3);    
    
    
 JLabel l3 = new JLabel ("Add");
        l3.setBounds(38,73,100,20);
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
    
 JLabel l4 = new JLabel ("Red Book");
        l4.setBounds(23,73,100,20);
        l4.setForeground(Color.RED);
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
 l4.setForeground(Color.RED);
  }
});

p4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Red_book Frame = new P_Red_book();
     dispose();
           
      }
  });  

 JPanel p5 = new JPanel();
        p5.setLayout(null);
        p5.setBounds(200,255,100,120);
        p5.setBackground(new Color(46,42,43,250));
    add(p5);
    
 JLabel l5 = new JLabel ("Add To");
        l5.setBounds(32,65,100,20);
        l5.setForeground(Color.RED);
 p5.add(l5);
 
 JLabel la5 = new JLabel ("Red Book");
        la5.setBounds(25,80,100,20);
        la5.setForeground(Color.RED);
 p5.add(la5);
            
p5.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
p5.setBackground(new Color(250,250,0,250));
  }
});


p5.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
p5.setBackground(new Color(46,42,43,250));
  }
});  
        
p5.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
l5.setForeground(Color.BLACK);
  }
});


p5.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
 l5.setForeground(Color.RED);
  }
});

p5.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
la5.setForeground(Color.BLACK);
  }
});


p5.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
 la5.setForeground(Color.RED);
  }
});

p5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_add_red Frame = new P_add_red();
     dispose();
           
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
           P_Class Frame = new P_Class();
   
        
           
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




