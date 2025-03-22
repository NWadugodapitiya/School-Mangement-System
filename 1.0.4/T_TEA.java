/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Blocker
 */
class T_TEA extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
String TID = Teachers_login.teachers_id();
      String teachers_ID = null;
    
T_TEA(){ 
setLayout(null);


    JLabel ll = new JLabel ("Teacher Name              =");
           ll.setForeground(Color.BLACK);
           ll.setBounds(230,170,250,30);
       add(ll);
   Font Atell = new Font ("calibri",Font.PLAIN,20);
           ll.setFont(Atell);
           
    JLabel ll1 = new JLabel ("");
           ll1.setForeground(Color.BLACK);
           ll1.setBounds(450,172,350,25);
       add(ll1);
   Font Atell1 = new Font ("calibri",Font.PLAIN,20);
           ll1.setFont(Atell);       
        
    JLabel l2 = new JLabel ("Telephone Numbers    =");
           l2.setForeground(Color.BLACK);
           l2.setBounds(230,230,250,30);
       add(l2);
   Font Atel2 = new Font ("calibri",Font.PLAIN,20);
           l2.setFont(Atel2);
           
    JLabel l21 = new JLabel ("");
           l21.setForeground(Color.BLACK);
           l21.setBounds(450,232,150,25);
       add(l21);
   Font Atel21 = new Font ("calibri",Font.PLAIN,20);
           l21.setFont(Atel21);  
           
    JLabel l22 = new JLabel ("");
           l22.setForeground(Color.BLACK);
           l22.setBounds(565,232,150,25);
       add(l22);
   Font Atel22 = new Font ("calibri",Font.PLAIN,20);
           l22.setFont(Atel22);       
           
           
           
    

JComboBox dura = new JComboBox();
          dura.setBounds(600,50,150,25);
          dura.setForeground(Color.BLACK);
          dura.setBackground(new Color(250,250,250,150));
          dura.addItem("Select");
      add(dura);    






dura.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM teachers WHERE Subject = '"+(String)dura.getSelectedItem()+"'");
            
        
            while(rs.next()){
                String na= rs.getString("teachers_name");
                String ag= rs.getString("Teachers_T1");
                String ds= rs.getString("Teachers_T2");
                
                ll1.setText(na);
                l21.setText(ag);
                l22.setText(ds);
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});


try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("select Subject from teachers");
            
            while(rs.next()){

                dura.addItem(rs.getString("Subject"));
               
                
            
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }    
    










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
        ex.setForeground(Color.WHITE);
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
        td.setForeground(Color.BLACK);
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
        
ex.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
        ex.setBounds(30,289,80,28);       
   Font seac = new Font ("calibri",Font.BOLD,28);
        ex.setFont(seac);
       
ex.setForeground(Color.BLACK);
  }
});

ex.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
        ex.setBounds(30,289,60,25);      
   Font seac = new Font ("calibri",Font.BOLD,24);
        ex.setFont(seac);
ex.setForeground(Color.WHITE);
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
           w.setIcon(new ImageIcon(getClass().getResource("T_Home/T2.png")));
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
           
       
setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(250,250,250,0));
setVisible(true); 
   }

 public static void main(String[] args) {
    T_TEA Frame = new T_TEA();
       
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



