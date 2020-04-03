/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logo;
import java.applet.*;  
import java.awt.*;
/**
 *
 * @author ZoRb
 */
public class java extends Applet{

  public void init() 
    { 
        // set the size of applet to 300, 300 
        setSize(1300, 1300); 
        show(); 
    } 
  
    // invoked when applet is started 
    public void start() 
    { 
    } 
  
    // invoked when applet is closed 
    public void stop() 
    { 
    } 
  
    public void paint(Graphics g) 
    { 
                Color c4= new Color(200,200,200);
                setBackground(c4);
                int x[]={490,500,505,515};
                int y[]={90,100,100,90};
                Color c1=new Color(244,196,48);
                Color c2=new Color(150,75,0);
                g.setColor(Color.black);
                g.fillRect(500,100,5,400);
                g.setColor(c1);
                g.fillRect(505,102,180,40);
                g.setColor(Color.white);
                g.fillRect(505,142,180,40);
                g.setColor(Color.green);
                g.fillRect(505,182,180,40);
                g.drawLine(500,100,490,90);
                g.drawLine(505,100,515,90);
                g.drawLine(490,90,515,90);
                g.setColor(c2);
                int n=4;
                g.fillPolygon(x,y,n);
                g.fillArc(490,80,25,20,0,180);
                int z[]={500,495,495,475,475,530,530,510,510,505};
                int w[]={500,500,505,505,515,515,505,505,500,500};
                Color c3= new Color(123,122,192);
                g.setColor(c3);
                g.fillPolygon(z,w,10);
                g.setColor(Color.blue);
                g.drawOval(575,142,40,40);
                int x1=595;
                int y1=162;
                double x2,y2;
                Double degre= 0.0;
                double d=0.0;
                int i;
                int r=20;
                for(i=1;i<=24;i++)
                {
                    degre=(double)d*(3.14/180);
                    x2=x1+(double)r*Math.cos(degre);
                    y2=y1+(double)r*Math.sin(degre);
                    g.drawLine(x1,y1,(int)x2,(int)y2);
                    d=d+(360/24);
                }
      }  
}      

