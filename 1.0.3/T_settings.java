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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ashen_NW
 */
public class T_settings extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
      String TID = T_Login.teachers_ID();
           
     
T_settings(){ 
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
        
   JLabel  a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("T_Class/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("T_Class/Home icon.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
       
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("T_Class/Teachers.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);
       
    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("T_Class/Students.png")));
           a4.setBounds(10,180,38,38); 
       add(a4);
       
    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("T_Class/exam.png")));
           a5.setBounds(10,235,38,38); 
       add(a5);  
       
    JLabel a6 = new JLabel();
           a6.setIcon(new ImageIcon(getClass().getResource("T_Class/T_Set.png")));
           a6.setBounds(10,290,38,38); 
       add(a6); 

    JLabel lal = new JLabel ("Your ID            =");
           lal.setForeground(Color.WHITE);
           lal.setBounds(100,100,150,30);
       add(lal);
   Font Atelal = new Font ("calibri",Font.PLAIN,20);
           lal.setFont(Atelal);  
       
    JLabel la2 = new JLabel ("");
           la2.setForeground(Color.WHITE);
           la2.setBounds(250,100,100,30);
       add(la2);
   Font Atela2 = new Font ("calibri",Font.PLAIN,20);
           la2.setFont(Atela2);  
           
        
           
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
        
    JLabel lc3 = new JLabel ("");
           lc3.setForeground(Color.WHITE);
           lc3.setBounds(305,202,70,25);
       add(lc3);
   Font Atelc3 = new Font ("calibri",Font.PLAIN,20);
           lc3.setFont(Atelc3);      
        
    JLabel lc4 = new JLabel ("Class");
           lc4.setForeground(Color.WHITE);
           lc4.setBounds(335,200,150,30);
       add(lc4);
   Font Atelc4 = new Font ("calibri",Font.PLAIN,20);
           lc4.setFont(Atelc4);
        
    JLabel lc5 = new JLabel ("");
           lc5.setForeground(Color.WHITE);
           lc5.setBounds(380,202,70,25);
       add(lc5);
   Font Atelc5 = new Font ("calibri",Font.PLAIN,20);
           lc5.setFont(Atelc5);        
      
    
    JLabel ld1 = new JLabel ("Telephone Numbers =");
           ld1.setForeground(Color.WHITE);
           ld1.setBounds(100,250,500,30);
       add(ld1);
   Font Ateld1 = new Font ("calibri",Font.PLAIN,20);
           ld1.setFont(Ateld1);

    JLabel le1 = new JLabel ("Change Password      =");
           le1.setForeground(Color.WHITE);
           le1.setBounds(100,300,250,30);
       add(le1);
   Font Atele1 = new Font ("calibri",Font.PLAIN,20);
           le1.setFont(Atele1);  
           

JTextField td1 = new JTextField();
           td1.setBounds (317,252,200,23);
           td1.setForeground(Color.WHITE);
           td1.setBackground(new Color(50,50,50,250));
       add(td1);
   Font Atetd1 = new Font ("calibri",Font.PLAIN,20);
           td1.setFont(Atetd1);          
       
           
JPasswordField te1 = new JPasswordField();
               te1.setBounds (317,302,200,20);
               te1.setForeground(Color.WHITE);
               te1.setBackground(new Color(50,50,50,250));
           add(te1);
       Font Atete1 = new Font ("calibri",Font.PLAIN,20);
               te1.setFont(Atete1);            
           
JButton b1 = new JButton ("Update");
        b1.setBounds (500,360,80,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);    
    








 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(250,180,0,250));
    add(a);
    
JPanel p1 = new JPanel();
       p1.setBounds(60,10,600,30);
       p1.setBackground(Color.RED);
   add(p1);               
     

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
     T_Class Frame = new T_Class();
     dispose();
           
      }
  });

a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Class Frame = new T_Class();
     dispose();
           
      }
  });

a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Details Frame = new T_Details();
     dispose();
           
      }
  });

a4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_S_Details Frame = new T_S_Details();
     dispose();
           
      }
  });

a5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_E_Marks Frame = new T_E_Marks();
     dispose();
           
      }
  });

a6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_settings Frame = new T_settings();
     dispose();
           
      }
  });


 try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM Teachers WHERE Teachers_ID = "+Integer.parseInt(TID));
            
           
            while(rs.next()){
                String id= rs.getString("Teachers_ID");
                String na= rs.getString("Name");
                String gr= rs.getString("Grade");
                String cl= rs.getString("Class");
                String pa= rs.getString("Password");
                String tn= rs.getString("T_Number1");
               
             
                la2.setText(id);
                lb2.setText(na);
                lc3.setText(gr);
                lc5.setText(cl);
                te1.setText(pa);
                td1.setText(tn);
            
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    

    




b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     
PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            java.sql.Statement stmt = con.createStatement();
            pst = (PreparedStatement) con.prepareStatement("update Teachers set T_Number1=?,Password=?");
            
            {
             
            pst.setString(1, td1.getText());
            pst.setString(2, te1.getText());
          


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
           T_settings Frame = new T_settings();
   
        
           
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






