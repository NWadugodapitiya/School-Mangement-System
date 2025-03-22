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
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Blocker
 */
class FORGET_PASSWORD extends JFrame{
static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
FORGET_PASSWORD(){ 
setLayout(null);



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

//================================================================================================================       
    JLabel dz = new JLabel();
           dz.setIcon(new ImageIcon(getClass().getResource("Icons/Menu.png")));
           dz.setBounds(10,20,30,20);
       add(dz);    
 
    JLabel dh = new JLabel();
           dh.setIcon(new ImageIcon(getClass().getResource("Icons/Home.png")));
           dh.setBounds(10,150,30,30);
       add(dh);  
       
    JLabel dt = new JLabel();
           dt.setIcon(new ImageIcon(getClass().getResource("Icons/Teachers.png")));
           dt.setBounds(10,200,30,30);
       add(dt);   
       
    JLabel ds = new JLabel();
           ds.setIcon(new ImageIcon(getClass().getResource("Icons/Students.png")));
           ds.setBounds(10,250,30,30);
       add(ds);
       
    JLabel dL = new JLabel();
           dL.setIcon(new ImageIcon(getClass().getResource("Icons/Library.png")));
           dL.setBounds(10,300,30,30);
       add(dL);   
 
    JLabel dC = new JLabel();
           dC.setIcon(new ImageIcon(getClass().getResource("Icons/Creater.png")));
           dC.setBounds(10,400,30,30);
       add(dC);   
       
 JLabel D = new JLabel ("");
        D.setForeground(Color.BLACK);
    add(D);
   Font DDD = new Font ("calibri",Font.BOLD,15);
        D.setFont(DDD);  


 
       
       
       
       
dC.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dC.setIcon(new ImageIcon(getClass().getResource("Icons/S_Creater.png")));

D.setText("Creater");
D.setBounds(55,406,120,20);
  }
});

dC.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dC.setIcon(new ImageIcon(getClass().getResource("Icons/Creater.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});        
       
dL.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dL.setIcon(new ImageIcon(getClass().getResource("Icons/S_Library.png")));

D.setText("Library Login");
D.setBounds(55,306,120,20);
  }
});

dL.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dL.setIcon(new ImageIcon(getClass().getResource("Icons/Library.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});      

ds.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
ds.setIcon(new ImageIcon(getClass().getResource("Icons/S_Students.png")));

D.setText("Students Login");
D.setBounds(55,256,120,20);
  }
});

ds.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
ds.setIcon(new ImageIcon(getClass().getResource("Icons/Students.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});

dt.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dt.setIcon(new ImageIcon(getClass().getResource("Icons/S_Teachers.png")));

D.setText("Teachers Login");
D.setBounds(55,206,120,20);
  }
});

dt.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dt.setIcon(new ImageIcon(getClass().getResource("Icons/Teachers.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});
 
dh.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dh.setIcon(new ImageIcon(getClass().getResource("Icons/S_Home.png")));

D.setText("Home");
D.setBounds(55,156,80,20);
  }
});

dh.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dh.setIcon(new ImageIcon(getClass().getResource("Icons/Home.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});       

dz.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
dz.setIcon(new ImageIcon(getClass().getResource("Icons/S_Menu.png")));

D.setText("Menu");
D.setBounds(55,21,80,20);
  }
});

dz.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
dz.setIcon(new ImageIcon(getClass().getResource("Icons/Menu.png")));

D.setText("");
D.setBounds(0,0,0,0);
  }
});  


 dC.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Creater Frame = new Creater();
     dispose();
           
      }
  });  

 dL.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Library_login Frame = new Library_login();
     dispose();
           
      }
  });       

 ds.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Students_login Frame = new Students_login();
     dispose();
           
      }
  });

 dt.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Teachers_login Frame = new Teachers_login();
     dispose();
           
      }
  }); 
 
 dh.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  });      
             
 dz.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Contacts Frame = new Contacts();
     dispose();
           
      }
  });      
       
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
   Teachers_login Frame = new Teachers_login();
     dispose();
     
  } 
    }); 
