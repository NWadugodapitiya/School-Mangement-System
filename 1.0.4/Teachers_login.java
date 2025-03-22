/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import javax.swing.JComboBox;
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
class Teachers_login extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
private static String z;
 

    String xx;
    
Teachers_login(){ 
setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------




























 JLabel exit = new JLabel ("Exit");
        exit.setBounds(740,421,30,20);
        exit.setForeground(Color.BLACK);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit); 

//------------------------------------------------------------------------------------------------------------------------------

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Icons/exit.png")));      
       add(a2);
        
        
//------------------------------------------------------------------------------------------------------------------------------

//================================================================================================================       
    JLabel dz = new JLabel();
           dz.setIcon(new ImageIcon(getClass().getResource("Icons/Menu.png")));
           dz.setBounds(15,20,30,20);
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
       
//------------------------------------------------------------------------------------------------------------------------------

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });  

//------------------------------------------------------------------------------------------------------------------------------

  
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

    JLabel l1 = new JLabel ("New Teacher ?");
           l1.setBounds(615,25,100,20);
           l1.setForeground(Color.BLACK);
       add(l1);
    Font Atl1 = new Font ("calibri",Font.PLAIN,14);
           l1.setFont(Atl1);
           
    JLabel la = new JLabel ("To Enter The Teachers ");
           la.setBounds(100,25,390,35);
           la.setForeground(Color.BLACK);
       add(la);
    Font Atla = new Font ("",Font.BOLD,35);
           la.setFont(Atla); 
         
    JLabel ll = new JLabel ("Welcome Back!");
           ll.setForeground(Color.BLACK);
           ll.setBounds(435,95,170,24);
       add(ll);
   Font Atell = new Font ("calibri",Font.BOLD,24);
           ll.setFont(Atell);
        
    JLabel l2 = new JLabel ("Login to continue");
           l2.setForeground(Color.BLACK);
           l2.setBounds(435,117,150,30);
       add(l2);
   Font Atel2 = new Font ("calibri",Font.BOLD,14);
           l2.setFont(Atel2);
        

           
    JLabel l4 = new JLabel ("Sign Up");
           l4.setForeground(new Color(102,0,153));
           l4.setBounds(705,25,60,20);
       add(l4);
    Font Atl4 = new Font ("calibri",Font.BOLD,15);
           l4.setFont(Atl4);         

//------------------------------------------------------------------------------------------------------------------------------
           
    JTextField t1 = new JTextField();
               t1.setBounds (430,155,354,49);
               t1.setForeground(Color.BLACK);
               t1.setBackground(new Color(210,210,210,250));
           add(t1);
       Font Atetl = new Font ("calibri",Font.BOLD,20);
               t1.setFont(Atetl);    
               
JPasswordField t2 = new JPasswordField();
               t2.setBounds (430,221,354,49);
               t2.setForeground(Color.BLACK);
               t2.setBackground(new Color(210,210,210,250));
           add(t2);
       Font Atet2 = new Font ("calibri",Font.BOLD,20);
               t2.setFont(Atet2); 
               
    JLabel l3 = new JLabel ("Teachers ID");
           l3.setForeground(new Color(0,0,0,150));
           l3.setBounds(38,16,300,20);
       t1.add(l3);
   Font Atel3 = new Font ("calibri",Font.PLAIN,17);
           l3.setFont(Atel3);     
    
 //   User Name /        
           
    JLabel QQ = new JLabel();
           QQ.setIcon(new ImageIcon(getClass().getResource("T_Frame/QQ.png")));
           QQ.setBounds(10,12,20,25);
    t1.add(QQ);  
    
    JLabel V3 = new JLabel ("Enter Password");
           V3.setForeground(new Color(0,0,0,150));
           V3.setBounds(38,16,300,20);
       t2.add(V3);
   Font AteV3 = new Font ("calibri",Font.PLAIN,17);
           V3.setFont(AteV3); 
           
    JLabel VV = new JLabel();
           VV.setIcon(new ImageIcon(getClass().getResource("T_Frame/VV.png")));
           VV.setBounds(10,12,20,25);
    t2.add(VV);      
           
           
//------------------------------------------------------------------------------------------------------------------------------     
 
 t1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
           l3.setBounds(0,0,0,0);
           QQ.setBounds(0,0,0,0); 
     } 
    });                

  t2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
           V3.setBounds(0,0,0,0);
           VV.setBounds(0,0,0,0); 
     } 
    });                

//------------------------------------------------------------------------------------------------------------------------------    
 
