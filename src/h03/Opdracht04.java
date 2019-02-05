package h03;


import java.awt.*;
import java.applet.*;

public class Opdracht04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

g.setColor(Color.blue);
        g.drawRect(100, 100, 20, 40);
        g.fillRect(100,100,20,40);
        g.setColor(Color.RED);
        g.drawRect(120,50,20,90);
        g.fillRect(120,50,20,90);
        g.setColor(Color.yellow);
        g.drawRect(140,100,20,50);
        g.fillRect(140,100,20,50);
    }

}