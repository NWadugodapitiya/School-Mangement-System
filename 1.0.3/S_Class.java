/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwear_01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import static java.lang.Thread.sleep;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ashen_NW
 */
public class S_Class extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
      String SID = S_Login.students_ID();
      String students_ID = null;
     
     
S_Class(){ 
setLayout(null);

        JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
           l1.setBounds(120,13,500,20);
           l1.setForeground(Color.WHITE);
       add(l1);
    Font Atl1 = new Font ("calibri",Font.PLAIN,20);
           l1.setFont(Atl1);
           
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
 
 
 JPanel p1 = new JPanel();
       p1.setBounds(60,10,600,30);
       p1.setBackground(Color.RED);
   add(p1);  
           
        
        
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("S_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("S_Class/Home icon.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
        
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("S_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);
     
    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("S_Class/Students.png")));
           a4.setBounds(10,180,38,38); 
       add(a4);
       
    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("S_Class/exam.png")));
           a5.setBounds(10,235,38,38); 
       add(a5);
       
    JLabel a6 = new JLabel();
           a6.setIcon(new ImageIcon(getClass().getResource("S_Class/S_Set.png")));
           a6.setBounds(10,290,38,38); 
       add(a6);
       
    JLabel ll = new JLabel ("Students");
           ll.setForeground(Color.WHITE);
           ll.setBounds(450,60,150,30);
       add(ll);
   Font Atell = new Font ("calibri",Font.PLAIN,25);
           ll.setFont(Atell);
        
    JLabel la = new JLabel ("60");
           la.setForeground(Color.WHITE);
           la.setBounds(550,60,150,30);
       add(la);
   Font Atela = new Font ("calibri",Font.PLAIN,25);
           la.setFont(Atela);        
       
    JLabel l2 = new JLabel ("Teacher Name   =");
           l2.setForeground(Color.WHITE);
           l2.setBounds(100,180,180,20);
       add(l2);
   Font Atel2 = new Font ("calibri",Font.PLAIN,20);
           l2.setFont(Atel2);
        
    JLabel lb = new JLabel ("");
           lb.setForeground(Color.YELLOW);
           lb.setBounds(290,180,300,20);
       add(lb);
   Font Atelb = new Font ("calibri",Font.PLAIN,20);
           lb.setFont(Atelb);
 
   JLabel l3 = new JLabel ("");
           l3.setForeground(Color.WHITE);
           l3.setBounds(100,70,180,60);
       add(l3);
   Font Atel3 = new Font ("calibri",Font.PLAIN,50);
           l3.setFont(Atel3);      
    
        
    JLabel lc = new JLabel ("");
           lc.setForeground(Color.YELLOW);
           lc.setBounds(160,70,180,60);
       add(lc);
   Font Atelc = new Font ("calibri",Font.PLAIN,50);
           lc.setFont(Atelc);     
        
    JLabel l4 = new JLabel ("Your Name        =");
           l4.setForeground(Color.WHITE);
           l4.setBounds(100,220,180,20);
       add(l4);
   Font Atel4 = new Font ("calibri",Font.PLAIN,20);
           l4.setFont(Atel4);      
    
    JLabel lc4 = new JLabel ("");
           lc4.setForeground(Color.YELLOW);
           lc4.setBounds(290,220,300,20);
       add(lc4);
   Font Atelc4 = new Font ("calibri",Font.PLAIN,20);
           lc4.setFont(Atelc4);      
       
    

 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(150,250,0,250));
    add(a);


a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
      JOptionPane.showMessageDialog(null, "Login Out success","Login Out ",JOptionPane.WARNING_MESSAGE);
      
     S_Login Frame = new S_Login();
     dispose();
           
      }
  });

a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Class Frame = new S_Class();
     dispose();
           
      }
  });

a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_T_Details Frame = new S_T_Details();
     dispose();
           
      }
  });

a4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_S_Details Frame = new S_S_Details();
     dispose();
           
      }
  });

a5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_E_Marks Frame = new S_E_Marks();
     dispose();
           
      }
  });

a6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_settings Frame = new S_settings();
     dispose();
           
      }
  });


    try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM Students WHERE Students_ID = "+Integer.parseInt(SID));
            
           
            while(rs.next()){
                String id= rs.getString("Students_ID");
                String na= rs.getString("Name");
                String gr= rs.getString("Grade");
                String cl= rs.getString("Class");
                
               
             
                lc4.setText(na);
                l3.setText(gr);
                lc.setText(cl);
            
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    
    try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM Teachers WHERE Grade = '"+l3.getText()+ "' && Class ='"+lc.getText()+"'");
            
           
            while(rs.next()){
                String id= rs.getString("Teachers_ID");
                String na= rs.getString("Name");
                
                
               
             
                lb.setText(na);
                
            
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    
  

setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(60,60,60,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_Class Frame = new S_Class();
   
        
           
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





