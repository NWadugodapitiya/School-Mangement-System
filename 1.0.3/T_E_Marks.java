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
import java.sql.SQLException;
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
public class T_E_Marks extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     
     
T_E_Marks(){ 
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

    JLabel i1 = new JLabel();
           i1.setIcon(new ImageIcon(getClass().getResource("T_Class/search icon.png")));
           i1.setBounds(560,65,18,18); 
       add(i1); 
       
//JButton i1 = new JButton ("");
//        i1.setBounds (560,65,18,18);
//        i1.setBackground(new Color(250,250,250,250));
//    add(i1);

 
    JLabel ll = new JLabel ("Student ID");
           ll.setForeground(Color.WHITE);
           ll.setBounds(350,60,100,30);
       add(ll);
   Font Atell = new Font ("calibri",Font.PLAIN,20);
           ll.setFont(Atell);   
          
    JLabel l2 = new JLabel ("Sinhala");
           l2.setForeground(Color.WHITE);
           l2.setBounds(100,100,150,30);
       add(l2);
   Font Atel2 = new Font ("calibri",Font.PLAIN,20);
           l2.setFont(Atel2);
           
    JLabel l3 = new JLabel ("English");
           l3.setForeground(Color.WHITE);
           l3.setBounds(100,150,150,30);
       add(l3);
   Font Atel3 = new Font ("calibri",Font.PLAIN,20);
           l3.setFont(Atel3);  
          
    JLabel l4 = new JLabel ("ICT");
           l4.setForeground(Color.WHITE);
           l4.setBounds(100,200,150,30);
       add(l4);
   Font Atel4 = new Font ("calibri",Font.PLAIN,20);
           l4.setFont(Atel4);         
           
    JLabel l5 = new JLabel ("Mathematics");
           l5.setForeground(Color.WHITE);
           l5.setBounds(100,250,150,30);
       add(l5);
   Font Atel5 = new Font ("calibri",Font.PLAIN,20);
           l5.setFont(Atel5);          
           
    JLabel l6 = new JLabel ("Science");
           l6.setForeground(Color.WHITE);
           l6.setBounds(100,300,150,30);
       add(l6);
   Font Atel6 = new Font ("calibri",Font.PLAIN,20);
           l6.setFont(Atel6);       
           
           
           
           
           
           
        
        
JTextField tll = new JTextField();
           tll.setBounds (450,62,100,25);
           tll.setForeground(Color.WHITE);
           tll.setBackground(new Color(50,50,50,250));
       add(tll);
   Font Atetll = new Font ("calibri",Font.PLAIN,20);
           tll.setFont(Atetll);         
       
JTextField t1n = new JTextField();
           t1n.setBounds (350,100,200,25);
           t1n.setForeground(Color.WHITE);
           t1n.setBackground(new Color(50,50,50,250));
       add(t1n);
   Font Atet1n = new Font ("calibri",Font.PLAIN,20);
           t1n.setFont(Atet1n);        
                 
       
JTextField t12 = new JTextField();
           t12.setBounds (230,102,50,25);
           t12.setForeground(Color.WHITE);
           t12.setBackground(new Color(50,50,50,250));
       add(t12);
   Font Atet12 = new Font ("calibri",Font.PLAIN,20);
           t12.setFont(Atet12);       
       
JTextField tl3 = new JTextField();
           tl3.setBounds (230,152,50,25);
           tl3.setForeground(Color.WHITE);
           tl3.setBackground(new Color(50,50,50,250));
       add(tl3);
   Font Atetl3 = new Font ("calibri",Font.PLAIN,20);
           tl3.setFont(Atetl3);          
       
JTextField tl4 = new JTextField();
           tl4.setBounds (230,202,50,25);
           tl4.setForeground(Color.WHITE);
           tl4.setBackground(new Color(50,50,50,250));
       add(tl4);
   Font Atetl4 = new Font ("calibri",Font.PLAIN,20);
           tl4.setFont(Atetl4);  
           
JTextField tl5 = new JTextField();
           tl5.setBounds (230,252,50,25);
           tl5.setForeground(Color.WHITE);
           tl5.setBackground(new Color(50,50,50,250));
       add(tl5);
   Font Atetl5 = new Font ("calibri",Font.PLAIN,20);
           tl5.setFont(Atetl5);           
          
JTextField tl6 = new JTextField();
           tl6.setBounds (230,302,50,25);
           tl6.setForeground(Color.WHITE);
           tl6.setBackground(new Color(50,50,50,250));
       add(tl6);
   Font Atetl6 = new Font ("calibri",Font.PLAIN,20);
           tl6.setFont(Atetl6);       
       
JTextField tot1 = new JTextField();
           tot1.setBounds (230,352,50,25);
           tot1.setForeground(Color.WHITE);
           tot1.setBackground(new Color(50,50,50,250));
       add(tot1);
   Font Atetot1 = new Font ("calibri",Font.PLAIN,20);
           tot1.setFont(Atetot1);        
       
       
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

JButton b4 = new JButton ("Clear");
        b4.setBounds (500,370,80,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);           

        
JButton b5 = new JButton ("Print");
        b5.setBounds (410,370,80,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5); 
    
JButton b6 = new JButton ("SUM");
        b6.setBounds (100,352,80,20);
        b6.setBackground(new Color(250,250,250,250));
    add(b6);
                 
       
       
       
       
       
       
       
       
       
       



 JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,400);
        a.setBackground(new Color(10,200,80,250));
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

    
b5.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b5.setBackground(new Color(250,250,0,250));
  }
});


