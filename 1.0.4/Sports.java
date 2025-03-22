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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ashen_NW
 */
class Sports extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
Sports(){ 
setLayout(null);

//-----------------------------------
  

//------------------------------------------------------------------------------------------------------------------------------

 JLabel A1 = new JLabel ("Home");
        A1.setBounds(355,20,40,15); 
        A1.setForeground(Color.BLACK);
    add(A1);
   Font A11 = new Font ("calibri",Font.BOLD,15);
        A1.setFont(A11);
        
 JLabel A2 = new JLabel ("Teachers");
        A2.setBounds(435,20,60,15); 
        A2.setForeground(Color.BLACK);
    add(A2);
   Font A22 = new Font ("calibri",Font.BOLD,15);
        A2.setFont(A22);       

 JLabel A3 = new JLabel ("Sports");
        A3.setBounds(534,20,40,15); 
        A3.setForeground(Color.BLACK);
    add(A3);
   Font A33 = new Font ("calibri",Font.BOLD,15);
        A3.setFont(A33); 

 JLabel A4 = new JLabel ("Library");
        A4.setBounds(623,20,45,15); 
        A4.setForeground(Color.BLACK);
    add(A4);
   Font A44 = new Font ("calibri",Font.BOLD,15);
        A4.setFont(A44); 

 JLabel A5 = new JLabel ("Contacts");
        A5.setBounds(707,20,55,15); 
        A5.setForeground(Color.BLACK);
    add(A5);
   Font A55 = new Font ("calibri",Font.BOLD,15);
        A5.setFont(A55); 


 JLabel exit = new JLabel ("Exit");
        exit.setBounds(740,421,30,20);
        exit.setForeground(Color.BLACK);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit); 
        
        

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
        D.setForeground(Color.WHITE);
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
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
              
        
        
 JLabel S1 = new JLabel ("1");
        S1.setBounds(130,425,15,15); 
        S1.setForeground(Color.WHITE);
    add(S1);
   Font S11 = new Font ("calibri",Font.BOLD,15);
        S1.setFont(S11);
        
 JLabel S2 = new JLabel ("2");
        S2.setBounds(160,425,15,15); 
        S2.setForeground(Color.WHITE);
    add(S2);
   Font S22 = new Font ("calibri",Font.BOLD,15);
        S2.setFont(S22);       

 JLabel S3 = new JLabel ("3");
        S3.setBounds(190,425,15,15); 
        S3.setForeground(Color.WHITE);
    add(S3);
   Font S33 = new Font ("calibri",Font.BOLD,15);
        S3.setFont(S33); 

 JLabel S4 = new JLabel ("4");
        S4.setBounds(220,425,15,15); 
        S4.setForeground(Color.WHITE);
    add(S4);
   Font S44 = new Font ("calibri",Font.BOLD,15);
        S4.setFont(S44); 

 JLabel S5 = new JLabel ("5");
        S5.setBounds(250,425,15,15); 
        S5.setForeground(Color.WHITE);
    add(S5);
   Font S55 = new Font ("calibri",Font.BOLD,15);
        S5.setFont(S55);      
        
 JLabel S6 = new JLabel ("6");
        S6.setBounds(280,425,15,15); 
        S6.setForeground(Color.WHITE);
    add(S6);
   Font S66 = new Font ("calibri",Font.BOLD,15);
        S6.setFont(S66); 

 JLabel S7 = new JLabel ("7");
        S7.setBounds(310,425,15,15); 
        S7.setForeground(Color.WHITE);
    add(S7);
   Font S77 = new Font ("calibri",Font.BOLD,15);
        S7.setFont(S77); 

 JLabel S8 = new JLabel ("8");
        S8.setBounds(340,425,15,15); 
        S8.setForeground(Color.WHITE);
    add(S8);
   Font S88 = new Font ("calibri",Font.BOLD,15);
        S8.setFont(S88);        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

//------------------------------------------------------------------------------------------------------------------------------

    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Icons/exit.png")));      
       add(a2);

    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("Icons/pannnel.png")));
           a4.setBounds(520,15,80,25);
       add(a4); 
       
    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("Icons/pannel.png")));
           a5.setBounds(342,17,480,21);
       add(a5);   
       

