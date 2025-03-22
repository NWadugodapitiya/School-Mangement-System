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
public class T_E_Marks extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
T_E_Marks(){ 
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
        a.setBackground(new Color(10,200,80,250));
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
    
    
 JLabel l2 = new JLabel ("Sinhala");
        l2.setForeground(Color.WHITE);
        l2.setBounds(100,100,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);  
        
JTextField t2 = new JTextField();
           t2.setBounds (230,102,50,25);
           t2.setForeground(Color.WHITE);
           t2.setBackground(new Color(50,50,50,250));
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);
           
           
           
           
 JLabel l3 = new JLabel ("English");
        l3.setForeground(Color.WHITE);
        l3.setBounds(100,150,150,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3);  
        
JTextField t3 = new JTextField();
           t3.setBounds (230,152,50,25);
           t3.setForeground(Color.WHITE);
           t3.setBackground(new Color(50,50,50,250));
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3);         
           
           
           
           
 JLabel l4 = new JLabel ("ICT");
        l4.setForeground(Color.WHITE);
        l4.setBounds(100,200,150,30);
    add(l4);
Font Atel4 = new Font ("calibri",Font.PLAIN,20);
        l4.setFont(Atel4);  
        
JTextField t4 = new JTextField();
           t4.setBounds (230,202,50,25);
           t4.setForeground(Color.WHITE);
           t4.setBackground(new Color(50,50,50,250));
       add(t4);
   Font Atet4 = new Font ("calibri",Font.PLAIN,20);
           t4.setFont(Atet4);
           
           
           
           
 JLabel l5 = new JLabel ("Mathematics");
        l5.setForeground(Color.WHITE);
        l5.setBounds(100,250,150,30);
    add(l5);
Font Atel5 = new Font ("calibri",Font.PLAIN,20);
        l5.setFont(Atel5);  
        
JTextField t5 = new JTextField();
           t5.setBounds (230,252,50,25);
           t5.setForeground(Color.WHITE);
           t5.setBackground(new Color(50,50,50,250));
       add(t5);
   Font Atet5 = new Font ("calibri",Font.PLAIN,20);
           t5.setFont(Atet5);
           
           
           
 JLabel l6 = new JLabel ("Science");
        l6.setForeground(Color.WHITE);
        l6.setBounds(100,300,150,30);
    add(l6);
Font Atel6 = new Font ("calibri",Font.PLAIN,20);
        l6.setFont(Atel6);  
        
JTextField t6 = new JTextField();
           t6.setBounds (230,302,50,25);
           t6.setForeground(Color.WHITE);
           t6.setBackground(new Color(50,50,50,250));
       add(t6);
   Font Atet6 = new Font ("calibri",Font.PLAIN,20);
           t6.setFont(Atet6);
           
           
JTextField t7 = new JTextField();
           t7.setBounds (230,352,50,25);
           t7.setForeground(Color.WHITE);
           t7.setBackground(new Color(50,50,50,250));
       add(t7);
   Font Atet7 = new Font ("calibri",Font.PLAIN,20);
           t7.setFont(Atet7);  
           
JTextField t8 = new JTextField();
           t8.setBounds (350,100,200,25);
           t8.setForeground(Color.WHITE);
           t8.setBackground(new Color(50,50,50,250));
       add(t8);
   Font Atet8 = new Font ("calibri",Font.PLAIN,20);
           t8.setFont(Atet8);           
           
    
    
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

JButton b4 = new JButton ("Clear");
        b4.setBounds (500,370,80,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);           

        
JButton b5 = new JButton ("Print");
        b5.setBounds (410,370,80,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5); 
    
JButton b6 = new JButton ("SUM");
        b6.setBounds (100,352,80,20);
        b6.setBackground(new Color(250,250,250,250));
    add(b6);
          

    
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

    
b5.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b5.setBackground(new Color(250,250,0,250));
  }
});


b5.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b5.setBackground(new Color(250,250,250,250));
  }
});  

b6.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b6.setBackground(new Color(250,250,0,250));
  }
});


b6.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b6.setBackground(new Color(250,250,250,250));
  }
});     

     
     
 
b4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     t1.setText("");
     t2.setText("");
     t3.setText("");
     t4.setText("");
     t5.setText("");
     t6.setText("");
     t7.setText("");
     t8.setText("");
     

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
           T_E_Marks Frame = new T_E_Marks();
   
        
           
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





