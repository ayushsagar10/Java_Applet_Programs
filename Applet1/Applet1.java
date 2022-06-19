import java.applet.*;
import java.awt.*;

public class Applet1 extends Applet {
    public void paint(Graphics g) {
        Color clr[] = { Color.black, Color.red, Color.yellow, Color.blue, Color.cyan,
                Color.gray, Color.green, Color.magenta, Color.pink, Color.orange };
        for (int i = 0; i < clr.length; i++) {
            g.setColor(clr[i]);
            g.drawString("Hello World!", 10, 25 * (i + 1));
        }
    }
}