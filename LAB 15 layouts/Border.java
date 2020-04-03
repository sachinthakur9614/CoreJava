import java.awt.*;  
import javax.swing.*;  





  
public class Border {  
JFrame f;  


MyGridLayout(){  
    f=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
        JButton b6=new JButton("6");  
        JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
        JButton b9=new JButton("9");  
          
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(b9);  
  
    f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}

Border(){  

    f=new JFrame();  
      
    JButton b1=new JButton("NORTH");;  
    JButton b2=new JButton("SOUTH");;  
    JButton b3=new JButton("EAST");;  
    JButton b4=new JButton("WEST");;  
    JButton b5=new JButton("CENTER");;  
      
    f.add(b1,BorderLayout.NORTH);  
    f.add(b2,BorderLayout.SOUTH);  
    f.add(b3,BorderLayout.EAST);  
    f.add(b4,BorderLayout.WEST);  
    f.add(b5,BorderLayout.CENTER);  
      
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Border();  
     new MyGridLayout();  
}  

}