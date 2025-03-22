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
import javax.swing.JTextField;

/**
 *
 * @author Ashen_NW
 */
public class P_Exam_Marks extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
P_Exam_Marks(){ 
setLayout(null);

 JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
           l1.setBounds(120,13,500,20);
           l1.setForeground(Color.WHITE);
       add(l1);
    Font Atl1 = new Font ("calibri",Font.PLAIN,20);
           l1.setFont(Atl1);
           
    JPanel p11 = new JPanel();
           p11.setBounds(60,10,600,30);
           p11.setBackground(Color.RED);
       add(p11);


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
        
        
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("P_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    
a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Class Frame = new P_Class();
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
 
JLabel ll = new JLabel ("Student ID  =");
        ll.setForeground(Color.WHITE);
        ll.setBounds(340,60,150,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,20);
        ll.setFont(Atell);
        
JTextField t1 = new JTextField();
           t1.setBounds (450,62,100,25);
           t1.setForeground(Color.WHITE);
           t1.setBackground(new Color(50,50,50,250));
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);  
           
    JLabel i = new JLabel();
           i.setIcon(new ImageIcon(getClass().getResource("P_Class/search icon.png")));
           i.setBounds(560,65,18,18); 
       add(i); 
           
     
    
    
 JLabel la1 = new JLabel ("Sinhala");
        la1.setForeground(Color.WHITE);
        la1.setBounds(100,100,150,30);
    add(la1);
Font Atela1 = new Font ("calibri",Font.PLAIN,20);
        la1.setFont(Atela1);   
                
                
 JLabel la2 = new JLabel ("100");
        la2.setForeground(Color.WHITE);
        la2.setBounds(230,102,50,25);
    add(la2);
Font Atela2 = new Font ("calibri",Font.PLAIN,20);
        la2.setFont(Atela2);               
        

           
           
           
           
 JLabel l3 = new JLabel ("English");
        l3.setForeground(Color.WHITE);
        l3.setBounds(100,150,150,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3); 
        
 JLabel la3 = new JLabel ("100");
        la3.setForeground(Color.WHITE);
        la3.setBounds(230,152,50,25);
    add(la3);
Font Atela3 = new Font ("calibri",Font.PLAIN,20);
        la3.setFont(Atela3);
        

           
           
           
 JLabel l4 = new JLabel ("ICT");
        l4.setForeground(Color.WHITE);
        l4.setBounds(100,200,150,30);
    add(l4);
Font Atel4 = new Font ("calibri",Font.PLAIN,20);
        l4.setFont(Atel4); 
        
 JLabel la4 = new JLabel ("100");
        la4.setForeground(Color.WHITE);
        la4.setBounds(230,202,50,25);
    add(la4);
Font Atela4 = new Font ("calibri",Font.PLAIN,20);
        la4.setFont(Atela4);
        

           
           
           
 JLabel l5 = new JLabel ("Mathematics");
        l5.setForeground(Color.WHITE);
        l5.setBounds(100,250,150,30);
    add(l5);
Font Atel5 = new Font ("calibri",Font.PLAIN,20);
        l5.setFont(Atel5);  
        
 JLabel la5 = new JLabel ("100");
        la5.setForeground(Color.WHITE);
        la5.setBounds(230,252,50,25);
    add(la5);
Font Atela5 = new Font ("calibri",Font.PLAIN,20);
        la5.setFont(Atela5);      
        
           
           
           
 JLabel l6 = new JLabel ("Science");
        l6.setForeground(Color.WHITE);
        l6.setBounds(100,300,150,30);
    add(l6);
Font Atel6 = new Font ("calibri",Font.PLAIN,20);
        l6.setFont(Atel6); 
        
 JLabel la6 = new JLabel ("100");
        la6.setForeground(Color.WHITE);
        la6.setBounds(230,302,50,25);
    add(la6);
Font Atela6 = new Font ("calibri",Font.PLAIN,20);
        la6.setFont(Atela5);        
        
 JLabel l7 = new JLabel ("Sum   =");
        l7.setForeground(Color.WHITE);
        l7.setBounds(150,350,150,30);
    add(l7);
Font Atel7 = new Font ("calibri",Font.PLAIN,20);
        l7.setFont(Atel7); 
           
 JLabel la7 = new JLabel ("100");
        la7.setForeground(Color.WHITE);
        la7.setBounds(230,352,50,25);
    add(la7);
Font Atela7 = new Font ("calibri",Font.PLAIN,20);
        la7.setFont(Atela7);          
        
 JLabel l8 = new JLabel ("Rank    =");
        l8.setForeground(Color.WHITE);
        l8.setBounds(360,100,150,30);
    add(l8);
Font Atel8 = new Font ("calibri",Font.PLAIN,20);
        l8.setFont(Atel8);         
        
        
 JLabel la8 = new JLabel ("07");
        la8.setForeground(Color.WHITE);
        la8.setBounds(450,102,60,25);
    add(la8);
Font Atela8 = new Font ("calibri",Font.PLAIN,20);
        la8.setFont(Atela8);   
                
           
    
    
JButton b1 = new JButton ("I");
        b1.setBounds (490,160,60,25);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);           
Font Ateb1 = new Font ("calibri",Font.PLAIN,20);
        b1.setFont(Ateb1); 
        
JButton b2 = new JButton ("II");
        b2.setBounds (490,210,60,25);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);           
Font Ateb2 = new Font ("calibri",Font.PLAIN,20);
        b2.setFont(Ateb2); 
        
JButton b3 = new JButton ("III");
        b3.setBounds (490,260,60,25);
        b3.setBackground(new Color(250,250,250,250));
    add(b3);           
Font Ateb3 = new Font ("calibri",Font.PLAIN,20);
        b3.setFont(Ateb3);        

JButton b4 = new JButton ("Print");
        b4.setBounds (500,370,80,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);           


    
    
    


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

b2.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b2.setBackground(new Color(250,250,0,250));
  }
});


b2.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b2.setBackground(new Color(250,250,250,250));
  }
});      
    
b3.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b3.setBackground(new Color(250,250,0,250));
  }
});


b3.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b3.setBackground(new Color(250,250,250,250));
  }
});      
    
b4.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b4.setBackground(new Color(250,250,0,250));
  }
});


b4.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b4.setBackground(new Color(250,250,250,250));
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
           P_Exam_Marks Frame = new P_Exam_Marks();
   
        
           
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


