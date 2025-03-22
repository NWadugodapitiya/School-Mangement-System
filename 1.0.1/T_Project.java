
 
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

/**
 *
 * @author Ashen
 */
public class T_Project extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
T_Project(){ 
setLayout(null);

JButton b1 = new JButton ("Register");
        b1.setBounds (20,60,130,40);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
Font Ateb1 = new Font ("calibri",Font.PLAIN,25);
        b1.setFont(Ateb1);
        
JButton b2 = new JButton ("Login");
        b2.setBounds (20,130,130,40);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);
Font Ateb2 = new Font ("calibri",Font.PLAIN,25);
        b2.setFont(Ateb2);        
        
JButton b3 = new JButton ("Back");
        b3.setBounds (15,350,100,20);
        b3.setBackground(new Color(250,250,250,250));
    add(b3);        
        
        b1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Registrasion Frame = new T_Registrasion();
     dispose();
           
      }
  });       
        
        
        b2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Login Frame = new T_Login();
     dispose();
           
      }
  });       
     
        b3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Project_one Frame = new Project_one();
     dispose();
           
      }
  });       
        

    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/pro.png")));
           a1.setBounds(200,0,400,400);
       add(a1);   

setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(250,0,0,250));
setVisible(true); 
   }
       
    public static void main(String[] args) {
           T_Project Frame = new T_Project();
    
           
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

