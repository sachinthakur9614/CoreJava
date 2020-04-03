import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet 
{  
  Font myfont = new Font("TimesNew Roman",Font.BOLD,20);
  Font myfont1 = new Font("TimesNew Roman",Font.BOLD,15);
  
  Image picture,picture1;  
  
  public void init() 
  {  
    picture1 = getImage(getDocumentBase(),"img1.jpg");  
    picture = getImage(getDocumentBase(),"img1.jpg");
    
  }      
  public void paint(Graphics g) 
  {  
    g.drawImage(picture, 30,30, this);
    g.drawImage(picture1, 20,20, this);  

    g.setColor(Color.RED); 
    g.fillOval(50,20,50,50);
    g.drawOval(50,20,50,50);
    g.setColor(Color.BLACK);
    g.setFont(myfont);
    g.drawString("Tech Event",105,105);
    g.setFont(myfont1);
    g.drawString("Participate",50,200);
	g.setColor(Color.RED);
	g.drawRect(45,205,170,10);
	g.fillRect(45,205,170,10);
    g.setColor(Color.YELLOW);
    g.drawRect(215,205,170,10);
   	g.fillRect(215,205,170,10);

   	g.drawRect(40,15,350,200);

   	g.setColor(Color.BLACK);
   	g.fillRect(70,70,10,50);
   	g.drawRect(70,70,10,50);
   	g.drawOval(50,20,50,50);
     
  }  
}  

