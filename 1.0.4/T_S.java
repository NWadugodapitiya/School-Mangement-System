/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Blocker
 */
class T_S extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
String TID = Teachers_login.teachers_id();
      String teachers_ID = null;
    
T_S(){ 
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
    




 JLabel la1 = new JLabel ("Student Name            =");
        la1.setForeground(Color.BLACK);
        la1.setBounds(200,120,250,30);
    add(la1);
Font Atela1 = new Font ("calibri",Font.PLAIN,20);
        la1.setFont(Atela1);    
        
 JLabel la2 = new JLabel ("");
        la2.setForeground(Color.BLACK);
        la2.setBounds(395,120,500,30);
    add(la2);
Font Atela2 = new Font ("calibri",Font.PLAIN,20);
        la2.setFont(Atela2); 
        
        
 JLabel lb1 = new JLabel ("Adress                         =");
        lb1.setForeground(Color.BLACK);
        lb1.setBounds(200,170,250,30);
    add(lb1);
Font Atelb1 = new Font ("calibri",Font.PLAIN,20);
        lb1.setFont(Atelb1);    
        
 JLabel lb2 = new JLabel ("");
        lb2.setForeground(Color.BLACK);
        lb2.setBounds(395,170,500,30);
    add(lb2);
Font Atelb2 = new Font ("calibri",Font.PLAIN,20);
        lb2.setFont(Atelb2); 
        
        
        
 JLabel lc1 = new JLabel ("Dtae Of Birth              =");
        lc1.setForeground(Color.BLACK);
        lc1.setBounds(200,220,250,30);
    add(lc1);
Font Atelc1 = new Font ("calibri",Font.PLAIN,20);
        lc1.setFont(Atelc1);    
        
 JLabel lc2 = new JLabel ("");
        lc2.setForeground(Color.BLACK);
        lc2.setBounds(400,220,180,30);
    add(lc2);
Font Atelc2 = new Font ("calibri",Font.PLAIN,20);
        lc2.setFont(Atelc2);
        
 
        
 JLabel ld1 = new JLabel ("Telephone Numbers  =");
        ld1.setForeground(Color.BLACK);
        ld1.setBounds(200,270,500,30);
    add(ld1);
Font Ateld1 = new Font ("calibri",Font.PLAIN,20);
        ld1.setFont(Ateld1);        
        
 JLabel ld2 = new JLabel ("");
        ld2.setForeground(Color.BLACK);
        ld2.setBounds(400,270,500,30);
    add(ld2);
Font Ateld2 = new Font ("calibri",Font.PLAIN,20);
        ld2.setFont(Ateld2); 
        
        
 JLabel ld3 = new JLabel ("");
        ld3.setForeground(Color.BLACK);
        ld3.setBounds(520,270,500,30);
    add(ld3);
Font Ateld3 = new Font ("calibri",Font.PLAIN,20);
        ld3.setFont(Ateld3); 
        
        
 
           
           
           
JButton b1 = new JButton ("Clear");
        b1.setBounds (560,410,80,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
           
JButton b2 = new JButton ("Print");
        b2.setBounds (650,410,80,20);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);     
    
    
        


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
           
           
b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
      t1.setText("");
     la2.setText("");
     lb2.setText("");
     lc2.setText("");
     ld2.setText("");
     ld3.setText("");
    

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
        ex.setForeground(Color.WHITE);
    add(ex);
   Font exac = new Font ("calibri",Font.BOLD,24);
        ex.setFont(exac);

        
 JLabel sd = new JLabel ("Students");
        sd.setBounds(30,243,100,25);
        sd.setForeground(Color.BLACK);
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
           w.setIcon(new ImageIcon(getClass().getResource("T_Home/T3.png")));
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
           
//=========================================================================================================================
 
 
 i.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM students WHERE Students_ID ="+t1.getText());
            
            while(rs.next()){
                String na= rs.getString("Name");
                String ag= rs.getString("Adress");
                String gr= rs.getString("Date_Of_Birth");
                String sc= rs.getString("T_Number1");
                String tn= rs.getString("T_Number2");
                
                la2.setText(na);
                lb2.setText(ag);
                lc2.setText(gr);
                ld2.setText(sc);
                ld3.setText(tn);
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});

          
        b2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
      Document document = new Document(PageSize.A4,50,70,50,50) {};

       try{
            File pdfFile = new File("Myreport.pdf");
            
            PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("Student report.pdf"));
            document.open();
            
            PdfContentByte cb = writer.getDirectContent();
            BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
            cb.setFontAndSize(bf,14);
            cb.beginText();
            
            String title =("Students Information Slip");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(220, 765);
            cb.showText(title);
            
            String name =("Name      =");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(75, 485);
            cb.showText(name);
            
            String ti =(la2.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(160, 485);
            cb.showText(ti);
            
            String Adress =("Adress     =");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(75, 450);
            cb.showText(Adress);
            
            String t2 =(lb2.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(160, 450);
            cb.showText(t2);
            
            String Date_Of_Birth =("Date Of Birth   =");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(75, 415);
            cb.showText(Date_Of_Birth);
            
            String t3 =(lc2.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(190, 415);
            cb.showText(t3);
            
            String S_Number =("TelePhone Number   =                        /");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(75, 380);
            cb.showText(S_Number);
            
            String t4 =(ld2.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(230, 380);
            cb.showText(t4);
            
            String t5=(ld3.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(318, 380);
            cb.showText(t5);
            
            
            
            cb.endText();
       }
            
       catch (Exception eb) {
           System.err.println(eb.getMessage());
       }
       document.close();
       //open
       
       try{
           File pdfFile = new File("Student report.pdf");
           if(pdfFile.exists()) {
               
               if(Desktop.isDesktopSupported()) {
                   Desktop.getDesktop().open(pdfFile);
               }
               else{
                   System.out.println("Awt Desktop is not supported!");
               }
           }
           else{
               JOptionPane.showMessageDialog(null,"No file found","No files",javax.swing.JOptionPane.WARNING_MESSAGE);
           }
       }
       catch (Exception ex) {
       }
       //open close
  
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
    T_S Frame = new T_S();
       
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



