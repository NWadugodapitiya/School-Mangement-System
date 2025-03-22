/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwear_01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ashen_NW
 */
public class Register extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    
Register(){ 
setLayout(null);

        JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
           l1.setBounds(120,13,500,20);
           l1.setForeground(Color.WHITE);
       add(l1);
    Font Atl1 = new Font ("calibri",Font.PLAIN,20);
           l1.setFont(Atl1);
           
          Thread tl = new Thread(){
     public void run (){
         for (int i = 0; i<120; i=i+1){
             l1.setBounds(i,13,500,20);
             try{
                 sleep(1);
             }catch(InterruptedException ex){}
         }
     }
 };
 tl.start(); 
 
 
 JPanel p1 = new JPanel();
       p1.setBounds(60,10,600,30);
       p1.setBackground(Color.RED);
   add(p1);  
           
           
    JLabel l2 = new JLabel ("or");
           l2.setBounds(463,60,50,20);
           l2.setForeground(Color.WHITE);
       add(l2);


    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("Home/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Home/Home icon.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);

    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("Home/Teachers Login icon.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);
      
    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("Home/Student Login icon.png")));
           a4.setBounds(10,180,38,38); 
       add(a4);  
       
       
    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("Home/Principal Login icon.png")));
           a5.setBounds(10,235,38,38); 
       add(a5);  
       
    JLabel a6 = new JLabel();
           a6.setIcon(new ImageIcon(getClass().getResource("Home/About us.png")));
           a6.setBounds(10,290,38,38); 
       add(a6);   
       

 JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(0,0,60,400);
        p.setBackground(new Color(40,250,70,250));
    add(p);
       
       
       
JButton b = new JButton ("Teacher");
        b.setBounds (365,60,90,20);
        b.setBackground(new Color(250,250,250,250));
    add(b);      
       
       
JButton b1 = new JButton ("Student");
        b1.setBounds (480,60,90,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);      
       
       
       
b.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b.setBackground(new Color(250,250,0,250));
  }
});


b.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b.setBackground(new Color(250,250,250,250));
  }
});  

b1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b1.setBackground(new Color(250,250,0,250));
  }
});


b1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b1.setBackground(new Color(250,250,250,250));
  }
});         
       
       
 b.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Register Frame = new T_Register();
     dispose();
           
      }
  });

b1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Register Frame = new S_Register();
     dispose();
           
      }
  });       

a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  });

a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  });

a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Login Frame = new T_Login();
     dispose();
           
      }
  });

a4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Login Frame = new S_Login();
     dispose();
           
      }
  });

a5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Login Frame = new P_Login();
     dispose();
           
      }
  });

a6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     About Frame = new About();
     dispose();
           
      }
  });















setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(50,50,50,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           Register Frame = new Register();
   
        
           
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


