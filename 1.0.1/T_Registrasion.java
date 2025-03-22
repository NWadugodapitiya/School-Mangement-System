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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class T_Registrasion extends JFrame{
static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;    
    
    
T_Registrasion(){ 
setLayout(null);

 JLabel ll = new JLabel ("Teachers ID");
        ll.setForeground(Color.WHITE);
        ll.setBounds(230,50,150,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,20);
        ll.setFont(Atell);
        
 JLabel l2 = new JLabel ("Name");
        l2.setForeground(Color.WHITE);
        l2.setBounds(230,100,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);
        
 JLabel l3 = new JLabel ("Grade");
        l3.setForeground(Color.WHITE);
        l3.setBounds(230,150,150,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3); 
        
 JLabel l4 = new JLabel ("Class");
        l4.setForeground(Color.WHITE);
        l4.setBounds(420,150,150,30);
    add(l4);
Font Atel4 = new Font ("calibri",Font.PLAIN,20);
        l4.setFont(Atel4);
        
 JLabel l5 = new JLabel ("Password");
        l5.setForeground(Color.WHITE);
        l5.setBounds(230,200,150,30);
    add(l5);
Font Atel5 = new Font ("calibri",Font.PLAIN,20);
        l5.setFont(Atel5); 
        
 JLabel l6 = new JLabel ("Conform Password");
        l6.setForeground(Color.WHITE);
        l6.setBounds(230,250,180,30);
    add(l6);
Font Atel6 = new Font ("calibri",Font.PLAIN,20);
        l6.setFont(Atel6);        
        
        

JTextField t1 = new JTextField();
           t1.setBounds (350,52,200,25);
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);          
       
JTextField t2 = new JTextField();
           t2.setBounds (350,102,200,25);
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);          
       
JTextField t3 = new JTextField();
           t3.setBounds (315,152,70,25);
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3);          
       
JTextField t4 = new JTextField();
           t4.setBounds (480,152,70,25);
       add(t4);
   Font Atet4 = new Font ("calibri",Font.PLAIN,20);
           t4.setFont(Atet4);       
       
JPasswordField t5 = new JPasswordField();
               t5.setBounds (400,202,150,25);
           add(t5);
       Font Atet5 = new Font ("calibri",Font.PLAIN,20);
               t5.setFont(Atet5);       
       
JPasswordField t6 = new JPasswordField();
               t6.setBounds (400,252,150,25);
           add(t6);
       Font Atet6 = new Font ("calibri",Font.PLAIN,20);
               t6.setFont(Atet6);       




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
        
JButton b3 = new JButton ("Clear");
        b3.setBounds (360,350,100,20);
        b3.setBackground(new Color(250,250,250,250));
    add(b3);
   
JButton b4 = new JButton ("Exit");
        b4.setBounds (480,350,100,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);
          
JButton b5 = new JButton ("Register");
        b5.setBounds (240,350,100,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5);        
        
JButton b6 = new JButton ("Back");
        b6.setBounds (15,350,100,20);
        b6.setBackground(new Color(250,250,250,250));
    add(b6);        
        


 
b5.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Project_one","root","");
            
            String query = "insert into t_registrasion (Teachers_ID,Name,Grade,Class,Password,Conform_Password)" + " values (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t2.getText());
            preparedStmt.setString(3, t3.getText());
            preparedStmt.setString(4, t4.getText());
            preparedStmt.setString(5, t5.getText());
            preparedStmt.setString(6, t6.getText());
            

preparedStmt.execute();
JOptionPane.showMessageDialog(null, "Registrasion Success","Registrasion Ok",JOptionPane.WARNING_MESSAGE);
 
 



 con.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
    
       
           
       }
       
       }
       });










b3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     t1.setText("");
     t2.setText("");
     t3.setText("");
     t4.setText("");
     t5.setText("");
     t6.setText("");
     
  } 
    });




        
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
      
        
    b5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Login Frame = new T_Login();
     dispose();
           
      }
  });         
       
    
        b6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Project Frame = new T_Project();
     dispose();
           
      }
  });    
        

   
 
b4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     System.exit(0);
  } 
    });
              


 t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t2.requestFocus(true);
   }
  }
}); 
   
   t2.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t3.requestFocus(true);
   }
  }
}); 
   
   t3.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t4.requestFocus(true);
   }
  }
});
   
t4.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t5.requestFocus(true);
   }
  }
}); 

t5.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t6.requestFocus(true);
   }
  }
});

t6.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
b5.requestFocus(true);
   }
  }
});


    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/prolite.png")));
           a1.setBounds(200,0,400,400);
       add(a1);   

setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(0,180,10,250));
setVisible(true); 
   }
       
    public static void main(String[] args) {
           T_Registrasion Frame = new T_Registrasion();
    
           
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

