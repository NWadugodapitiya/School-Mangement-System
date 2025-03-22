/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregister;

import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 *
 * @author Ashen
 */
public class StudentRegister extends JFrame {    
StudentRegister(){
  
JLabel l1=new JLabel("Student ID");
       l1.setBounds(100,150,200,20);
       l1.setForeground(Color.BLACK);
         add(l1);
JLabel l2=new JLabel("Name");
       l2.setBounds(100,200,225,20);
       l2.setForeground(Color.BLACK);
         add(l2);
JLabel l3=new JLabel("Age");
       l3.setBounds(100,250,250,20);
       l3.setForeground(Color.BLACK);
         add(l3);
JLabel l4=new JLabel("School");
       l4.setBounds(100,300,275,20);
       l4.setForeground(Color.BLACK);
         add(l4);
JLabel l5=new JLabel("TEL");
       l5.setBounds(100,350,300,20);
       l5.setForeground(Color.BLACK);
         add(l5);
         
JLabel l11=new JLabel("Adress");
       l11.setBounds(100,400,200,20);
       l11.setForeground(Color.BLACK);
         add(l11);
JLabel l21=new JLabel("Car");
       l21.setBounds(100,450,225,20);
       l21.setForeground(Color.BLACK);
         add(l21);
JLabel l31=new JLabel("Van");
       l31.setBounds(100,500,250,20);
       l31.setForeground(Color.BLACK);
         add(l31);
JLabel l41=new JLabel("Bus");
       l41.setBounds(100,550,275,20);
       l41.setForeground(Color.BLACK);
         add(l41);
JLabel l51=new JLabel("home");
       l51.setBounds(100,600,300,20);
       l51.setForeground(Color.BLACK);
         add(l51);
         
         
         
         
         
JButton b1=new JButton("Print");
        b1.setBounds(100,650,90,25);
         add(b1);
JButton b2=new JButton("CLEAR");
        b2.setBounds(200,650,90,25);
         add(b2);

JButton b3=new JButton("EXIT");
        b3.setBounds(300,650,90,25);
         add(b3);

b3.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
     System.exit(0);
  } 
    });


JTextField t1=new JTextField();
            t1.setBounds(200,150,300,20);
             add(t1);
JTextField t2=new JTextField();
            t2.setBounds(200,200,300,20);
             add(t2);
JTextField t3=new JTextField();
            t3.setBounds(200,250,300,20);
             add(t3);
JTextField t4=new JTextField();
            t4.setBounds(200,300,300,20);
             add(t4);
JTextField t5=new JTextField();
            t5.setBounds(200,350,300,20);
             add(t5);
             
JTextField t11=new JTextField();
            t11.setBounds(200,400,300,20);
             add(t11);
JTextField t21=new JTextField();
            t21.setBounds(200,450,300,20);
             add(t21);
JTextField t31=new JTextField();
            t31.setBounds(200,500,300,20);
             add(t31);
JTextField t41=new JTextField();
            t41.setBounds(200,550,300,20);
             add(t41);
JTextField t51=new JTextField();
            t51.setBounds(200,600,300,20);
             add(t51);  
             
        b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
    
      com.lowagie.text.Document document = new com.lowagie.text.Document(PageSize.A4,50,70,50,50) {};

       try{
            File pdfFile = new File("Myreport.pdf");
            
            PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("Myreport.pdf"));
            document.open();
            
            PdfContentByte cb = writer.getDirectContent();
            BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
            cb.setFontAndSize(bf,14);
            cb.beginText();
            
            String title =("Anuradhapura Walisinghe school");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(210, 765);
            cb.showText(title);
            
            String ti =("Student ID          -   "+t1.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 600);
            cb.showText(ti);
            
            String ta =("Name                   -   "+t2.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 550);
            cb.showText(ta);
            
            String tb =("Age                       -   "+t3.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 500);
            cb.showText(tb);
            
            String tc =("School                  -   "+t4.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 450);
            cb.showText(tc);
            
            String td =("Tel                        -   "+t5.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 400);
            cb.showText(td);
            
            String te =("Adress                  -   "+t11.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 350);
            cb.showText(te);
            
            String tf =("Car                       -   "+t21.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 300);
            cb.showText(tf);
            
            String tg =("van                       -   "+t31.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 250);
            cb.showText(tg);
            
            String th =("Bus                       -   "+t41.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 200);
            cb.showText(th);
            
            String tj =("Home                  -   "+t51.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(110, 150);
            cb.showText(tj);
            
            cb.endText();
       }
            
       catch (Exception eb) {
           System.err.println(eb.getMessage());
       }
       document.close();
       //open
       
       try{
           File pdfFile = new File("Myreport.pdf");
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
       
b2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
 t1.setText("");
 t2.setText("");
 t3.setText("");
 t4.setText("");
 t5.setText("");
 t11.setText("");
 t21.setText("");
 t31.setText("");
 t41.setText("");
 t51.setText("");
} 
    });


    
    
setLayout(null);
setSize (800,700);
setTitle("Student Registrasion");
setLocationRelativeTo(null);
setVisible(true);
}
     
    
    
    public static void main(String[] args) {
       StudentRegister Frame = new StudentRegister();
     }
    
}