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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class S_settings extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
S_settings(){ 
setLayout(null);

 JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
        l1.setBounds(120,13,500,20);
        l1.setForeground(Color.WHITE);
    add(l1);
 Font Atl1 = new Font ("calibri",Font.PLAIN,20);
        l1.setFont(Atl1);
        
        
   JLabel  a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("S_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    
a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Class Frame = new S_Class();
     dispose();
           
      }
  });

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("S_Class/Home icon.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
       
    
a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Class Frame = new S_Class();
     dispose();
           
      }
  });
 
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("S_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);

a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_T_Details Frame = new S_T_Details();
     dispose();
           
      }
  });

    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("S_Class/Students.png")));
           a4.setBounds(10,180,38,38); 
       add(a4);

a4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_S_Details Frame = new S_S_Details();
     dispose();
           
      }
  });

    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("S_Class/exam.png")));
           a5.setBounds(10,235,38,38); 
       add(a5);

a5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_E_Marks Frame = new S_E_Marks();
     dispose();
           
      }
  });

    JLabel a6 = new JLabel();
           a6.setIcon(new ImageIcon(getClass().getResource("S_Class/S_Set.png")));
           a6.setBounds(10,290,38,38); 
       add(a6);

a6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_settings Frame = new S_settings();
     dispose();
           
      }
  });

       
        
        
        
        

 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(250,180,0,250));
    add(a);
 

 JLabel lal = new JLabel ("Your ID            =");
        lal.setForeground(Color.WHITE);
        lal.setBounds(100,100,150,30);
    add(lal);
Font Atelal = new Font ("calibri",Font.PLAIN,20);
        lal.setFont(Atelal);  
        
        
 JLabel la2 = new JLabel ("253654");
        la2.setForeground(Color.WHITE);
        la2.setBounds(250,100,100,30);
    add(la2);
Font Atela2 = new Font ("calibri",Font.PLAIN,20);
        la2.setFont(Atela2);  
        
        
        
        
        
 JLabel lb1 = new JLabel ("Name               =");
        lb1.setForeground(Color.WHITE);
        lb1.setBounds(100,150,200,30);
    add(lb1);
Font Atelb1 = new Font ("calibri",Font.PLAIN,20);
        lb1.setFont(Atelb1);    
        
 JLabel lb2 = new JLabel ("Nirmal Wadugodapitiya");
        lb2.setForeground(Color.WHITE);
        lb2.setBounds(250,150,500,30);
    add(lb2);
Font Atelb2 = new Font ("calibri",Font.PLAIN,20);
        lb2.setFont(Atelb2); 
        
        
        
 JLabel lc1 = new JLabel ("Class Custody  =");
        lc1.setForeground(Color.WHITE);
        lc1.setBounds(100,200,250,30);
    add(lc1);
Font Atelc1 = new Font ("calibri",Font.PLAIN,20);
        lc1.setFont(Atelc1);    
        
 JLabel lc2 = new JLabel ("Grade");
        lc2.setForeground(Color.WHITE);
        lc2.setBounds(250,200,150,30);
    add(lc2);
Font Atelc2 = new Font ("calibri",Font.PLAIN,20);
        lc2.setFont(Atelc2);
        
 JLabel lc3 = new JLabel ("Class");
        lc3.setForeground(Color.WHITE);
        lc3.setBounds(403,200,150,30);
    add(lc3);
Font Atelc3 = new Font ("calibri",Font.PLAIN,20);
        lc3.setFont(Atelc3);        
        
        
JTextField t1 = new JTextField();
           t1.setBounds (317,202,70,25);
           t1.setForeground(Color.WHITE);
           t1.setBackground(new Color(50,50,50,250));
       add(t1);
   Font Atet1 = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atet1);          
      
JTextField t2 = new JTextField();
           t2.setBounds (460,202,70,25);
           t2.setForeground(Color.WHITE);
           t2.setBackground(new Color(50,50,50,250));
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);   
    

        
 JLabel le1 = new JLabel ("Change Password      =");
        le1.setForeground(Color.WHITE);
        le1.setBounds(100,250,500,30);
    add(le1);
Font Atele1 = new Font ("calibri",Font.PLAIN,20);
        le1.setFont(Atele1);     
    
JPasswordField t5 = new JPasswordField();
               t5.setBounds (317,252,265,20);
               t5.setForeground(Color.WHITE);
               t5.setBackground(new Color(50,50,50,250));
           add(t5);
       Font Atet5 = new Font ("calibri",Font.PLAIN,20);
               t5.setFont(Atet5); 
               
               
       
JButton b1 = new JButton ("Update");
        b1.setBounds (500,360,80,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);        
    
    
    
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
    




setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(60,60,60,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_settings Frame = new S_settings();
   
        
           
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