//------------------------------------------------------------------------------------------------------------------------------
    JLabel ll = new JLabel ("FORGET PASSWORD");
           ll.setForeground(Color.BLACK);
           ll.setBounds(450,40,300,35);
       add(ll);
   Font Atell = new Font ("calibri",Font.BOLD,27);
           ll.setFont(Atell);
  
//------------------------------------------------------------------------------------------------------------------------------
    JTextField t1 = new JTextField();
               t1.setBounds (450,102,250,30);
               t1.setForeground(Color.BLACK);
               t1.setBackground(new Color(210,210,210,250));
           add(t1);
       Font Atetl = new Font ("calibri",Font.BOLD,20);
               t1.setFont(Atetl);
               
    JLabel QQ = new JLabel();
           QQ.setIcon(new ImageIcon(getClass().getResource("T_Frame/mm.png")));
           QQ.setBounds(6,2,20,20);
    t1.add(QQ);               
               
    JLabel l3 = new JLabel ("Your ID");
           l3.setForeground(new Color(0,0,0));
           l3.setBounds(30,6,300,20);
       t1.add(l3);
   Font Atel3 = new Font ("calibri",Font.PLAIN,17);
           l3.setFont(Atel3);    
           
 
 
 t1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
           l3.setBounds(0,0,0,0);
           QQ.setBounds(0,0,0,0); 
     } 
    });                


//------------------------------------------------------------------------------------------------------------------------------
    JTextField t2 = new JTextField();
               t2.setBounds (450,145,250,30);
               t2.setForeground(Color.BLACK);
               t2.setBackground(new Color(210,210,210,250));
           add(t2);
       Font Atet2 = new Font ("calibri",Font.BOLD,20);
               t2.setFont(Atet2);
               
    JLabel nn = new JLabel();
           nn.setIcon(new ImageIcon(getClass().getResource("T_Frame/mm.png")));
           nn.setBounds(6,2,20,20);
    t2.add(nn);               
              
    JLabel l4 = new JLabel ("Your Name");
           l4.setForeground(new Color(0,0,0));
           l4.setBounds(30,6,300,20);
       t2.add(l4);
   Font Atel4 = new Font ("calibri",Font.PLAIN,17);
           l4.setFont(Atel4);    
           
  t2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
           l4.setBounds(0,0,0,0);
           nn.setBounds(0,0,0,0); 
     } 
    });                
          
           
//------------------------------------------------------------------------------------------------------------------------------
           
JPasswordField t3 = new JPasswordField();
               t3.setBounds (450,190,250,30);
               t3.setForeground(Color.BLACK);
               t3.setBackground(new Color(210,210,210,250));
           add(t3);
       Font Atet3 = new Font ("calibri",Font.BOLD,20);
               t3.setFont(Atet3);          
           
               
    JLabel bb = new JLabel();
           bb.setIcon(new ImageIcon(getClass().getResource("T_Frame/bb.png")));
           bb.setBounds(8,2,20,25);
    t3.add(bb);               
               
    JLabel l5 = new JLabel ("Backup Code");
           l5.setForeground(new Color(0,0,0));
           l5.setBounds(30,6,300,20);
       t3.add(l5);
   Font Atel5 = new Font ("calibri",Font.PLAIN,17);
           l5.setFont(Atel5);   
           
   t3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
           l5.setBounds(0,0,0,0);
           bb.setBounds(0,0,0,0); 
     } 
    });                
         
//------------------------------------------------------------------------------------------------------------------------------
   
    JLabel SS = new JLabel();
           SS.setIcon(new ImageIcon(getClass().getResource("S_Frame/SEARCH.png")));
           SS.setBounds(450,235,85,33);
       add(SS);  
       
       
SS.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
SS.setIcon(new ImageIcon(getClass().getResource("S_Frame/Y_SEARCH.png")));
    
  }
});


