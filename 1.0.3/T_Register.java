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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class T_Register extends JFrame{
static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
T_Register(){ 
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
 
 
 

    JLabel la = new JLabel ("Teachers Registrasion");
           la.setBounds(230,50,250,25);
           la.setForeground(Color.WHITE);
       add(la);
    Font Atla = new Font ("",Font.PLAIN,20);
           la.setFont(Atla);  

    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("Home/back icon.png")));
           a1.setBounds(7,350,55,39); 
       add(a1);
       
    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("Home/Home icon.png")));
           a2.setBounds(10,70,38,38); 
       add(a2);
       
    JLabel a3 = new JLabel();
           a3.setIcon(new ImageIcon(getClass().getResource("Home/Teachers Login icon.png")));
           a3.setBounds(10,125,38,38); 
       add(a3);  
       
    JLabel a4 = new JLabel();
           a4.setIcon(new ImageIcon(getClass().getResource("Home/Student Login icon.png")));
           a4.setBounds(10,180,38,38); 
       add(a4);
       
    JLabel a5 = new JLabel();
           a5.setIcon(new ImageIcon(getClass().getResource("Home/Principal Login icon.png")));
           a5.setBounds(10,235,38,38); 
       add(a5); 
       
    JLabel a6 = new JLabel();
           a6.setIcon(new ImageIcon(getClass().getResource("Home/About us.png")));
           a6.setBounds(10,290,38,38); 
       add(a6);  
       
    JLabel ll = new JLabel ("Teachers ID");
           ll.setForeground(Color.WHITE);
           ll.setBounds(100,100,150,30);
       add(ll);
   Font Atell = new Font ("calibri",Font.PLAIN,20);
           ll.setFont(Atell);
        
    JLabel l2 = new JLabel ("Name");
           l2.setForeground(Color.WHITE);
           l2.setBounds(100,150,150,30);
       add(l2);
   Font Atel2 = new Font ("calibri",Font.PLAIN,20);
           l2.setFont(Atel2);
        
    JLabel l31 = new JLabel ("Class Custody");
           l31.setForeground(Color.WHITE);
           l31.setBounds(100,200,150,30);
       add(l31);
   Font Atel31 = new Font ("calibri",Font.PLAIN,20);
           l31.setFont(Atel31);        
        
    JLabel l3 = new JLabel ("Grade");
           l3.setForeground(Color.WHITE);
           l3.setBounds(280,200,150,30);
       add(l3);
   Font Atel3 = new Font ("calibri",Font.PLAIN,20);
           l3.setFont(Atel3); 
        
    JLabel l4 = new JLabel ("Class");
           l4.setForeground(Color.WHITE);
           l4.setBounds(413,200,150,30);
       add(l4);
   Font Atel4 = new Font ("calibri",Font.PLAIN,20);
           l4.setFont(Atel4);
        
    JLabel l5 = new JLabel ("Password");
           l5.setForeground(Color.WHITE);
           l5.setBounds(100,250,150,30);
       add(l5);
   Font Atel5 = new Font ("calibri",Font.PLAIN,20);
           l5.setFont(Atel5); 
        
    
    JLabel l6 = new JLabel ("");
           l6.setForeground(Color.WHITE);
           l6.setBounds(280,300,200,30);
       add(l6);
   Font Atel6 = new Font ("calibri",Font.PLAIN,20);
           l6.setFont(Atel6);   
       
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           

    JTextField t1 = new JTextField();
               t1.setBounds (280,102,250,25);
               t1.setForeground(Color.WHITE);
               t1.setBackground(new Color(50,50,50,250));
           add(t1);
       Font Atetl = new Font ("calibri",Font.PLAIN,20);
               t1.setFont(Atetl);          
       
    JTextField t2 = new JTextField();
               t2.setBounds (280,152,250,25);
               t2.setForeground(Color.WHITE);
               t2.setBackground(new Color(50,50,50,250));
           add(t2);
       Font Atet2 = new Font ("calibri",Font.PLAIN,20);
               t2.setFont(Atet2);          
       
    JTextField t3 = new JTextField();
               t3.setBounds (337,202,70,25);
               t3.setForeground(Color.WHITE);
               t3.setBackground(new Color(50,50,50,250));
           add(t3);
       Font Atet3 = new Font ("calibri",Font.PLAIN,20);
               t3.setFont(Atet3);          
       
    JTextField t4 = new JTextField();
               t4.setBounds (460,202,70,25);
               t4.setForeground(Color.WHITE);
               t4.setBackground(new Color(50,50,50,250));
           add(t4);
       Font Atet4 = new Font ("calibri",Font.PLAIN,20);
               t4.setFont(Atet4);       
       
