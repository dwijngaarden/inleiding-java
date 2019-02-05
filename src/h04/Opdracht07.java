package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht07 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(100,100,50,50);
        g.fillArc(110,110,10,10,360,360);
        g.fillArc(130,110,10,10,360,360);
        g.fillArc(130,130,10,10,360,360);
        g.fillArc(110,130,10,10,360,360);

    }
}