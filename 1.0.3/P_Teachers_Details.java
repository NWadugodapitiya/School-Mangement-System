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
import javax.swing.JTextField;

/**
 *
 * @author Ashen_NW
 */
public class P_Teachers_Details extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
P_Teachers_Details(){ 
setLayout(null);

  JLabel l1 = new JLabel ("Anuradhapura Walisinghe Harischandra College");
           l1.setBounds(120,13,500,20);
           l1.setForeground(Color.WHITE);
       add(l1);
    Font Atl1 = new Font ("calibri",Font.PLAIN,20);
           l1.setFont(Atl1);
           
    JPanel p11 = new JPanel();
           p11.setBounds(60,10,600,30);
           p11.setBackground(Color.RED);
       add(p11);


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
        
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("P_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    
a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Teachers Frame = new P_Teachers();
     dispose();
           
      }
  });
        
  JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("P_Class/Students.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
       
    
a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Class Frame = new P_Class();
     dispose();
           
      }
  });
 
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("P_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);

 a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Teachers Frame = new P_Teachers();
     dispose();
           
      }
  }); 
 
 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(250,180,0,250));
    add(a);
    
    
 JLabel ll = new JLabel ("Teachers ID");
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
        
        
        
        
        
 JLabel lb1 = new JLabel ("Name               =");
        lb1.setForeground(Color.WHITE);
        lb1.setBounds(100,150,200,30);
    add(lb1);
Font Atelb1 = new Font ("calibri",Font.PLAIN,20);
        lb1.setFont(Atelb1);    
        
 JLabel lb2 = new JLabel ("");
        lb2.setForeground(Color.WHITE);
        lb2.setBounds(250,150,500,30);
    add(lb2);
Font Atelb2 = new Font ("calibri",Font.PLAIN,20);
        lb2.setFont(Atelb2); 
        
        
        
 JLabel lc1 = new JLabel ("Class Custody  =");
        lc1.setForeground(Color.WHITE);
        lc1.setBounds(100,200,250,30);
    add(lc1);
Font Atelc1 = new Font ("calibri",Font.PLAIN,20);
        lc1.setFont(Atelc1);    
        
JLabel lc2 = new JLabel ("Grade");
        lc2.setForeground(Color.WHITE);
        lc2.setBounds(250,200,150,30);
    add(lc2);
Font Atelc2 = new Font ("calibri",Font.PLAIN,20);
        lc2.setFont(Atelc2);
        
        
 JLabel lc3 = new JLabel ("Class");
        lc3.setForeground(Color.WHITE);
        lc3.setBounds(405,200,150,30);
    add(lc3);
Font Atelc3 = new Font ("calibri",Font.PLAIN,20);
        lc3.setFont(Atelc3);      
        
 
 JTextField tc1 = new JTextField();
           tc1.setBounds (317,202,70,25);
           tc1.setForeground(Color.WHITE);
           tc1.setBackground(new Color(50,50,50,250));
       add(tc1);
   Font Atetc1 = new Font ("calibri",Font.PLAIN,20);
           tc1.setFont(Atetc1);          
       
JTextField tc2 = new JTextField();
           tc2.setBounds (460,202,70,25);
           tc2.setForeground(Color.WHITE);
           tc2.setBackground(new Color(50,50,50,250));
       add(tc2);
   Font Atetc2 = new Font ("calibri",Font.PLAIN,20);
           tc2.setFont(Atetc2);        
        
        

    
    
 JLabel ld1 = new JLabel ("Telephone Numbers =");
        ld1.setForeground(Color.WHITE);
        ld1.setBounds(100,250,500,30);
    add(ld1);
Font Ateld1 = new Font ("calibri",Font.PLAIN,20);
        ld1.setFont(Ateld1);        
        
 JLabel ld2 = new JLabel ("");
        ld2.setForeground(Color.WHITE);
        ld2.setBounds(312,252,120,23);
    add(ld2);
Font Ateld2 = new Font ("calibri",Font.PLAIN,20);
        ld2.setFont(Ateld2); 
        
 
 JLabel ld = new JLabel ("Subject             =");
        ld.setForeground(Color.WHITE);
        ld.setBounds(100,300,500,23);
    add(ld);
Font Ateld = new Font ("calibri",Font.PLAIN,20);
        ld.setFont(Ateld);         
        
 JLabel ld3 = new JLabel ("");
        ld3.setForeground(Color.WHITE);
        ld3.setBounds(250,300,120,23);
    add(ld3);
Font Ateld3 = new Font ("calibri",Font.PLAIN,20);
        ld3.setFont(Ateld3); 
        
        
    
    

        
        

               
               
       
           
JButton b1 = new JButton ("Clear");
        b1.setBounds (500,360,80,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
           
JButton b2 = new JButton ("Print");
        b2.setBounds (400,360,80,20);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);    
    
    
JButton b3 = new JButton ("Update");
        b3.setBounds (300,360,80,20);
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
b3.setBackground(new Color(250,250,0,250));
  }
});


b3.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b3.setBackground(new Color(250,250,250,250));
  }
});  
           
b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
      t1.setText("");
     lb2.setText("");
     tc1.setText("");
     tc2.setText("");
     ld2.setText("");
     ld3.setText("");
    

} 
    });           
           
i.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM teachers WHERE Teachers_ID ="+t1.getText());
            
            while(rs.next()){
                String na= rs.getString("name");
                String gd= rs.getString("Grade");
                String ag= rs.getString("Class");
                String gr= rs.getString("T_Number1");
                String sc= rs.getString("Subject");
                
                
                lb2.setText(na);
                tc1.setText(gd);
                tc2.setText(ag);
                ld2.setText(gr);
                ld3.setText(sc);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});

b3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     
PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            java.sql.Statement stmt = con.createStatement();
            pst = (PreparedStatement) con.prepareStatement("update teachers set Grade=?,Class=?");
            
            {
             
            pst.setString(1, tc1.getText());
            pst.setString(2, tc2.getText());
          


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
           P_Teachers_Details Frame = new P_Teachers_Details();
   
        
           
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












