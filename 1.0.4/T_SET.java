/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Blocker
 */
class T_SET extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
String TID = Teachers_login.teachers_id();
      String teachers_ID = null;
    
T_SET(){ 
setLayout(null);



 JLabel lal = new JLabel ("Teachers ID                 =");
        lal.setForeground(Color.BLACK);
        lal.setBounds(230,100,250,30);
    add(lal);
Font Atelal = new Font ("calibri",Font.PLAIN,20);
        lal.setFont(Atelal);  
        
        
 JLabel la2 = new JLabel ("");
        la2.setForeground(Color.BLACK);
        la2.setBounds(450,100,100,30);
    add(la2);
Font Atela2 = new Font ("calibri",Font.PLAIN,20);
        la2.setFont(Atela2);  
        
        
       
        
        
 JLabel lb1 = new JLabel ("Full Name                   =");
        lb1.setForeground(Color.BLACK);
        lb1.setBounds(230,150,200,30);
    add(lb1);
Font Atelb1 = new Font ("calibri",Font.PLAIN,20);
        lb1.setFont(Atelb1);    
        
 JLabel lb2 = new JLabel ("");
        lb2.setForeground(Color.BLACK);
        lb2.setBounds(450,150,500,30);
    add(lb2);
Font Atelb2 = new Font ("calibri",Font.PLAIN,20);
        lb2.setFont(Atelb2); 
        
        
        
 JLabel lc1 = new JLabel ("Grade and Class         =");
        lc1.setForeground(Color.BLACK);
        lc1.setBounds(230,200,250,30);
    add(lc1);
Font Atelc1 = new Font ("calibri",Font.PLAIN,20);
        lc1.setFont(Atelc1);    
        
 JLabel lc2 = new JLabel ("");
        lc2.setForeground(Color.BLACK);
        lc2.setBounds(450,200,150,25);
    add(lc2);
Font Atelc2 = new Font ("calibri",Font.PLAIN,20);
        lc2.setFont(Atelc2);
        
 JLabel lc3 = new JLabel ("-");
        lc3.setForeground(Color.BLACK);
        lc3.setBounds(478,198,150,25);
    add(lc3);
Font Atelc3 = new Font ("calibri",Font.PLAIN,20);
        lc3.setFont(Atelc3);        
        
        
 JLabel t1 = new JLabel ("");;
        t1.setBounds (490,200,70,25);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(250,250,250,100));
    add(t1);
Font Atet1 = new Font ("calibri",Font.PLAIN,20);
        t1.setFont(Atet1);          
       
  
    
    
 JLabel ld1 = new JLabel ("Telephone Numbers  =");
        ld1.setForeground(Color.BLACK);
        ld1.setBounds(230,250,500,30);
    add(ld1);
Font Ateld1 = new Font ("calibri",Font.PLAIN,20);
        ld1.setFont(Ateld1);        
        
    
    
JTextField t3 = new JTextField();
           t3.setBounds (450,252,120,23);
           t3.setForeground(Color.BLACK);
           t3.setBackground(new Color(250,250,250,250));
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3);          
       
JTextField t4 = new JTextField();
           t4.setBounds (592,252,120,23);
           t4.setForeground(Color.BLACK);
           t4.setBackground(new Color(250,250,250,250));
       add(t4);
   Font Atet4 = new Font ("calibri",Font.PLAIN,20);
           t4.setFont(Atet4);
        
        
        
 JLabel le1 = new JLabel ("Change Password       =");
        le1.setForeground(Color.BLACK);
        le1.setBounds(230,300,250,30);
    add(le1);
Font Atele1 = new Font ("calibri",Font.PLAIN,20);
        le1.setFont(Atele1);     
    
