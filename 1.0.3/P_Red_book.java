/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwear_01;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import static java.lang.Thread.sleep;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ashen_NW
 */
public class P_Red_book extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
    
    
    
    
    
    
P_Red_book(){ 
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
           
    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("P_Class/Students.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);

    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("P_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);
       
    JLabel i = new JLabel();
           i.setIcon(new ImageIcon(getClass().getResource("T_Class/search icon.png")));
           i.setBounds(560,65,18,18); 
       add(i);
      
    JLabel ll = new JLabel ("Student ID");
           ll.setForeground(Color.WHITE);
           ll.setBounds(350,60,100,30);
       add(ll);
   Font Atell = new Font ("calibri",Font.PLAIN,20);
           ll.setFont(Atell);    

    JLabel la1 = new JLabel ("Name   =");
           la1.setForeground(Color.GREEN);
           la1.setBounds(100,120,100,30);
       add(la1);
   Font Atela1 = new Font ("calibri",Font.PLAIN,20);
           la1.setFont(Atela1);    
        
    JLabel la2 = new JLabel ("");
           la2.setForeground(Color.WHITE);
           la2.setBounds(180,120,500,30);
       add(la2);
   Font Atela2 = new Font ("calibri",Font.PLAIN,20);
           la2.setFont(Atela2);  
   
  
JTextField t1 = new JTextField();
           t1.setBounds (450,62,100,25);
           t1.setForeground(Color.WHITE);
           t1.setBackground(new Color(50,50,50,250));
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);  
          
 JTextArea t2 = new JTextArea();
           t2.setBounds (100,180,450,150);
           t2.setForeground(Color.WHITE);
           t2.setBackground(new Color(50,50,50,250));
       add(t2);
   Font Ftet2 = new Font ("calibri",Font.PLAIN,30);
           t2.setFont(Ftet2); 
     
   JButton b1 = new JButton ("Update");
           b1.setBounds (500,360,80,20);
           b1.setBackground(new Color(250,250,250,250));
       add(b1);    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(Color.GREEN);
    add(a);      
       
       
           
    JPanel p11 = new JPanel();
           p11.setBounds(60,10,600,30);
           p11.setBackground(Color.RED);
       add(p11);
      
       
       
 

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

 
            
        


a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Class Frame = new P_Class();
     dispose();
           
      }
  });
    
a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Class Frame = new P_Class();
     dispose();
           
      }
  });
 
 a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Teachers Frame = new P_Teachers();
     dispose();
           
      }
  });        
       
      
       
       
       
 

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

i.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM students WHERE Students_ID ="+t1.getText());
            
            while(rs.next()){
                String na= rs.getString("name");
                String add= rs.getString("Add1");
                
                la2.setText(na);
                t2.setText(add);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});

b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     
PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            java.sql.Statement stmt = con.createStatement();
            pst = (PreparedStatement) con.prepareStatement("update students set Add1=?");
            
            {
             
            pst.setString(1, t2.getText());
           
          


pst.executeUpdate();
JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);

            }
            stmt.close();
            con.close();
            
            
            }catch (Exception eo){
            System.out.println(eo);
            }

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
           P_Red_book Frame = new P_Red_book();
   
        
           
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