//------------------------------------------------------------------------------------------------------------------------------

 JLabel N = new JLabel (">");
        N.setBounds(390,389,35,35); 
        N.setForeground(Color.WHITE);
    add(N);
   Font N11 = new Font ("calibri",Font.BOLD,35);
        N.setFont(N11);

 JLabel N1 = new JLabel();
        N1.setIcon(new ImageIcon(getClass().getResource("Icons/next.png"))); 
        N1.setBounds(383,388,35,35);
    add(N1);
    
 JLabel n2 = new JLabel ("<");
        n2.setBounds(73,389,35,35); 
        n2.setForeground(Color.WHITE);
    add(n2);
   Font n22 = new Font ("calibri",Font.BOLD,35);
        n2.setFont(n22);    
    
 
 JLabel N2 = new JLabel();
        N2.setIcon(new ImageIcon(getClass().getResource("Icons/next.png"))); 
        N2.setBounds(66,388,35,35);
    add(N2);

//------------------------------------------------------------------------------------------------------------------------------
 
//------------------------------------------------------------------------------------------------------------------------------
/*
JPanel p1 = new JPanel();
       p1.setBounds(70,150,380,200);
       p1.setBackground(Color.GREEN);
   add(p1);

JPanel p2 = new JPanel();
       p2.setBounds(550,80,200,200);
       p2.setBackground(Color.GREEN);
   add(p2);   
*/

 JLabel a = new JLabel();
        a.setBounds(70,150,380,200); 
    add(a); 
 
  JLabel a1 = new JLabel();
         a1.setBounds(550,80,200,200);
     add(a1);     
       
 JLabel at = new JLabel (); 
        at.setForeground(Color.WHITE);
    add(at);
   Font ate = new Font ("calibri",Font.BOLD,35);
   at.setFont(ate);
   
   
 
 
 S1.setForeground(Color.YELLOW);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE);
 

Thread z = new Thread() {
                                      
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 3; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                                               
                        a.setIcon(new ImageIcon(getClass().getResource("Sports/running/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/running/run.jpg")));
                        
                        at.setText("RUNNING");
                        at.setBounds(165,390,150,35);
                        
          
                        
         try {
                        sleep(1);
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
            z.start(); 
            
   
//----------------------------------------------------------        


 S1.addMouseListener(new MouseAdapter() {
 public void mouseClicked(MouseEvent e) {
 
 S1.setForeground(Color.YELLOW);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE);
 

Thread A1 = new Thread() {
                                      
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 3; lk++){     
                  for (int i = -200; i < 10; i=i+14) {
                {
                                               
                        a.setIcon(new ImageIcon(getClass().getResource("Sports/running/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/running/run.jpg")));
                        
                        at.setText("RUNNING");
                        at.setBounds(165,390,150,35);
                        
          
                        
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
            A1.start(); 
            
           }       
      
  });       

//------------------------------------------------------------------------------------------------------------------------------


 S2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.YELLOW);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE); 

Thread A2 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 2; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                        
                        a.setIcon(new ImageIcon(getClass().getResource("Sports/Cricket/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/Cricket/Cricket.jpg")));
                        
                        at.setText("CRICKET");
                        at.setBounds(175,390,150,35);
                        
                       
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
            A2.start(); 
            
           }       
      
  });       
           
//------------------------------------------------------------------------------------------------------------------------------


 S3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.YELLOW);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE); 

Thread A3 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 2; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                            
                        a.setIcon(new ImageIcon(getClass().getResource("Sports/SWIMMING/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/SWIMMING/SWIMMING.jpg")));
                        
                        at.setText("SWIMMING");
                        at.setBounds(155,390,200,35);
                        
             
                        
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
            A3.start(); 
            
           }       
      
  });       
    
 //------------------------------------------------------------------------------------------------------------------------------


 S4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.YELLOW);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE); 

Thread A4 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 3; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                            
                         a.setIcon(new ImageIcon(getClass().getResource("Sports/football/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/football/football.png")));
                        
                        at.setText("FOOTBALL");
                        at.setBounds(165,390,200,35);
                        
          
                       
                        
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
            A4.start(); 
            
           }       
      
  });       
           
//------------------------------------------------------------------------------------------------------------------------------


 S5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.YELLOW);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE); 