JPasswordField t5 = new JPasswordField();
               t5.setBounds (280,252,250,25);
               t5.setForeground(Color.WHITE);
               t5.setBackground(new Color(50,50,50,250));
           add(t5);
       Font Atet5 = new Font ("calibri",Font.PLAIN,20);
               t5.setFont(Atet5);


               
               
               
               
               
               
               
               
               

       
 JPanel p = new JPanel();
        p.setBounds(0,0,60,400);
        p.setBackground(Color.yellow);
    add(p);
    
JPanel p1 = new JPanel();
       p1.setBounds(60,10,600,30);
       p1.setBackground(Color.RED);
   add(p1);               
 

    
    
   JComboBox dura = new JComboBox();
dura.setBounds(100,300,150,25);
dura.setForeground(Color.BLACK);
dura.setBackground(new Color(250,250,0,250));
dura.addItem("Select Subject");
dura.addItem("Sinhala");
dura.addItem("English");
dura.addItem("ICT");
dura.addItem("Mathematics");
dura.addItem("Science");
add(dura); 
    
       
JButton b1 = new JButton ("Clear");
        b1.setBounds (480,370,100,20);
        b1.setBackground(new Color(250,250,250,250));
    add(b1);
   
          
JButton b2 = new JButton ("Register");
        b2.setBounds (360,370,100,20);
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

la.addMouseListener(new MouseAdapter() {
public void mouseEntered(MouseEvent e) {  
la.setForeground(Color.GREEN);
  }
});


la.addMouseListener(new MouseAdapter() {
public void mouseExited(MouseEvent e) {  
la.setForeground(Color.WHITE);
  }
});    
    
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
t3.requestFocus(true);
   }
  }
}); 
   
   t3.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t4.requestFocus(true);
   }
  }
});
   
   t4.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t5.requestFocus(true);
   }
  }
}); 

   t5.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
b2.requestFocus(true);
   }
  }
});

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

          
 a1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  });      
       
 a2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     Home Frame = new Home();
     dispose();
           
      }
  });      
       
 a3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     T_Login Frame = new T_Login();
     dispose();
           
      }
  });
 
 a4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Login Frame = new S_Login();
     dispose();
           
      }
  });
 
 a5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     P_Login Frame = new P_Login();
     dispose();
           
      }
  });
 
 a6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     About Frame = new About();
     dispose();
           
      }
  });


 b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     t1.setText("");
     t2.setText("");
     t3.setText("");
     t4.setText("");
     t5.setText("");
    
  } 
    }); 


 b2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
       
     if(t1.getText().isEmpty()){
        l6.setText("Type Item Teacher ID");
         l6.setForeground(Color.YELLOW);
       }
       
       if(t2.getText().isEmpty()){
        l6.setText("Type Item Name");
         l6.setForeground(Color.YELLOW);
       }
       
       if(t3.getText().isEmpty()){
        l6.setText("Type Item Grade");
         l6.setForeground(Color.YELLOW);
       }
       
       if(t4.getText().isEmpty()){
        l6.setText("Type Item Class");
         l6.setForeground(Color.YELLOW);
       }
       
       if(t5.getText().isEmpty()){
        l6.setText("Type Item Password");
         l6.setForeground(Color.YELLOW);
       }
       
       if(t1.getText().isEmpty() && t2.getText().isEmpty()&& t3.getText().isEmpty()&& t4.getText().isEmpty()&& t5.getText().isEmpty()){
        l6.setText("Type Items");
         l6.setForeground(Color.YELLOW);
       }
       else{    
       
       
       
       
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
             con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/softwear_01","root","");
            
            String query = "insert into teachers (Teachers_ID,Name,Grade,Class,Password,Subject,Add1,T_Number1,Add2,Add3)" + " values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
            
            
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, t2.getText());
            preparedStmt.setString(3, t3.getText());
            preparedStmt.setString(4, t4.getText());
            preparedStmt.setString(5, t5.getText());
            preparedStmt.setString(6, (String)dura.getSelectedItem());
            preparedStmt.setString(7,  "");
            preparedStmt.setString(8,  "");
            preparedStmt.setString(9,  "");
            preparedStmt.setString(10, "");
     
    JOptionPane.showMessageDialog(null, "Teachers Registrasion success","Registrasion ok ",JOptionPane.WARNING_MESSAGE);

           T_Login Frame = new T_Login();
           dispose();        
            
            
            
 
 preparedStmt.execute();
 
 con.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }
       }
       }
       });
    
 

setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(50,50,50,250));
setVisible(true); 
   }
       
    public static void main(String[] args) {
           T_Register Frame = new T_Register();
    
           
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


