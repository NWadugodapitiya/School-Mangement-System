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
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Blocker
 */
class Teachers_frame extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
String TID = Teachers_login.teachers_id();
      String teachers_ID = null;

    
Teachers_frame(){ 
setLayout(null);

//=================================================================================================================
 JLabel l1 = new JLabel ("+ LIBRARY");
        l1.setForeground(Color.BLACK);
        l1.setBounds(280,190,200,23);
    add(l1);
   Font l1t = new Font ("calibri",Font.BOLD,22);
        l1.setFont(l1t); 

 JLabel l2 = new JLabel ("Teachers to access the library");
        l2.setForeground(Color.BLACK);
        l2.setBounds(295,210,220,20);
    add(l2);
   Font l2t = new Font ("Bahnschrift",Font.PLAIN,14);
        l2.setFont(l2t); 
//==============================================================================

 JLabel o1 = new JLabel ("+ PRINCIPAL");
        o1.setForeground(Color.BLACK);
        o1.setBounds(280,275,200,23);
    add(o1);
   Font o1t = new Font ("calibri",Font.BOLD,22);
        o1.setFont(o1t); 

 JLabel o2 = new JLabel ("Send a message to the principal");
        o2.setForeground(Color.BLACK);
        o2.setBounds(295,292,220,20);
    add(o2);
   Font o2t = new Font ("Bahnschrift",Font.PLAIN,14);
        o2.setFont(o2t); 
//==============================================================================

 JLabel y1 = new JLabel ("+ ALL LESSONS");
        y1.setForeground(Color.BLACK);
        y1.setBounds(280,360,200,23);
    add(y1);
   Font y1t = new Font ("calibri",Font.BOLD,22);
        y1.setFont(o1t); 

 JLabel y2 = new JLabel ("View and monitor all lessons");
        y2.setForeground(Color.BLACK);
        y2.setBounds(295,375,220,20);
    add(y2);
   Font y2t = new Font ("Bahnschrift",Font.PLAIN,14);
        y2.setFont(y2t); 
//==============================================================================





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
        td.setForeground(Color.WHITE);
    add(td);
   Font tdac = new Font ("calibri",Font.BOLD,24);
        td.setFont(tdac);


 JLabel ho = new JLabel ("Home");
        ho.setBounds(30,155,60,25);
        ho.setForeground(Color.BLACK);
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












 JLabel tn = new JLabel ("");
        tn.setBounds(30,115,180,20);
        tn.setForeground(Color.darkGray);
    add(tn);
   Font teac = new Font ("Forte",Font.PLAIN,18);
        tn.setFont(teac);
        
             
        
        
 JLabel g1 = new JLabel ("");
        g1.setBounds(230,20,100,70);
        g1.setForeground(Color.BLACK);
    add(g1);
   Font g1ac = new Font ("calibri",Font.BOLD,70);
        g1.setFont(g1ac);    
        
 JLabel cc = new JLabel ("-");
        cc.setBounds(300,15,100,70);
        cc.setForeground(Color.BLACK);
    add(cc);
   Font ccac = new Font ("calibri",Font.BOLD,70);
        cc.setFont(ccac);        
        

 JLabel c1 = new JLabel ("");
        c1.setBounds(320,20,100,70);
        c1.setForeground(Color.BLACK);
    add(c1);
   Font c1ac = new Font ("calibri",Font.BOLD,70);
        c1.setFont(c1ac); 
        
 JLabel ns = new JLabel ("Number of Students");
        ns.setBounds(595,42,200,17);
        ns.setForeground(Color.BLACK);
    add(ns);
   Font nsac = new Font ("calibri",Font.PLAIN,13);
        ns.setFont(nsac);
        
 JLabel nss = new JLabel ("");
        nss.setBounds(710,42,80,17);
        nss.setForeground(Color.BLACK);
    add(nss);
   Font nssac = new Font ("calibri",Font.BOLD,19);
        nss.setFont(nssac);        
        
        
 JLabel cll = new JLabel ("Lessons Completed");
        cll.setBounds(595,72,200,17);
        cll.setForeground(Color.BLACK);
    add(cll);
   Font cllac = new Font ("calibri",Font.PLAIN,13);
        cll.setFont(cllac);
        
 JLabel clc = new JLabel ("23/50");
        clc.setBounds(705,72,80,17);
        clc.setForeground(Color.BLACK);
    add(clc);
   Font clcac = new Font ("calibri",Font.BOLD,15);
        clc.setFont(clcac);           
        
        
 JLabel Hll = new JLabel ("Last Test");
        Hll.setBounds(595,102,200,17);
        Hll.setForeground(Color.BLACK);
    add(Hll);
   Font Hllac = new Font ("calibri",Font.PLAIN,13);
        Hll.setFont(Hllac);
        
 JLabel Hlc = new JLabel ("III");
        Hlc.setBounds(705,102,80,17);
        Hlc.setForeground(Color.BLACK);
    add(Hlc);
   Font Hlcac = new Font ("calibri",Font.BOLD,15);
        Hlc.setFont(Hlcac);           
        
        
        
        
        
        



    JLabel q2 = new JLabel();
           q2.setIcon(new ImageIcon(getClass().getResource("T_Home/12.png")));
           q2.setBounds(210,12,325,83);
       add(q2);
    
       
       
       
       

    JLabel tf = new JLabel();
           tf.setIcon(new ImageIcon(getClass().getResource("T_Home/3_All.png")));
           tf.setBounds(220,195,55,55);
       add(tf);        
       
       
    JLabel we = new JLabel();
           we.setIcon(new ImageIcon(getClass().getResource("T_Home/400.png")));
//           we.setIcon(new ImageIcon(getClass().getResource("T_Home/Lib_001.png")));
           we.setBounds(207,185,316,70);
       add(we);   
       
       
       
       
       
        
we.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
we.setIcon(new ImageIcon(getClass().getResource("T_Home/Lib_002.png")));    

  }
});

