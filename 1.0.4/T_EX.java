/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Blocker
 */
class T_EX extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
String TID = Teachers_login.teachers_id();
      String teachers_ID = null;
    
T_EX(){ 
setLayout(null);








    
 JLabel ll = new JLabel ("Student ID");
        ll.setForeground(Color.BLACK);
        ll.setBounds(500,40,100,30);
    add(ll);
Font Atell = new Font ("calibri",Font.PLAIN,20);
        ll.setFont(Atell);    
        
JTextField t1 = new JTextField();
           t1.setBounds (600,42,120,25);
           t1.setForeground(Color.BLACK);
           t1.setBackground(new Color(250,250,250,250));
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);  
           
           
    JLabel i = new JLabel();
           i.setIcon(new ImageIcon(getClass().getResource("T_Home/FIND.png")));
           i.setBounds(735,45,40,20); 
       add(i);    
    

i.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
i.setIcon(new ImageIcon(getClass().getResource("T_Home/FIND B.png")));
       
  }
});

i.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
i.setIcon(new ImageIcon(getClass().getResource("T_Home/FIND.png")));
       
  }
});        
       
       
 JLabel l2 = new JLabel ("Sinhala");
        l2.setForeground(Color.BLACK);
        l2.setBounds(250,100,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);  
        
JTextField t2 = new JTextField();
           t2.setBounds (400,102,50,25);
           t2.setForeground(Color.BLACK);
           t2.setBackground(new Color(250,250,250,250));
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);
           
           
           
           
 JLabel l3 = new JLabel ("English");
        l3.setForeground(Color.BLACK);
        l3.setBounds(250,150,150,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3);  
        
JTextField t3 = new JTextField();
           t3.setBounds (400,152,50,25);
           t3.setForeground(Color.BLACK);
           t3.setBackground(new Color(250,250,250,250));
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3);         
           
           
           
           
 JLabel l4 = new JLabel ("ICT");
        l4.setForeground(Color.BLACK);
        l4.setBounds(250,200,150,30);
    add(l4);
Font Atel4 = new Font ("calibri",Font.PLAIN,20);
        l4.setFont(Atel4);  
        
JTextField t4 = new JTextField();
           t4.setBounds (400,202,50,25);
           t4.setForeground(Color.BLACK);
           t4.setBackground(new Color(250,250,250,250));
       add(t4);
   Font Atet4 = new Font ("calibri",Font.PLAIN,20);
           t4.setFont(Atet4);
           
           
           
           
 JLabel l5 = new JLabel ("Mathematics");
        l5.setForeground(Color.BLACK);
        l5.setBounds(250,250,150,30);
    add(l5);
Font Atel5 = new Font ("calibri",Font.PLAIN,20);
        l5.setFont(Atel5);  
        
JTextField t5 = new JTextField();
           t5.setBounds (400,252,50,25);
           t5.setForeground(Color.BLACK);
           t5.setBackground(new Color(250,250,250,250));
       add(t5);
   Font Atet5 = new Font ("calibri",Font.PLAIN,20);
           t5.setFont(Atet5);
           
           
           
 JLabel l6 = new JLabel ("Science");
        l6.setForeground(Color.BLACK);
        l6.setBounds(250,300,150,30);
    add(l6);
Font Atel6 = new Font ("calibri",Font.PLAIN,20);
        l6.setFont(Atel6);  
        
JTextField t6 = new JTextField();
           t6.setBounds (400,302,50,25);
           t6.setForeground(Color.BLACK);
           t6.setBackground(new Color(250,250,250,250));
       add(t6);
   Font Atet6 = new Font ("calibri",Font.PLAIN,20);
           t6.setFont(Atet6);
           

           
           
           
           
 //  SUM          
           
           
JTextField t7 = new JTextField();
           t7.setBounds (400,352,50,25);
           t7.setForeground(Color.BLACK);
           t7.setBackground(new Color(250,250,250,250));
       add(t7);
   Font Atet7 = new Font ("calibri",Font.PLAIN,20);
           t7.setFont(Atet7);  

//  NAME           
           
           
    JTextField t8= new JTextField ();
           t8.setBounds (510,100,280,25);
           t8.setForeground(Color.BLACK);
           t8.setBackground(new Color(250,250,250,250));
       add(t8);
   Font Atet8 = new Font ("calibri",Font.PLAIN,20);
           t8.setFont(Atet8);           
           
    
    
JButton b1 = new JButton ("I");
        b1.setBounds (660,160,60,25);
        b1.setBackground(new Color(250,250,250,50));
    add(b1);           
Font Ateb1 = new Font ("calibri",Font.PLAIN,20);
        b1.setFont(Ateb1); 
        
JButton b2 = new JButton ("II");
        b2.setBounds (660,210,60,25);
        b2.setBackground(new Color(250,250,250,50));
    add(b2);           
