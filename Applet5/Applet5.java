import java.applet.*;
import java.awt.*;

public class Applet5 extends Applet{
  int x=300,y=100,r=50;

  public void paint(Graphics g){
  g.setColor(Color.red);  //Drawing line color is red
  g.drawLine(3,300,200,10);
  g.setColor(Color.magenta);  
  g.drawString("Line",100,100);

  g.drawOval(x-r,y-r,100,100);
  g.setColor(Color.yellow);  //Fill the yellow color in circle
  g.fillOval( x-r,y-r, 100, 100 );
  g.setColor(Color.magenta);
  g.drawString("Circle",275,100);
  
  g.drawRect(400,50,200,100);
  g.setColor(Color.yellow);  //Fill the yellow color in rectangel
  g.fillRect( 400, 50, 200, 100 );
  g.setColor(Color.magenta);
  g.drawString("Rectangel",450,100);
  }
}