we.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
we.setIcon(new ImageIcon(getClass().getResource("T_Home/400.png")));      

  }
}); 


we.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
   Teachers_Library_frame Frame = new Teachers_Library_frame();
     dispose();
     
  } 
    });



//]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]



    JLabel pf = new JLabel();
           pf.setIcon(new ImageIcon(getClass().getResource("T_Home/2_All.png")));
           pf.setBounds(220,280,55,55);
       add(pf);  

       
       
       
       
    JLabel df = new JLabel();
//           df.setIcon(new ImageIcon(getClass().getResource("T_Home/pn_001.png")));
           df.setIcon(new ImageIcon(getClass().getResource("T_Home/400.png")));
           df.setBounds(207,270,316,70);
       add(df);   
       
        
df.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
df.setIcon(new ImageIcon(getClass().getResource("T_Home/pn_002.png")));    

  }
});

df.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
df.setIcon(new ImageIcon(getClass().getResource("T_Home/400.png")));   

  }
}); 



    JLabel pS = new JLabel();
           pS.setIcon(new ImageIcon(getClass().getResource("T_Home/1_All.png")));
           pS.setBounds(220,360,55,55);
       add(pS);         
       
       
df.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
    principal_message Frame = new principal_message();
     dispose();
     
  } 
    });       
       
       
//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
       
    JLabel vf = new JLabel();
//           vf.setIcon(new ImageIcon(getClass().getResource("T_Home/3_001.png")));
           vf.setIcon(new ImageIcon(getClass().getResource("T_Home/400.png")));
           vf.setBounds(207,355,316,70);
       add(vf);

       
vf.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) { 
vf.setIcon(new ImageIcon(getClass().getResource("T_Home/3_002.png")));    

  }
});

vf.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
vf.setIcon(new ImageIcon(getClass().getResource("T_Home/400.png")));      

  }
});        
       
       
       
 vf.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
              
    All_lessons Frame = new All_lessons();
     dispose();
     
  } 
    });          
     
       
 









       
       
//Group 1

    JLabel etS = new JLabel();
           etS.setIcon(new ImageIcon(getClass().getResource("T_Home/Group 1.png")));
           etS.setBounds(587,30,157,102);
       add(etS); 
       
       
       

       
 
//==================================================================================================
     
       
// JLabel st = new JLabel();
   JLabel stS = new JLabel();
 JScrollPane scrol = new JScrollPane(stS); 

        
        
 stS.setIcon(new ImageIcon(getClass().getResource("T_Home/students.png")));       
        
        
scrol.setBounds(558,190,185,250);



        add(scrol);




//    students 

        

//    students 

        
 
    
      
       
//================================================================================================       
       
 JLabel K1 = new JLabel ("1.");
        K1.setBounds(10,20,20,17);
        K1.setForeground(Color.BLACK);
   scrol.add(K1);
   Font K1c = new Font ("calibri",Font.BOLD,15);
        K1.setFont(K1c);
       
 JLabel K2 = new JLabel ("2.");
        K2.setBounds(563,260,20,17);
        K2.setForeground(Color.BLACK);
    scrol.add(K2);
   Font K2c = new Font ("calibri",Font.BOLD,15);
        K2.setFont(K2c);     
        
 JLabel K3 = new JLabel ("3.");
        K3.setBounds(563,305,20,17);
        K3.setForeground(Color.BLACK);
    scrol.add(K3);
   Font K3c = new Font ("calibri",Font.BOLD,15);
        K3.setFont(K3c);   
        
 JLabel K4 = new JLabel ("4.");
        K4.setBounds(563,355,20,17);
        K4.setForeground(Color.BLACK);
    scrol.add(K4);
   Font K4c = new Font ("calibri",Font.BOLD,15);
        K4.setFont(K4c);     
        
 JLabel K5 = new JLabel ("5.");
        K5.setBounds(563,402,20,17);
        K5.setForeground(Color.BLACK);
    scrol.add(K5);
   Font K5c = new Font ("calibri",Font.BOLD,15);
        K5.setFont(K5c);       
       
