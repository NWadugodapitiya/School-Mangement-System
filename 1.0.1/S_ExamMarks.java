/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_one;

import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ashen
 */
public class S_ExamMarks extends JFrame{
    static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
    private Object l1;
    
S_ExamMarks(){ 
setLayout(null);


 JLabel l2 = new JLabel ("English");
        l2.setForeground(Color.WHITE);
        l2.setBounds(230,100,150,30);
    add(l2);
Font Atel2 = new Font ("calibri",Font.PLAIN,20);
        l2.setFont(Atel2);        
        
 JLabel l3 = new JLabel ("Mathematics");
        l3.setForeground(Color.WHITE);
        l3.setBounds(230,150,150,30);
    add(l3);
Font Atel3 = new Font ("calibri",Font.PLAIN,20);
        l3.setFont(Atel3);
              
       
 JLabel l6 = new JLabel ("Science");
        l6.setForeground(Color.WHITE);
        l6.setBounds(230,200,180,30);
    add(l6);
Font Atel6 = new Font ("calibri",Font.PLAIN,20);
        l6.setFont(Atel6); 
        
 JLabel l7 = new JLabel ("Sinhala");
        l7.setForeground(Color.WHITE);
        l7.setBounds(230,50,150,30);
    add(l7);
Font Atel7 = new Font ("calibri",Font.PLAIN,20);
        l7.setFont(Atel7);        
        
 JLabel l8 = new JLabel ("ICT");
        l8.setForeground(Color.WHITE);
        l8.setBounds(230,250,180,30);
    add(l8);
Font Atel8 = new Font ("calibri",Font.PLAIN,20);
        l8.setFont(Atel8);         
                
 JLabel l9 = new JLabel ("Sum");
        l9.setForeground(Color.WHITE);
        l9.setBounds(230,310,180,30);
    add(l9);
Font Atel9 = new Font ("calibri",Font.PLAIN,20);
        l9.setFont(Atel9);        
        
JTextField t1 = new JTextField();
           t1.setBounds (50,50,150,25);
       add(t1);
   Font Atetl = new Font ("calibri",Font.PLAIN,20);
           t1.setFont(Atetl);         
              
       
        
           
JTextField t2 = new JTextField();
           t2.setBounds (345,102,60,25);
       add(t2);
   Font Atet2 = new Font ("calibri",Font.PLAIN,20);
           t2.setFont(Atet2);           
         
JTextField t3 = new JTextField();
           t3.setBounds (345,152,60,25);
       add(t3);
   Font Atet3 = new Font ("calibri",Font.PLAIN,20);
           t3.setFont(Atet3);            
           
JTextField t4 = new JTextField();
           t4.setBounds (490,52,60,25);
       add(t4);
   Font Atet4 = new Font ("calibri",Font.PLAIN,20);
           t4.setFont(Atet4);         
           
JTextField t5 = new JTextField();
           t5.setBounds (345,312,60,25);
       add(t5);
   Font Atet5 = new Font ("calibri",Font.PLAIN,20);
           t5.setFont(Atet5); 
           
JTextField t6 = new JTextField();
           t6.setBounds (345,202,60,25);
       add(t6);
   Font Atet6 = new Font ("calibri",Font.PLAIN,20);
           t6.setFont(Atet6);
           
JTextField t7 = new JTextField();
           t7.setBounds (345,52,60,25);
       add(t7);
   Font Atet7 = new Font ("calibri",Font.PLAIN,20);
           t7.setFont(Atet7); 
           
JTextField t8 = new JTextField();
           t8.setBounds (345,252,60,25);
       add(t8);
   Font Atet8 = new Font ("calibri",Font.PLAIN,20);
           t8.setFont(Atet8);           
           

       
JButton b2 = new JButton ("I");
        b2.setBounds (60,100,60,25);
        b2.setBackground(new Color(250,250,250,250));
    add(b2);           
Font Ateb2 = new Font ("calibri",Font.PLAIN,20);
        b2.setFont(Ateb2); 
        
JButton b3 = new JButton ("II");
        b3.setBounds (60,180,60,25);
        b3.setBackground(new Color(250,250,250,250));
    add(b3);           
Font Ateb3 = new Font ("calibri",Font.PLAIN,20);
        b3.setFont(Ateb3);        

JButton b4 = new JButton ("III");
        b4.setBounds (60,260,60,25);
        b4.setBackground(new Color(250,250,250,250));
    add(b4);           
Font Ateb4 = new Font ("calibri",Font.PLAIN,20);
        b4.setFont(Ateb4);
        
JButton b5 = new JButton ("Print");
        b5.setBounds (480,350,100,20);
        b5.setBackground(new Color(250,250,250,250));
    add(b5); 
    
JButton b6 = new JButton ("Back");
        b6.setBounds (15,350,100,20);
        b6.setBackground(new Color(250,250,250,250));
    add(b6);



b2.addActionListener(new ActionListener(){
    public void actionPerformed (ActionEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Project_one","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM t_exammarks_a WHERE Student_ID ="+t1.getText());
            
            while(rs.next()){
                
                String bb= rs.getString("Sinhala");
                String cc= rs.getString("English");
                String dd= rs.getString("Mathematics");
                String ee= rs.getString("Science");
                String ff= rs.getString("ICT");
                String gg= rs.getString("Sum");
                String hh= rs.getString("rank");
                
                
                
                
                t7.setText(bb);
                t2.setText(cc);
                t3.setText(dd);
                t6.setText(ee);
                t8.setText(ff);
                t5.setText(gg);
                t4.setText(hh);
              
            
                
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});

b3.addActionListener(new ActionListener(){
    public void actionPerformed (ActionEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Project_one","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM t_exammarks_b WHERE Student_ID ="+t1.getText());
            
            while(rs.next()){
                
                String bb= rs.getString("Sinhala");
                String cc= rs.getString("English");
                String dd= rs.getString("Mathematics");
                String ee= rs.getString("Science");
                String ff= rs.getString("ICT");
                String gg= rs.getString("Sum");
                String hh= rs.getString("rank");
                
                
                
                
                t7.setText(bb);
                t2.setText(cc);
                t3.setText(dd);
                t6.setText(ee);
                t8.setText(ff);
                t5.setText(gg);
                t4.setText(hh);
              
            
                
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});

b4.addActionListener(new ActionListener(){
    public void actionPerformed (ActionEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Project_one","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM t_exammarks_c WHERE Student_ID ="+t1.getText());
            
            while(rs.next()){
               
                String bb= rs.getString("Sinhala");
                String cc= rs.getString("English");
                String dd= rs.getString("Mathematics");
                String ee= rs.getString("Science");
                String ff= rs.getString("ICT");
                String gg= rs.getString("Sum");
                String hh= rs.getString("rank");
                
                
                
                
                t7.setText(bb);
                t2.setText(cc);
                t3.setText(dd);
                t6.setText(ee);
                t8.setText(ff);
                t5.setText(gg);
                t4.setText(hh);
              
            
                
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});
 

      b5.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
       
       
       
      com.lowagie.text.Document document = new com.lowagie.text.Document(PageSize.A4,50,70,50,50) {};
    
      
      
       try{
            File pdfFile = new File("Myreport.pdf");
            
            PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("Student Exam Marks report.pdf"));
            document.open();
            
            PdfContentByte cb = writer.getDirectContent();
            BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
            cb.setFontAndSize(bf,14);
            cb.beginText();
            
    
            
            
            String title =("Anuradhapura Walisinghe Harischandra College ");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(140, 800);
            cb.showText(title);
            
            String ti =("Student ID           -   "+t1.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(70, 600);
            cb.showText(ti);
            
            String ta =("Name                    -   "+t7.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(70, 550);
            cb.showText(ta);
            
            String tb =("Adress                  -   "+t2.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(70, 500);
            cb.showText(tb);
            
            String tc =("Dtae Of Birth      -   "+t3.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(70, 450);
            cb.showText(tc);
            
            String td =(" / "+t4.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(225, 450);
            cb.showText(td);
            
            String te =(" / "+t5.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(250, 450);
            cb.showText(te);
            
            String tf =("phone numbers   -   "+t6.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(70, 400);
            cb.showText(tf);
            
            String tg =(" / "+t8.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(275, 400);
            cb.showText(tg);
            
           
            
           
            
            cb.endText();
       }
            
       catch (Exception eb) {
           System.err.println(eb.getMessage());
       }
       document.close();
       //open
       
       try{
           File pdfFile = new File("Student Exam Marks report.pdf");
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








    
    
    
    
    
b6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
     S_Grade Frame = new S_Grade();
     dispose();
           
      }
  });

    JLabel a1 = new JLabel();
           a1.setIcon(new ImageIcon(getClass().getResource("image/prolite.png")));
           a1.setBounds(200,0,400,400);
       add(a1);


setSize (600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(25,250,20,250));
setVisible(true); 
   }

 public static void main(String[] args) {
           S_ExamMarks Frame = new S_ExamMarks();
   
        
           
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