b5.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b5.setBackground(new Color(250,250,250,250));
  }
});  

b6.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b6.setBackground(new Color(250,250,0,250));
  }
});


b6.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b6.setBackground(new Color(250,250,250,250));
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


b4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     tll.setText("");
     t1n.setText("");
     t12.setText("");
     tl3.setText("");
     tl4.setText("");
     tl5.setText("");
     tl6.setText("");
     tot1.setText("");
 
} 
    }); 




b6.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){

  int v1 = Integer.parseInt(t12.getText());
  int v2 = Integer.parseInt(tl3.getText());
  int v3 = Integer.parseInt(tl4.getText());
  int v4 = Integer.parseInt(tl5.getText());
  int v5 = Integer.parseInt(tl6.getText());
  
  
  int tot = v1+v2+v3+v4+v5;
 
           tot1.setText(""+tot);
            
  }
 });



i1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM students WHERE Students_ID ="+tll.getText());
            
            while(rs.next()){
                String na= rs.getString("Name");
              
               
                t1n.setText(na);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});





b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
     
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            String query = "insert into Exam_Marks1 (Students_ID,Name,Sinhala,English,ICT,Mathematics,Science,SUM,Rank)" + " values (?,?,?,?,?,?,?,?,? )";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            preparedStmt.setString(1, tll.getText());
            preparedStmt.setString(2, t1n.getText());
            preparedStmt.setString(3, t12.getText());
            preparedStmt.setString(4, tl3.getText());
            preparedStmt.setString(5, tl4.getText());
            preparedStmt.setString(6, tl5.getText());
            preparedStmt.setString(7, tl6.getText());
            preparedStmt.setString(8, tot1.getText());
            preparedStmt.setString(9, "");
     
    JOptionPane.showMessageDialog(null, "1 Exam Marks Saved success","Saved success ",JOptionPane.WARNING_MESSAGE);

        
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


b2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
     
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            String query = "insert into Exam_Marks2 (Students_ID,Name,Sinhala,English,ICT,Mathematics,Science,SUM,Rank)" + " values (?,?,?,?,?,?,?,?,? )";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            preparedStmt.setString(1, tll.getText());
            preparedStmt.setString(2, t1n.getText());
            preparedStmt.setString(3, t12.getText());
            preparedStmt.setString(4, tl3.getText());
            preparedStmt.setString(5, tl4.getText());
            preparedStmt.setString(6, tl5.getText());
            preparedStmt.setString(7, tl6.getText());
            preparedStmt.setString(8, tot1.getText());
            preparedStmt.setString(9, "");
     
    JOptionPane.showMessageDialog(null, "2 Exam Marks Saved success","Saved success ",JOptionPane.WARNING_MESSAGE);

        
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

b3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
     
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            String query = "insert into Exam_Marks3 (Students_ID,Name,Sinhala,English,ICT,Mathematics,Science,SUM,Rank)" + " values (?,?,?,?,?,?,?,?,? )";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            preparedStmt.setString(1, tll.getText());
            preparedStmt.setString(2, t1n.getText());
            preparedStmt.setString(3, t12.getText());
            preparedStmt.setString(4, tl3.getText());
            preparedStmt.setString(5, tl4.getText());
            preparedStmt.setString(6, tl5.getText());
            preparedStmt.setString(7, tl6.getText());
            preparedStmt.setString(8, tot1.getText());
            preparedStmt.setString(9, "");
     
    JOptionPane.showMessageDialog(null, "3 Exam Marks Saved success","Saved success ",JOptionPane.WARNING_MESSAGE);

        
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


setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(60,60,60,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           T_E_Marks Frame = new T_E_Marks();
   
        
           
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