JComboBox dura = new JComboBox();
          dura.setBounds(650,95,90,18);
          dura.setForeground(Color.BLACK);
          dura.addItem("Teachers");
          dura.addItem("Principal");
      add(dura); 
     Font duraa = new Font ("calibri",Font.PLAIN,13);
          dura.setFont(duraa);    
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

 JLabel log = new JLabel ("");
        log.setBounds(450,400,300,20);
    add(log);
   Font Log = new Font ("calibri",Font.BOLD,18);
        log.setFont(Log); 

 JLabel Cle = new JLabel ("FORGET PASSWORD?");
        Cle.setBounds(583,330,150,20);
        Cle.setForeground(Color.BLACK);
    add(Cle);
   Font Cler = new Font ("calibri",Font.BOLD,14);
        Cle.setFont(Cler);        
//------------------------------------------------------------------------------------------------------------------------------

    JLabel qL = new JLabel();
           qL.setIcon(new ImageIcon(getClass().getResource("T_Frame/Login.png")));
           qL.setBounds(397,317,145,45);
       add(qL);   
       
       
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
                        sleep(400);
		     } catch (InterruptedException ex) {}
	            }
                   }                  
                 //----------- 
 
   try
  {
  Thread.sleep(5000); 
   //-----------------------------------
  
  
   
  }catch (InterruptedException ie)
  {
  System.out.println(ie.getMessage());
  }  }   }    }        
            };
            snn.start(); 

//------------------------------------------------------------------------------------------------------------------------------
       
       
       
       
       
       

   
l4.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) { 
    l4.setBounds(705,25,60,20);
Font Atl4 = new Font ("calibri",Font.BOLD,17);
           l4.setFont(Atl4); 
  }
});


l4.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
   l4.setBounds(705,25,60,20);
Font Atl4 = new Font ("calibri",Font.BOLD,15);
           l4.setFont(Atl4); 
  }
});

Cle.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
    Cle.setBounds(578,330,150,20);
        Cle.setForeground(new Color(102,0,153));
Font Cler = new Font ("calibri",Font.BOLD,15);
           Cle.setFont(Cler); 
  }
});


Cle.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) { 
    Cle.setBounds(583,330,150,20);
    Cle.setForeground(Color.BLACK);

Font Cler = new Font ("calibri",Font.BOLD,14);
           Cle.setFont(Cler); 
  }
});

la.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
la.setForeground(Color.GREEN);
  }
});


la.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
la.setForeground(Color.BLACK);
  }
});   

qL.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
qL.setIcon(new ImageIcon(getClass().getResource("T_Frame/login Y.png")));
    
  }
});


qL.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
qL.setIcon(new ImageIcon(getClass().getResource("T_Frame/Login.png")));
    
  }
}); 
//------------------------------------------------------------------------------------------------------------------------------

t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t2.requestFocus(true);
   }
  }
});

t2.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

   }
  }
});

//------------------------------------------------------------------------------------------------------------------------------ 

l4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Register Frame = new T_Register();
     dispose();
           
      }
  });
 
 
//------------------------------------------------------------------------------------------------------------------------------ 
 
Cle.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
   
       FORGET_PASSWORD Frame = new FORGET_PASSWORD();
     dispose();         
     
     } 
    });      

//------------------------------------------------------------------------------------------------------------------------------

qL.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent e) {
       
       
       if(t1.getText().isEmpty() && t2.getText().isEmpty()){
        log.setText("Type Item Your ID and Password");
       }
       else{    
       
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM teachers WHERE teachers_id = '"+t1.getText()+ "' && password ='"+t2.getText()+"' && User ='"+(String)dura.getSelectedItem()+"'");
    
    
      if(rs.next()){
           
            xx = rs.getString("teachers_id");
            xx = rs.getString("password");
           
      JOptionPane.showMessageDialog(null, "Login success","Login ok ",JOptionPane.WARNING_MESSAGE);

      z = t1.getText();
      
           System.out.println(xx);
          
           
          if(dura.getSelectedItem().equals("Teachers")){
             Teachers_frame Frame = new Teachers_frame();   
             dispose();
             
        
      }else if(dura.getSelectedItem().equals("Principal")){
   //          Principal_frame Frame = new Principal_frame();
              dispose();
           } 
              
           
       }
       else{System.out.println(xx);
           log.setText("Invalid Your ID or Password");
           log.setForeground(Color.RED);
       }    
       }
     
       catch (Exception ew){
            System.out.println(ew);
       }
       }
   
//--------------------------------------------------------------------------------------       
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
            
            
            
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t2.getText());
            preparedStmt.setString(3,(String)dura.getSelectedItem());
            preparedStmt.setString(4, formattedDate);
            preparedStmt.setString(5, ("Login in"));
            
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



//===============================================================================================


JPanel p = new JPanel();
       p.setBounds(0,0,50,450);
       p.setBackground(Color.BLACK);
   add(p); 

setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(220,220,220,250));
setVisible(true); 
   }

 public static void main(String[] args) {
    Teachers_login Frame = new Teachers_login();
       
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

 public static String teachers_id(){
           return z;
       }
}



