/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class P_add_red extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
P_add_red(){ 
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
        a.setBackground(new Color(200,50,0,250));
    add(a); 
    
 JLabel ll = new JLabel ("Student ID");
        ll.setForeground(Color.WHITE);
        ll.setBounds(350,60,100,30);
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
           i.setIcon(new ImageIcon(getClass().getResource("T_Class/search icon.png")));
           i.setBounds(560,65,18,18); 
       add(i);           
                      
    

 JLabel la1 = new JLabel ("Name   =");
        la1.setForeground(Color.GREEN);
        la1.setBounds(100,120,100,30);
    add(la1);
Font Atela1 = new Font ("calibri",Font.PLAIN,20);
        la1.setFont(Atela1);    
        
 JLabel la2 = new JLabel (" R R W M Ashen Nirmal Wadugodapitiya");
        la2.setForeground(Color.WHITE);
        la2.setBounds(180,120,500,30);
    add(la2);
Font Atela2 = new Font ("calibri",Font.PLAIN,20);
        la2.setFont(Atela2);  


    
           
JTextArea t2 = new JTextArea();
          t2.setBounds (100,180,450,150);
          t2.setForeground(Color.WHITE);
          t2.setBackground(new Color(50,50,50,250));
      add(t2);
  Font Ftet2 = new Font ("calibri",Font.PLAIN,30);
          t2.setFont(Ftet2); 

        
        
JButton b1 = new JButton ("Save");
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

 
           
           
b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
      t1.setText("");
     la2.setText("");
     t2.setText("");
    

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
           P_add_red Frame = new P_add_red();
   
        
           
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




