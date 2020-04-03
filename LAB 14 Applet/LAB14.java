import java.applet.*;
import java.awt.*;

public class LAB14  extends Applet {
   public void paint (Graphics g) {
      g.drawString("Tech Event", 250, 250);
      g.setColor(Color.blue);  
g.drawString("Tect Event",100, 100);  
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  


g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
  
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
   }






 
}