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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class S_studentDetails extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
S_studentDetails(){ 
setLayout(null);

 JLabel ll = new JLabel ("Student ID");
        ll.setForeground(Color.BLACK);
        ll.setBounds(20,60,150,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,20);
        ll.setFont(Atell);
        
 JLabel l7 = new JLabel ("Name");
        l7.setForeground(Color.WHITE);
        l7.setBounds(230,50,150,30);
    add(l7);
Font Atel7 = new Font ("calibri",Font.PLAIN,20);
        l7.setFont(Atel7);  
                
        
 JLabel l2 = new JLabel ("Adress");
        l2.setForeground(Color.WHITE);
        l2.setBounds(230,100,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);        

 JLabel l3 = new JLabel ("Year");
        l3.setForeground(Color.WHITE);
        l3.setBounds(230,150,150,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3);
        
 JLabel l4 = new JLabel ("Month");
        l4.setForeground(Color.WHITE);
        l4.setBounds(365,150,150,30);
    add(l4);
Font Atel4 = new Font ("calibri",Font.PLAIN,20);
        l4.setFont(Atel4); 
        
 JLabel l5 = new JLabel ("Date");
        l5.setForeground(Color.WHITE);
        l5.setBounds(485,150,150,30);
    add(l5);
Font Atel5 = new Font ("calibri",Font.PLAIN,20);
        l5.setFont(Atel5);        
        
 JLabel l6 = new JLabel ("Telephone Numbers");
        l6.setForeground(Color.WHITE);
        l6.setBounds(230,210,180,30);
    add(l6);
Font Atel6 = new Font ("calibri",Font.PLAIN,20);
        l6.setFont(Atel6);        
        
 
 JLabel l8 = new JLabel ("Dtae Of Birth");
        l8.setForeground(Color.WHITE);
        l8.setBounds(230,138,180,10);
    add(l8);
Font Atel8 = new Font ("calibri",Font.PLAIN,12);
        l8.setFont(Atel8); 
        
 JLabel l9 = new JLabel ("");
        l9.setBounds(230,320,300,30);
    add(l9);
Font Atel9 = new Font ("calibri",Font.PLAIN,20);
        l9.setFont(Atel9);         
        
        
        
JTextField t1 = new JTextField();
           t1.setBounds (50,100,150,25);
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);
           
JTextField t7 = new JTextField();
           t7.setBounds (300,52,280,25);
       add(t7);
   Font Atet7 = new Font ("calibri",Font.PLAIN,20);
           t7.setFont(Atet7);            
           
JTextField t2 = new JTextField();
           t2.setBounds (300,102,280,25);
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);
           
JTextField t3 = new JTextField();
           t3.setBounds (298,152,60,25);
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3); 
           
JTextField t4 = new JTextField();
           t4.setBounds (425,152,50,25);
       add(t4);
   Font Atet4 = new Font ("calibri",Font.PLAIN,20);
           t4.setFont(Atet4);                   
        
JTextField t5 = new JTextField();
           t5.setBounds (530,152,50,25);
       add(t5);
   Font Atet5 = new Font ("calibri",Font.PLAIN,20);
           t5.setFont(Atet5);          
       
JTextField t6 = new JTextField();
           t6.setBounds (420,210,160,25);
       add(t6);
   Font Atet6 = new Font ("calibri",Font.PLAIN,20);
           t6.setFont(Atet6);
                   
           
JTextField t8 = new JTextField();
           t8.setBounds (420,260,160,25);
       add(t8);
   Font Atet8 = new Font ("calibri",Font.PLAIN,20);
           t8.setFont(Atet8);
                        
JTextField t9 = new JTextField();
           t9.setBounds (420,310,160,25);
       add(t9);
   Font Atet9 = new Font ("calibri",Font.PLAIN,20);
           t9.setFont(Atet9);             

      
JButton b1 = new JButton ("Save");
        b1.setBounds (450,350,100,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);           

JButton b2 = new JButton ("Back");
        b2.setBounds (15,350,100,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b2);      
           

b2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Grade Frame = new S_Grade();
     dispose();
           
      }
  });           

b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Project_one","root","");
            
            String query = "insert into student_save (Student_ID,Name,Adress,Year,Month,Date,Tel_one,Tel_two,Tel_three)" + " values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t7.getText());
            preparedStmt.setString(3, t2.getText());
            preparedStmt.setString(4, t3.getText());
            preparedStmt.setString(5, t4.getText());
            preparedStmt.setString(6, t5.getText());
            preparedStmt.setString(7, t6.getText());
            preparedStmt.setString(8, t8.getText());
            preparedStmt.setString(9, t9.getText());
            
           
            
 l9.setText("Successfully saved");
 l9.setForeground(Color.GREEN);
 preparedStmt.execute();
 
 con.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }
       
       }
       });


    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/max.png")));
           a1.setBounds(200,0,400,400);
       add(a1);   
   
setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(10,200,80,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_Grade Frame = new S_Grade();
           
           
              
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


