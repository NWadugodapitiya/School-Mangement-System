/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_one;

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


public class Project_one extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
Project_one(){ 
setLayout(null);



JButton b1 = new JButton ("Teacher");
        b1.setBounds (20,60,130,40);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
Font Ateb1 = new Font ("calibri",Font.PLAIN,25);
        b1.setFont(Ateb1);
        
JButton b2 = new JButton ("Student");
        b2.setBounds (20,130,130,40);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);
Font Ateb2 = new Font ("calibri",Font.PLAIN,25);
        b2.setFont(Ateb2); 
        
JButton b3 = new JButton ("Exit");
        b3.setBounds (15,350,100,20);
        b3.setBackground(new Color(250,250,250,250));
    add(b3);        

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
b3.setBackground(new Color(250,0,0,250));
  }
});


b3.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
b3.setBackground(new Color(250,250,250,250));
  }
});       
    
        b1.addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent e) {
              T_Project Frame = new T_Project();
     dispose();
           
      }
  });
        
        b2.addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent e) {
              S_Project Frame = new S_Project();
     dispose();
           
      }
  }); 
          
        b3.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
              System.exit(0);
      } 
  });
              
    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("icon/whc.png")));
           a2.setBounds(510,0,90,90);
       add(a2); 
        
        
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/lite.png")));
           a1.setBounds(200,0,400,400);
       add(a1);
       
       
       
                  
setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(0,50,200,250));
setVisible(true); 
   }
       
    public static void main(String[] args) {
           Project_one Frame = new Project_one();
    
           
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
