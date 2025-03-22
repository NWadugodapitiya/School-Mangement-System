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
import java.sql.ResultSet;
import java.sql.Statement;
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
public class T_Login extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    String xx;
T_Login(){ 
setLayout(null);

 JLabel ll = new JLabel ("Teachers ID");
        ll.setForeground(Color.WHITE);
        ll.setBounds(230,100,150,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,20);
        ll.setFont(Atell);
        
 JLabel l2 = new JLabel ("Password");
        l2.setForeground(Color.WHITE);
        l2.setBounds(230,150,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);
        
 JLabel l3 = new JLabel ("");
        l3.setForeground(Color.WHITE);
        l3.setBounds(250,230,300,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,17);
        l3.setFont(Atel3);        
        
       
JTextField t1 = new JTextField();
           t1.setBounds (350,102,200,25);
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);       
       
JPasswordField t2 = new JPasswordField();
               t2.setBounds (350,152,200,25);
           add(t2);
       Font Atet2 = new Font ("calibri",Font.PLAIN,20);
               t2.setFont(Atet2);   
        

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
          
JButton b5 = new JButton ("Login");
        b5.setBounds (240,350,100,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5); 

JButton b6 = new JButton ("Back");
        b6.setBounds (15,350,100,20);
        b6.setBackground(new Color(250,250,250,250));
    add(b6);
        
        
        
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

 
 //       b5.addMouseListener(new MouseAdapter() {
  //         public void mouseClicked(MouseEvent e) {
 //    T_Grade Frame = new T_Grade();
 //    dispose();
           
  //    }
//  });          

b6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Project Frame = new T_Project();
     dispose();
           
      }
  });    
        

 b5.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
       
       if(t1.getText().isEmpty() && t2.getText().isEmpty()){
        l3.setText("Type Item Teachers ID and Password");
       }
       else{    
       
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Project_one","root","");
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM t_registrasion WHERE Teachers_ID = '"+t1.getText()+ "' && Password ='"+t2.getText()+"'");
    
    
      if(rs.next()){
          
          
           
     
           
            xx = rs.getString("Teachers_ID");
           l3.setText("Login Success");
           System.out.println(xx);
           //dispose();
           
              JOptionPane.showMessageDialog(null, "Login Success","Login Ok",JOptionPane.WARNING_MESSAGE);
    
              
              
       }
       else{System.out.println(xx);
           l3.setText("Invalid Teachers ID or Password");
       }    
       }
     
       catch (Exception ew){
            System.out.println(ew);
       }
       }
   
   
   
   }
    });


  
     
    
          
b4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     System.exit(0);
     } 
    });
              
b3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     t1.setText("");
     t2.setText("");
     
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
setBackground(new Color(250,180,0,250));
setVisible(true); 
   }
       
    public static void main(String[] args) {
           T_Login Frame = new T_Login();
   
        
           
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


           
           