Font Ateb2 = new Font ("calibri",Font.PLAIN,20);
        b2.setFont(Ateb2); 
        
JButton b3 = new JButton ("III");
        b3.setBounds (660,260,60,25);
        b3.setBackground(new Color(250,250,250,50));
    add(b3);           
Font Ateb3 = new Font ("calibri",Font.PLAIN,20);
        b3.setFont(Ateb3);        

JButton b4 = new JButton ("Clear");
        b4.setBounds (560,410,80,20);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);           

        
JButton b5 = new JButton ("Print");
        b5.setBounds (650,410,80,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5); 
    
JButton b6 = new JButton ("SUM");
        b6.setBounds (250,353,80,20);
        b6.setBackground(new Color(250,250,250,250));
    add(b6);
          

    
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

     
     
 
b4.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     t1.setText("");
     t2.setText("");
     t3.setText("");
     t4.setText("");
     t5.setText("");
     t6.setText("");
     t7.setText("");
     t8.setText("");
     

} 
    });              
    
    
 
















 JLabel tn = new JLabel ("");
        tn.setBounds(30,115,180,20);
        tn.setForeground(Color.darkGray);
    add(tn);
   Font teac = new Font ("Forte",Font.PLAIN,18);
        tn.setFont(teac);


//------------------------------------------------------------------------------------------------------------------------------



 JLabel exit = new JLabel ("Exit");
        exit.setBounds(760,410,30,20);
        exit.setForeground(Color.BLACK);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit); 
        
       

        
    JLabel lo = new JLabel();
           lo.setIcon(new ImageIcon(getClass().getResource("T_Home/log out.png")));
           lo.setBounds(25,410,25,20);
       add(lo);        
       
       
 JLabel log = new JLabel ("Logout");
        log.setForeground(Color.BLACK);
    add(log);
   Font logt = new Font ("calibri",Font.BOLD,18);
        log.setFont(logt);   
       
       
        
//------------------------------------------------------------------------------------------------------------------------------

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Icons/exit.png")));      
       add(a2);
       

//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
 

exit.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a2.setBounds(750,408,70,25);
exit.setForeground(Color.WHITE);
  }
});

exit.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a2.setBounds(0,0,0,0);
exit.setForeground(Color.BLACK);
  }
});       
       

lo.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
        log.setBounds(55,410,100,20);

  }
});

lo.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
        log.setBounds(0,0,0,0);

  }
}); 
//------------------------------------------------------------------------------------------------------------------------------

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });  

lo.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
   
      JOptionPane.showMessageDialog(null, "Logout success","Logout ok ",JOptionPane.WARNING_MESSAGE);            
               
   Teachers_login Frame = new Teachers_login();
     dispose();
     
  } 
    }); 


 JLabel se = new JLabel ("Settings");
        se.setBounds(30,333,80,25);
        se.setForeground(Color.WHITE);
    add(se);
   Font seac = new Font ("calibri",Font.BOLD,24);
        se.setFont(seac);

 JLabel ex = new JLabel ("Exam");
        ex.setBounds(30,289,60,25);
        ex.setForeground(Color.BLACK);
    add(ex);
   Font exac = new Font ("calibri",Font.BOLD,24);
        ex.setFont(exac);

        
 JLabel sd = new JLabel ("Students");
        sd.setBounds(30,243,100,25);
        sd.setForeground(Color.WHITE);
    add(sd);
   Font sdac = new Font ("calibri",Font.BOLD,24);
        sd.setFont(sdac);


 JLabel td = new JLabel ("Teachers");
        td.setBounds(30,200,100,25);
        td.setForeground(Color.WHITE);
    add(td);
   Font tdac = new Font ("calibri",Font.BOLD,24);
        td.setFont(tdac);


 JLabel ho = new JLabel ("Home");
        ho.setBounds(30,155,60,25);
        ho.setForeground(Color.WHITE);
    add(ho);
   Font hoac = new Font ("calibri",Font.BOLD,24);
        ho.setFont(hoac);

        
se.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
        se.setBounds(30,333,100,28);       
   Font seac = new Font ("calibri",Font.BOLD,28);
        se.setFont(seac);
       
se.setForeground(Color.BLACK);

  }
});

se.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
        se.setBounds(30,333,80,25);       
   Font seac = new Font ("calibri",Font.BOLD,24);
        se.setFont(seac);
se.setForeground(Color.WHITE);
  }
});           
        
         
        
sd.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
        sd.setBounds(30,243,120,28);      
   Font seac = new Font ("calibri",Font.BOLD,28);
        sd.setFont(seac);
       
sd.setForeground(Color.BLACK);
  }
});

sd.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
        sd.setBounds(30,243,100,25);       
   Font seac = new Font ("calibri",Font.BOLD,24);
        sd.setFont(seac);
