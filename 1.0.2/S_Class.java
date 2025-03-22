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
public class S_Class extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
S_Class(){ 
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
     S_Login Frame = new S_Login();
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
        a.setBackground(new Color(150,250,0,250));
    add(a);
 


 JLabel ll = new JLabel ("Students");
        ll.setForeground(Color.WHITE);
        ll.setBounds(450,60,150,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,25);
        ll.setFont(Atell);
        
 JLabel la = new JLabel ("60");
        la.setForeground(Color.WHITE);
        la.setBounds(550,60,150,30);
    add(la);
Font Atela = new Font ("calibri",Font.PLAIN,25);
        la.setFont(Atela);        
        
        
 JLabel l2 = new JLabel ("Teacher Name   =");
        l2.setForeground(Color.WHITE);
        l2.setBounds(100,140,180,20);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);
        
 JLabel lb = new JLabel ("K.N.M Sumith Hewage");
        lb.setForeground(Color.YELLOW);
        lb.setBounds(290,140,300,20);
    add(lb);
Font Atelb = new Font ("calibri",Font.PLAIN,20);
        lb.setFont(Atelb);
 
        
 JLabel l3 = new JLabel ("Class Leader      =");
        l3.setForeground(Color.WHITE);
        l3.setBounds(100,180,180,20);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3);      
    
        
 JLabel lc = new JLabel ("Ashen Nirmal");
        lc.setForeground(Color.YELLOW);
        lc.setBounds(290,180,180,20);
    add(lc);
Font Atelc = new Font ("calibri",Font.PLAIN,20);
        lc.setFont(Atelc);      
        
        
 JLabel l4 = new JLabel ("Your Name        =");
        l4.setForeground(Color.WHITE);
        l4.setBounds(100,220,180,20);
    add(l4);
Font Atel4 = new Font ("calibri",Font.PLAIN,20);
        l4.setFont(Atel4);      
    
        
 JLabel lc4 = new JLabel ("Nirmal Wadugodapitiya");
        lc4.setForeground(Color.YELLOW);
        lc4.setBounds(290,220,250,20);
    add(lc4);
Font Atelc4 = new Font ("calibri",Font.PLAIN,20);
        lc4.setFont(Atelc4);      
    
    
    
    
    
    
    
    
    
    
    
    
    




setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(60,60,60,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_Class Frame = new S_Class();
   
        
           
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





