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
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class T_S_Details extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
T_S_Details(){ 
setLayout(null);

 JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
        l1.setBounds(120,13,500,20);
        l1.setForeground(Color.WHITE);
    add(l1);
 Font Atl1 = new Font ("calibri",Font.PLAIN,20);
        l1.setFont(Atl1);
        
        
   JLabel  a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("T_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    
a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Class Frame = new T_Class();
     dispose();
           
      }
  });

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("T_Class/Home icon.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
       
    
a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Class Frame = new T_Class();
     dispose();
           
      }
  });
 
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("T_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);

a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Details Frame = new T_Details();
     dispose();
           
      }
  });

    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("T_Class/Students.png")));
           a4.setBounds(10,180,38,38); 
       add(a4);

a4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_S_Details Frame = new T_S_Details();
     dispose();
           
      }
  });

    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("T_Class/exam.png")));
           a5.setBounds(10,235,38,38); 
       add(a5);

a5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_E_Marks Frame = new T_E_Marks();
     dispose();
           
      }
  });

    JLabel a6 = new JLabel();
           a6.setIcon(new ImageIcon(getClass().getResource("T_Class/T_Set.png")));
           a6.setBounds(10,290,38,38); 
       add(a6);

a6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_settings Frame = new T_settings();
     dispose();
           
      }
  });

 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(10,250,10,250));
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
        
        
 JLabel lb1 = new JLabel ("Adress  =");
        lb1.setForeground(Color.GREEN);
        lb1.setBounds(100,170,100,30);
    add(lb1);
Font Atelb1 = new Font ("calibri",Font.PLAIN,20);
        lb1.setFont(Atelb1);    
        
 JLabel lb2 = new JLabel (" No,302 Gunanandha Mawatha Wijeyapura ");
        lb2.setForeground(Color.WHITE);
        lb2.setBounds(180,170,500,30);
    add(lb2);
Font Atelb2 = new Font ("calibri",Font.PLAIN,20);
        lb2.setFont(Atelb2); 
        
        
        
 JLabel lc1 = new JLabel ("Dtae Of Birth  =");
        lc1.setForeground(Color.GREEN);
        lc1.setBounds(100,220,250,30);
    add(lc1);
Font Atelc1 = new Font ("calibri",Font.PLAIN,20);
        lc1.setFont(Atelc1);    
        
 JLabel lc2 = new JLabel ("2004/09/30");
        lc2.setForeground(Color.WHITE);
        lc2.setBounds(235,220,180,30);
    add(lc2);
Font Atelc2 = new Font ("calibri",Font.PLAIN,20);
        lc2.setFont(Atelc2);
        
 
        
 JLabel ld1 = new JLabel ("Telephone Numbers =");
        ld1.setForeground(Color.GREEN);
        ld1.setBounds(100,270,500,30);
    add(ld1);
Font Ateld1 = new Font ("calibri",Font.PLAIN,20);
        ld1.setFont(Ateld1);        
        
 JLabel ld2 = new JLabel ("0703620555");
        ld2.setForeground(Color.WHITE);
        ld2.setBounds(300,270,500,30);
    add(ld2);
Font Ateld2 = new Font ("calibri",Font.PLAIN,20);
        ld2.setFont(Ateld2); 
        
        
 JLabel ld3 = new JLabel ("/0777518881");
        ld3.setForeground(Color.WHITE);
        ld3.setBounds(400,270,500,30);
    add(ld3);
Font Ateld3 = new Font ("calibri",Font.PLAIN,20);
        ld3.setFont(Ateld3); 
        
        
 
           
           
           
JButton b1 = new JButton ("Clear");
        b1.setBounds (500,360,80,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
           
JButton b2 = new JButton ("Print");
        b2.setBounds (400,360,80,20);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);     
    
    
        


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
           
           
b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
      t1.setText("");
     la2.setText("");
     lb2.setText("");
     lc2.setText("");
     ld2.setText("");
     ld3.setText("");
    

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
           T_S_Details Frame = new T_S_Details();
   
        
           
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




