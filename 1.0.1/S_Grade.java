/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_one;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class S_Grade extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
S_Grade(){ 
setLayout(null);

JLabel ll = new JLabel ("Students");
        ll.setForeground(Color.BLACK);
        ll.setBounds(20,60,150,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,20);
        ll.setFont(Atell);
        
 JLabel l2 = new JLabel ("Teacher Name");
        l2.setForeground(Color.BLACK);
        l2.setBounds(20,120,180,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);
        
 JLabel l3 = new JLabel ("Class Leader");
        l3.setForeground(Color.BLACK);
        l3.setBounds(20,175,180,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3);
        
        

JTextField t1 = new JTextField();
           t1.setBounds (110,62,50,25);
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);       
       
JTextField t2 = new JTextField();
           t2.setBounds (50,145,150,25);
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);
           
JTextField t3 = new JTextField();
           t3.setBounds (50,200,150,25);
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3);            

 

    
    //JOptionPane.showMessageDialog(null, "Login success","Login success",JOptionPane.WARNING_MESSAGE);
   
JButton b1 = new JButton ("Student");
        b1.setBounds (380,100,209,35);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
Font Ateb1 = new Font ("calibri",Font.PLAIN,23);
        b1.setFont(Ateb1); 
        
JButton b2 = new JButton ("Details of Teachers");
        b2.setBounds (380,180,209,35);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);
Font Ateb2 = new Font ("calibri",Font.PLAIN,23);
        b2.setFont(Ateb2);
        
JButton b3 = new JButton ("Exam Marks");
        b3.setBounds (380,260,209,35);
        b3.setBackground(new Color(250,250,250,250));
    add(b3);
Font Ateb3 = new Font ("calibri",Font.PLAIN,23);
        b3.setFont(Ateb3);         

JButton b4 = new JButton ("Logout");
        b4.setBounds (15,350,100,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);
    
b1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b1.setBackground(new Color(250,150,30,250));
  }
});


b1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b1.setBackground(new Color(250,250,250,250));
  }
});        
      
b2.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b2.setBackground(new Color(250,150,30,250));
  }
});


b2.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b2.setBackground(new Color(250,250,250,250));
  }
});  

b3.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b3.setBackground(new Color(250,150,30,250));
  }
});


b3.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b3.setBackground(new Color(250,250,250,250));
  }
});        
       
    
    
    
b1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_studentDetails Frame = new S_studentDetails();
     dispose();
           
      }
  });
        
b2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Details_T Frame = new S_Details_T();
     dispose();
           
      }
  });      
   
b3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_ExamMarks Frame = new S_ExamMarks();
     dispose();
           
      }
  });       
    
    
    
        
b4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Login Frame = new S_Login();
     dispose();
           
      }
  });

  
JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/promax.png")));
           a1.setBounds(200,0,400,400);
       add(a1);   

setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(250,150,30,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_Grade Frame = new S_Grade();
   
        
           
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

