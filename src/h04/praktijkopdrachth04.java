package h04;

import java.awt.*;
import java.applet.*;

public class praktijkopdrachth04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20,20,100,20);
        g.drawRect(20,30,80,50);
        g.setColor(Color.MAGENTA);
        g.fillRect(110,30,80,50);
        g.fillArc(110,90,80,50,360,360);
        g.setColor(Color.blue);
        g.drawOval(110,30,80,50);
        g.setColor(Color.BLACK);
        g.drawArc(200,90,50,50,360,360);
        g.drawRoundRect(20,90,80,50,10,10);
        g.drawOval(200,30,80,50);
        g.setColor(Color.MAGENTA);
        g.fillArc(200,10,80,80,340,20);

    }
}