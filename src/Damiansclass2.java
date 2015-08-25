import java.awt.*;
import java.applet.*;

public class Damiansclass2 extends Applet {

  public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Damian!!", 50, 60 );
    g.setColor(Color.red);
    g.drawString("de Haas", 50, 70);
  }
}