sd.setForeground(Color.WHITE);
  }
});        
        
td.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
        td.setBounds(30,200,120,28);      
   Font seac = new Font ("calibri",Font.BOLD,28);
        td.setFont(seac);
       
td.setForeground(Color.BLACK);
  }
});

td.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
        td.setBounds(30,200,100,25);       
   Font seac = new Font ("calibri",Font.BOLD,24);
        td.setFont(seac);
td.setForeground(Color.WHITE);
  }
});   

ho.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
        ho.setBounds(30,155,80,28);      
   Font seac = new Font ("calibri",Font.BOLD,28);
        ho.setFont(seac);
       
ho.setForeground(Color.BLACK);
  }
});

ho.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
        ho.setBounds(30,155,60,25);       
   Font seac = new Font ("calibri",Font.BOLD,24);
        ho.setFont(seac);
ho.setForeground(Color.WHITE);
  }
});
            
se.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
   T_SET Frame = new T_SET();
     dispose();
     
  } 
    });         

ex.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
   T_EX Frame = new T_EX();
     dispose();
     
  } 
    });
        
sd.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
   T_S Frame = new T_S();
     dispose();
     
  } 
    });

td.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
   T_TEA Frame = new T_TEA();
     dispose();
     
  } 
    });

ho.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
   Teachers_frame Frame = new Teachers_frame();
     dispose();
     
  } 
    });










    JLabel w = new JLabel();
           w.setIcon(new ImageIcon(getClass().getResource("T_Home/T4.png")));
           w.setBounds(0,0,800,450);
       add(w);
       
    JLabel w1 = new JLabel();
           w1.setIcon(new ImageIcon(getClass().getResource("T_Home/4.jpg")));
           w1.setBounds(51,30,78,78);
       add(w1); 
       
       
 try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM teachers WHERE teachers_id = "+Integer.parseInt(TID));
            
           
            while(rs.next()){
                String id= rs.getString("teachers_id");
                String na= rs.getString("teachers_name");
                String gr= rs.getString("Grade");
                String cl= rs.getString("Class");
                
               
             
                tn.setText(na);

            
         
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
           

 



b6.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){

  int v1 = Integer.parseInt(t2.getText());
  int v2 = Integer.parseInt(t3.getText());
  int v3 = Integer.parseInt(t4.getText());
  int v4 = Integer.parseInt(t5.getText());
  int v5 = Integer.parseInt(t6.getText());
  
  
  int tot = v1+v2+v3+v4+v5;
 
           t7.setText(""+tot);
            
  }
 });



i.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM students WHERE Students_ID ="+t1.getText());
            
            while(rs.next()){
                String na= rs.getString("Name");
              
               
                t8.setText(na);
                
                
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
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            
            String query = "insert into Exam_Marks1 (Students_ID,Name,Sinhala,English,ICT,Mathematics,Science,SUM,Rank,Date_Time)" + " values (?,?,?,?,?,?,?,?,?,? )";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
              
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t8.getText());
            preparedStmt.setString(3, t2.getText());
            preparedStmt.setString(4, t3.getText());
            preparedStmt.setString(5, t4.getText());
            preparedStmt.setString(6, t5.getText());
            preparedStmt.setString(7, t6.getText());
            preparedStmt.setString(8, t7.getText());
            preparedStmt.setString(9, "");
            preparedStmt.setString(10, formattedDate);
     
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
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            
            String query = "insert into Exam_Marks2 (Students_ID,Name,Sinhala,English,ICT,Mathematics,Science,SUM,Rank,Date_Time)" + " values (?,?,?,?,?,?,?,?,?,? )";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
              
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t8.getText());
            preparedStmt.setString(3, t2.getText());
            preparedStmt.setString(4, t3.getText());
            preparedStmt.setString(5, t4.getText());
            preparedStmt.setString(6, t5.getText());
            preparedStmt.setString(7, t6.getText());
            preparedStmt.setString(8, t7.getText());
            preparedStmt.setString(9, "");
            preparedStmt.setString(10, formattedDate);
     
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
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            
            String query = "insert into Exam_Marks3 (Students_ID,Name,Sinhala,English,ICT,Mathematics,Science,SUM,Rank,Date_Time)" + " values (?,?,?,?,?,?,?,?,?,? )";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
              
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t8.getText());
            preparedStmt.setString(3, t2.getText());
            preparedStmt.setString(4, t3.getText());
            preparedStmt.setString(5, t4.getText());
            preparedStmt.setString(6, t5.getText());
            preparedStmt.setString(7, t6.getText());
            preparedStmt.setString(8, t7.getText());
            preparedStmt.setString(9, "");
            preparedStmt.setString(10, formattedDate);
     
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



       
setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(250,250,250,0));
setVisible(true); 
   }

 public static void main(String[] args) {
    T_EX Frame = new T_EX();
       
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