SS.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
SS.setIcon(new ImageIcon(getClass().getResource("S_Frame/SEARCH.png")));
    
  }
});       
       
       
       
       
   
   
   
            
JPasswordField t4 = new JPasswordField();
               t4.setBackground(new Color(210,210,210,250));    
               t4.setForeground(Color.BLACK);
           add(t4);
       Font Atet4 = new Font ("calibri",Font.BOLD,20);
               t4.setFont(Atet4);          
           
               
    JLabel vv = new JLabel();
           vv.setIcon(new ImageIcon(getClass().getResource("T_Frame/bb.png")));
           vv.setBounds(8,2,20,25);
    t4.add(vv);               
               
    JLabel l6 = new JLabel ("New Password");
           l6.setForeground(new Color(0,0,0));
           l6.setBounds(30,6,300,20);
       t4.add(l6);
   Font Atel6 = new Font ("calibri",Font.PLAIN,17);
           l6.setFont(Atel6);             
          
  t4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
           l6.setBounds(0,0,0,0);
           vv.setBounds(0,0,0,0); 
     } 
    });                
          
//------------------------------------------------------------------------------------------------------------------------------

 
           
//------------------------------------------------------------------------------------------------------------------------------
     
//------------------------------------------------------------------------------------------------------------------------------

   

   
   JLabel rr = new JLabel();
           rr.setIcon(new ImageIcon(getClass().getResource("S_Frame/update.png")));

       add(rr);
 


//----------------------------------- 
    JLabel I = new JLabel();
       add(I);

 //-----------------------------------

 JLabel a = new JLabel();     
       add(a); 

Thread snn = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 3; lk++){                              
                  for (int i = -100; i < 100; i=i+14) {
            		{
                        I.setBounds(50,80,350,290);
                        I.setIcon(new ImageIcon(getClass().getResource("T_Frame/"+lk+".png")));
                     
		     try {
                        sleep(180);
		     } catch (InterruptedException ex) {}
	            }
                   }                  
                 //----------- 
 
   try
  {
  Thread.sleep(50); 
   //-----------------------------------
  
  
   
  }catch (InterruptedException ie)
  {
  System.out.println(ie.getMessage());
  }  }   }    }        
            };
            snn.start(); 

//------------------------------------------------------------------------------------------------------------------------------
SS.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent e) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs=st.executeQuery("SELECT * FROM teachers WHERE teachers_id = '"+t1.getText()+ "' && teachers_name ='"+t2.getText()+ "' && Backup_Code ='"+t3.getText()+"'");
        
         
            while(rs.next()){
                String na= rs.getString("password");
                
     //           t4.setText(na);
                
            
         t4.setBounds (450,300,250,30);
         rr.setBounds(450,337,100,40);             
          
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});
            
            
            
            
            
rr.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent e) {
     
PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            
            java.sql.Statement stmt = con.createStatement();
            pst = (PreparedStatement) con.prepareStatement("update teachers set password=?,update_date=? WHERE Teachers_ID ="+t1.getText());
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            {
             
            pst.setString(1, t4.getText());
            pst.setString(2, formattedDate);


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
//--------------------------------------------------------------------------------------       

//--------------------------------------------------------------------------------------   
    
       
rr.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
rr.setIcon(new ImageIcon(getClass().getResource("S_Frame/Y_update.png")));
    
  }
});


rr.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
rr.setIcon(new ImageIcon(getClass().getResource("S_Frame/update.png")));    
  }
});
       
       

JPanel p = new JPanel();
       p.setBounds(0,0,50,450);
       p.setBackground(Color.BLACK);
   add(p); 


/*
    JLabel w = new JLabel();
           w.setIcon(new ImageIcon(getClass().getResource("T_Frame/Register.png")));
           w.setBounds(0,0,800,450);
       add(w);

*/


setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(220,220,220,250));
setVisible(true); 
   }
       
    public static void main(String[] args) {
           FORGET_PASSWORD Frame = new FORGET_PASSWORD();
    
           
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

