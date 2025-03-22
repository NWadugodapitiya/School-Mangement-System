/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwear_01;

import com.mysql.jdbc.Connection;
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

/**
 *
 * @author Ashen_NW
 */
public class S_E_Marks extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
S_E_Marks(){ 
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

    JLabel ll = new JLabel ("Your ID    =");
           ll.setForeground(Color.WHITE);
           ll.setBounds(340,60,150,30);
       add(ll);
   Font Atell = new Font ("calibri",Font.PLAIN,20);
           ll.setFont(Atell);
        
    JLabel ll1 = new JLabel ("");
           ll1.setForeground(Color.GREEN);
           ll1.setBounds(450,65,100,25);
       add(ll1);
   Font Atell1 = new Font ("calibri",Font.PLAIN,20);
           ll1.setFont(Atell1); 
           
           String nameMo = S_Login.students_ID();
           ll1.setText(nameMo); 
     
    JLabel l2 = new JLabel ("Sinhala");
           l2.setForeground(Color.WHITE);
           l2.setBounds(100,100,150,30);
       add(l2);
   Font Atel2 = new Font ("calibri",Font.PLAIN,20);
           l2.setFont(Atel2);   
                
    JLabel la2 = new JLabel ("100");
           la2.setForeground(Color.WHITE);
           la2.setBounds(230,102,50,25);
       add(la2);
   Font Atela2 = new Font ("calibri",Font.PLAIN,20);
           la2.setFont(Atela2);               
          
    JLabel l3 = new JLabel ("English");
           l3.setForeground(Color.WHITE);
           l3.setBounds(100,150,150,30);
       add(l3);
   Font Atel3 = new Font ("calibri",Font.PLAIN,20);
           l3.setFont(Atel3); 
        
    JLabel la3 = new JLabel ("100");
           la3.setForeground(Color.WHITE);
           la3.setBounds(230,152,50,25);
       add(la3);
   Font Atela3 = new Font ("calibri",Font.PLAIN,20);
           la3.setFont(Atela3);
         
    JLabel l4 = new JLabel ("ICT");
           l4.setForeground(Color.WHITE);
           l4.setBounds(100,200,150,30);
       add(l4);
   Font Atel4 = new Font ("calibri",Font.PLAIN,20);
           l4.setFont(Atel4); 
        
    JLabel la4 = new JLabel ("100");
           la4.setForeground(Color.WHITE);
           la4.setBounds(230,202,50,25);
       add(la4);
   Font Atela4 = new Font ("calibri",Font.PLAIN,20);
           la4.setFont(Atela4);
         
    JLabel l5 = new JLabel ("Mathematics");
           l5.setForeground(Color.WHITE);
           l5.setBounds(100,250,150,30);
       add(l5);
   Font Atel5 = new Font ("calibri",Font.PLAIN,20);
           l5.setFont(Atel5);  
        
    JLabel la5 = new JLabel ("100");
           la5.setForeground(Color.WHITE);
           la5.setBounds(230,252,50,25);
       add(la5);
   Font Atela5 = new Font ("calibri",Font.PLAIN,20);
           la5.setFont(Atela5);      
        
    JLabel l6 = new JLabel ("Science");
           l6.setForeground(Color.WHITE);
           l6.setBounds(100,300,150,30);
       add(l6);
   Font Atel6 = new Font ("calibri",Font.PLAIN,20);
           l6.setFont(Atel6); 
        
    JLabel la6 = new JLabel ("100");
           la6.setForeground(Color.WHITE);
           la6.setBounds(230,302,50,25);
       add(la6);
   Font Atela6 = new Font ("calibri",Font.PLAIN,20);
           la6.setFont(Atela5);        
        
    JLabel l7 = new JLabel ("Sum   =");
           l7.setForeground(Color.WHITE);
           l7.setBounds(150,350,150,30);
       add(l7);
   Font Atel7 = new Font ("calibri",Font.PLAIN,20);
           l7.setFont(Atel7); 
           
    JLabel la7 = new JLabel ("100");
           la7.setForeground(Color.WHITE);
           la7.setBounds(230,352,50,25);
       add(la7);
   Font Atela7 = new Font ("calibri",Font.PLAIN,20);
           la7.setFont(Atela7);          
        
    JLabel l8 = new JLabel ("Rank    =");
           l8.setForeground(Color.WHITE);
           l8.setBounds(360,100,150,30);
       add(l8);
   Font Atel8 = new Font ("calibri",Font.PLAIN,20);
           l8.setFont(Atel8);         
        
    JLabel la8 = new JLabel ("07");
           la8.setForeground(Color.WHITE);
           la8.setBounds(450,102,60,25);
       add(la8);
   Font Atela8 = new Font ("calibri",Font.PLAIN,20);
           la8.setFont(Atela8);   
           
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

JButton b4 = new JButton ("Print");
        b4.setBounds (500,370,80,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);    





 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(10,200,80,250));
    add(a);
    
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
    

a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
       
     S_Class Frame = new S_Class();
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


b1.addActionListener(new ActionListener(){
    public void actionPerformed (ActionEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM S_E_Marks1 WHERE Students_ID ="+ll1.getText());
            
            while(rs.next()){
                String si= rs.getString("Sinhala");
                String en= rs.getString("English");
                String ic= rs.getString("ICT");
                String ma= rs.getString("Mathematics");
                String sc= rs.getString("Science");
                String su= rs.getString("SUM");
                String ra= rs.getString("Rank");
                
                la2.setText(si);
                la3.setText(en);
                la4.setText(ic);
                la5.setText(ma);
                la6.setText(sc);
                la7.setText(su);
                la8.setText(ra);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});


b2.addActionListener(new ActionListener(){
    public void actionPerformed (ActionEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM S_E_Marks2 WHERE Students_ID ="+ll1.getText());
            
            while(rs.next()){
                String si= rs.getString("Sinhala");
                String en= rs.getString("English");
                String ic= rs.getString("ICT");
                String ma= rs.getString("Mathematics");
                String sc= rs.getString("Science");
                String su= rs.getString("SUM");
                String ra= rs.getString("Rank");
                
                la2.setText(si);
                la3.setText(en);
                la4.setText(ic);
                la5.setText(ma);
                la6.setText(sc);
                la7.setText(su);
                la8.setText(ra);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});

b3.addActionListener(new ActionListener(){
    public void actionPerformed (ActionEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM S_E_Marks3 WHERE Students_ID ="+ll1.getText());
            
            while(rs.next()){
                String si= rs.getString("Sinhala");
                String en= rs.getString("English");
                String ic= rs.getString("ICT");
                String ma= rs.getString("Mathematics");
                String sc= rs.getString("Science");
                String su= rs.getString("SUM");
                String ra= rs.getString("Rank");
                
                la2.setText(si);
                la3.setText(en);
                la4.setText(ic);
                la5.setText(ma);
                la6.setText(sc);
                la7.setText(su);
                la8.setText(ra);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
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
           S_E_Marks Frame = new S_E_Marks();
   
        
           
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

