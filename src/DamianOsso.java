import java.applet.Applet;
import java.awt.Graphics;

public class DamianOsso extends Applet{

	public void init (){
		
	}
	
	public void paint (Graphics g){
		g.drawRect(300, 300, 250, 250);
		g.drawLine(300, 300, 425, 150);
		g.drawLine(550, 300, 425, 150);
		g.drawRect(390, 450, 75, 100);
		g.drawRect(345, 330, 175, 80);
	}
	
}
