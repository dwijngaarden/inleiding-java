package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht05 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
setBackground(Color.blue);
g.setColor(Color.yellow);
g.fillArc(40,40,70,100,360,360);
    }
}