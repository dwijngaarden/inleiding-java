package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht03 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 50, 150);
        g.setColor(Color.RED);
        g.drawRect(50, 50, 50, 30);
        g.fillRect(50, 50, 50, 30);
g.setColor(Color.WHITE);
        g.drawRect(50, 60, 50, 30);
        g.fillRect(50,60,50,30);
g.setColor(Color.blue);
        g.drawRect(50,70,50,10);
        g.fillRect(50,70,50,10);

    }

}