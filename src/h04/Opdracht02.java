package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht02 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(50, 100, 100, 100);
        g.drawLine(50,100,100,50);
        g.drawLine(150,100,100,50);
g.drawRect(60,110,20,20);
g.drawRect(120,140,20,60);

    }
}