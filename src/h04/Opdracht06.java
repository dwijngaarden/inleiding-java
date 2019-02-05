package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht06 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(180,100,40,100);
        g.setColor(Color.RED);
        g.fillArc(190,110,20,20,360,360);
        g.setColor(Color.ORANGE);
        g.fillArc(190,140,20,20,360,360);
        g.setColor(Color.GREEN);
        g.fillArc(190,170,20,20,360,360);

    }
}