Thread A5 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 2; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                            
                         a.setIcon(new ImageIcon(getClass().getResource("Sports/busketball/"+lk+".png")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/busketball/busketball.jpg")));
                        
                        at.setText("BUSKETBALL");
                        at.setBounds(155,390,200,35);
                        
              
                        
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
            A5.start(); 
            
           }       
      
  });       
  
//------------------------------------------------------------------------------------------------------------------------------


 S6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.YELLOW);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.WHITE); 

Thread A6 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 2; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                            
                         a.setIcon(new ImageIcon(getClass().getResource("Sports/netball/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/netball/netball.jpg")));
                        
                        at.setText("NETBALL");
                        at.setBounds(178,390,200,35);
                        
              
                            
                       
                        
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
            A6.start(); 
            
           }       
      
  });       

//------------------------------------------------------------------------------------------------------------------------------


 S7.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.YELLOW);
 S8.setForeground(Color.WHITE); 

Thread A7 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 2; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                            
                            
                         a.setIcon(new ImageIcon(getClass().getResource("Sports/batminton/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/batminton/batminton.jpg")));
                        
                        at.setText("BATMINTON");
                        at.setBounds(155,390,200,35);
                        
              
                       
                        
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
            A7.start(); 
            
           }       
      
  });       

//------------------------------------------------------------------------------------------------------------------------------



 S8.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 S1.setForeground(Color.WHITE);
 S2.setForeground(Color.WHITE);
 S3.setForeground(Color.WHITE);
 S4.setForeground(Color.WHITE);
 S5.setForeground(Color.WHITE);
 S6.setForeground(Color.WHITE);
 S7.setForeground(Color.WHITE);
 S8.setForeground(Color.YELLOW); 

Thread A8 = new Thread() {
                    @Override                    
               public void run() {                   
             for(int j = 1; j <= 5000; j++){            
                        for(int lk = 1; lk <= 2; lk++){                              
                  for (int i = -200; i < 10; i=i+14) {
                {
                            
                         a.setIcon(new ImageIcon(getClass().getResource("Sports/chess/"+lk+".jpg")));
                                               
                        a1.setIcon(new ImageIcon(getClass().getResource("Sports/chess/chess.jpg")));
                        
                        at.setText("CHESS");
                        at.setBounds(190,390,200,35);
                        
              
                      
                        
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
            A8.start(); 
            
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

A1.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
 a4.setBounds(340,15,80,25);
A1.setForeground(Color.BLACK);
  }
});

A1.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
  a4.setBounds(520,15,80,25);
   A1.setForeground(Color.BLACK);
  }
});

A2.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
  a4.setBounds(430,15,80,25);     
  A2.setForeground(Color.BLACK);
  }
});

A2.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) { 
A2.setForeground(Color.BLACK);
a4.setBounds(520,15,80,25);
  }
});

A3.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  

  }
});

A3.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  

  }
});

A4.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a4.setBounds(610,15,80,25);
A4.setForeground(Color.BLACK);
  }
});

A4.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a4.setBounds(520,15,80,25); 
A4.setForeground(Color.BLACK);
  }
});

A5.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
   a4.setBounds(700,15,80,25);
  A5.setForeground(Color.BLACK);
  }
});

A5.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a4.setBounds(520,15,80,25);
A5.setForeground(Color.BLACK);
  }
});

//------------------------------------------------------------------------------------------------------------------------------

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });

A1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  }); 

A2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Teachers Frame = new Teachers();
     dispose();
           
      }
  }); 

A3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Sports Frame = new Sports();
     dispose();
           
      }
  });

A4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Library Frame = new Library();
     dispose();
           
      }
  });

A5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Contacts Frame = new Contacts();
     dispose();
           
      }
  });

//------------------------------------------------------------------------------------------------------------------------------




JPanel p = new JPanel();
       p.setBounds(0,0,50,450);
       p.setBackground(Color.BLACK);
   add(p);  
   
 JLabel DI = new JLabel();
        DI.setIcon(new ImageIcon(getClass().getResource("Sports/DD.png"))); 
        DI.setBounds(0,0,800,450);
    add(DI);

setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(21,21,21,250));
setVisible(true); 
   }

 public static void main(String[] args) {
    Sports Frame = new Sports();
       
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



