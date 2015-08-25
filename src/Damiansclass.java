import java.awt.*;
import java.applet.*;

public class Damiansclass extends Applet {

  public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Damian!!", 50, 60 );
  }
}