//================================================================================================       
        
 JLabel K01 = new JLabel ("James Walker");
        K01.setBounds(623,210,200,17);
        K01.setForeground(Color.BLACK);
    scrol.add(K01);
   Font K01c = new Font ("calibri",Font.PLAIN,15);
        K01.setFont(K01c);
       
 JLabel K02 = new JLabel ("Velma Clemons");
        K02.setBounds(623,260,200,17);
        K02.setForeground(Color.BLACK);
    scrol.add(K02);
   Font K02c = new Font ("calibri",Font.PLAIN,15);
        K02.setFont(K02c);     
        
 JLabel K03 = new JLabel ("Kibo Underwood");
        K03.setBounds(623,305,200,17);
        K03.setForeground(Color.BLACK);
    scrol.add(K03);
   Font K03c = new Font ("calibri",Font.PLAIN,15);
        K03.setFont(K03c);   
        
 JLabel K04 = new JLabel ("Louis Mcgee");
        K04.setBounds(623,355,200,17);
        K04.setForeground(Color.BLACK);
    scrol.add(K04);
   Font K04c = new Font ("calibri",Font.PLAIN,15);
        K04.setFont(K04c);     
        
 JLabel K05 = new JLabel ("Phyllis Paul");
        K05.setBounds(623,402,200,17);
        K05.setForeground(Color.BLACK);
    scrol.add(K05);
   Font K05c = new Font ("calibri",Font.PLAIN,15);
        K05.setFont(K05c);          
        
        
//================================================================================================          
       
 JLabel sr = new JLabel ("Students Rank");
        sr.setBounds(582,155,180,20);
        sr.setForeground(Color.BLACK);
    add(sr);
   Font srac = new Font ("calibri",Font.BOLD,19);
        sr.setFont(srac);       
       
// Polygon 2

    JLabel pt = new JLabel();
           pt.setIcon(new ImageIcon(getClass().getResource("T_Home/Polygon 2.png")));
           pt.setBounds(560,155,20,20);
       add(pt);         
        
       
       
 JLabel cd = new JLabel ("Class Details");
        cd.setBounds(585,5,180,20);
        cd.setForeground(Color.BLACK);
    add(cd);
   Font cdac = new Font ("calibri",Font.BOLD,19);
        cd.setFont(cdac); 
        
        
// Polygon 2

    JLabel ptS = new JLabel();
           ptS.setIcon(new ImageIcon(getClass().getResource("T_Home/Polygon 2.png")));
           ptS.setBounds(565,5,20,20);
       add(ptS);         
        
   
        
       
    JLabel w = new JLabel();
           w.setIcon(new ImageIcon(getClass().getResource("T_Home/T1.png")));
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
                g1.setText(gr);
                c1.setText(cl);
            
         
                
            }
            
            
            
            
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    

try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            
            Statement tr = (Statement) con.createStatement ();
            ResultSet er = tr.executeQuery("SELECT Count(Students_id) FROM students WHERE Grade = '"+g1.getText()+ "' && Class ='"+c1.getText()+"'");
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            nss.setText(String.valueOf(i));
            con.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }    
    

//--------------------------------------------------------------------------------------   


lo.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
   
      JOptionPane.showMessageDialog(null, "Logout success","Logout ok ",JOptionPane.WARNING_MESSAGE);            
               
   Teachers_login Frame = new Teachers_login();
     dispose();
     

Connection con;       
   try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            
            String query = "insert into T_login_infor (teachers_id,password,User,Date_time,type)" + " values (?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            
            
            preparedStmt.setString(1, (TID));
            preparedStmt.setString(2, (""));
            preparedStmt.setString(3,("Teachers"));
            preparedStmt.setString(4, formattedDate);
            preparedStmt.setString(5, ("Logout"));
            
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
//--------------------------------------------------------------------------------------   

              
       
setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(250,250,250,0));
setVisible(true); 
   }

 public static void main(String[] args) {
    Teachers_frame Frame = new Teachers_frame();
       
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



