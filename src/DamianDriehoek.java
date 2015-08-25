import java.applet.Applet;
import java.awt.Graphics;

public class DamianDriehoek extends Applet{

	public void init() {
		
	}
	
	public void paint(Graphics g){
		g.drawLine(80, 80, 80, 100);
		g.drawLine(80, 80, 100, 90);
		g.drawLine(80, 100, 100, 90);
	}
}
