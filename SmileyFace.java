import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class SmileyFace extends applet {
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        // eyes
        g.setColor(Color.RED);
        g.fillOval(100, 120, 20, 20); //left
        g.fillOval(180, 120, 20, 20); //right
        //mouth
        g.drawArc(100, 160, 100, 50, 0, -180);
    }
}
