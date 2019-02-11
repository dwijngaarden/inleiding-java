package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht01 extends Applet {

double karwei,verdelen,uitkomst;

    public void init() {
        karwei = 113;
        verdelen = 4;
      uitkomst = karwei/verdelen;


    }

    public void paint(Graphics g) {
        g.drawString("jan:"+ uitkomst,20,30);
        g.drawString("Ali:" +uitkomst, 20,45);
        g.drawString("Jeannette:"+uitkomst,20,60);
        g.drawString("Donovan"+uitkomst,20,75);

    }
}
