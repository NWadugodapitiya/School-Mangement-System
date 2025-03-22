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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class S_Details_T extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
S_Details_T(){ 
setLayout(null);

 JLabel l1 = new JLabel ("Name");
        l1.setForeground(Color.WHITE);
        l1.setBounds(230,180,150,30);
    add(l1);
Font Atel1 = new Font ("calibri",Font.PLAIN,20);
        l1.setFont(Atel1);
        
 JLabel l2 = new JLabel ("Tel");
        l2.setForeground(Color.WHITE);
        l2.setBounds(230,230,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);  
        
        
        

JTextField t1 = new JTextField();
           t1.setBounds (300,182,280,25);
       add(t1);
   Font Atet1 = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atet1);
           
JTextField t2 = new JTextField();
           t2.setBounds (300,232,280,25);
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);  
           
JComboBox dura = new JComboBox();
dura.setBounds(280,52,250,25);
dura.addItem("Select Subject");
dura.addItem("Sinhala");
dura.addItem("English");
dura.addItem("ICT");
dura.addItem("Mathematics");
dura.addItem("Science");
add(dura);           
           
           
JButton b1 = new JButton ("Back");
        b1.setBounds (15,350,100,20);
        b1.setBackground(new Color(250,250,250,250));
   add(b1);   


b1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Grade Frame = new S_Grade();
     dispose();
           
      }
  });         
 
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/lite.png")));
           a1.setBounds(200,0,400,400);
       add(a1);  
          
setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(50,150,80,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_Details_T Frame = new S_Details_T();
   
        
           
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