JPasswordField t5 = new JPasswordField();
               t5.setBounds (450,302,263,23);
               t5.setForeground(Color.BLACK);
               t5.setBackground(new Color(250,250,250,250));
           add(t5);
       Font Atet5 = new Font ("calibri",Font.PLAIN,20);
               t5.setFont(Atet5); 
               
 JLabel lud = new JLabel ("Last Update  =");
        lud.setForeground(Color.BLACK);
        lud.setBounds(560,350,150,16);
    add(lud);
Font Atelud = new Font ("calibri",Font.PLAIN,15);
        lud.setFont(Atelud);        
        
        
 JLabel lu = new JLabel ("");;
        lu.setBounds (650,350,250,16);
        lu.setForeground(Color.BLACK);
        lu.setBackground(new Color(250,250,250,100));
    add(lu);
Font Atelu = new Font ("calibri",Font.PLAIN,15);
        lu.setFont(Atelu);                

        
 JLabel lb = new JLabel ("Your Backup Code  =");
        lb.setForeground(Color.BLACK);
        lb.setBounds(560,50,150,16);
    add(lb);
Font Atelb = new Font ("calibri",Font.PLAIN,15);
        lb.setFont(Atelb);        
        
        
 JLabel lub = new JLabel ("");;
        lub.setBounds (690,48,100,21);
        lub.setForeground(Color.BLACK);
        lub.setBackground(new Color(250,250,250,100));
    add(lub);
Font Atelub = new Font ("calibri",Font.PLAIN,20);
        lub.setFont(Atelub);         
        
       
        
JButton b1 = new JButton ("UPDATE");
        b1.setBounds (580,400,120,26);
        b1.setForeground(Color.BLACK);
        b1.setBackground(new Color(250,250,250,100));
    add(b1);
Font Ateb1 = new Font ("calibri",Font.BOLD,20);
        b1.setFont(Ateb1);     
 
   

  
    
    
     
    
   
/*     
 JLabel b1 = new JLabel ("UPDATE");;
        b1.setBounds (608,384,70,21);
        b1.setForeground(Color.BLACK);
        b1.setBackground(new Color(250,250,250,100));
    add(b1);
Font Ateb1 = new Font ("calibri",Font.BOLD,20);
        b1.setFont(Ateb1);         
        
        
    JLabel wu = new JLabel();
           wu.setIcon(new ImageIcon(getClass().getResource("T_Home/update1.png"))); 
       add(wu);      
    
    
b1.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
b1.setForeground(Color.WHITE);
wu.setBounds(600,380,85,26);
  }
});


b1.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
b1.setForeground(Color.BLACK);
wu.setBounds(0,0,0,0);
  }
}); 


*/  


















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
        se.setForeground(Color.BLACK);
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
           w.setIcon(new ImageIcon(getClass().getResource("T_Home/T5.png")));
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
                String pa= rs.getString("password");
                String bc= rs.getString("Backup_Code");
                String ud= rs.getString("update_date");
                String gr= rs.getString("Grade");
                String cl= rs.getString("Class");
                String tt= rs.getString("Teachers_T1");
                String nt= rs.getString("Teachers_T2");
             
                la2.setText(id);
                lb2.setText(na);
                t5.setText(pa);
                lub.setText(bc);
                lu.setText(ud);
                lc2.setText(gr);
                t1.setText(cl);
                t3.setText(tt);
                t4.setText(nt);
               
               
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
           
//=====================================================================================================================
 

b1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     
PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();

          
            pst = (PreparedStatement) con.prepareStatement("update teachers set password=?,Teachers_T1=?,Teachers_T2=?,update_date=? WHERE teachers_id ="+la2.getText());
            
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            
            {
             
            pst.setString(1, t5.getText());
            pst.setString(2, t3.getText());
            pst.setString(3, t4.getText());
            pst.setString(4, formattedDate);
            
            
            

pst.executeUpdate();
JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);

            }
            st.close();
            con.close();
            
            
            }catch (Exception eo){
            System.out.println(eo);
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
    T_SET Frame = new T_SET();
       
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



