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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Blocker
 */
class Teachers_Library_frame extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
String TID = Teachers_login.teachers_id();
      String teachers_ID = null;

    
Teachers_Library_frame(){ 
setLayout(null);



 JLabel tn = new JLabel ("");
        tn.setBounds(30,115,180,20);
        tn.setForeground(Color.darkGray);
    add(tn);
   Font teac = new Font ("Forte",Font.PLAIN,18);
        tn.setFont(teac);
        
        
 try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM teachers WHERE teachers_id = "+Integer.parseInt(TID));
            
           
            while(rs.next()){
                String id= rs.getString("teachers_id");
                String na= rs.getString("teachers_name");
                

                tn.setText(na);
                

                
            } 
            
        }
        catch(Exception ew){
            System.out.println(ew);
        }        
        
        
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------


 JLabel exit = new JLabel ("Exit");
        exit.setBounds(740,421,30,20);
        exit.setForeground(Color.BLACK);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit); 
        
 JLabel back = new JLabel ("Back");
        back.setBounds(740,390,55,20);
        back.setForeground(Color.BLACK);
    add(back);
   Font bac = new Font ("calibri",Font.BOLD,18);
        back.setFont(bac);        

//------------------------------------------------------------------------------------------------------------------------------

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Icons/exit.png")));      
       add(a2);
       
       
    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("Icons/pannnel.png")));      
       add(a1);     
        
//------------------------------------------------------------------------------------------------------------------------------
   

exit.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a2.setBounds(718,420,70,25);
exit.setForeground(Color.WHITE);
  }
});

exit.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a2.setBounds(0,0,0,0);
exit.setForeground(Color.BLACK);
  }
});       
       

back.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a1.setBounds(720,388,70,25);

  }
});

back.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a1.setBounds(0,0,0,0);

  }
}); 
//------------------------------------------------------------------------------------------------------------------------------

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });  

back.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   Teachers_frame Frame = new Teachers_frame();
     dispose();
     
  } 
    }); 
//------------------------------------------------------------------------------------------------------------------------------

//===================================================================================================================

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
//-------------------------------------------------------------------------------------------------

JButton b5 = new JButton ("Print");
        b5.setBounds (620,390,80,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5); 
    
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


//--------------------------------------------------------------------------------------
JFrame frame = new JFrame();
JTable table = new JTable();



      
 Object[] columns = {"No","Book ID","Name","Date taken","Date given","days"};
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);   

        
        
table.setModel(model);   


	JScrollPane pane = new JScrollPane(table);
 	pane.setBounds(200,100,550,250);
	frame.setLayout(null);
    add(pane);


    
	Object[] row = new Object[6];
        
        
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM teachers_library WHERE teachers_id = "+Integer.parseInt(TID));
            
            while(rs.next()){
             
                
                row[0] = rs.getString("No");
                row[1] = rs.getString("Book_ID");
                row[2] = rs.getString("Name");
                row[3] = rs.getString("Date_taken");
                row[4] = rs.getString("Date_given");
                row[5] = rs.getString("days");

                
                
                model.addRow(row);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }

        





//--------------------------------------------------------------------------------------   
















//--------------------------------------------------------------------------------------   

    JLabel w = new JLabel();
           w.setIcon(new ImageIcon(getClass().getResource("T_Home/TL.png")));
           w.setBounds(0,0,800,450);
       add(w); 
       
    JLabel w1 = new JLabel();
           w1.setIcon(new ImageIcon(getClass().getResource("T_Home/4.jpg")));
           w1.setBounds(51,30,78,78);
       add(w1);    
       
setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(250,250,250,0));
setVisible(true); 
   }

 public static void main(String[] args) {
    Teachers_Library_frame Frame = new Teachers_Library_frame();
       
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




