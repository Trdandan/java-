import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class App extends Applet{

	public void paint(Graphics g){
		
		g.drawOval(10,10,100,200);
		g.setColor(Color.BLACK);
		g.drawArc(20, 20, 100, 100, 50, 50);
		
	}
	
}
